// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1106 {

    static final FunctionDescriptor dprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle dprintf$MH = RuntimeHelper.downcallHandle(
        "dprintf",
        constants$1106.dprintf$FUNC, true
    );
    static final FunctionDescriptor fscanf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fscanf$MH = RuntimeHelper.downcallHandle(
        "fscanf",
        constants$1106.fscanf$FUNC, true
    );
    static final FunctionDescriptor scanf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scanf$MH = RuntimeHelper.downcallHandle(
        "scanf",
        constants$1106.scanf$FUNC, true
    );
    static final FunctionDescriptor sscanf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sscanf$MH = RuntimeHelper.downcallHandle(
        "sscanf",
        constants$1106.sscanf$FUNC, true
    );
    static final FunctionDescriptor vfscanf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vfscanf$MH = RuntimeHelper.downcallHandle(
        "vfscanf",
        constants$1106.vfscanf$FUNC, false
    );
    static final FunctionDescriptor vscanf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vscanf$MH = RuntimeHelper.downcallHandle(
        "vscanf",
        constants$1106.vscanf$FUNC, false
    );
}


