// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1977 {

    static final FunctionDescriptor gtk_spin_button_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_spin_button_new$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_new",
        constants$1977.gtk_spin_button_new$FUNC, false
    );
    static final FunctionDescriptor gtk_spin_button_new_with_range$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_spin_button_new_with_range$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_new_with_range",
        constants$1977.gtk_spin_button_new_with_range$FUNC, false
    );
    static final FunctionDescriptor gtk_spin_button_set_adjustment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_spin_button_set_adjustment$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_set_adjustment",
        constants$1977.gtk_spin_button_set_adjustment$FUNC, false
    );
    static final FunctionDescriptor gtk_spin_button_get_adjustment$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_spin_button_get_adjustment$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_get_adjustment",
        constants$1977.gtk_spin_button_get_adjustment$FUNC, false
    );
    static final FunctionDescriptor gtk_spin_button_set_digits$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_spin_button_set_digits$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_set_digits",
        constants$1977.gtk_spin_button_set_digits$FUNC, false
    );
    static final FunctionDescriptor gtk_spin_button_get_digits$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_spin_button_get_digits$MH = RuntimeHelper.downcallHandle(
        "gtk_spin_button_get_digits",
        constants$1977.gtk_spin_button_get_digits$FUNC, false
    );
}


