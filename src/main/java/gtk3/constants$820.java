// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$820 {

    static final FunctionDescriptor g_socket_service_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_socket_service_new$MH = RuntimeHelper.downcallHandle(
        "g_socket_service_new",
        constants$820.g_socket_service_new$FUNC, false
    );
    static final FunctionDescriptor g_socket_service_start$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_service_start$MH = RuntimeHelper.downcallHandle(
        "g_socket_service_start",
        constants$820.g_socket_service_start$FUNC, false
    );
    static final FunctionDescriptor g_socket_service_stop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_service_stop$MH = RuntimeHelper.downcallHandle(
        "g_socket_service_stop",
        constants$820.g_socket_service_stop$FUNC, false
    );
    static final FunctionDescriptor g_socket_service_is_active$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_service_is_active$MH = RuntimeHelper.downcallHandle(
        "g_socket_service_is_active",
        constants$820.g_socket_service_is_active$FUNC, false
    );
    static final FunctionDescriptor g_srv_target_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_srv_target_get_type$MH = RuntimeHelper.downcallHandle(
        "g_srv_target_get_type",
        constants$820.g_srv_target_get_type$FUNC, false
    );
    static final FunctionDescriptor g_srv_target_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_srv_target_new$MH = RuntimeHelper.downcallHandle(
        "g_srv_target_new",
        constants$820.g_srv_target_new$FUNC, false
    );
}

