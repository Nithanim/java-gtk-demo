// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1629 {

    static final FunctionDescriptor gtk_tree_view_create_row_drag_icon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_create_row_drag_icon$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_create_row_drag_icon",
        constants$1629.gtk_tree_view_create_row_drag_icon$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_set_enable_search$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_set_enable_search$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_set_enable_search",
        constants$1629.gtk_tree_view_set_enable_search$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_get_enable_search$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_enable_search$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_enable_search",
        constants$1629.gtk_tree_view_get_enable_search$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_get_search_column$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_search_column$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_search_column",
        constants$1629.gtk_tree_view_get_search_column$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_set_search_column$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_set_search_column$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_set_search_column",
        constants$1629.gtk_tree_view_set_search_column$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_get_search_equal_func$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_search_equal_func$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_search_equal_func",
        constants$1629.gtk_tree_view_get_search_equal_func$FUNC, false
    );
}


