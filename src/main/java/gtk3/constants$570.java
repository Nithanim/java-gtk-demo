// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$570 {

    static final FunctionDescriptor symlinkat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle symlinkat$MH = RuntimeHelper.downcallHandle(
        "symlinkat",
        constants$570.symlinkat$FUNC, false
    );
    static final FunctionDescriptor readlinkat$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle readlinkat$MH = RuntimeHelper.downcallHandle(
        "readlinkat",
        constants$570.readlinkat$FUNC, false
    );
    static final FunctionDescriptor unlink$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle unlink$MH = RuntimeHelper.downcallHandle(
        "unlink",
        constants$570.unlink$FUNC, false
    );
    static final FunctionDescriptor unlinkat$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle unlinkat$MH = RuntimeHelper.downcallHandle(
        "unlinkat",
        constants$570.unlinkat$FUNC, false
    );
    static final FunctionDescriptor rmdir$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rmdir$MH = RuntimeHelper.downcallHandle(
        "rmdir",
        constants$570.rmdir$FUNC, false
    );
    static final FunctionDescriptor tcgetpgrp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle tcgetpgrp$MH = RuntimeHelper.downcallHandle(
        "tcgetpgrp",
        constants$570.tcgetpgrp$FUNC, false
    );
}

