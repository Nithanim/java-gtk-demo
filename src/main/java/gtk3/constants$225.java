// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$225 {

    static final FunctionDescriptor g_variant_n_children$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_n_children$MH = RuntimeHelper.downcallHandle(
        "g_variant_n_children",
        constants$225.g_variant_n_children$FUNC, false
    );
    static final FunctionDescriptor g_variant_get_child$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_child$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_child",
        constants$225.g_variant_get_child$FUNC, true
    );
    static final FunctionDescriptor g_variant_get_child_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_variant_get_child_value$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_child_value",
        constants$225.g_variant_get_child_value$FUNC, false
    );
    static final FunctionDescriptor g_variant_lookup$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_lookup$MH = RuntimeHelper.downcallHandle(
        "g_variant_lookup",
        constants$225.g_variant_lookup$FUNC, true
    );
    static final FunctionDescriptor g_variant_lookup_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_lookup_value$MH = RuntimeHelper.downcallHandle(
        "g_variant_lookup_value",
        constants$225.g_variant_lookup_value$FUNC, false
    );
    static final FunctionDescriptor g_variant_get_fixed_array$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_variant_get_fixed_array$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_fixed_array",
        constants$225.g_variant_get_fixed_array$FUNC, false
    );
}

