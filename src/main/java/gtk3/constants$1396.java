// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1396 {

    static final FunctionDescriptor gtk_widget_set_accel_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_set_accel_path$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_accel_path",
        constants$1396.gtk_widget_set_accel_path$FUNC, false
    );
    static final FunctionDescriptor gtk_widget_list_accel_closures$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_list_accel_closures$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_list_accel_closures",
        constants$1396.gtk_widget_list_accel_closures$FUNC, false
    );
    static final FunctionDescriptor gtk_widget_can_activate_accel$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_can_activate_accel$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_can_activate_accel",
        constants$1396.gtk_widget_can_activate_accel$FUNC, false
    );
    static final FunctionDescriptor gtk_widget_mnemonic_activate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_mnemonic_activate$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_mnemonic_activate",
        constants$1396.gtk_widget_mnemonic_activate$FUNC, false
    );
    static final FunctionDescriptor gtk_widget_event$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_event$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_event",
        constants$1396.gtk_widget_event$FUNC, false
    );
    static final FunctionDescriptor gtk_widget_send_expose$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_send_expose$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_send_expose",
        constants$1396.gtk_widget_send_expose$FUNC, false
    );
}


