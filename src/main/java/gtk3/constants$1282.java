// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1282 {

    static final FunctionDescriptor pango_cairo_layout_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_cairo_layout_path$MH = RuntimeHelper.downcallHandle(
        "pango_cairo_layout_path",
        constants$1282.pango_cairo_layout_path$FUNC, false
    );
    static final FunctionDescriptor pango_cairo_error_underline_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle pango_cairo_error_underline_path$MH = RuntimeHelper.downcallHandle(
        "pango_cairo_error_underline_path",
        constants$1282.pango_cairo_error_underline_path$FUNC, false
    );
    static final FunctionDescriptor gdk_cairo_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cairo_create$MH = RuntimeHelper.downcallHandle(
        "gdk_cairo_create",
        constants$1282.gdk_cairo_create$FUNC, false
    );
    static final FunctionDescriptor gdk_cairo_get_clip_rectangle$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cairo_get_clip_rectangle$MH = RuntimeHelper.downcallHandle(
        "gdk_cairo_get_clip_rectangle",
        constants$1282.gdk_cairo_get_clip_rectangle$FUNC, false
    );
    static final FunctionDescriptor gdk_cairo_set_source_rgba$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cairo_set_source_rgba$MH = RuntimeHelper.downcallHandle(
        "gdk_cairo_set_source_rgba",
        constants$1282.gdk_cairo_set_source_rgba$FUNC, false
    );
    static final FunctionDescriptor gdk_cairo_set_source_pixbuf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gdk_cairo_set_source_pixbuf$MH = RuntimeHelper.downcallHandle(
        "gdk_cairo_set_source_pixbuf",
        constants$1282.gdk_cairo_set_source_pixbuf$FUNC, false
    );
}


