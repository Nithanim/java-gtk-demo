// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1628 {

    static final FunctionDescriptor gtk_tree_view_enable_model_drag_dest$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_enable_model_drag_dest$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_enable_model_drag_dest",
        constants$1628.gtk_tree_view_enable_model_drag_dest$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_unset_rows_drag_source$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_unset_rows_drag_source$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_unset_rows_drag_source",
        constants$1628.gtk_tree_view_unset_rows_drag_source$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_unset_rows_drag_dest$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_unset_rows_drag_dest$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_unset_rows_drag_dest",
        constants$1628.gtk_tree_view_unset_rows_drag_dest$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_set_drag_dest_row$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_set_drag_dest_row$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_set_drag_dest_row",
        constants$1628.gtk_tree_view_set_drag_dest_row$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_get_drag_dest_row$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_drag_dest_row$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_drag_dest_row",
        constants$1628.gtk_tree_view_get_drag_dest_row$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_get_dest_row_at_pos$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_dest_row_at_pos$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_dest_row_at_pos",
        constants$1628.gtk_tree_view_get_dest_row_at_pos$FUNC, false
    );
}


