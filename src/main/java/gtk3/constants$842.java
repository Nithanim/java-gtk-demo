// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$842 {

    static final FunctionDescriptor g_tls_backend_get_dtls_server_connection_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_backend_get_dtls_server_connection_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_backend_get_dtls_server_connection_type",
        constants$842.g_tls_backend_get_dtls_server_connection_type$FUNC, false
    );
    static final FunctionDescriptor g_tls_certificate_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_tls_certificate_get_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_get_type",
        constants$842.g_tls_certificate_get_type$FUNC, false
    );
    static final FunctionDescriptor g_tls_certificate_new_from_pem$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_new_from_pem$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_new_from_pem",
        constants$842.g_tls_certificate_new_from_pem$FUNC, false
    );
    static final FunctionDescriptor g_tls_certificate_new_from_file$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_new_from_file$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_new_from_file",
        constants$842.g_tls_certificate_new_from_file$FUNC, false
    );
    static final FunctionDescriptor g_tls_certificate_new_from_files$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_new_from_files$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_new_from_files",
        constants$842.g_tls_certificate_new_from_files$FUNC, false
    );
    static final FunctionDescriptor g_tls_certificate_new_from_pkcs11_uris$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_new_from_pkcs11_uris$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_new_from_pkcs11_uris",
        constants$842.g_tls_certificate_new_from_pkcs11_uris$FUNC, false
    );
}

