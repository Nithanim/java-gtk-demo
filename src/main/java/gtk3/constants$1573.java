// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1573 {

    static final FunctionDescriptor gtk_selection_owner_set_for_display$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_selection_owner_set_for_display$MH = RuntimeHelper.downcallHandle(
        "gtk_selection_owner_set_for_display",
        constants$1573.gtk_selection_owner_set_for_display$FUNC, false
    );
    static final FunctionDescriptor gtk_selection_add_target$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_selection_add_target$MH = RuntimeHelper.downcallHandle(
        "gtk_selection_add_target",
        constants$1573.gtk_selection_add_target$FUNC, false
    );
    static final FunctionDescriptor gtk_selection_add_targets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_selection_add_targets$MH = RuntimeHelper.downcallHandle(
        "gtk_selection_add_targets",
        constants$1573.gtk_selection_add_targets$FUNC, false
    );
    static final FunctionDescriptor gtk_selection_clear_targets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_selection_clear_targets$MH = RuntimeHelper.downcallHandle(
        "gtk_selection_clear_targets",
        constants$1573.gtk_selection_clear_targets$FUNC, false
    );
    static final FunctionDescriptor gtk_selection_convert$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_selection_convert$MH = RuntimeHelper.downcallHandle(
        "gtk_selection_convert",
        constants$1573.gtk_selection_convert$FUNC, false
    );
    static final FunctionDescriptor gtk_selection_remove_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_selection_remove_all$MH = RuntimeHelper.downcallHandle(
        "gtk_selection_remove_all",
        constants$1573.gtk_selection_remove_all$FUNC, false
    );
}

