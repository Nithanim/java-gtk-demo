// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$283 {

    static final FunctionDescriptor strncpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strncpy$MH = RuntimeHelper.downcallHandle(
        "strncpy",
        constants$283.strncpy$FUNC, false
    );
    static final FunctionDescriptor strcat$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcat$MH = RuntimeHelper.downcallHandle(
        "strcat",
        constants$283.strcat$FUNC, false
    );
    static final FunctionDescriptor strncat$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strncat$MH = RuntimeHelper.downcallHandle(
        "strncat",
        constants$283.strncat$FUNC, false
    );
    static final FunctionDescriptor strcmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcmp$MH = RuntimeHelper.downcallHandle(
        "strcmp",
        constants$283.strcmp$FUNC, false
    );
    static final FunctionDescriptor strncmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle strncmp$MH = RuntimeHelper.downcallHandle(
        "strncmp",
        constants$283.strncmp$FUNC, false
    );
    static final FunctionDescriptor strcoll$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcoll$MH = RuntimeHelper.downcallHandle(
        "strcoll",
        constants$283.strcoll$FUNC, false
    );
}

