// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$48 {

    static final FunctionDescriptor qsort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle qsort$MH = RuntimeHelper.downcallHandle(
        "qsort",
        constants$48.qsort$FUNC, false
    );
    static final FunctionDescriptor abs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle abs$MH = RuntimeHelper.downcallHandle(
        "abs",
        constants$48.abs$FUNC, false
    );
    static final FunctionDescriptor labs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle labs$MH = RuntimeHelper.downcallHandle(
        "labs",
        constants$48.labs$FUNC, false
    );
    static final FunctionDescriptor llabs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle llabs$MH = RuntimeHelper.downcallHandle(
        "llabs",
        constants$48.llabs$FUNC, false
    );
    static final FunctionDescriptor div$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("quot"),
        Constants$root.C_INT$LAYOUT.withName("rem")
    ),
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle div$MH = RuntimeHelper.downcallHandle(
        "div",
        constants$48.div$FUNC, false
    );
    static final FunctionDescriptor ldiv$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("quot"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("rem")
    ),
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ldiv$MH = RuntimeHelper.downcallHandle(
        "ldiv",
        constants$48.ldiv$FUNC, false
    );
}


