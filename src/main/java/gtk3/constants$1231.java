// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1231 {

    static final FunctionDescriptor gdk_seat_get_pointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_seat_get_pointer$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_get_pointer",
        constants$1231.gdk_seat_get_pointer$FUNC, false
    );
    static final FunctionDescriptor gdk_seat_get_keyboard$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_seat_get_keyboard$MH = RuntimeHelper.downcallHandle(
        "gdk_seat_get_keyboard",
        constants$1231.gdk_seat_get_keyboard$FUNC, false
    );
    static final FunctionDescriptor gdk_rectangle_intersect$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_rectangle_intersect$MH = RuntimeHelper.downcallHandle(
        "gdk_rectangle_intersect",
        constants$1231.gdk_rectangle_intersect$FUNC, false
    );
    static final FunctionDescriptor gdk_rectangle_union$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_rectangle_union$MH = RuntimeHelper.downcallHandle(
        "gdk_rectangle_union",
        constants$1231.gdk_rectangle_union$FUNC, false
    );
    static final FunctionDescriptor gdk_rectangle_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_rectangle_equal$MH = RuntimeHelper.downcallHandle(
        "gdk_rectangle_equal",
        constants$1231.gdk_rectangle_equal$FUNC, false
    );
    static final FunctionDescriptor gdk_rectangle_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_rectangle_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_rectangle_get_type",
        constants$1231.gdk_rectangle_get_type$FUNC, false
    );
}


