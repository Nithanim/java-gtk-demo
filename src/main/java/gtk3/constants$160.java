// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$160 {

    static final FunctionDescriptor g_main_context_check$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_main_context_check$MH = RuntimeHelper.downcallHandle(
        "g_main_context_check",
        constants$160.g_main_context_check$FUNC, false
    );
    static final FunctionDescriptor g_main_context_dispatch$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_dispatch$MH = RuntimeHelper.downcallHandle(
        "g_main_context_dispatch",
        constants$160.g_main_context_dispatch$FUNC, false
    );
    static final FunctionDescriptor g_main_context_set_poll_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_set_poll_func$MH = RuntimeHelper.downcallHandle(
        "g_main_context_set_poll_func",
        constants$160.g_main_context_set_poll_func$FUNC, false
    );
    static final FunctionDescriptor g_main_context_get_poll_func$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_get_poll_func$MH = RuntimeHelper.downcallHandle(
        "g_main_context_get_poll_func",
        constants$160.g_main_context_get_poll_func$FUNC, false
    );
    static final FunctionDescriptor g_main_context_add_poll$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_main_context_add_poll$MH = RuntimeHelper.downcallHandle(
        "g_main_context_add_poll",
        constants$160.g_main_context_add_poll$FUNC, false
    );
    static final FunctionDescriptor g_main_context_remove_poll$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_remove_poll$MH = RuntimeHelper.downcallHandle(
        "g_main_context_remove_poll",
        constants$160.g_main_context_remove_poll$FUNC, false
    );
}


