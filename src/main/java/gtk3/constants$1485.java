// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1485 {

    static final FunctionDescriptor gtk_menu_get_attach_widget$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_get_attach_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_get_attach_widget",
        constants$1485.gtk_menu_get_attach_widget$FUNC, false
    );
    static final FunctionDescriptor gtk_menu_set_tearoff_state$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_menu_set_tearoff_state$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_set_tearoff_state",
        constants$1485.gtk_menu_set_tearoff_state$FUNC, false
    );
    static final FunctionDescriptor gtk_menu_get_tearoff_state$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_get_tearoff_state$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_get_tearoff_state",
        constants$1485.gtk_menu_get_tearoff_state$FUNC, false
    );
    static final FunctionDescriptor gtk_menu_set_title$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_set_title$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_set_title",
        constants$1485.gtk_menu_set_title$FUNC, false
    );
    static final FunctionDescriptor gtk_menu_get_title$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_get_title$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_get_title",
        constants$1485.gtk_menu_get_title$FUNC, false
    );
    static final FunctionDescriptor gtk_menu_reorder_child$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_menu_reorder_child$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_reorder_child",
        constants$1485.gtk_menu_reorder_child$FUNC, false
    );
}

