// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$676 {

    static final FunctionDescriptor g_file_enumerator_has_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_enumerator_has_pending$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_has_pending",
        constants$676.g_file_enumerator_has_pending$FUNC, false
    );
    static final FunctionDescriptor g_file_enumerator_set_pending$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_file_enumerator_set_pending$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_set_pending",
        constants$676.g_file_enumerator_set_pending$FUNC, false
    );
    static final FunctionDescriptor g_file_enumerator_get_container$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_enumerator_get_container$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_get_container",
        constants$676.g_file_enumerator_get_container$FUNC, false
    );
    static final FunctionDescriptor g_file_enumerator_get_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_enumerator_get_child$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_get_child",
        constants$676.g_file_enumerator_get_child$FUNC, false
    );
    static final FunctionDescriptor g_file_enumerator_iterate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_enumerator_iterate$MH = RuntimeHelper.downcallHandle(
        "g_file_enumerator_iterate",
        constants$676.g_file_enumerator_iterate$FUNC, false
    );
    static final FunctionDescriptor g_file_icon_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_file_icon_get_type$MH = RuntimeHelper.downcallHandle(
        "g_file_icon_get_type",
        constants$676.g_file_icon_get_type$FUNC, false
    );
}


