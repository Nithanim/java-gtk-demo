// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$196 {

    static final FunctionDescriptor g_io_channel_write_chars$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_write_chars$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_write_chars",
        constants$196.g_io_channel_write_chars$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_write_unichar$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_write_unichar$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_write_unichar",
        constants$196.g_io_channel_write_unichar$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_seek_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_seek_position$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_seek_position",
        constants$196.g_io_channel_seek_position$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_new_file$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_channel_new_file$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_new_file",
        constants$196.g_io_channel_new_file$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_io_channel_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_error_quark",
        constants$196.g_io_channel_error_quark$FUNC, false
    );
    static final FunctionDescriptor g_io_channel_error_from_errno$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_io_channel_error_from_errno$MH = RuntimeHelper.downcallHandle(
        "g_io_channel_error_from_errno",
        constants$196.g_io_channel_error_from_errno$FUNC, false
    );
}


