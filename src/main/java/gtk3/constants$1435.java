// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1435 {

    static final FunctionDescriptor gtk_application_set_accels_for_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_application_set_accels_for_action$MH = RuntimeHelper.downcallHandle(
        "gtk_application_set_accels_for_action",
        constants$1435.gtk_application_set_accels_for_action$FUNC, false
    );
    static final FunctionDescriptor gtk_application_prefers_app_menu$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_application_prefers_app_menu$MH = RuntimeHelper.downcallHandle(
        "gtk_application_prefers_app_menu",
        constants$1435.gtk_application_prefers_app_menu$FUNC, false
    );
    static final FunctionDescriptor gtk_application_get_menu_by_id$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_application_get_menu_by_id$MH = RuntimeHelper.downcallHandle(
        "gtk_application_get_menu_by_id",
        constants$1435.gtk_application_get_menu_by_id$FUNC, false
    );
    static final FunctionDescriptor glib_autoptr_clear_GtkApplication$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_clear_GtkApplication$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_clear_GtkApplication",
        constants$1435.glib_autoptr_clear_GtkApplication$FUNC, false
    );
    static final FunctionDescriptor glib_autoptr_cleanup_GtkApplication$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_cleanup_GtkApplication$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_cleanup_GtkApplication",
        constants$1435.glib_autoptr_cleanup_GtkApplication$FUNC, false
    );
    static final FunctionDescriptor glib_listautoptr_cleanup_GtkApplication$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_listautoptr_cleanup_GtkApplication$MH = RuntimeHelper.downcallHandle(
        "glib_listautoptr_cleanup_GtkApplication",
        constants$1435.glib_listautoptr_cleanup_GtkApplication$FUNC, false
    );
}


