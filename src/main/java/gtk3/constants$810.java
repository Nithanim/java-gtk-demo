// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$810 {

    static final FunctionDescriptor g_socket_client_set_local_address$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_set_local_address$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_set_local_address",
        constants$810.g_socket_client_set_local_address$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_get_timeout$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_get_timeout$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_timeout",
        constants$810.g_socket_client_get_timeout$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_set_timeout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_client_set_timeout$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_set_timeout",
        constants$810.g_socket_client_set_timeout$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_get_enable_proxy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_get_enable_proxy$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_enable_proxy",
        constants$810.g_socket_client_get_enable_proxy$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_set_enable_proxy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_client_set_enable_proxy$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_set_enable_proxy",
        constants$810.g_socket_client_set_enable_proxy$FUNC, false
    );
    static final FunctionDescriptor g_socket_client_get_tls$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_get_tls$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_tls",
        constants$810.g_socket_client_get_tls$FUNC, false
    );
}


