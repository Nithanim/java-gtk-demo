// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$988 {

    static final FunctionDescriptor hb_face_set_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_face_set_user_data$MH = RuntimeHelper.downcallHandle(
        "hb_face_set_user_data",
        constants$988.hb_face_set_user_data$FUNC, false
    );
    static final FunctionDescriptor hb_face_get_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_face_get_user_data$MH = RuntimeHelper.downcallHandle(
        "hb_face_get_user_data",
        constants$988.hb_face_get_user_data$FUNC, false
    );
    static final FunctionDescriptor hb_face_make_immutable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_face_make_immutable$MH = RuntimeHelper.downcallHandle(
        "hb_face_make_immutable",
        constants$988.hb_face_make_immutable$FUNC, false
    );
    static final FunctionDescriptor hb_face_is_immutable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_face_is_immutable$MH = RuntimeHelper.downcallHandle(
        "hb_face_is_immutable",
        constants$988.hb_face_is_immutable$FUNC, false
    );
    static final FunctionDescriptor hb_face_reference_table$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_face_reference_table$MH = RuntimeHelper.downcallHandle(
        "hb_face_reference_table",
        constants$988.hb_face_reference_table$FUNC, false
    );
    static final FunctionDescriptor hb_face_reference_blob$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_face_reference_blob$MH = RuntimeHelper.downcallHandle(
        "hb_face_reference_blob",
        constants$988.hb_face_reference_blob$FUNC, false
    );
}

