// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$644 {

    static final FunctionDescriptor g_dtls_connection_set_require_close_notify$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dtls_connection_set_require_close_notify$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_set_require_close_notify",
        constants$644.g_dtls_connection_set_require_close_notify$FUNC, false
    );
    static final FunctionDescriptor g_dtls_connection_get_require_close_notify$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_get_require_close_notify$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_get_require_close_notify",
        constants$644.g_dtls_connection_get_require_close_notify$FUNC, false
    );
    static final FunctionDescriptor g_dtls_connection_set_rehandshake_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dtls_connection_set_rehandshake_mode$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_set_rehandshake_mode",
        constants$644.g_dtls_connection_set_rehandshake_mode$FUNC, false
    );
    static final FunctionDescriptor g_dtls_connection_get_rehandshake_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_get_rehandshake_mode$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_get_rehandshake_mode",
        constants$644.g_dtls_connection_get_rehandshake_mode$FUNC, false
    );
    static final FunctionDescriptor g_dtls_connection_handshake$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_handshake$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_handshake",
        constants$644.g_dtls_connection_handshake$FUNC, false
    );
    static final FunctionDescriptor g_dtls_connection_handshake_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_handshake_async$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_handshake_async",
        constants$644.g_dtls_connection_handshake_async$FUNC, false
    );
}

