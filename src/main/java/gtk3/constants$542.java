// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$542 {

    static final FunctionDescriptor g_buffered_input_stream_set_buffer_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_buffered_input_stream_set_buffer_size$MH = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_set_buffer_size",
        constants$542.g_buffered_input_stream_set_buffer_size$FUNC, false
    );
    static final FunctionDescriptor g_buffered_input_stream_get_available$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_buffered_input_stream_get_available$MH = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_get_available",
        constants$542.g_buffered_input_stream_get_available$FUNC, false
    );
    static final FunctionDescriptor g_buffered_input_stream_peek$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_buffered_input_stream_peek$MH = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_peek",
        constants$542.g_buffered_input_stream_peek$FUNC, false
    );
    static final FunctionDescriptor g_buffered_input_stream_peek_buffer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_buffered_input_stream_peek_buffer$MH = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_peek_buffer",
        constants$542.g_buffered_input_stream_peek_buffer$FUNC, false
    );
    static final FunctionDescriptor g_buffered_input_stream_fill$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_buffered_input_stream_fill$MH = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_fill",
        constants$542.g_buffered_input_stream_fill$FUNC, false
    );
    static final FunctionDescriptor g_buffered_input_stream_fill_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_buffered_input_stream_fill_async$MH = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_fill_async",
        constants$542.g_buffered_input_stream_fill_async$FUNC, false
    );
}


