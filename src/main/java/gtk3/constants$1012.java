// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1012 {

    static final FunctionDescriptor hb_buffer_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_destroy$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_destroy",
        constants$1012.hb_buffer_destroy$FUNC, false
    );
    static final FunctionDescriptor hb_buffer_set_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_set_user_data$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_set_user_data",
        constants$1012.hb_buffer_set_user_data$FUNC, false
    );
    static final FunctionDescriptor hb_buffer_get_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_get_user_data$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_user_data",
        constants$1012.hb_buffer_get_user_data$FUNC, false
    );
    static final FunctionDescriptor hb_buffer_set_content_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_buffer_set_content_type$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_set_content_type",
        constants$1012.hb_buffer_set_content_type$FUNC, false
    );
    static final FunctionDescriptor hb_buffer_get_content_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_get_content_type$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_get_content_type",
        constants$1012.hb_buffer_get_content_type$FUNC, false
    );
    static final FunctionDescriptor hb_buffer_set_unicode_funcs$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_buffer_set_unicode_funcs$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_set_unicode_funcs",
        constants$1012.hb_buffer_set_unicode_funcs$FUNC, false
    );
}

