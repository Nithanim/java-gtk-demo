// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$188 {

    static final FunctionDescriptor g_string_insert_c$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_string_insert_c$MH = RuntimeHelper.downcallHandle(
        "g_string_insert_c",
        constants$188.g_string_insert_c$FUNC, false
    );
    static final FunctionDescriptor g_string_insert_unichar$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_string_insert_unichar$MH = RuntimeHelper.downcallHandle(
        "g_string_insert_unichar",
        constants$188.g_string_insert_unichar$FUNC, false
    );
    static final FunctionDescriptor g_string_overwrite$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_overwrite$MH = RuntimeHelper.downcallHandle(
        "g_string_overwrite",
        constants$188.g_string_overwrite$FUNC, false
    );
    static final FunctionDescriptor g_string_overwrite_len$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_overwrite_len$MH = RuntimeHelper.downcallHandle(
        "g_string_overwrite_len",
        constants$188.g_string_overwrite_len$FUNC, false
    );
    static final FunctionDescriptor g_string_erase$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_erase$MH = RuntimeHelper.downcallHandle(
        "g_string_erase",
        constants$188.g_string_erase$FUNC, false
    );
    static final FunctionDescriptor g_string_replace$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_string_replace$MH = RuntimeHelper.downcallHandle(
        "g_string_replace",
        constants$188.g_string_replace$FUNC, false
    );
}

