// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$580 {

    static final FunctionDescriptor g_data_input_stream_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_input_stream_new$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_new",
        constants$580.g_data_input_stream_new$FUNC, false
    );
    static final FunctionDescriptor g_data_input_stream_set_byte_order$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_data_input_stream_set_byte_order$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_set_byte_order",
        constants$580.g_data_input_stream_set_byte_order$FUNC, false
    );
    static final FunctionDescriptor g_data_input_stream_get_byte_order$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_input_stream_get_byte_order$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_get_byte_order",
        constants$580.g_data_input_stream_get_byte_order$FUNC, false
    );
    static final FunctionDescriptor g_data_input_stream_set_newline_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_data_input_stream_set_newline_type$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_set_newline_type",
        constants$580.g_data_input_stream_set_newline_type$FUNC, false
    );
    static final FunctionDescriptor g_data_input_stream_get_newline_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_input_stream_get_newline_type$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_get_newline_type",
        constants$580.g_data_input_stream_get_newline_type$FUNC, false
    );
    static final FunctionDescriptor g_data_input_stream_read_byte$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_input_stream_read_byte$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_read_byte",
        constants$580.g_data_input_stream_read_byte$FUNC, false
    );
}

