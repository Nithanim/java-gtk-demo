// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1461 {

    static final FunctionDescriptor gtk_window_begin_move_drag$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_begin_move_drag$MH = RuntimeHelper.downcallHandle(
        "gtk_window_begin_move_drag",
        constants$1461.gtk_window_begin_move_drag$FUNC, false
    );
    static final FunctionDescriptor gtk_window_set_default_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_set_default_size$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_default_size",
        constants$1461.gtk_window_set_default_size$FUNC, false
    );
    static final FunctionDescriptor gtk_window_get_default_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_default_size$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_default_size",
        constants$1461.gtk_window_get_default_size$FUNC, false
    );
    static final FunctionDescriptor gtk_window_resize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_resize$MH = RuntimeHelper.downcallHandle(
        "gtk_window_resize",
        constants$1461.gtk_window_resize$FUNC, false
    );
    static final FunctionDescriptor gtk_window_get_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_size$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_size",
        constants$1461.gtk_window_get_size$FUNC, false
    );
    static final FunctionDescriptor gtk_window_move$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_move$MH = RuntimeHelper.downcallHandle(
        "gtk_window_move",
        constants$1461.gtk_window_move$FUNC, false
    );
}

