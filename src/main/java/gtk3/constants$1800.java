// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1800 {

    static final FunctionDescriptor gtk_icon_theme_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_icon_theme_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_get_type",
        constants$1800.gtk_icon_theme_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_theme_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_icon_theme_new$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_new",
        constants$1800.gtk_icon_theme_new$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_theme_get_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_icon_theme_get_default$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_get_default",
        constants$1800.gtk_icon_theme_get_default$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_theme_get_for_screen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_theme_get_for_screen$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_get_for_screen",
        constants$1800.gtk_icon_theme_get_for_screen$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_theme_set_screen$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_theme_set_screen$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_set_screen",
        constants$1800.gtk_icon_theme_set_screen$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_theme_set_search_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_icon_theme_set_search_path$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_set_search_path",
        constants$1800.gtk_icon_theme_set_search_path$FUNC, false
    );
}

