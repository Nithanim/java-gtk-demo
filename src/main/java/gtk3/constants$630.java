// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$630 {

    static final FunctionDescriptor g_dbus_object_skeleton_set_object_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_object_skeleton_set_object_path$MH = RuntimeHelper.downcallHandle(
        "g_dbus_object_skeleton_set_object_path",
        constants$630.g_dbus_object_skeleton_set_object_path$FUNC, false
    );
    static final FunctionDescriptor g_dbus_proxy_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dbus_proxy_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dbus_proxy_get_type",
        constants$630.g_dbus_proxy_get_type$FUNC, false
    );
    static final FunctionDescriptor g_dbus_proxy_new$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_proxy_new$MH = RuntimeHelper.downcallHandle(
        "g_dbus_proxy_new",
        constants$630.g_dbus_proxy_new$FUNC, false
    );
    static final FunctionDescriptor g_dbus_proxy_new_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_proxy_new_finish$MH = RuntimeHelper.downcallHandle(
        "g_dbus_proxy_new_finish",
        constants$630.g_dbus_proxy_new_finish$FUNC, false
    );
    static final FunctionDescriptor g_dbus_proxy_new_sync$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_proxy_new_sync$MH = RuntimeHelper.downcallHandle(
        "g_dbus_proxy_new_sync",
        constants$630.g_dbus_proxy_new_sync$FUNC, false
    );
    static final FunctionDescriptor g_dbus_proxy_new_for_bus$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_proxy_new_for_bus$MH = RuntimeHelper.downcallHandle(
        "g_dbus_proxy_new_for_bus",
        constants$630.g_dbus_proxy_new_for_bus$FUNC, false
    );
}


