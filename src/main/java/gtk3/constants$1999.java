// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1999 {

    static final FunctionDescriptor gtk_text_buffer_register_deserialize_format$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_register_deserialize_format$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_register_deserialize_format",
        constants$1999.gtk_text_buffer_register_deserialize_format$FUNC, false
    );
    static final FunctionDescriptor gtk_text_buffer_register_deserialize_tagset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_register_deserialize_tagset$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_register_deserialize_tagset",
        constants$1999.gtk_text_buffer_register_deserialize_tagset$FUNC, false
    );
    static final FunctionDescriptor gtk_text_buffer_unregister_serialize_format$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_unregister_serialize_format$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_unregister_serialize_format",
        constants$1999.gtk_text_buffer_unregister_serialize_format$FUNC, false
    );
    static final FunctionDescriptor gtk_text_buffer_unregister_deserialize_format$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_unregister_deserialize_format$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_unregister_deserialize_format",
        constants$1999.gtk_text_buffer_unregister_deserialize_format$FUNC, false
    );
    static final FunctionDescriptor gtk_text_buffer_deserialize_set_can_create_tags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_deserialize_set_can_create_tags$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_deserialize_set_can_create_tags",
        constants$1999.gtk_text_buffer_deserialize_set_can_create_tags$FUNC, false
    );
    static final FunctionDescriptor gtk_text_buffer_deserialize_get_can_create_tags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_deserialize_get_can_create_tags$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_deserialize_get_can_create_tags",
        constants$1999.gtk_text_buffer_deserialize_get_can_create_tags$FUNC, false
    );
}


