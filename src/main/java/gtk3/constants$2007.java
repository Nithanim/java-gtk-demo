// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$2007 {

    static final FunctionDescriptor gtk_text_view_move_child$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_view_move_child$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_move_child",
        constants$2007.gtk_text_view_move_child$FUNC, false
    );
    static final FunctionDescriptor gtk_text_view_set_wrap_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_view_set_wrap_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_set_wrap_mode",
        constants$2007.gtk_text_view_set_wrap_mode$FUNC, false
    );
    static final FunctionDescriptor gtk_text_view_get_wrap_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_view_get_wrap_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_get_wrap_mode",
        constants$2007.gtk_text_view_get_wrap_mode$FUNC, false
    );
    static final FunctionDescriptor gtk_text_view_set_editable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_view_set_editable$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_set_editable",
        constants$2007.gtk_text_view_set_editable$FUNC, false
    );
    static final FunctionDescriptor gtk_text_view_get_editable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_view_get_editable$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_get_editable",
        constants$2007.gtk_text_view_get_editable$FUNC, false
    );
    static final FunctionDescriptor gtk_text_view_set_overwrite$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_view_set_overwrite$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_set_overwrite",
        constants$2007.gtk_text_view_set_overwrite$FUNC, false
    );
}


