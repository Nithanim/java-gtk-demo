// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$843 {

    static final FunctionDescriptor g_tls_certificate_list_new_from_file$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_list_new_from_file$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_list_new_from_file",
        constants$843.g_tls_certificate_list_new_from_file$FUNC, false
    );
    static final FunctionDescriptor g_tls_certificate_get_issuer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_get_issuer$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_get_issuer",
        constants$843.g_tls_certificate_get_issuer$FUNC, false
    );
    static final FunctionDescriptor g_tls_certificate_verify$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_verify$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_verify",
        constants$843.g_tls_certificate_verify$FUNC, false
    );
    static final FunctionDescriptor g_tls_certificate_is_same$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_is_same$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_is_same",
        constants$843.g_tls_certificate_is_same$FUNC, false
    );
    static final FunctionDescriptor g_tls_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_tls_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_type",
        constants$843.g_tls_connection_get_type$FUNC, false
    );
    static final FunctionDescriptor g_tls_connection_set_use_system_certdb$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_tls_connection_set_use_system_certdb$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_set_use_system_certdb",
        constants$843.g_tls_connection_set_use_system_certdb$FUNC, false
    );
}

