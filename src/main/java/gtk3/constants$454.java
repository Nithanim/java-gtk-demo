// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$454 {

    static final FunctionDescriptor g_signal_stop_emission_by_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_stop_emission_by_name$MH = RuntimeHelper.downcallHandle(
        "g_signal_stop_emission_by_name",
        constants$454.g_signal_stop_emission_by_name$FUNC, false
    );
    static final FunctionDescriptor g_signal_add_emission_hook$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_add_emission_hook$MH = RuntimeHelper.downcallHandle(
        "g_signal_add_emission_hook",
        constants$454.g_signal_add_emission_hook$FUNC, false
    );
    static final FunctionDescriptor g_signal_remove_emission_hook$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_signal_remove_emission_hook$MH = RuntimeHelper.downcallHandle(
        "g_signal_remove_emission_hook",
        constants$454.g_signal_remove_emission_hook$FUNC, false
    );
    static final FunctionDescriptor g_signal_has_handler_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_has_handler_pending$MH = RuntimeHelper.downcallHandle(
        "g_signal_has_handler_pending",
        constants$454.g_signal_has_handler_pending$FUNC, false
    );
    static final FunctionDescriptor g_signal_connect_closure_by_id$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_connect_closure_by_id$MH = RuntimeHelper.downcallHandle(
        "g_signal_connect_closure_by_id",
        constants$454.g_signal_connect_closure_by_id$FUNC, false
    );
    static final FunctionDescriptor g_signal_connect_closure$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_connect_closure$MH = RuntimeHelper.downcallHandle(
        "g_signal_connect_closure",
        constants$454.g_signal_connect_closure$FUNC, false
    );
}

