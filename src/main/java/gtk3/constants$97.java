// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$97 {

    static final FunctionDescriptor g_iconv_close$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_iconv_close$MH = RuntimeHelper.downcallHandle(
        "g_iconv_close",
        constants$97.g_iconv_close$FUNC, false
    );
    static final FunctionDescriptor g_convert$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_convert$MH = RuntimeHelper.downcallHandle(
        "g_convert",
        constants$97.g_convert$FUNC, false
    );
    static final FunctionDescriptor g_convert_with_iconv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_convert_with_iconv$MH = RuntimeHelper.downcallHandle(
        "g_convert_with_iconv",
        constants$97.g_convert_with_iconv$FUNC, false
    );
    static final FunctionDescriptor g_convert_with_fallback$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_convert_with_fallback$MH = RuntimeHelper.downcallHandle(
        "g_convert_with_fallback",
        constants$97.g_convert_with_fallback$FUNC, false
    );
    static final FunctionDescriptor g_locale_to_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_locale_to_utf8$MH = RuntimeHelper.downcallHandle(
        "g_locale_to_utf8",
        constants$97.g_locale_to_utf8$FUNC, false
    );
    static final FunctionDescriptor g_locale_from_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_locale_from_utf8$MH = RuntimeHelper.downcallHandle(
        "g_locale_from_utf8",
        constants$97.g_locale_from_utf8$FUNC, false
    );
}


