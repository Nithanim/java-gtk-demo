// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1175 {

    static final FunctionDescriptor cairo_region_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_status$MH = RuntimeHelper.downcallHandle(
        "cairo_region_status",
        constants$1175.cairo_region_status$FUNC, false
    );
    static final FunctionDescriptor cairo_region_get_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_get_extents$MH = RuntimeHelper.downcallHandle(
        "cairo_region_get_extents",
        constants$1175.cairo_region_get_extents$FUNC, false
    );
    static final FunctionDescriptor cairo_region_num_rectangles$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_num_rectangles$MH = RuntimeHelper.downcallHandle(
        "cairo_region_num_rectangles",
        constants$1175.cairo_region_num_rectangles$FUNC, false
    );
    static final FunctionDescriptor cairo_region_get_rectangle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_get_rectangle$MH = RuntimeHelper.downcallHandle(
        "cairo_region_get_rectangle",
        constants$1175.cairo_region_get_rectangle$FUNC, false
    );
    static final FunctionDescriptor cairo_region_is_empty$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_is_empty$MH = RuntimeHelper.downcallHandle(
        "cairo_region_is_empty",
        constants$1175.cairo_region_is_empty$FUNC, false
    );
    static final FunctionDescriptor cairo_region_contains_rectangle$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_contains_rectangle$MH = RuntimeHelper.downcallHandle(
        "cairo_region_contains_rectangle",
        constants$1175.cairo_region_contains_rectangle$FUNC, false
    );
}

