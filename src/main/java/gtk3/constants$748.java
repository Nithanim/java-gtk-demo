// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$748 {

    static final FunctionDescriptor g_mount_eject_with_operation_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_eject_with_operation_finish$MH = RuntimeHelper.downcallHandle(
        "g_mount_eject_with_operation_finish",
        constants$748.g_mount_eject_with_operation_finish$FUNC, false
    );
    static final FunctionDescriptor g_mount_get_sort_key$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_get_sort_key$MH = RuntimeHelper.downcallHandle(
        "g_mount_get_sort_key",
        constants$748.g_mount_get_sort_key$FUNC, false
    );
    static final FunctionDescriptor g_mount_operation_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_mount_operation_get_type$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_get_type",
        constants$748.g_mount_operation_get_type$FUNC, false
    );
    static final FunctionDescriptor g_mount_operation_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_mount_operation_new$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_new",
        constants$748.g_mount_operation_new$FUNC, false
    );
    static final FunctionDescriptor g_mount_operation_get_username$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_operation_get_username$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_get_username",
        constants$748.g_mount_operation_get_username$FUNC, false
    );
    static final FunctionDescriptor g_mount_operation_set_username$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_operation_set_username$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_set_username",
        constants$748.g_mount_operation_set_username$FUNC, false
    );
}

