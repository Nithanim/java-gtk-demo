// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$852 {

    static final FunctionDescriptor g_tls_interaction_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_tls_interaction_get_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_interaction_get_type",
        constants$852.g_tls_interaction_get_type$FUNC, false
    );
    static final FunctionDescriptor g_tls_interaction_invoke_ask_password$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_interaction_invoke_ask_password$MH = RuntimeHelper.downcallHandle(
        "g_tls_interaction_invoke_ask_password",
        constants$852.g_tls_interaction_invoke_ask_password$FUNC, false
    );
    static final FunctionDescriptor g_tls_interaction_ask_password$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_interaction_ask_password$MH = RuntimeHelper.downcallHandle(
        "g_tls_interaction_ask_password",
        constants$852.g_tls_interaction_ask_password$FUNC, false
    );
    static final FunctionDescriptor g_tls_interaction_ask_password_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_interaction_ask_password_async$MH = RuntimeHelper.downcallHandle(
        "g_tls_interaction_ask_password_async",
        constants$852.g_tls_interaction_ask_password_async$FUNC, false
    );
    static final FunctionDescriptor g_tls_interaction_ask_password_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_interaction_ask_password_finish$MH = RuntimeHelper.downcallHandle(
        "g_tls_interaction_ask_password_finish",
        constants$852.g_tls_interaction_ask_password_finish$FUNC, false
    );
    static final FunctionDescriptor g_tls_interaction_invoke_request_certificate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_interaction_invoke_request_certificate$MH = RuntimeHelper.downcallHandle(
        "g_tls_interaction_invoke_request_certificate",
        constants$852.g_tls_interaction_invoke_request_certificate$FUNC, false
    );
}


