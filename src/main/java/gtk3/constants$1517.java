// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1517 {

    static final FunctionDescriptor gtk_tree_path_new_from_indicesv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gtk_tree_path_new_from_indicesv$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_path_new_from_indicesv",
        constants$1517.gtk_tree_path_new_from_indicesv$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_path_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_path_to_string$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_path_to_string",
        constants$1517.gtk_tree_path_to_string$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_path_new_first$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_tree_path_new_first$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_path_new_first",
        constants$1517.gtk_tree_path_new_first$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_path_append_index$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_path_append_index$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_path_append_index",
        constants$1517.gtk_tree_path_append_index$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_path_prepend_index$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_path_prepend_index$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_path_prepend_index",
        constants$1517.gtk_tree_path_prepend_index$FUNC, false
    );
    static final FunctionDescriptor gtk_tree_path_get_depth$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_path_get_depth$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_path_get_depth",
        constants$1517.gtk_tree_path_get_depth$FUNC, false
    );
}


