// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$856 {

    static final FunctionDescriptor g_vfs_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_vfs_get_type$MH = RuntimeHelper.downcallHandle(
        "g_vfs_get_type",
        constants$856.g_vfs_get_type$FUNC, false
    );
    static final FunctionDescriptor g_vfs_is_active$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_vfs_is_active$MH = RuntimeHelper.downcallHandle(
        "g_vfs_is_active",
        constants$856.g_vfs_is_active$FUNC, false
    );
    static final FunctionDescriptor g_vfs_get_file_for_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_vfs_get_file_for_path$MH = RuntimeHelper.downcallHandle(
        "g_vfs_get_file_for_path",
        constants$856.g_vfs_get_file_for_path$FUNC, false
    );
    static final FunctionDescriptor g_vfs_get_file_for_uri$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_vfs_get_file_for_uri$MH = RuntimeHelper.downcallHandle(
        "g_vfs_get_file_for_uri",
        constants$856.g_vfs_get_file_for_uri$FUNC, false
    );
    static final FunctionDescriptor g_vfs_get_supported_uri_schemes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_vfs_get_supported_uri_schemes$MH = RuntimeHelper.downcallHandle(
        "g_vfs_get_supported_uri_schemes",
        constants$856.g_vfs_get_supported_uri_schemes$FUNC, false
    );
    static final FunctionDescriptor g_vfs_parse_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_vfs_parse_name$MH = RuntimeHelper.downcallHandle(
        "g_vfs_parse_name",
        constants$856.g_vfs_parse_name$FUNC, false
    );
}


