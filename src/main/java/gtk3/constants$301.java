// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$301 {

    static final FunctionDescriptor g_memdup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_memdup$MH = RuntimeHelper.downcallHandle(
        "g_memdup",
        constants$301.g_memdup$FUNC, false
    );
    static final FunctionDescriptor g_memdup2$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_memdup2$MH = RuntimeHelper.downcallHandle(
        "g_memdup2",
        constants$301.g_memdup2$FUNC, false
    );
    static final FunctionDescriptor g_strsplit$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_strsplit$MH = RuntimeHelper.downcallHandle(
        "g_strsplit",
        constants$301.g_strsplit$FUNC, false
    );
    static final FunctionDescriptor g_strsplit_set$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_strsplit_set$MH = RuntimeHelper.downcallHandle(
        "g_strsplit_set",
        constants$301.g_strsplit_set$FUNC, false
    );
    static final FunctionDescriptor g_strjoinv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strjoinv$MH = RuntimeHelper.downcallHandle(
        "g_strjoinv",
        constants$301.g_strjoinv$FUNC, false
    );
    static final FunctionDescriptor g_strfreev$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strfreev$MH = RuntimeHelper.downcallHandle(
        "g_strfreev",
        constants$301.g_strfreev$FUNC, false
    );
}


