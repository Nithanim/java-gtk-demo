// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1623 {

    static final FunctionDescriptor gtk_tree_view_get_n_columns$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_n_columns$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_n_columns",
        constants$1623.gtk_tree_view_get_n_columns$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_get_column$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_column$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_column",
        constants$1623.gtk_tree_view_get_column$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_get_columns$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_columns$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_columns",
        constants$1623.gtk_tree_view_get_columns$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_move_column_after$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_move_column_after$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_move_column_after",
        constants$1623.gtk_tree_view_move_column_after$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_set_expander_column$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_set_expander_column$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_set_expander_column",
        constants$1623.gtk_tree_view_set_expander_column$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_get_expander_column$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_expander_column$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_expander_column",
        constants$1623.gtk_tree_view_get_expander_column$FUNC, false
    );
}

