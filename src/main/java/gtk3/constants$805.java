// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$805 {

    static final FunctionDescriptor g_socket_accept$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_accept$MH = RuntimeHelper.downcallHandle(
        "g_socket_accept",
        constants$805.g_socket_accept$FUNC, false
    );
    static final FunctionDescriptor g_socket_listen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_listen$MH = RuntimeHelper.downcallHandle(
        "g_socket_listen",
        constants$805.g_socket_listen$FUNC, false
    );
    static final FunctionDescriptor g_socket_receive$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_receive$MH = RuntimeHelper.downcallHandle(
        "g_socket_receive",
        constants$805.g_socket_receive$FUNC, false
    );
    static final FunctionDescriptor g_socket_receive_from$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_receive_from$MH = RuntimeHelper.downcallHandle(
        "g_socket_receive_from",
        constants$805.g_socket_receive_from$FUNC, false
    );
    static final FunctionDescriptor g_socket_send$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_send$MH = RuntimeHelper.downcallHandle(
        "g_socket_send",
        constants$805.g_socket_send$FUNC, false
    );
    static final FunctionDescriptor g_socket_send_to$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_send_to$MH = RuntimeHelper.downcallHandle(
        "g_socket_send_to",
        constants$805.g_socket_send_to$FUNC, false
    );
}


