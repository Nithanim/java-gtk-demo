// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1092 {

    static final FunctionDescriptor pango_layout_get_lines$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_lines$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_lines",
        constants$1092.pango_layout_get_lines$FUNC, false
    );
    static final FunctionDescriptor pango_layout_get_lines_readonly$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_lines_readonly$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_lines_readonly",
        constants$1092.pango_layout_get_lines_readonly$FUNC, false
    );
    static final FunctionDescriptor pango_layout_line_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_layout_line_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_layout_line_get_type",
        constants$1092.pango_layout_line_get_type$FUNC, false
    );
    static final FunctionDescriptor pango_layout_line_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_line_ref$MH = RuntimeHelper.downcallHandle(
        "pango_layout_line_ref",
        constants$1092.pango_layout_line_ref$FUNC, false
    );
    static final FunctionDescriptor pango_layout_line_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_line_unref$MH = RuntimeHelper.downcallHandle(
        "pango_layout_line_unref",
        constants$1092.pango_layout_line_unref$FUNC, false
    );
    static final FunctionDescriptor pango_layout_line_x_to_index$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_line_x_to_index$MH = RuntimeHelper.downcallHandle(
        "pango_layout_line_x_to_index",
        constants$1092.pango_layout_line_x_to_index$FUNC, false
    );
}


