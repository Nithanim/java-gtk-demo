// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$775 {

    static final FunctionDescriptor g_resources_lookup_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resources_lookup_data$MH = RuntimeHelper.downcallHandle(
        "g_resources_lookup_data",
        constants$775.g_resources_lookup_data$FUNC, false
    );
    static final FunctionDescriptor g_resources_enumerate_children$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resources_enumerate_children$MH = RuntimeHelper.downcallHandle(
        "g_resources_enumerate_children",
        constants$775.g_resources_enumerate_children$FUNC, false
    );
    static final FunctionDescriptor g_resources_get_info$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resources_get_info$MH = RuntimeHelper.downcallHandle(
        "g_resources_get_info",
        constants$775.g_resources_get_info$FUNC, false
    );
    static final FunctionDescriptor g_static_resource_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_resource_init$MH = RuntimeHelper.downcallHandle(
        "g_static_resource_init",
        constants$775.g_static_resource_init$FUNC, false
    );
    static final FunctionDescriptor g_static_resource_fini$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_resource_fini$MH = RuntimeHelper.downcallHandle(
        "g_static_resource_fini",
        constants$775.g_static_resource_fini$FUNC, false
    );
    static final FunctionDescriptor g_static_resource_get_resource$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_static_resource_get_resource$MH = RuntimeHelper.downcallHandle(
        "g_static_resource_get_resource",
        constants$775.g_static_resource_get_resource$FUNC, false
    );
}


