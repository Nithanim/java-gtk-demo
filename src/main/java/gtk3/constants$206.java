// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$206 {

    static final FunctionDescriptor g_mapped_file_new_from_fd$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_new_from_fd$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_new_from_fd",
        constants$206.g_mapped_file_new_from_fd$FUNC, false
    );
    static final FunctionDescriptor g_mapped_file_get_length$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_get_length$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_get_length",
        constants$206.g_mapped_file_get_length$FUNC, false
    );
    static final FunctionDescriptor g_mapped_file_get_contents$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_get_contents$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_get_contents",
        constants$206.g_mapped_file_get_contents$FUNC, false
    );
    static final FunctionDescriptor g_mapped_file_get_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_get_bytes$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_get_bytes",
        constants$206.g_mapped_file_get_bytes$FUNC, false
    );
    static final FunctionDescriptor g_mapped_file_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_ref$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_ref",
        constants$206.g_mapped_file_ref$FUNC, false
    );
    static final FunctionDescriptor g_mapped_file_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mapped_file_unref$MH = RuntimeHelper.downcallHandle(
        "g_mapped_file_unref",
        constants$206.g_mapped_file_unref$FUNC, false
    );
}


