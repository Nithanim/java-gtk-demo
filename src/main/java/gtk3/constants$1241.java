// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1241 {

    static final FunctionDescriptor gdk_display_get_default_seat$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_get_default_seat$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_default_seat",
        constants$1241.gdk_display_get_default_seat$FUNC, false
    );
    static final FunctionDescriptor gdk_display_list_seats$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_list_seats$MH = RuntimeHelper.downcallHandle(
        "gdk_display_list_seats",
        constants$1241.gdk_display_list_seats$FUNC, false
    );
    static final FunctionDescriptor gdk_display_get_n_monitors$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_get_n_monitors$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_n_monitors",
        constants$1241.gdk_display_get_n_monitors$FUNC, false
    );
    static final FunctionDescriptor gdk_display_get_monitor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_display_get_monitor$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_monitor",
        constants$1241.gdk_display_get_monitor$FUNC, false
    );
    static final FunctionDescriptor gdk_display_get_primary_monitor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_get_primary_monitor$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_primary_monitor",
        constants$1241.gdk_display_get_primary_monitor$FUNC, false
    );
    static final FunctionDescriptor gdk_display_get_monitor_at_point$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_display_get_monitor_at_point$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_monitor_at_point",
        constants$1241.gdk_display_get_monitor_at_point$FUNC, false
    );
}


