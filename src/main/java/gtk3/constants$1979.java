// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1979 {

    static final FunctionDescriptor gtk_spin_button_set_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_spin_button_set_value$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_set_value",
        constants$1979.gtk_spin_button_set_value$FUNC, false
    );
    static final FunctionDescriptor gtk_spin_button_set_update_policy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_spin_button_set_update_policy$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_set_update_policy",
        constants$1979.gtk_spin_button_set_update_policy$FUNC, false
    );
    static final FunctionDescriptor gtk_spin_button_get_update_policy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_spin_button_get_update_policy$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_get_update_policy",
        constants$1979.gtk_spin_button_get_update_policy$FUNC, false
    );
    static final FunctionDescriptor gtk_spin_button_set_numeric$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_spin_button_set_numeric$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_set_numeric",
        constants$1979.gtk_spin_button_set_numeric$FUNC, false
    );
    static final FunctionDescriptor gtk_spin_button_get_numeric$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_spin_button_get_numeric$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_get_numeric",
        constants$1979.gtk_spin_button_get_numeric$FUNC, false
    );
    static final FunctionDescriptor gtk_spin_button_spin$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_spin_button_spin$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_spin",
        constants$1979.gtk_spin_button_spin$FUNC, false
    );
}


