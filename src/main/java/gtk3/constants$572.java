// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$572 {

    static final  OfInt opterr$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle opterr$VH = constants$572.opterr$LAYOUT.varHandle();
    static final MemorySegment opterr$SEGMENT = RuntimeHelper.lookupGlobalVariable("opterr", constants$572.opterr$LAYOUT);
    static final  OfInt optopt$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle optopt$VH = constants$572.optopt$LAYOUT.varHandle();
    static final MemorySegment optopt$SEGMENT = RuntimeHelper.lookupGlobalVariable("optopt", constants$572.optopt$LAYOUT);
    static final FunctionDescriptor getopt$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getopt$MH = RuntimeHelper.downcallHandle(
        "getopt",
        constants$572.getopt$FUNC, false
    );
    static final FunctionDescriptor gethostname$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gethostname$MH = RuntimeHelper.downcallHandle(
        "gethostname",
        constants$572.gethostname$FUNC, false
    );
    static final FunctionDescriptor sethostname$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle sethostname$MH = RuntimeHelper.downcallHandle(
        "sethostname",
        constants$572.sethostname$FUNC, false
    );
    static final FunctionDescriptor sethostid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle sethostid$MH = RuntimeHelper.downcallHandle(
        "sethostid",
        constants$572.sethostid$FUNC, false
    );
}

