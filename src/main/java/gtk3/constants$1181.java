// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1181 {

    static final FunctionDescriptor gdk_device_list_axes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_list_axes$MH = RuntimeHelper.downcallHandle(
        "gdk_device_list_axes",
        constants$1181.gdk_device_list_axes$FUNC, false
    );
    static final FunctionDescriptor gdk_device_get_axis_value$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_axis_value$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_axis_value",
        constants$1181.gdk_device_get_axis_value$FUNC, false
    );
    static final FunctionDescriptor gdk_device_get_axis$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_axis$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_axis",
        constants$1181.gdk_device_get_axis$FUNC, false
    );
    static final FunctionDescriptor gdk_device_get_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_display$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_display",
        constants$1181.gdk_device_get_display$FUNC, false
    );
    static final FunctionDescriptor gdk_device_get_associated_device$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_associated_device$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_associated_device",
        constants$1181.gdk_device_get_associated_device$FUNC, false
    );
    static final FunctionDescriptor gdk_device_list_slave_devices$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_list_slave_devices$MH = RuntimeHelper.downcallHandle(
        "gdk_device_list_slave_devices",
        constants$1181.gdk_device_list_slave_devices$FUNC, false
    );
}

