// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$320 {

    static final FunctionDescriptor g_timer_reset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_timer_reset$MH = RuntimeHelper.downcallHandle(
        "g_timer_reset",
        constants$320.g_timer_reset$FUNC, false
    );
    static final FunctionDescriptor g_timer_continue$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_timer_continue$MH = RuntimeHelper.downcallHandle(
        "g_timer_continue",
        constants$320.g_timer_continue$FUNC, false
    );
    static final FunctionDescriptor g_timer_elapsed$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_timer_elapsed$MH = RuntimeHelper.downcallHandle(
        "g_timer_elapsed",
        constants$320.g_timer_elapsed$FUNC, false
    );
    static final FunctionDescriptor g_timer_is_active$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_timer_is_active$MH = RuntimeHelper.downcallHandle(
        "g_timer_is_active",
        constants$320.g_timer_is_active$FUNC, false
    );
    static final FunctionDescriptor g_usleep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_usleep$MH = RuntimeHelper.downcallHandle(
        "g_usleep",
        constants$320.g_usleep$FUNC, false
    );
    static final FunctionDescriptor g_time_val_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_time_val_add$MH = RuntimeHelper.downcallHandle(
        "g_time_val_add",
        constants$320.g_time_val_add$FUNC, false
    );
}


