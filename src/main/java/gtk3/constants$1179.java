// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1179 {

    static final FunctionDescriptor gdk_device_get_key$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_key$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_key",
        constants$1179.gdk_device_get_key$FUNC, false
    );
    static final FunctionDescriptor gdk_device_set_key$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_device_set_key$MH = RuntimeHelper.downcallHandle(
        "gdk_device_set_key",
        constants$1179.gdk_device_set_key$FUNC, false
    );
    static final FunctionDescriptor gdk_device_get_axis_use$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_device_get_axis_use$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_axis_use",
        constants$1179.gdk_device_get_axis_use$FUNC, false
    );
    static final FunctionDescriptor gdk_device_set_axis_use$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_device_set_axis_use$MH = RuntimeHelper.downcallHandle(
        "gdk_device_set_axis_use",
        constants$1179.gdk_device_set_axis_use$FUNC, false
    );
    static final FunctionDescriptor gdk_device_get_state$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_state$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_state",
        constants$1179.gdk_device_get_state$FUNC, false
    );
    static final FunctionDescriptor gdk_device_get_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_position$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_position",
        constants$1179.gdk_device_get_position$FUNC, false
    );
}

