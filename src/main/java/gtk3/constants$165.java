// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$165 {

    static final FunctionDescriptor g_source_get_can_recurse$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_get_can_recurse$MH = RuntimeHelper.downcallHandle(
        "g_source_get_can_recurse",
        constants$165.g_source_get_can_recurse$FUNC, false
    );
    static final FunctionDescriptor g_source_get_id$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_get_id$MH = RuntimeHelper.downcallHandle(
        "g_source_get_id",
        constants$165.g_source_get_id$FUNC, false
    );
    static final FunctionDescriptor g_source_get_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_get_context$MH = RuntimeHelper.downcallHandle(
        "g_source_get_context",
        constants$165.g_source_get_context$FUNC, false
    );
    static final FunctionDescriptor g_source_set_callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_set_callback$MH = RuntimeHelper.downcallHandle(
        "g_source_set_callback",
        constants$165.g_source_set_callback$FUNC, false
    );
    static final FunctionDescriptor g_source_set_funcs$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_set_funcs$MH = RuntimeHelper.downcallHandle(
        "g_source_set_funcs",
        constants$165.g_source_set_funcs$FUNC, false
    );
    static final FunctionDescriptor g_source_is_destroyed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_is_destroyed$MH = RuntimeHelper.downcallHandle(
        "g_source_is_destroyed",
        constants$165.g_source_is_destroyed$FUNC, false
    );
}


