// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$694 {

    static final FunctionDescriptor g_file_monitor_cancel$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_monitor_cancel$MH = RuntimeHelper.downcallHandle(
        "g_file_monitor_cancel",
        constants$694.g_file_monitor_cancel$FUNC, false
    );
    static final FunctionDescriptor g_file_monitor_is_cancelled$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_monitor_is_cancelled$MH = RuntimeHelper.downcallHandle(
        "g_file_monitor_is_cancelled",
        constants$694.g_file_monitor_is_cancelled$FUNC, false
    );
    static final FunctionDescriptor g_file_monitor_set_rate_limit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_file_monitor_set_rate_limit$MH = RuntimeHelper.downcallHandle(
        "g_file_monitor_set_rate_limit",
        constants$694.g_file_monitor_set_rate_limit$FUNC, false
    );
    static final FunctionDescriptor g_file_monitor_emit_event$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_file_monitor_emit_event$MH = RuntimeHelper.downcallHandle(
        "g_file_monitor_emit_event",
        constants$694.g_file_monitor_emit_event$FUNC, false
    );
    static final FunctionDescriptor g_filename_completer_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_filename_completer_get_type$MH = RuntimeHelper.downcallHandle(
        "g_filename_completer_get_type",
        constants$694.g_filename_completer_get_type$FUNC, false
    );
    static final FunctionDescriptor g_filename_completer_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_filename_completer_new$MH = RuntimeHelper.downcallHandle(
        "g_filename_completer_new",
        constants$694.g_filename_completer_new$FUNC, false
    );
}


