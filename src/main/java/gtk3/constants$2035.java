// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$2035 {

    static final FunctionDescriptor gtk_tree_store_set_column_types$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_set_column_types$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_set_column_types",
        constants$2035.gtk_tree_store_set_column_types$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_store_set_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_set_value$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_set_value",
        constants$2035.gtk_tree_store_set_value$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_store_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_set$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_set",
        constants$2035.gtk_tree_store_set$FUNC, true
    );
    static final FunctionDescriptor gtk_tree_store_set_valuesv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_store_set_valuesv$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_set_valuesv",
        constants$2035.gtk_tree_store_set_valuesv$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_store_set_valist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_set_valist$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_set_valist",
        constants$2035.gtk_tree_store_set_valist$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_store_remove$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_remove$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_remove",
        constants$2035.gtk_tree_store_remove$FUNC, false
    );
}

