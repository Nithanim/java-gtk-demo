// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$158 {

    static final FunctionDescriptor g_main_context_iteration$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_main_context_iteration$MH = RuntimeHelper.downcallHandle(
        "g_main_context_iteration",
        constants$158.g_main_context_iteration$FUNC, false
    );
    static final FunctionDescriptor g_main_context_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_pending$MH = RuntimeHelper.downcallHandle(
        "g_main_context_pending",
        constants$158.g_main_context_pending$FUNC, false
    );
    static final FunctionDescriptor g_main_context_find_source_by_id$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_main_context_find_source_by_id$MH = RuntimeHelper.downcallHandle(
        "g_main_context_find_source_by_id",
        constants$158.g_main_context_find_source_by_id$FUNC, false
    );
    static final FunctionDescriptor g_main_context_find_source_by_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_find_source_by_user_data$MH = RuntimeHelper.downcallHandle(
        "g_main_context_find_source_by_user_data",
        constants$158.g_main_context_find_source_by_user_data$FUNC, false
    );
    static final FunctionDescriptor g_main_context_find_source_by_funcs_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_find_source_by_funcs_user_data$MH = RuntimeHelper.downcallHandle(
        "g_main_context_find_source_by_funcs_user_data",
        constants$158.g_main_context_find_source_by_funcs_user_data$FUNC, false
    );
    static final FunctionDescriptor g_main_context_wakeup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_wakeup$MH = RuntimeHelper.downcallHandle(
        "g_main_context_wakeup",
        constants$158.g_main_context_wakeup$FUNC, false
    );
}

