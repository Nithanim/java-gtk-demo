// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$2033 {

    static final FunctionDescriptor gtk_tree_selection_unselect_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_unselect_path$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_unselect_path",
        constants$2033.gtk_tree_selection_unselect_path$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_selection_select_iter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_select_iter$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_select_iter",
        constants$2033.gtk_tree_selection_select_iter$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_selection_unselect_iter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_unselect_iter$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_unselect_iter",
        constants$2033.gtk_tree_selection_unselect_iter$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_selection_path_is_selected$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_path_is_selected$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_path_is_selected",
        constants$2033.gtk_tree_selection_path_is_selected$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_selection_iter_is_selected$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_iter_is_selected$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_iter_is_selected",
        constants$2033.gtk_tree_selection_iter_is_selected$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_selection_select_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_select_all$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_select_all",
        constants$2033.gtk_tree_selection_select_all$FUNC, false
    );
}


