// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$2000 {

    static final FunctionDescriptor gtk_text_buffer_get_serialize_formats$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_get_serialize_formats$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_serialize_formats",
        constants$2000.gtk_text_buffer_get_serialize_formats$FUNC, false
    );
    static final FunctionDescriptor gtk_text_buffer_get_deserialize_formats$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_get_deserialize_formats$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_deserialize_formats",
        constants$2000.gtk_text_buffer_get_deserialize_formats$FUNC, false
    );
    static final FunctionDescriptor gtk_text_buffer_serialize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_serialize$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_serialize",
        constants$2000.gtk_text_buffer_serialize$FUNC, false
    );
    static final FunctionDescriptor gtk_text_buffer_deserialize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_deserialize$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_deserialize",
        constants$2000.gtk_text_buffer_deserialize$FUNC, false
    );
    static final FunctionDescriptor gtk_text_view_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_text_view_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_get_type",
        constants$2000.gtk_text_view_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_text_view_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_text_view_new$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_new",
        constants$2000.gtk_text_view_new$FUNC, false
    );
}


