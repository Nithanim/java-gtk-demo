# Java GTK3 demo

This repository is a demo of using jextract to generate panama ffi bindings for GTK3.


## jextract

To use jextract, we need pass it a header file to generate the bindings from.
We can do it the easy way like
```C
#include <gtk/gtk.h>
```
Sadly, jextract is not really "intelligent" so we have to tell it where all the stuff of gtk and all the libraries it depends on can be found.

(It is assumed you have the development packages of GTK installed on your system.)

Fortunately, there is `pkg-config` which can resolve everything and give us all the include-paths we need.
A sample output on Ubuntu with `pkg-config --cflags gtk+-3.0`:
```
-pthread -I/usr/include/gtk-3.0 -I/usr/include/at-spi2-atk/2.0 -I/usr/include/at-spi-2.0 -I/usr/include/dbus-1.0 -I/usr/lib/x86_64-linux-gnu/dbus-1.0/include -I/usr/include/gtk-3.0 -I/usr/include/gio-unix-2.0 -I/usr/include/cairo -I/usr/include/pango-1.0 -I/usr/include/harfbuzz -I/usr/include/pango-1.0 -I/usr/include/fribidi -I/usr/include/harfbuzz -I/usr/include/atk-1.0 -I/usr/include/cairo -I/usr/include/pixman-1 -I/usr/include/uuid -I/usr/include/freetype2 -I/usr/include/libpng16 -I/usr/include/gdk-pixbuf-2.0 -I/usr/include/libpng16 -I/usr/include/x86_64-linux-gnu -I/usr/include/libmount -I/usr/include/blkid -I/usr/include/glib-2.0 -I/usr/lib/x86_64-linux-gnu/glib-2.0/include
```

We have to remove the `-pthread` from the list, but otherwise we can put it directly to use.

`./jextract -I/usr/include/gtk-3.0 <...> -I/usr/include/at-spi2-atk/2.0 --source -t gtk3 test.h
`

The `-source` flag makes generates java sources instead of class files directly.
This is easier if you are playing around or want it use in a maven artifact because you just put in the source folder (or generated-sources) and use it directly.

The downside is that with A LOT of functions, the source gets quite large and (for now) a big serial hierarchy of classes filled with methods is created, which IntelliJ does NOT like.
JavaC is also working very hard on them.
It might be better if the code is pre-compiled in a separate maven dependency and then included in you actual project but it could be equally bad.
My hope is that `jextract` stops to produce the weird class hierarchy at some point.

The `-t <package>` flag controls the destination packages for the generated classes.

The `-l <library>` flag instructs jextract to call `System.loadLibrary("<library")` when the bindings are loaded.
However, the problem is that java is not "intelligent" too, so it has no idea where "gtk+-3.0" is.
It searches in the `java.library.path` but there are only some paths and nothing we would like.
My current "quick fix" is to call `System.load` manually beforehand instead.
It takes the absolute path of the shared library `System.load("/usr/lib/x86_64-linux-gnu/libgtk-3.so");`.
The problem is that this just works on *my* system and not necessarily on another.

## Other important stuff
A fun thing having to use the "real" binary api is, that you do not have any special header-file magic.

You encounter it immediately with `g_signal_connect` which is used in all C tutorials and manuals but that does not really exist.
Instead, it is defined in the header to rewrite it with `g_signal_connect_data`.
I highly recommend you have an IDE ready where you can jump to the definitions in the header files easily.



