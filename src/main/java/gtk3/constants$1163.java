// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1163 {

    static final FunctionDescriptor cairo_raster_source_copy_func_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_raster_source_copy_func_t$MH = RuntimeHelper.downcallHandle(
        constants$1163.cairo_raster_source_copy_func_t$FUNC, false
    );
    static final FunctionDescriptor cairo_raster_source_finish_func_t$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_raster_source_finish_func_t$MH = RuntimeHelper.downcallHandle(
        constants$1163.cairo_raster_source_finish_func_t$FUNC, false
    );
    static final FunctionDescriptor cairo_pattern_create_raster_source$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_pattern_create_raster_source$MH = RuntimeHelper.downcallHandle(
        "cairo_pattern_create_raster_source",
        constants$1163.cairo_pattern_create_raster_source$FUNC, false
    );
    static final FunctionDescriptor cairo_raster_source_pattern_set_callback_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_raster_source_pattern_set_callback_data$MH = RuntimeHelper.downcallHandle(
        "cairo_raster_source_pattern_set_callback_data",
        constants$1163.cairo_raster_source_pattern_set_callback_data$FUNC, false
    );
    static final FunctionDescriptor cairo_raster_source_pattern_get_callback_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_raster_source_pattern_get_callback_data$MH = RuntimeHelper.downcallHandle(
        "cairo_raster_source_pattern_get_callback_data",
        constants$1163.cairo_raster_source_pattern_get_callback_data$FUNC, false
    );
}


