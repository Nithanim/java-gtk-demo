// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$121 {

    static final FunctionDescriptor g_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_free$MH = RuntimeHelper.downcallHandle(
        "g_free",
        constants$121.g_free$FUNC, false
    );
    static final FunctionDescriptor g_clear_pointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_clear_pointer$MH = RuntimeHelper.downcallHandle(
        "g_clear_pointer",
        constants$121.g_clear_pointer$FUNC, false
    );
    static final FunctionDescriptor g_malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_malloc$MH = RuntimeHelper.downcallHandle(
        "g_malloc",
        constants$121.g_malloc$FUNC, false
    );
    static final FunctionDescriptor g_malloc0$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_malloc0$MH = RuntimeHelper.downcallHandle(
        "g_malloc0",
        constants$121.g_malloc0$FUNC, false
    );
    static final FunctionDescriptor g_realloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_realloc$MH = RuntimeHelper.downcallHandle(
        "g_realloc",
        constants$121.g_realloc$FUNC, false
    );
    static final FunctionDescriptor g_try_malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_try_malloc$MH = RuntimeHelper.downcallHandle(
        "g_try_malloc",
        constants$121.g_try_malloc$FUNC, false
    );
}

