// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1230 {

    static final FunctionDescriptor gdk_seat_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_seat_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_get_type",
        constants$1230.gdk_seat_get_type$FUNC, false
    );
    static final FunctionDescriptor gdk_seat_grab$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_seat_grab$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_grab",
        constants$1230.gdk_seat_grab$FUNC, false
    );
    static final FunctionDescriptor gdk_seat_ungrab$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_seat_ungrab$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_ungrab",
        constants$1230.gdk_seat_ungrab$FUNC, false
    );
    static final FunctionDescriptor gdk_seat_get_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_seat_get_display$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_get_display",
        constants$1230.gdk_seat_get_display$FUNC, false
    );
    static final FunctionDescriptor gdk_seat_get_capabilities$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_seat_get_capabilities$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_get_capabilities",
        constants$1230.gdk_seat_get_capabilities$FUNC, false
    );
    static final FunctionDescriptor gdk_seat_get_slaves$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_seat_get_slaves$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_get_slaves",
        constants$1230.gdk_seat_get_slaves$FUNC, false
    );
}


