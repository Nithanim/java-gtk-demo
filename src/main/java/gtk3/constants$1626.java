// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1626 {

    static final FunctionDescriptor gtk_tree_view_get_reorderable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_reorderable$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_reorderable",
        constants$1626.gtk_tree_view_get_reorderable$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_set_cursor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_set_cursor$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_set_cursor",
        constants$1626.gtk_tree_view_set_cursor$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_set_cursor_on_cell$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_set_cursor_on_cell$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_set_cursor_on_cell",
        constants$1626.gtk_tree_view_set_cursor_on_cell$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_get_cursor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_cursor$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_cursor",
        constants$1626.gtk_tree_view_get_cursor$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_get_bin_window$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_bin_window$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_bin_window",
        constants$1626.gtk_tree_view_get_bin_window$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_get_path_at_pos$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_path_at_pos$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_path_at_pos",
        constants$1626.gtk_tree_view_get_path_at_pos$FUNC, false
    );
}


