// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$67 {

    static final FunctionDescriptor sigemptyset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigemptyset$MH = RuntimeHelper.downcallHandle(
        "sigemptyset",
        constants$67.sigemptyset$FUNC, false
    );
    static final FunctionDescriptor sigfillset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigfillset$MH = RuntimeHelper.downcallHandle(
        "sigfillset",
        constants$67.sigfillset$FUNC, false
    );
    static final FunctionDescriptor sigaddset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sigaddset$MH = RuntimeHelper.downcallHandle(
        "sigaddset",
        constants$67.sigaddset$FUNC, false
    );
    static final FunctionDescriptor sigdelset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sigdelset$MH = RuntimeHelper.downcallHandle(
        "sigdelset",
        constants$67.sigdelset$FUNC, false
    );
    static final FunctionDescriptor sigismember$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle sigismember$MH = RuntimeHelper.downcallHandle(
        "sigismember",
        constants$67.sigismember$FUNC, false
    );
    static final FunctionDescriptor sigprocmask$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigprocmask$MH = RuntimeHelper.downcallHandle(
        "sigprocmask",
        constants$67.sigprocmask$FUNC, false
    );
}


