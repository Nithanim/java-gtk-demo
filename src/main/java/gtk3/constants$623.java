// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$623 {

    static final FunctionDescriptor g_bus_watch_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bus_watch_name$MH = RuntimeHelper.downcallHandle(
        "g_bus_watch_name",
        constants$623.g_bus_watch_name$FUNC, false
    );
    static final FunctionDescriptor g_bus_watch_name_on_connection$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bus_watch_name_on_connection$MH = RuntimeHelper.downcallHandle(
        "g_bus_watch_name_on_connection",
        constants$623.g_bus_watch_name_on_connection$FUNC, false
    );
    static final FunctionDescriptor g_bus_watch_name_with_closures$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bus_watch_name_with_closures$MH = RuntimeHelper.downcallHandle(
        "g_bus_watch_name_with_closures",
        constants$623.g_bus_watch_name_with_closures$FUNC, false
    );
    static final FunctionDescriptor g_bus_watch_name_on_connection_with_closures$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bus_watch_name_on_connection_with_closures$MH = RuntimeHelper.downcallHandle(
        "g_bus_watch_name_on_connection_with_closures",
        constants$623.g_bus_watch_name_on_connection_with_closures$FUNC, false
    );
    static final FunctionDescriptor g_bus_unwatch_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_bus_unwatch_name$MH = RuntimeHelper.downcallHandle(
        "g_bus_unwatch_name",
        constants$623.g_bus_unwatch_name$FUNC, false
    );
    static final FunctionDescriptor g_dbus_object_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dbus_object_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dbus_object_get_type",
        constants$623.g_dbus_object_get_type$FUNC, false
    );
}


