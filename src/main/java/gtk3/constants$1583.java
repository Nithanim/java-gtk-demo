// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1583 {

    static final FunctionDescriptor gtk_editable_copy_clipboard$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_copy_clipboard$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_copy_clipboard",
        constants$1583.gtk_editable_copy_clipboard$FUNC, false
    );
    static final FunctionDescriptor gtk_editable_paste_clipboard$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_paste_clipboard$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_paste_clipboard",
        constants$1583.gtk_editable_paste_clipboard$FUNC, false
    );
    static final FunctionDescriptor gtk_editable_delete_selection$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_delete_selection$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_delete_selection",
        constants$1583.gtk_editable_delete_selection$FUNC, false
    );
    static final FunctionDescriptor gtk_editable_set_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_editable_set_position$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_set_position",
        constants$1583.gtk_editable_set_position$FUNC, false
    );
    static final FunctionDescriptor gtk_editable_get_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_get_position$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_get_position",
        constants$1583.gtk_editable_get_position$FUNC, false
    );
    static final FunctionDescriptor gtk_editable_set_editable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_editable_set_editable$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_set_editable",
        constants$1583.gtk_editable_set_editable$FUNC, false
    );
}

