// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$693 {

    static final FunctionDescriptor g_file_io_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_file_io_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_file_io_stream_get_type",
        constants$693.g_file_io_stream_get_type$FUNC, false
    );
    static final FunctionDescriptor g_file_io_stream_query_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_io_stream_query_info$MH = RuntimeHelper.downcallHandle(
        "g_file_io_stream_query_info",
        constants$693.g_file_io_stream_query_info$FUNC, false
    );
    static final FunctionDescriptor g_file_io_stream_query_info_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_io_stream_query_info_async$MH = RuntimeHelper.downcallHandle(
        "g_file_io_stream_query_info_async",
        constants$693.g_file_io_stream_query_info_async$FUNC, false
    );
    static final FunctionDescriptor g_file_io_stream_query_info_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_io_stream_query_info_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_io_stream_query_info_finish",
        constants$693.g_file_io_stream_query_info_finish$FUNC, false
    );
    static final FunctionDescriptor g_file_io_stream_get_etag$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_io_stream_get_etag$MH = RuntimeHelper.downcallHandle(
        "g_file_io_stream_get_etag",
        constants$693.g_file_io_stream_get_etag$FUNC, false
    );
    static final FunctionDescriptor g_file_monitor_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_file_monitor_get_type$MH = RuntimeHelper.downcallHandle(
        "g_file_monitor_get_type",
        constants$693.g_file_monitor_get_type$FUNC, false
    );
}

