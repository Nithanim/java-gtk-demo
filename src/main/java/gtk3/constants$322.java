// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$322 {

    static final FunctionDescriptor GTraverseFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTraverseFunc$MH = RuntimeHelper.downcallHandle(
        constants$322.GTraverseFunc$FUNC, false
    );
    static final FunctionDescriptor GTraverseNodeFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTraverseNodeFunc$MH = RuntimeHelper.downcallHandle(
        constants$322.GTraverseNodeFunc$FUNC, false
    );
    static final FunctionDescriptor g_tree_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_new$MH = RuntimeHelper.downcallHandle(
        "g_tree_new",
        constants$322.g_tree_new$FUNC, false
    );
    static final FunctionDescriptor g_tree_new_with_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_new_with_data$MH = RuntimeHelper.downcallHandle(
        "g_tree_new_with_data",
        constants$322.g_tree_new_with_data$FUNC, false
    );
}


