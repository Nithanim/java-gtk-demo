// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1185 {

    static final FunctionDescriptor gdk_drag_context_get_dest_window$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_drag_context_get_dest_window$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_context_get_dest_window",
        constants$1185.gdk_drag_context_get_dest_window$FUNC, false
    );
    static final FunctionDescriptor gdk_drag_context_get_protocol$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_drag_context_get_protocol$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_context_get_protocol",
        constants$1185.gdk_drag_context_get_protocol$FUNC, false
    );
    static final FunctionDescriptor gdk_drag_status$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_drag_status$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_status",
        constants$1185.gdk_drag_status$FUNC, false
    );
    static final FunctionDescriptor gdk_drop_reply$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_drop_reply$MH = RuntimeHelper.downcallHandle(
        "gdk_drop_reply",
        constants$1185.gdk_drop_reply$FUNC, false
    );
    static final FunctionDescriptor gdk_drop_finish$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_drop_finish$MH = RuntimeHelper.downcallHandle(
        "gdk_drop_finish",
        constants$1185.gdk_drop_finish$FUNC, false
    );
    static final FunctionDescriptor gdk_drag_get_selection$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_drag_get_selection$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_get_selection",
        constants$1185.gdk_drag_get_selection$FUNC, false
    );
}


