// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1955 {

    static final FunctionDescriptor gtk_scale_clear_marks$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_scale_clear_marks$MH = RuntimeHelper.downcallHandle(
        "gtk_scale_clear_marks",
        constants$1955.gtk_scale_clear_marks$FUNC, false
    );
    static final FunctionDescriptor gtk_scale_button_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_scale_button_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_scale_button_get_type",
        constants$1955.gtk_scale_button_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_scale_button_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_scale_button_new$MH = RuntimeHelper.downcallHandle(
        "gtk_scale_button_new",
        constants$1955.gtk_scale_button_new$FUNC, false
    );
    static final FunctionDescriptor gtk_scale_button_set_icons$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_scale_button_set_icons$MH = RuntimeHelper.downcallHandle(
        "gtk_scale_button_set_icons",
        constants$1955.gtk_scale_button_set_icons$FUNC, false
    );
    static final FunctionDescriptor gtk_scale_button_get_value$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_scale_button_get_value$MH = RuntimeHelper.downcallHandle(
        "gtk_scale_button_get_value",
        constants$1955.gtk_scale_button_get_value$FUNC, false
    );
    static final FunctionDescriptor gtk_scale_button_set_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_scale_button_set_value$MH = RuntimeHelper.downcallHandle(
        "gtk_scale_button_set_value",
        constants$1955.gtk_scale_button_set_value$FUNC, false
    );
}


