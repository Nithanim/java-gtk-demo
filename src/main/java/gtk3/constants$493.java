// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$493 {

    static final FunctionDescriptor g_type_plugin_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_type_plugin_get_type$MH = RuntimeHelper.downcallHandle(
        "g_type_plugin_get_type",
        constants$493.g_type_plugin_get_type$FUNC, false
    );
    static final FunctionDescriptor g_type_plugin_use$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_plugin_use$MH = RuntimeHelper.downcallHandle(
        "g_type_plugin_use",
        constants$493.g_type_plugin_use$FUNC, false
    );
    static final FunctionDescriptor g_type_plugin_unuse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_plugin_unuse$MH = RuntimeHelper.downcallHandle(
        "g_type_plugin_unuse",
        constants$493.g_type_plugin_unuse$FUNC, false
    );
    static final FunctionDescriptor g_type_plugin_complete_type_info$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_plugin_complete_type_info$MH = RuntimeHelper.downcallHandle(
        "g_type_plugin_complete_type_info",
        constants$493.g_type_plugin_complete_type_info$FUNC, false
    );
    static final FunctionDescriptor g_type_plugin_complete_interface_info$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_plugin_complete_interface_info$MH = RuntimeHelper.downcallHandle(
        "g_type_plugin_complete_interface_info",
        constants$493.g_type_plugin_complete_interface_info$FUNC, false
    );
    static final FunctionDescriptor g_value_array_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_value_array_get_type$MH = RuntimeHelper.downcallHandle(
        "g_value_array_get_type",
        constants$493.g_value_array_get_type$FUNC, false
    );
}


