// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1344 {

    static final FunctionDescriptor atk_object_notify_state_change$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_object_notify_state_change$MH = RuntimeHelper.downcallHandle(
        "atk_object_notify_state_change",
        constants$1344.atk_object_notify_state_change$FUNC, false
    );
    static final FunctionDescriptor atk_object_initialize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_object_initialize$MH = RuntimeHelper.downcallHandle(
        "atk_object_initialize",
        constants$1344.atk_object_initialize$FUNC, false
    );
    static final FunctionDescriptor atk_role_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_role_get_name$MH = RuntimeHelper.downcallHandle(
        "atk_role_get_name",
        constants$1344.atk_role_get_name$FUNC, false
    );
    static final FunctionDescriptor atk_role_for_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_role_for_name$MH = RuntimeHelper.downcallHandle(
        "atk_role_for_name",
        constants$1344.atk_role_for_name$FUNC, false
    );
    static final FunctionDescriptor atk_object_add_relationship$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_object_add_relationship$MH = RuntimeHelper.downcallHandle(
        "atk_object_add_relationship",
        constants$1344.atk_object_add_relationship$FUNC, false
    );
    static final FunctionDescriptor atk_object_remove_relationship$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_object_remove_relationship$MH = RuntimeHelper.downcallHandle(
        "atk_object_remove_relationship",
        constants$1344.atk_object_remove_relationship$FUNC, false
    );
}


