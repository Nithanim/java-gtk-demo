// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$170 {

    static final FunctionDescriptor g_source_remove_by_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_remove_by_user_data$MH = RuntimeHelper.downcallHandle(
        "g_source_remove_by_user_data",
        constants$170.g_source_remove_by_user_data$FUNC, false
    );
    static final FunctionDescriptor g_source_remove_by_funcs_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_remove_by_funcs_user_data$MH = RuntimeHelper.downcallHandle(
        "g_source_remove_by_funcs_user_data",
        constants$170.g_source_remove_by_funcs_user_data$FUNC, false
    );
    static final FunctionDescriptor GClearHandleFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle GClearHandleFunc$MH = RuntimeHelper.downcallHandle(
        constants$170.GClearHandleFunc$FUNC, false
    );
    static final FunctionDescriptor g_clear_handle_id$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_clear_handle_id$MH = RuntimeHelper.downcallHandle(
        "g_clear_handle_id",
        constants$170.g_clear_handle_id$FUNC, false
    );
    static final FunctionDescriptor g_timeout_add_full$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_timeout_add_full$MH = RuntimeHelper.downcallHandle(
        "g_timeout_add_full",
        constants$170.g_timeout_add_full$FUNC, false
    );
}


