// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$439 {

    static final FunctionDescriptor GClosureMarshal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GClosureMarshal$MH = RuntimeHelper.downcallHandle(
        constants$439.GClosureMarshal$FUNC, false
    );
    static final FunctionDescriptor GVaClosureMarshal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GVaClosureMarshal$MH = RuntimeHelper.downcallHandle(
        constants$439.GVaClosureMarshal$FUNC, false
    );
    static final FunctionDescriptor g_cclosure_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cclosure_new$MH = RuntimeHelper.downcallHandle(
        "g_cclosure_new",
        constants$439.g_cclosure_new$FUNC, false
    );
    static final FunctionDescriptor g_cclosure_new_swap$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cclosure_new_swap$MH = RuntimeHelper.downcallHandle(
        "g_cclosure_new_swap",
        constants$439.g_cclosure_new_swap$FUNC, false
    );
    static final FunctionDescriptor g_signal_type_cclosure_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_type_cclosure_new$MH = RuntimeHelper.downcallHandle(
        "g_signal_type_cclosure_new",
        constants$439.g_signal_type_cclosure_new$FUNC, false
    );
}


