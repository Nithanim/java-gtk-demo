// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$678 {

    static final FunctionDescriptor g_file_info_has_attribute$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_has_attribute$MH = RuntimeHelper.downcallHandle(
        "g_file_info_has_attribute",
        constants$678.g_file_info_has_attribute$FUNC, false
    );
    static final FunctionDescriptor g_file_info_has_namespace$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_has_namespace$MH = RuntimeHelper.downcallHandle(
        "g_file_info_has_namespace",
        constants$678.g_file_info_has_namespace$FUNC, false
    );
    static final FunctionDescriptor g_file_info_list_attributes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_list_attributes$MH = RuntimeHelper.downcallHandle(
        "g_file_info_list_attributes",
        constants$678.g_file_info_list_attributes$FUNC, false
    );
    static final FunctionDescriptor g_file_info_get_attribute_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_attribute_data$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_attribute_data",
        constants$678.g_file_info_get_attribute_data$FUNC, false
    );
    static final FunctionDescriptor g_file_info_get_attribute_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_get_attribute_type$MH = RuntimeHelper.downcallHandle(
        "g_file_info_get_attribute_type",
        constants$678.g_file_info_get_attribute_type$FUNC, false
    );
    static final FunctionDescriptor g_file_info_remove_attribute$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_remove_attribute$MH = RuntimeHelper.downcallHandle(
        "g_file_info_remove_attribute",
        constants$678.g_file_info_remove_attribute$FUNC, false
    );
}


