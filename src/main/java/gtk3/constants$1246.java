// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1246 {

    static final FunctionDescriptor gdk_screen_get_monitor_scale_factor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_screen_get_monitor_scale_factor$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_get_monitor_scale_factor",
        constants$1246.gdk_screen_get_monitor_scale_factor$FUNC, false
    );
    static final FunctionDescriptor gdk_screen_get_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_screen_get_default$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_get_default",
        constants$1246.gdk_screen_get_default$FUNC, false
    );
    static final FunctionDescriptor gdk_screen_get_setting$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_screen_get_setting$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_get_setting",
        constants$1246.gdk_screen_get_setting$FUNC, false
    );
    static final FunctionDescriptor gdk_screen_set_font_options$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_screen_set_font_options$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_set_font_options",
        constants$1246.gdk_screen_set_font_options$FUNC, false
    );
    static final FunctionDescriptor gdk_screen_get_font_options$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_screen_get_font_options$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_get_font_options",
        constants$1246.gdk_screen_get_font_options$FUNC, false
    );
    static final FunctionDescriptor gdk_screen_set_resolution$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gdk_screen_set_resolution$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_set_resolution",
        constants$1246.gdk_screen_set_resolution$FUNC, false
    );
}

