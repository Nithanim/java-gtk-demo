// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1740 {

    static final FunctionDescriptor gtk_native_dialog_show$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_dialog_show$MH = RuntimeHelper.downcallHandle(
        "gtk_native_dialog_show",
        constants$1740.gtk_native_dialog_show$FUNC, false
    );
    static final FunctionDescriptor gtk_native_dialog_hide$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_dialog_hide$MH = RuntimeHelper.downcallHandle(
        "gtk_native_dialog_hide",
        constants$1740.gtk_native_dialog_hide$FUNC, false
    );
    static final FunctionDescriptor gtk_native_dialog_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_dialog_destroy$MH = RuntimeHelper.downcallHandle(
        "gtk_native_dialog_destroy",
        constants$1740.gtk_native_dialog_destroy$FUNC, false
    );
    static final FunctionDescriptor gtk_native_dialog_get_visible$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_dialog_get_visible$MH = RuntimeHelper.downcallHandle(
        "gtk_native_dialog_get_visible",
        constants$1740.gtk_native_dialog_get_visible$FUNC, false
    );
    static final FunctionDescriptor gtk_native_dialog_set_modal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_native_dialog_set_modal$MH = RuntimeHelper.downcallHandle(
        "gtk_native_dialog_set_modal",
        constants$1740.gtk_native_dialog_set_modal$FUNC, false
    );
    static final FunctionDescriptor gtk_native_dialog_get_modal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_native_dialog_get_modal$MH = RuntimeHelper.downcallHandle(
        "gtk_native_dialog_get_modal",
        constants$1740.gtk_native_dialog_get_modal$FUNC, false
    );
}


