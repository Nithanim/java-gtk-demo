// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1375 {

    static final FunctionDescriptor atk_selection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle atk_selection_get_type$MH = RuntimeHelper.downcallHandle(
        "atk_selection_get_type",
        constants$1375.atk_selection_get_type$FUNC, false
    );
    static final FunctionDescriptor atk_selection_add_selection$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_selection_add_selection$MH = RuntimeHelper.downcallHandle(
        "atk_selection_add_selection",
        constants$1375.atk_selection_add_selection$FUNC, false
    );
    static final FunctionDescriptor atk_selection_clear_selection$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_selection_clear_selection$MH = RuntimeHelper.downcallHandle(
        "atk_selection_clear_selection",
        constants$1375.atk_selection_clear_selection$FUNC, false
    );
    static final FunctionDescriptor atk_selection_ref_selection$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_selection_ref_selection$MH = RuntimeHelper.downcallHandle(
        "atk_selection_ref_selection",
        constants$1375.atk_selection_ref_selection$FUNC, false
    );
    static final FunctionDescriptor atk_selection_get_selection_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_selection_get_selection_count$MH = RuntimeHelper.downcallHandle(
        "atk_selection_get_selection_count",
        constants$1375.atk_selection_get_selection_count$FUNC, false
    );
    static final FunctionDescriptor atk_selection_is_child_selected$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_selection_is_child_selected$MH = RuntimeHelper.downcallHandle(
        "atk_selection_is_child_selected",
        constants$1375.atk_selection_is_child_selected$FUNC, false
    );
}


