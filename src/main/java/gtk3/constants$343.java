// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$343 {

    static final FunctionDescriptor g_relation_select$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_relation_select$MH = RuntimeHelper.downcallHandle(
        "g_relation_select",
        constants$343.g_relation_select$FUNC, false
    );
    static final FunctionDescriptor g_relation_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_relation_count$MH = RuntimeHelper.downcallHandle(
        "g_relation_count",
        constants$343.g_relation_count$FUNC, false
    );
    static final FunctionDescriptor g_relation_exists$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_relation_exists$MH = RuntimeHelper.downcallHandle(
        "g_relation_exists",
        constants$343.g_relation_exists$FUNC, true
    );
    static final FunctionDescriptor g_relation_print$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_relation_print$MH = RuntimeHelper.downcallHandle(
        "g_relation_print",
        constants$343.g_relation_print$FUNC, false
    );
    static final FunctionDescriptor g_tuples_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tuples_destroy$MH = RuntimeHelper.downcallHandle(
        "g_tuples_destroy",
        constants$343.g_tuples_destroy$FUNC, false
    );
    static final FunctionDescriptor g_tuples_index$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_tuples_index$MH = RuntimeHelper.downcallHandle(
        "g_tuples_index",
        constants$343.g_tuples_index$FUNC, false
    );
}


