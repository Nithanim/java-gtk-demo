// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1257 {

    static final FunctionDescriptor gdk_pixbuf_fill$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_fill$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_fill",
        constants$1257.gdk_pixbuf_fill$FUNC, false
    );
    static final FunctionDescriptor gdk_pixbuf_save$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_save$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_save",
        constants$1257.gdk_pixbuf_save$FUNC, true
    );
    static final FunctionDescriptor gdk_pixbuf_savev$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_savev$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_savev",
        constants$1257.gdk_pixbuf_savev$FUNC, false
    );
    static final FunctionDescriptor GdkPixbufSaveFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GdkPixbufSaveFunc$MH = RuntimeHelper.downcallHandle(
        constants$1257.GdkPixbufSaveFunc$FUNC, false
    );
    static final FunctionDescriptor gdk_pixbuf_save_to_callback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_save_to_callback$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_save_to_callback",
        constants$1257.gdk_pixbuf_save_to_callback$FUNC, true
    );
}

