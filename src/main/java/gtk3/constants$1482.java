// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1482 {

    static final FunctionDescriptor gtk_menu_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_menu_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_get_type",
        constants$1482.gtk_menu_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_menu_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_menu_new$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_new",
        constants$1482.gtk_menu_new$FUNC, false
    );
    static final FunctionDescriptor gtk_menu_new_from_model$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_new_from_model$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_new_from_model",
        constants$1482.gtk_menu_new_from_model$FUNC, false
    );
    static final FunctionDescriptor gtk_menu_popup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_menu_popup$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_popup",
        constants$1482.gtk_menu_popup$FUNC, false
    );
    static final FunctionDescriptor gtk_menu_popup_for_device$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_menu_popup_for_device$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_popup_for_device",
        constants$1482.gtk_menu_popup_for_device$FUNC, false
    );
    static final FunctionDescriptor gtk_menu_popup_at_rect$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_popup_at_rect$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_popup_at_rect",
        constants$1482.gtk_menu_popup_at_rect$FUNC, false
    );
}


