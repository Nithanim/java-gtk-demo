// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$94 {

    static final FunctionDescriptor g_get_console_charset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_get_console_charset$MH = RuntimeHelper.downcallHandle(
        "g_get_console_charset",
        constants$94.g_get_console_charset$FUNC, false
    );
    static final FunctionDescriptor g_get_language_names$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_language_names$MH = RuntimeHelper.downcallHandle(
        "g_get_language_names",
        constants$94.g_get_language_names$FUNC, false
    );
    static final FunctionDescriptor g_get_language_names_with_category$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_get_language_names_with_category$MH = RuntimeHelper.downcallHandle(
        "g_get_language_names_with_category",
        constants$94.g_get_language_names_with_category$FUNC, false
    );
    static final FunctionDescriptor g_get_locale_variants$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_get_locale_variants$MH = RuntimeHelper.downcallHandle(
        "g_get_locale_variants",
        constants$94.g_get_locale_variants$FUNC, false
    );
    static final FunctionDescriptor g_checksum_type_get_length$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_checksum_type_get_length$MH = RuntimeHelper.downcallHandle(
        "g_checksum_type_get_length",
        constants$94.g_checksum_type_get_length$FUNC, false
    );
    static final FunctionDescriptor g_checksum_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_checksum_new$MH = RuntimeHelper.downcallHandle(
        "g_checksum_new",
        constants$94.g_checksum_new$FUNC, false
    );
}

