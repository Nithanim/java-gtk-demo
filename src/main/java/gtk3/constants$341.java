// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$341 {

    static final FunctionDescriptor g_completion_add_items$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_completion_add_items$MH = RuntimeHelper.downcallHandle(
        "g_completion_add_items",
        constants$341.g_completion_add_items$FUNC, false
    );
    static final FunctionDescriptor g_completion_remove_items$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_completion_remove_items$MH = RuntimeHelper.downcallHandle(
        "g_completion_remove_items",
        constants$341.g_completion_remove_items$FUNC, false
    );
    static final FunctionDescriptor g_completion_clear_items$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_completion_clear_items$MH = RuntimeHelper.downcallHandle(
        "g_completion_clear_items",
        constants$341.g_completion_clear_items$FUNC, false
    );
    static final FunctionDescriptor g_completion_complete$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_completion_complete$MH = RuntimeHelper.downcallHandle(
        "g_completion_complete",
        constants$341.g_completion_complete$FUNC, false
    );
    static final FunctionDescriptor g_completion_complete_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_completion_complete_utf8$MH = RuntimeHelper.downcallHandle(
        "g_completion_complete_utf8",
        constants$341.g_completion_complete_utf8$FUNC, false
    );
    static final FunctionDescriptor g_completion_set_compare$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_completion_set_compare$MH = RuntimeHelper.downcallHandle(
        "g_completion_set_compare",
        constants$341.g_completion_set_compare$FUNC, false
    );
}

