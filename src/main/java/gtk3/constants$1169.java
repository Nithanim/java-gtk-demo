// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1169 {

    static final FunctionDescriptor cairo_mesh_pattern_set_corner_color_rgba$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_mesh_pattern_set_corner_color_rgba$MH = RuntimeHelper.downcallHandle(
        "cairo_mesh_pattern_set_corner_color_rgba",
        constants$1169.cairo_mesh_pattern_set_corner_color_rgba$FUNC, false
    );
    static final FunctionDescriptor cairo_pattern_set_matrix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_pattern_set_matrix$MH = RuntimeHelper.downcallHandle(
        "cairo_pattern_set_matrix",
        constants$1169.cairo_pattern_set_matrix$FUNC, false
    );
    static final FunctionDescriptor cairo_pattern_get_matrix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_pattern_get_matrix$MH = RuntimeHelper.downcallHandle(
        "cairo_pattern_get_matrix",
        constants$1169.cairo_pattern_get_matrix$FUNC, false
    );
    static final FunctionDescriptor cairo_pattern_set_extend$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_pattern_set_extend$MH = RuntimeHelper.downcallHandle(
        "cairo_pattern_set_extend",
        constants$1169.cairo_pattern_set_extend$FUNC, false
    );
    static final FunctionDescriptor cairo_pattern_get_extend$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_pattern_get_extend$MH = RuntimeHelper.downcallHandle(
        "cairo_pattern_get_extend",
        constants$1169.cairo_pattern_get_extend$FUNC, false
    );
    static final FunctionDescriptor cairo_pattern_set_filter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_pattern_set_filter$MH = RuntimeHelper.downcallHandle(
        "cairo_pattern_set_filter",
        constants$1169.cairo_pattern_set_filter$FUNC, false
    );
}

