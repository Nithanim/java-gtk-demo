// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1666 {

    static final FunctionDescriptor gtk_button_leave$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_button_leave$MH = RuntimeHelper.downcallHandle(
        "gtk_button_leave",
        constants$1666.gtk_button_leave$FUNC, false
    );
    static final FunctionDescriptor gtk_button_set_relief$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_button_set_relief$MH = RuntimeHelper.downcallHandle(
        "gtk_button_set_relief",
        constants$1666.gtk_button_set_relief$FUNC, false
    );
    static final FunctionDescriptor gtk_button_get_relief$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_button_get_relief$MH = RuntimeHelper.downcallHandle(
        "gtk_button_get_relief",
        constants$1666.gtk_button_get_relief$FUNC, false
    );
    static final FunctionDescriptor gtk_button_set_label$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_button_set_label$MH = RuntimeHelper.downcallHandle(
        "gtk_button_set_label",
        constants$1666.gtk_button_set_label$FUNC, false
    );
    static final FunctionDescriptor gtk_button_get_label$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_button_get_label$MH = RuntimeHelper.downcallHandle(
        "gtk_button_get_label",
        constants$1666.gtk_button_get_label$FUNC, false
    );
    static final FunctionDescriptor gtk_button_set_use_underline$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_button_set_use_underline$MH = RuntimeHelper.downcallHandle(
        "gtk_button_set_use_underline",
        constants$1666.gtk_button_set_use_underline$FUNC, false
    );
}

