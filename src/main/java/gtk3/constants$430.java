// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$430 {

    static final FunctionDescriptor g_type_name_from_class$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_name_from_class$MH = RuntimeHelper.downcallHandle(
        "g_type_name_from_class",
        constants$430.g_type_name_from_class$FUNC, false
    );
    static final FunctionDescriptor GValueTransform$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GValueTransform$MH = RuntimeHelper.downcallHandle(
        constants$430.GValueTransform$FUNC, false
    );
    static final FunctionDescriptor g_value_init$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_value_init$MH = RuntimeHelper.downcallHandle(
        "g_value_init",
        constants$430.g_value_init$FUNC, false
    );
    static final FunctionDescriptor g_value_copy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_copy$MH = RuntimeHelper.downcallHandle(
        "g_value_copy",
        constants$430.g_value_copy$FUNC, false
    );
    static final FunctionDescriptor g_value_reset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_reset$MH = RuntimeHelper.downcallHandle(
        "g_value_reset",
        constants$430.g_value_reset$FUNC, false
    );
}

