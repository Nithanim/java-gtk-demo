// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1468 {

    static final FunctionDescriptor gtk_dialog_get_widget_for_response$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_dialog_get_widget_for_response$MH = RuntimeHelper.downcallHandle(
        "gtk_dialog_get_widget_for_response",
        constants$1468.gtk_dialog_get_widget_for_response$FUNC, false
    );
    static final FunctionDescriptor gtk_dialog_get_response_for_widget$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_dialog_get_response_for_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_dialog_get_response_for_widget",
        constants$1468.gtk_dialog_get_response_for_widget$FUNC, false
    );
    static final FunctionDescriptor gtk_alternative_dialog_button_order$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_alternative_dialog_button_order$MH = RuntimeHelper.downcallHandle(
        "gtk_alternative_dialog_button_order",
        constants$1468.gtk_alternative_dialog_button_order$FUNC, false
    );
    static final FunctionDescriptor gtk_dialog_set_alternative_button_order$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_dialog_set_alternative_button_order$MH = RuntimeHelper.downcallHandle(
        "gtk_dialog_set_alternative_button_order",
        constants$1468.gtk_dialog_set_alternative_button_order$FUNC, true
    );
    static final FunctionDescriptor gtk_dialog_set_alternative_button_order_from_array$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_dialog_set_alternative_button_order_from_array$MH = RuntimeHelper.downcallHandle(
        "gtk_dialog_set_alternative_button_order_from_array",
        constants$1468.gtk_dialog_set_alternative_button_order_from_array$FUNC, false
    );
    static final FunctionDescriptor gtk_dialog_response$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_dialog_response$MH = RuntimeHelper.downcallHandle(
        "gtk_dialog_response",
        constants$1468.gtk_dialog_response$FUNC, false
    );
}


