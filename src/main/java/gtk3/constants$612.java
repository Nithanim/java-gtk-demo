// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$612 {

    static final FunctionDescriptor g_dbus_message_get_serial$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_serial$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_serial",
        constants$612.g_dbus_message_get_serial$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_set_serial$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dbus_message_set_serial$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_set_serial",
        constants$612.g_dbus_message_set_serial$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_get_header$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_header$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_header",
        constants$612.g_dbus_message_get_header$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_set_header$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_set_header$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_set_header",
        constants$612.g_dbus_message_set_header$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_get_header_fields$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_header_fields$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_header_fields",
        constants$612.g_dbus_message_get_header_fields$FUNC, false
    );
    static final FunctionDescriptor g_dbus_message_get_body$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_body$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_body",
        constants$612.g_dbus_message_get_body$FUNC, false
    );
}

