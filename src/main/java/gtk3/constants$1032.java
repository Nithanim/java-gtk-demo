// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1032 {

    static final FunctionDescriptor pango_matrix_scale$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle pango_matrix_scale$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_scale",
        constants$1032.pango_matrix_scale$FUNC, false
    );
    static final FunctionDescriptor pango_matrix_rotate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle pango_matrix_rotate$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_rotate",
        constants$1032.pango_matrix_rotate$FUNC, false
    );
    static final FunctionDescriptor pango_matrix_concat$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_matrix_concat$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_concat",
        constants$1032.pango_matrix_concat$FUNC, false
    );
    static final FunctionDescriptor pango_matrix_transform_point$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_matrix_transform_point$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_transform_point",
        constants$1032.pango_matrix_transform_point$FUNC, false
    );
    static final FunctionDescriptor pango_matrix_transform_distance$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_matrix_transform_distance$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_transform_distance",
        constants$1032.pango_matrix_transform_distance$FUNC, false
    );
    static final FunctionDescriptor pango_matrix_transform_rectangle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_matrix_transform_rectangle$MH = RuntimeHelper.downcallHandle(
        "pango_matrix_transform_rectangle",
        constants$1032.pango_matrix_transform_rectangle$FUNC, false
    );
}


