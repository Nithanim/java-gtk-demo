// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1307 {

    static final FunctionDescriptor gdk_set_double_click_time$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_set_double_click_time$MH = RuntimeHelper.downcallHandle(
        "gdk_set_double_click_time",
        constants$1307.gdk_set_double_click_time$FUNC, false
    );
    static final FunctionDescriptor gdk_beep$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gdk_beep$MH = RuntimeHelper.downcallHandle(
        "gdk_beep",
        constants$1307.gdk_beep$FUNC, false
    );
    static final FunctionDescriptor gdk_flush$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gdk_flush$MH = RuntimeHelper.downcallHandle(
        "gdk_flush",
        constants$1307.gdk_flush$FUNC, false
    );
    static final FunctionDescriptor gdk_disable_multidevice$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gdk_disable_multidevice$MH = RuntimeHelper.downcallHandle(
        "gdk_disable_multidevice",
        constants$1307.gdk_disable_multidevice$FUNC, false
    );
    static final FunctionDescriptor gdk_set_allowed_backends$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_set_allowed_backends$MH = RuntimeHelper.downcallHandle(
        "gdk_set_allowed_backends",
        constants$1307.gdk_set_allowed_backends$FUNC, false
    );
    static final FunctionDescriptor gdk_pango_context_get_for_screen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pango_context_get_for_screen$MH = RuntimeHelper.downcallHandle(
        "gdk_pango_context_get_for_screen",
        constants$1307.gdk_pango_context_get_for_screen$FUNC, false
    );
}

