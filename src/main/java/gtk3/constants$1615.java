// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1615 {

    static final FunctionDescriptor gtk_entry_set_icon_drag_source$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_set_icon_drag_source$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_set_icon_drag_source",
        constants$1615.gtk_entry_set_icon_drag_source$FUNC, false
    );
    static final FunctionDescriptor gtk_entry_get_current_icon_drag_source$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_get_current_icon_drag_source$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_current_icon_drag_source",
        constants$1615.gtk_entry_get_current_icon_drag_source$FUNC, false
    );
    static final FunctionDescriptor gtk_entry_get_icon_area$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_get_icon_area$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_icon_area",
        constants$1615.gtk_entry_get_icon_area$FUNC, false
    );
    static final FunctionDescriptor gtk_entry_im_context_filter_keypress$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_im_context_filter_keypress$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_im_context_filter_keypress",
        constants$1615.gtk_entry_im_context_filter_keypress$FUNC, false
    );
    static final FunctionDescriptor gtk_entry_reset_im_context$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_reset_im_context$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_reset_im_context",
        constants$1615.gtk_entry_reset_im_context$FUNC, false
    );
    static final FunctionDescriptor gtk_entry_set_input_purpose$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_set_input_purpose$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_set_input_purpose",
        constants$1615.gtk_entry_set_input_purpose$FUNC, false
    );
}


