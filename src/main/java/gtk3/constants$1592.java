// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1592 {

    static final FunctionDescriptor GtkTreeModelFilterVisibleFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTreeModelFilterVisibleFunc$MH = RuntimeHelper.downcallHandle(
        constants$1592.GtkTreeModelFilterVisibleFunc$FUNC, false
    );
    static final FunctionDescriptor GtkTreeModelFilterModifyFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkTreeModelFilterModifyFunc$MH = RuntimeHelper.downcallHandle(
        constants$1592.GtkTreeModelFilterModifyFunc$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_model_filter_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_tree_model_filter_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_filter_get_type",
        constants$1592.gtk_tree_model_filter_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_model_filter_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_model_filter_new$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_filter_new",
        constants$1592.gtk_tree_model_filter_new$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_model_filter_set_visible_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_model_filter_set_visible_func$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_filter_set_visible_func",
        constants$1592.gtk_tree_model_filter_set_visible_func$FUNC, false
    );
}


