// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1150 {

    static final FunctionDescriptor cairo_device_flush$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_device_flush$MH = RuntimeHelper.downcallHandle(
        "cairo_device_flush",
        constants$1150.cairo_device_flush$FUNC, false
    );
    static final FunctionDescriptor cairo_device_finish$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_device_finish$MH = RuntimeHelper.downcallHandle(
        "cairo_device_finish",
        constants$1150.cairo_device_finish$FUNC, false
    );
    static final FunctionDescriptor cairo_device_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_device_destroy$MH = RuntimeHelper.downcallHandle(
        "cairo_device_destroy",
        constants$1150.cairo_device_destroy$FUNC, false
    );
    static final FunctionDescriptor cairo_device_get_reference_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_device_get_reference_count$MH = RuntimeHelper.downcallHandle(
        "cairo_device_get_reference_count",
        constants$1150.cairo_device_get_reference_count$FUNC, false
    );
    static final FunctionDescriptor cairo_device_get_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_device_get_user_data$MH = RuntimeHelper.downcallHandle(
        "cairo_device_get_user_data",
        constants$1150.cairo_device_get_user_data$FUNC, false
    );
    static final FunctionDescriptor cairo_device_set_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_device_set_user_data$MH = RuntimeHelper.downcallHandle(
        "cairo_device_set_user_data",
        constants$1150.cairo_device_set_user_data$FUNC, false
    );
}

