// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1105 {

    static final FunctionDescriptor vfprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vfprintf$MH = RuntimeHelper.downcallHandle(
        "vfprintf",
        constants$1105.vfprintf$FUNC, false
    );
    static final FunctionDescriptor vprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vprintf$MH = RuntimeHelper.downcallHandle(
        "vprintf",
        constants$1105.vprintf$FUNC, false
    );
    static final FunctionDescriptor vsprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vsprintf$MH = RuntimeHelper.downcallHandle(
        "vsprintf",
        constants$1105.vsprintf$FUNC, false
    );
    static final FunctionDescriptor snprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle snprintf$MH = RuntimeHelper.downcallHandle(
        "snprintf",
        constants$1105.snprintf$FUNC, true
    );
    static final FunctionDescriptor vsnprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vsnprintf$MH = RuntimeHelper.downcallHandle(
        "vsnprintf",
        constants$1105.vsnprintf$FUNC, false
    );
    static final FunctionDescriptor vdprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vdprintf$MH = RuntimeHelper.downcallHandle(
        "vdprintf",
        constants$1105.vdprintf$FUNC, false
    );
}

