// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1348 {

    static final FunctionDescriptor AtkKeySnoopFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AtkKeySnoopFunc$MH = RuntimeHelper.downcallHandle(
        constants$1348.AtkKeySnoopFunc$FUNC, false
    );
    static final FunctionDescriptor atk_util_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle atk_util_get_type$MH = RuntimeHelper.downcallHandle(
        "atk_util_get_type",
        constants$1348.atk_util_get_type$FUNC, false
    );
    static final FunctionDescriptor atk_add_focus_tracker$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_add_focus_tracker$MH = RuntimeHelper.downcallHandle(
        "atk_add_focus_tracker",
        constants$1348.atk_add_focus_tracker$FUNC, false
    );
    static final FunctionDescriptor atk_remove_focus_tracker$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_remove_focus_tracker$MH = RuntimeHelper.downcallHandle(
        "atk_remove_focus_tracker",
        constants$1348.atk_remove_focus_tracker$FUNC, false
    );
    static final FunctionDescriptor atk_focus_tracker_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_focus_tracker_init$MH = RuntimeHelper.downcallHandle(
        "atk_focus_tracker_init",
        constants$1348.atk_focus_tracker_init$FUNC, false
    );
    static final FunctionDescriptor atk_focus_tracker_notify$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_focus_tracker_notify$MH = RuntimeHelper.downcallHandle(
        "atk_focus_tracker_notify",
        constants$1348.atk_focus_tracker_notify$FUNC, false
    );
}

