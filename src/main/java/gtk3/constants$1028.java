// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1028 {

    static final FunctionDescriptor hb_shape_plan_set_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_shape_plan_set_user_data$MH = RuntimeHelper.downcallHandle(
        "hb_shape_plan_set_user_data",
        constants$1028.hb_shape_plan_set_user_data$FUNC, false
    );
    static final FunctionDescriptor hb_shape_plan_get_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_shape_plan_get_user_data$MH = RuntimeHelper.downcallHandle(
        "hb_shape_plan_get_user_data",
        constants$1028.hb_shape_plan_get_user_data$FUNC, false
    );
    static final FunctionDescriptor hb_shape_plan_execute$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_shape_plan_execute$MH = RuntimeHelper.downcallHandle(
        "hb_shape_plan_execute",
        constants$1028.hb_shape_plan_execute$FUNC, false
    );
    static final FunctionDescriptor hb_shape_plan_get_shaper$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_shape_plan_get_shaper$MH = RuntimeHelper.downcallHandle(
        "hb_shape_plan_get_shaper",
        constants$1028.hb_shape_plan_get_shaper$FUNC, false
    );
    static final FunctionDescriptor hb_version$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_version$MH = RuntimeHelper.downcallHandle(
        "hb_version",
        constants$1028.hb_version$FUNC, false
    );
    static final FunctionDescriptor hb_version_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle hb_version_string$MH = RuntimeHelper.downcallHandle(
        "hb_version_string",
        constants$1028.hb_version_string$FUNC, false
    );
}


