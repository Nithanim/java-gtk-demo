// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$720 {

    static final FunctionDescriptor g_io_modules_load_all_in_directory_with_scope$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_modules_load_all_in_directory_with_scope$MH = RuntimeHelper.downcallHandle(
        "g_io_modules_load_all_in_directory_with_scope",
        constants$720.g_io_modules_load_all_in_directory_with_scope$FUNC, false
    );
    static final FunctionDescriptor g_io_extension_point_register$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_point_register$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_point_register",
        constants$720.g_io_extension_point_register$FUNC, false
    );
    static final FunctionDescriptor g_io_extension_point_lookup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_point_lookup$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_point_lookup",
        constants$720.g_io_extension_point_lookup$FUNC, false
    );
    static final FunctionDescriptor g_io_extension_point_set_required_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_io_extension_point_set_required_type$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_point_set_required_type",
        constants$720.g_io_extension_point_set_required_type$FUNC, false
    );
    static final FunctionDescriptor g_io_extension_point_get_required_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_point_get_required_type$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_point_get_required_type",
        constants$720.g_io_extension_point_get_required_type$FUNC, false
    );
    static final FunctionDescriptor g_io_extension_point_get_extensions$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_point_get_extensions$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_point_get_extensions",
        constants$720.g_io_extension_point_get_extensions$FUNC, false
    );
}


