// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$47 {

    static final FunctionDescriptor mkdtemp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mkdtemp$MH = RuntimeHelper.downcallHandle(
        "mkdtemp",
        constants$47.mkdtemp$FUNC, false
    );
    static final FunctionDescriptor system$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle system$MH = RuntimeHelper.downcallHandle(
        "system",
        constants$47.system$FUNC, false
    );
    static final FunctionDescriptor realpath$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle realpath$MH = RuntimeHelper.downcallHandle(
        "realpath",
        constants$47.realpath$FUNC, false
    );
    static final FunctionDescriptor __compar_fn_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __compar_fn_t$MH = RuntimeHelper.downcallHandle(
        constants$47.__compar_fn_t$FUNC, false
    );
    static final FunctionDescriptor bsearch$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle bsearch$MH = RuntimeHelper.downcallHandle(
        "bsearch",
        constants$47.bsearch$FUNC, false
    );
}


