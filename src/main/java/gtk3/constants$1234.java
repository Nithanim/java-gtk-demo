// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1234 {

    static final FunctionDescriptor gdk_display_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_display_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_type",
        constants$1234.gdk_display_get_type$FUNC, false
    );
    static final FunctionDescriptor gdk_display_open$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_open$MH = RuntimeHelper.downcallHandle(
        "gdk_display_open",
        constants$1234.gdk_display_open$FUNC, false
    );
    static final FunctionDescriptor gdk_display_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_get_name$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_name",
        constants$1234.gdk_display_get_name$FUNC, false
    );
    static final FunctionDescriptor gdk_display_get_n_screens$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_get_n_screens$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_n_screens",
        constants$1234.gdk_display_get_n_screens$FUNC, false
    );
    static final FunctionDescriptor gdk_display_get_screen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_display_get_screen$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_screen",
        constants$1234.gdk_display_get_screen$FUNC, false
    );
    static final FunctionDescriptor gdk_display_get_default_screen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_get_default_screen$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_default_screen",
        constants$1234.gdk_display_get_default_screen$FUNC, false
    );
}


