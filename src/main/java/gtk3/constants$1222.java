// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1222 {

    static final FunctionDescriptor gdk_window_maximize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_maximize$MH = RuntimeHelper.downcallHandle(
        "gdk_window_maximize",
        constants$1222.gdk_window_maximize$FUNC, false
    );
    static final FunctionDescriptor gdk_window_unmaximize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_unmaximize$MH = RuntimeHelper.downcallHandle(
        "gdk_window_unmaximize",
        constants$1222.gdk_window_unmaximize$FUNC, false
    );
    static final FunctionDescriptor gdk_window_fullscreen$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_fullscreen$MH = RuntimeHelper.downcallHandle(
        "gdk_window_fullscreen",
        constants$1222.gdk_window_fullscreen$FUNC, false
    );
    static final FunctionDescriptor gdk_window_fullscreen_on_monitor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_fullscreen_on_monitor$MH = RuntimeHelper.downcallHandle(
        "gdk_window_fullscreen_on_monitor",
        constants$1222.gdk_window_fullscreen_on_monitor$FUNC, false
    );
    static final FunctionDescriptor gdk_window_set_fullscreen_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_set_fullscreen_mode$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_fullscreen_mode",
        constants$1222.gdk_window_set_fullscreen_mode$FUNC, false
    );
    static final FunctionDescriptor gdk_window_get_fullscreen_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_fullscreen_mode$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_fullscreen_mode",
        constants$1222.gdk_window_get_fullscreen_mode$FUNC, false
    );
}

