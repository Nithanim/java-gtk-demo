// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$226 {

    static final FunctionDescriptor g_variant_get_size$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_size$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_size",
        constants$226.g_variant_get_size$FUNC, false
    );
    static final FunctionDescriptor g_variant_get_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_data$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_data",
        constants$226.g_variant_get_data$FUNC, false
    );
    static final FunctionDescriptor g_variant_get_data_as_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_data_as_bytes$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_data_as_bytes",
        constants$226.g_variant_get_data_as_bytes$FUNC, false
    );
    static final FunctionDescriptor g_variant_store$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_store$MH = RuntimeHelper.downcallHandle(
        "g_variant_store",
        constants$226.g_variant_store$FUNC, false
    );
    static final FunctionDescriptor g_variant_print$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_variant_print$MH = RuntimeHelper.downcallHandle(
        "g_variant_print",
        constants$226.g_variant_print$FUNC, false
    );
    static final FunctionDescriptor g_variant_print_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_variant_print_string$MH = RuntimeHelper.downcallHandle(
        "g_variant_print_string",
        constants$226.g_variant_print_string$FUNC, false
    );
}

