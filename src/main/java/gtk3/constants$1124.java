// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1124 {

    static final FunctionDescriptor cairo_scale$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_scale$MH = RuntimeHelper.downcallHandle(
        "cairo_scale",
        constants$1124.cairo_scale$FUNC, false
    );
    static final FunctionDescriptor cairo_rotate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_rotate$MH = RuntimeHelper.downcallHandle(
        "cairo_rotate",
        constants$1124.cairo_rotate$FUNC, false
    );
    static final FunctionDescriptor cairo_transform$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_transform$MH = RuntimeHelper.downcallHandle(
        "cairo_transform",
        constants$1124.cairo_transform$FUNC, false
    );
    static final FunctionDescriptor cairo_set_matrix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_set_matrix$MH = RuntimeHelper.downcallHandle(
        "cairo_set_matrix",
        constants$1124.cairo_set_matrix$FUNC, false
    );
    static final FunctionDescriptor cairo_identity_matrix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_identity_matrix$MH = RuntimeHelper.downcallHandle(
        "cairo_identity_matrix",
        constants$1124.cairo_identity_matrix$FUNC, false
    );
    static final FunctionDescriptor cairo_user_to_device$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_user_to_device$MH = RuntimeHelper.downcallHandle(
        "cairo_user_to_device",
        constants$1124.cairo_user_to_device$FUNC, false
    );
}

