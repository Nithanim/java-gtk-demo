// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1091 {

    static final FunctionDescriptor pango_layout_get_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_size$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_size",
        constants$1091.pango_layout_get_size$FUNC, false
    );
    static final FunctionDescriptor pango_layout_get_pixel_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_pixel_size$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_pixel_size",
        constants$1091.pango_layout_get_pixel_size$FUNC, false
    );
    static final FunctionDescriptor pango_layout_get_baseline$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_baseline$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_baseline",
        constants$1091.pango_layout_get_baseline$FUNC, false
    );
    static final FunctionDescriptor pango_layout_get_line_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_line_count$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_line_count",
        constants$1091.pango_layout_get_line_count$FUNC, false
    );
    static final FunctionDescriptor pango_layout_get_line$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_get_line$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_line",
        constants$1091.pango_layout_get_line$FUNC, false
    );
    static final FunctionDescriptor pango_layout_get_line_readonly$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_get_line_readonly$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_line_readonly",
        constants$1091.pango_layout_get_line_readonly$FUNC, false
    );
}

