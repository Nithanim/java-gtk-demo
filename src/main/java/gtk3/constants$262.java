// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$262 {

    static final FunctionDescriptor g_atomic_ref_count_inc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_atomic_ref_count_inc$MH = RuntimeHelper.downcallHandle(
        "g_atomic_ref_count_inc",
        constants$262.g_atomic_ref_count_inc$FUNC, false
    );
    static final FunctionDescriptor g_atomic_ref_count_dec$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_atomic_ref_count_dec$MH = RuntimeHelper.downcallHandle(
        "g_atomic_ref_count_dec",
        constants$262.g_atomic_ref_count_dec$FUNC, false
    );
    static final FunctionDescriptor g_atomic_ref_count_compare$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_atomic_ref_count_compare$MH = RuntimeHelper.downcallHandle(
        "g_atomic_ref_count_compare",
        constants$262.g_atomic_ref_count_compare$FUNC, false
    );
    static final FunctionDescriptor g_ref_string_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ref_string_new$MH = RuntimeHelper.downcallHandle(
        "g_ref_string_new",
        constants$262.g_ref_string_new$FUNC, false
    );
    static final FunctionDescriptor g_ref_string_new_len$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_ref_string_new_len$MH = RuntimeHelper.downcallHandle(
        "g_ref_string_new_len",
        constants$262.g_ref_string_new_len$FUNC, false
    );
    static final FunctionDescriptor g_ref_string_new_intern$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ref_string_new_intern$MH = RuntimeHelper.downcallHandle(
        "g_ref_string_new_intern",
        constants$262.g_ref_string_new_intern$FUNC, false
    );
}

