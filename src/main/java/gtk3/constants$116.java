// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$116 {

    static final FunctionDescriptor g_file_test$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_file_test$MH = RuntimeHelper.downcallHandle(
        "g_file_test",
        constants$116.g_file_test$FUNC, false
    );
    static final FunctionDescriptor g_file_get_contents$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_get_contents$MH = RuntimeHelper.downcallHandle(
        "g_file_get_contents",
        constants$116.g_file_get_contents$FUNC, false
    );
    static final FunctionDescriptor g_file_set_contents$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_contents$MH = RuntimeHelper.downcallHandle(
        "g_file_set_contents",
        constants$116.g_file_set_contents$FUNC, false
    );
    static final FunctionDescriptor g_file_set_contents_full$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_contents_full$MH = RuntimeHelper.downcallHandle(
        "g_file_set_contents_full",
        constants$116.g_file_set_contents_full$FUNC, false
    );
    static final FunctionDescriptor g_file_read_link$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_read_link$MH = RuntimeHelper.downcallHandle(
        "g_file_read_link",
        constants$116.g_file_read_link$FUNC, false
    );
    static final FunctionDescriptor g_mkdtemp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mkdtemp$MH = RuntimeHelper.downcallHandle(
        "g_mkdtemp",
        constants$116.g_mkdtemp$FUNC, false
    );
}


