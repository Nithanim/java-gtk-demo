// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$438 {

    static final FunctionDescriptor g_param_spec_pool_list$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_spec_pool_list$MH = RuntimeHelper.downcallHandle(
        "g_param_spec_pool_list",
        constants$438.g_param_spec_pool_list$FUNC, false
    );
    static final FunctionDescriptor GCallback$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle GCallback$MH = RuntimeHelper.downcallHandle(
        constants$438.GCallback$FUNC, false
    );
    static final FunctionDescriptor GClosureNotify$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GClosureNotify$MH = RuntimeHelper.downcallHandle(
        constants$438.GClosureNotify$FUNC, false
    );
    static final FunctionDescriptor GClosureMarshal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}


