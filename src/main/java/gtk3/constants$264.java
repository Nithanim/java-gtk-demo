// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$264 {

    static final FunctionDescriptor g_regex_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_regex_new$MH = RuntimeHelper.downcallHandle(
        "g_regex_new",
        constants$264.g_regex_new$FUNC, false
    );
    static final FunctionDescriptor g_regex_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_regex_ref$MH = RuntimeHelper.downcallHandle(
        "g_regex_ref",
        constants$264.g_regex_ref$FUNC, false
    );
    static final FunctionDescriptor g_regex_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_regex_unref$MH = RuntimeHelper.downcallHandle(
        "g_regex_unref",
        constants$264.g_regex_unref$FUNC, false
    );
    static final FunctionDescriptor g_regex_get_pattern$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_regex_get_pattern$MH = RuntimeHelper.downcallHandle(
        "g_regex_get_pattern",
        constants$264.g_regex_get_pattern$FUNC, false
    );
    static final FunctionDescriptor g_regex_get_max_backref$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_regex_get_max_backref$MH = RuntimeHelper.downcallHandle(
        "g_regex_get_max_backref",
        constants$264.g_regex_get_max_backref$FUNC, false
    );
    static final FunctionDescriptor g_regex_get_capture_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_regex_get_capture_count$MH = RuntimeHelper.downcallHandle(
        "g_regex_get_capture_count",
        constants$264.g_regex_get_capture_count$FUNC, false
    );
}


