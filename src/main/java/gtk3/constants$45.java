// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$45 {

    static final FunctionDescriptor on_exit$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle on_exit$MH = RuntimeHelper.downcallHandle(
        "on_exit",
        constants$45.on_exit$FUNC, false
    );
    static final FunctionDescriptor exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle exit$MH = RuntimeHelper.downcallHandle(
        "exit",
        constants$45.exit$FUNC, false
    );
    static final FunctionDescriptor quick_exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle quick_exit$MH = RuntimeHelper.downcallHandle(
        "quick_exit",
        constants$45.quick_exit$FUNC, false
    );
    static final FunctionDescriptor _Exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle _Exit$MH = RuntimeHelper.downcallHandle(
        "_Exit",
        constants$45._Exit$FUNC, false
    );
    static final FunctionDescriptor getenv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getenv$MH = RuntimeHelper.downcallHandle(
        "getenv",
        constants$45.getenv$FUNC, false
    );
    static final FunctionDescriptor putenv$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle putenv$MH = RuntimeHelper.downcallHandle(
        "putenv",
        constants$45.putenv$FUNC, false
    );
}


