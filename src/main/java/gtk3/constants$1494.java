// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1494 {

    static final FunctionDescriptor gtk_label_get_selectable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_get_selectable$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_selectable",
        constants$1494.gtk_label_get_selectable$FUNC, false
    );
    static final FunctionDescriptor gtk_label_set_angle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_label_set_angle$MH = RuntimeHelper.downcallHandle(
        "gtk_label_set_angle",
        constants$1494.gtk_label_set_angle$FUNC, false
    );
    static final FunctionDescriptor gtk_label_get_angle$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_get_angle$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_angle",
        constants$1494.gtk_label_get_angle$FUNC, false
    );
    static final FunctionDescriptor gtk_label_select_region$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_label_select_region$MH = RuntimeHelper.downcallHandle(
        "gtk_label_select_region",
        constants$1494.gtk_label_select_region$FUNC, false
    );
    static final FunctionDescriptor gtk_label_get_selection_bounds$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_get_selection_bounds$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_selection_bounds",
        constants$1494.gtk_label_get_selection_bounds$FUNC, false
    );
    static final FunctionDescriptor gtk_label_get_layout$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_get_layout$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_layout",
        constants$1494.gtk_label_get_layout$FUNC, false
    );
}

