// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1167 {

    static final FunctionDescriptor cairo_pattern_get_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_pattern_get_user_data$MH = RuntimeHelper.downcallHandle(
        "cairo_pattern_get_user_data",
        constants$1167.cairo_pattern_get_user_data$FUNC, false
    );
    static final FunctionDescriptor cairo_pattern_set_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_pattern_set_user_data$MH = RuntimeHelper.downcallHandle(
        "cairo_pattern_set_user_data",
        constants$1167.cairo_pattern_set_user_data$FUNC, false
    );
    static final FunctionDescriptor cairo_pattern_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_pattern_get_type$MH = RuntimeHelper.downcallHandle(
        "cairo_pattern_get_type",
        constants$1167.cairo_pattern_get_type$FUNC, false
    );
    static final FunctionDescriptor cairo_pattern_add_color_stop_rgb$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_pattern_add_color_stop_rgb$MH = RuntimeHelper.downcallHandle(
        "cairo_pattern_add_color_stop_rgb",
        constants$1167.cairo_pattern_add_color_stop_rgb$FUNC, false
    );
    static final FunctionDescriptor cairo_pattern_add_color_stop_rgba$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_pattern_add_color_stop_rgba$MH = RuntimeHelper.downcallHandle(
        "cairo_pattern_add_color_stop_rgba",
        constants$1167.cairo_pattern_add_color_stop_rgba$FUNC, false
    );
    static final FunctionDescriptor cairo_mesh_pattern_begin_patch$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_mesh_pattern_begin_patch$MH = RuntimeHelper.downcallHandle(
        "cairo_mesh_pattern_begin_patch",
        constants$1167.cairo_mesh_pattern_begin_patch$FUNC, false
    );
}

