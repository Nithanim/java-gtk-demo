// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1543 {

    static final FunctionDescriptor gtk_tree_view_column_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_tree_view_column_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_column_get_type",
        constants$1543.gtk_tree_view_column_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_column_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_tree_view_column_new$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_column_new",
        constants$1543.gtk_tree_view_column_new$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_column_new_with_area$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_column_new_with_area$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_column_new_with_area",
        constants$1543.gtk_tree_view_column_new_with_area$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_column_new_with_attributes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_column_new_with_attributes$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_column_new_with_attributes",
        constants$1543.gtk_tree_view_column_new_with_attributes$FUNC, true
    );
    static final FunctionDescriptor gtk_tree_view_column_pack_start$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_column_pack_start$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_column_pack_start",
        constants$1543.gtk_tree_view_column_pack_start$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_view_column_pack_end$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_column_pack_end$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_column_pack_end",
        constants$1543.gtk_tree_view_column_pack_end$FUNC, false
    );
}


