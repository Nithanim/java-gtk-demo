// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1801 {

    static final FunctionDescriptor gtk_icon_theme_get_search_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_theme_get_search_path$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_get_search_path",
        constants$1801.gtk_icon_theme_get_search_path$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_theme_append_search_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_theme_append_search_path$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_append_search_path",
        constants$1801.gtk_icon_theme_append_search_path$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_theme_prepend_search_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_theme_prepend_search_path$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_prepend_search_path",
        constants$1801.gtk_icon_theme_prepend_search_path$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_theme_add_resource_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_theme_add_resource_path$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_add_resource_path",
        constants$1801.gtk_icon_theme_add_resource_path$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_theme_set_custom_theme$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_theme_set_custom_theme$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_set_custom_theme",
        constants$1801.gtk_icon_theme_set_custom_theme$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_theme_has_icon$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_theme_has_icon$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_has_icon",
        constants$1801.gtk_icon_theme_has_icon$FUNC, false
    );
}


