// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1996 {

    static final FunctionDescriptor gtk_text_buffer_get_has_selection$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_get_has_selection$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_has_selection",
        constants$1996.gtk_text_buffer_get_has_selection$FUNC, false
    );
    static final FunctionDescriptor gtk_text_buffer_add_selection_clipboard$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_add_selection_clipboard$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_add_selection_clipboard",
        constants$1996.gtk_text_buffer_add_selection_clipboard$FUNC, false
    );
    static final FunctionDescriptor gtk_text_buffer_remove_selection_clipboard$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_remove_selection_clipboard$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_remove_selection_clipboard",
        constants$1996.gtk_text_buffer_remove_selection_clipboard$FUNC, false
    );
    static final FunctionDescriptor gtk_text_buffer_cut_clipboard$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_cut_clipboard$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_cut_clipboard",
        constants$1996.gtk_text_buffer_cut_clipboard$FUNC, false
    );
    static final FunctionDescriptor gtk_text_buffer_copy_clipboard$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_copy_clipboard$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_copy_clipboard",
        constants$1996.gtk_text_buffer_copy_clipboard$FUNC, false
    );
    static final FunctionDescriptor gtk_text_buffer_paste_clipboard$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_paste_clipboard$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_paste_clipboard",
        constants$1996.gtk_text_buffer_paste_clipboard$FUNC, false
    );
}


