// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1245 {

    static final FunctionDescriptor gdk_screen_get_monitor_workarea$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_screen_get_monitor_workarea$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_get_monitor_workarea",
        constants$1245.gdk_screen_get_monitor_workarea$FUNC, false
    );
    static final FunctionDescriptor gdk_screen_get_monitor_at_point$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_screen_get_monitor_at_point$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_get_monitor_at_point",
        constants$1245.gdk_screen_get_monitor_at_point$FUNC, false
    );
    static final FunctionDescriptor gdk_screen_get_monitor_at_window$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_screen_get_monitor_at_window$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_get_monitor_at_window",
        constants$1245.gdk_screen_get_monitor_at_window$FUNC, false
    );
    static final FunctionDescriptor gdk_screen_get_monitor_width_mm$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_screen_get_monitor_width_mm$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_get_monitor_width_mm",
        constants$1245.gdk_screen_get_monitor_width_mm$FUNC, false
    );
    static final FunctionDescriptor gdk_screen_get_monitor_height_mm$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_screen_get_monitor_height_mm$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_get_monitor_height_mm",
        constants$1245.gdk_screen_get_monitor_height_mm$FUNC, false
    );
    static final FunctionDescriptor gdk_screen_get_monitor_plug_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_screen_get_monitor_plug_name$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_get_monitor_plug_name",
        constants$1245.gdk_screen_get_monitor_plug_name$FUNC, false
    );
}


