// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$117 {

    static final FunctionDescriptor g_mkdtemp_full$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_mkdtemp_full$MH = RuntimeHelper.downcallHandle(
        "g_mkdtemp_full",
        constants$117.g_mkdtemp_full$FUNC, false
    );
    static final FunctionDescriptor g_mkstemp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mkstemp$MH = RuntimeHelper.downcallHandle(
        "g_mkstemp",
        constants$117.g_mkstemp$FUNC, false
    );
    static final FunctionDescriptor g_mkstemp_full$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_mkstemp_full$MH = RuntimeHelper.downcallHandle(
        "g_mkstemp_full",
        constants$117.g_mkstemp_full$FUNC, false
    );
    static final FunctionDescriptor g_file_open_tmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_open_tmp$MH = RuntimeHelper.downcallHandle(
        "g_file_open_tmp",
        constants$117.g_file_open_tmp$FUNC, false
    );
    static final FunctionDescriptor g_dir_make_tmp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dir_make_tmp$MH = RuntimeHelper.downcallHandle(
        "g_dir_make_tmp",
        constants$117.g_dir_make_tmp$FUNC, false
    );
    static final FunctionDescriptor g_build_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_build_path$MH = RuntimeHelper.downcallHandle(
        "g_build_path",
        constants$117.g_build_path$FUNC, true
    );
}


