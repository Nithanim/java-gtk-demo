// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1182 {

    static final FunctionDescriptor gdk_device_get_device_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_device_type$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_device_type",
        constants$1182.gdk_device_get_device_type$FUNC, false
    );
    static final FunctionDescriptor gdk_device_grab$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_device_grab$MH = RuntimeHelper.downcallHandle(
        "gdk_device_grab",
        constants$1182.gdk_device_grab$FUNC, false
    );
    static final FunctionDescriptor gdk_device_ungrab$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_device_ungrab$MH = RuntimeHelper.downcallHandle(
        "gdk_device_ungrab",
        constants$1182.gdk_device_ungrab$FUNC, false
    );
    static final FunctionDescriptor gdk_device_warp$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_device_warp$MH = RuntimeHelper.downcallHandle(
        "gdk_device_warp",
        constants$1182.gdk_device_warp$FUNC, false
    );
    static final FunctionDescriptor gdk_device_grab_info_libgtk_only$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_grab_info_libgtk_only$MH = RuntimeHelper.downcallHandle(
        "gdk_device_grab_info_libgtk_only",
        constants$1182.gdk_device_grab_info_libgtk_only$FUNC, false
    );
    static final FunctionDescriptor gdk_device_get_last_event_window$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_last_event_window$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_last_event_window",
        constants$1182.gdk_device_get_last_event_window$FUNC, false
    );
}


