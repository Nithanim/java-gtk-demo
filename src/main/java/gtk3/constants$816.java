// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$816 {

    static final FunctionDescriptor g_socket_connection_factory_register_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_connection_factory_register_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_factory_register_type",
        constants$816.g_socket_connection_factory_register_type$FUNC, false
    );
    static final FunctionDescriptor g_socket_connection_factory_lookup_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_connection_factory_lookup_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_factory_lookup_type",
        constants$816.g_socket_connection_factory_lookup_type$FUNC, false
    );
    static final FunctionDescriptor g_socket_connection_factory_create_connection$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_connection_factory_create_connection$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_factory_create_connection",
        constants$816.g_socket_connection_factory_create_connection$FUNC, false
    );
    static final FunctionDescriptor g_socket_control_message_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_socket_control_message_get_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_control_message_get_type",
        constants$816.g_socket_control_message_get_type$FUNC, false
    );
    static final FunctionDescriptor g_socket_control_message_get_size$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_control_message_get_size$MH = RuntimeHelper.downcallHandle(
        "g_socket_control_message_get_size",
        constants$816.g_socket_control_message_get_size$FUNC, false
    );
    static final FunctionDescriptor g_socket_control_message_get_level$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_control_message_get_level$MH = RuntimeHelper.downcallHandle(
        "g_socket_control_message_get_level",
        constants$816.g_socket_control_message_get_level$FUNC, false
    );
}


