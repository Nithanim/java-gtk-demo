// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1595 {

    static final FunctionDescriptor gtk_entry_completion_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_entry_completion_new$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_new",
        constants$1595.gtk_entry_completion_new$FUNC, false
    );
    static final FunctionDescriptor gtk_entry_completion_new_with_area$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_new_with_area$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_new_with_area",
        constants$1595.gtk_entry_completion_new_with_area$FUNC, false
    );
    static final FunctionDescriptor gtk_entry_completion_get_entry$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_get_entry$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_get_entry",
        constants$1595.gtk_entry_completion_get_entry$FUNC, false
    );
    static final FunctionDescriptor gtk_entry_completion_set_model$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_set_model$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_set_model",
        constants$1595.gtk_entry_completion_set_model$FUNC, false
    );
    static final FunctionDescriptor gtk_entry_completion_get_model$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_get_model$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_get_model",
        constants$1595.gtk_entry_completion_get_model$FUNC, false
    );
    static final FunctionDescriptor gtk_entry_completion_set_match_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_set_match_func$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_set_match_func",
        constants$1595.gtk_entry_completion_set_match_func$FUNC, false
    );
}

