// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1533 {

    static final FunctionDescriptor gtk_tree_sortable_get_sort_column_id$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_sortable_get_sort_column_id$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_sortable_get_sort_column_id",
        constants$1533.gtk_tree_sortable_get_sort_column_id$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_sortable_set_sort_column_id$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_sortable_set_sort_column_id$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_sortable_set_sort_column_id",
        constants$1533.gtk_tree_sortable_set_sort_column_id$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_sortable_set_sort_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_sortable_set_sort_func$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_sortable_set_sort_func",
        constants$1533.gtk_tree_sortable_set_sort_func$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_sortable_set_default_sort_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_sortable_set_default_sort_func$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_sortable_set_default_sort_func",
        constants$1533.gtk_tree_sortable_set_default_sort_func$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_sortable_has_default_sort_func$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_sortable_has_default_sort_func$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_sortable_has_default_sort_func",
        constants$1533.gtk_tree_sortable_has_default_sort_func$FUNC, false
    );
    static final FunctionDescriptor GtkCellCallback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


