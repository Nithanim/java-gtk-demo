// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1311 {

    static final FunctionDescriptor gdk_selection_send_notify$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_selection_send_notify$MH = RuntimeHelper.downcallHandle(
        "gdk_selection_send_notify",
        constants$1311.gdk_selection_send_notify$FUNC, false
    );
    static final FunctionDescriptor gdk_selection_send_notify_for_display$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_selection_send_notify_for_display$MH = RuntimeHelper.downcallHandle(
        "gdk_selection_send_notify_for_display",
        constants$1311.gdk_selection_send_notify_for_display$FUNC, false
    );
    static final FunctionDescriptor gdk_test_render_sync$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_test_render_sync$MH = RuntimeHelper.downcallHandle(
        "gdk_test_render_sync",
        constants$1311.gdk_test_render_sync$FUNC, false
    );
    static final FunctionDescriptor gdk_test_simulate_key$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_test_simulate_key$MH = RuntimeHelper.downcallHandle(
        "gdk_test_simulate_key",
        constants$1311.gdk_test_simulate_key$FUNC, false
    );
    static final FunctionDescriptor gdk_test_simulate_button$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_test_simulate_button$MH = RuntimeHelper.downcallHandle(
        "gdk_test_simulate_button",
        constants$1311.gdk_test_simulate_button$FUNC, false
    );
    static final FunctionDescriptor gdk_threads_init$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gdk_threads_init$MH = RuntimeHelper.downcallHandle(
        "gdk_threads_init",
        constants$1311.gdk_threads_init$FUNC, false
    );
}


