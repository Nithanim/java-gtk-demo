// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1351 {

    static final FunctionDescriptor atk_component_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle atk_component_get_type$MH = RuntimeHelper.downcallHandle(
        "atk_component_get_type",
        constants$1351.atk_component_get_type$FUNC, false
    );
    static final FunctionDescriptor atk_component_add_focus_handler$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_component_add_focus_handler$MH = RuntimeHelper.downcallHandle(
        "atk_component_add_focus_handler",
        constants$1351.atk_component_add_focus_handler$FUNC, false
    );
    static final FunctionDescriptor atk_component_contains$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_component_contains$MH = RuntimeHelper.downcallHandle(
        "atk_component_contains",
        constants$1351.atk_component_contains$FUNC, false
    );
    static final FunctionDescriptor atk_component_ref_accessible_at_point$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_component_ref_accessible_at_point$MH = RuntimeHelper.downcallHandle(
        "atk_component_ref_accessible_at_point",
        constants$1351.atk_component_ref_accessible_at_point$FUNC, false
    );
    static final FunctionDescriptor atk_component_get_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_component_get_extents$MH = RuntimeHelper.downcallHandle(
        "atk_component_get_extents",
        constants$1351.atk_component_get_extents$FUNC, false
    );
    static final FunctionDescriptor atk_component_get_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_component_get_position$MH = RuntimeHelper.downcallHandle(
        "atk_component_get_position",
        constants$1351.atk_component_get_position$FUNC, false
    );
}


