// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1102 {

    static final FunctionDescriptor tmpfile$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle tmpfile$MH = RuntimeHelper.downcallHandle(
        "tmpfile",
        constants$1102.tmpfile$FUNC, false
    );
    static final FunctionDescriptor tmpnam$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle tmpnam$MH = RuntimeHelper.downcallHandle(
        "tmpnam",
        constants$1102.tmpnam$FUNC, false
    );
    static final FunctionDescriptor tmpnam_r$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle tmpnam_r$MH = RuntimeHelper.downcallHandle(
        "tmpnam_r",
        constants$1102.tmpnam_r$FUNC, false
    );
    static final FunctionDescriptor tempnam$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle tempnam$MH = RuntimeHelper.downcallHandle(
        "tempnam",
        constants$1102.tempnam$FUNC, false
    );
    static final FunctionDescriptor fflush$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fflush$MH = RuntimeHelper.downcallHandle(
        "fflush",
        constants$1102.fflush$FUNC, false
    );
    static final FunctionDescriptor fflush_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fflush_unlocked$MH = RuntimeHelper.downcallHandle(
        "fflush_unlocked",
        constants$1102.fflush_unlocked$FUNC, false
    );
}

