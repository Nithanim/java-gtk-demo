// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$52 {

    static final FunctionDescriptor g_thread_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_unref$MH = RuntimeHelper.downcallHandle(
        "g_thread_unref",
        constants$52.g_thread_unref$FUNC, false
    );
    static final FunctionDescriptor g_thread_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_new$MH = RuntimeHelper.downcallHandle(
        "g_thread_new",
        constants$52.g_thread_new$FUNC, false
    );
    static final FunctionDescriptor g_thread_try_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_try_new$MH = RuntimeHelper.downcallHandle(
        "g_thread_try_new",
        constants$52.g_thread_try_new$FUNC, false
    );
    static final FunctionDescriptor g_thread_self$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_thread_self$MH = RuntimeHelper.downcallHandle(
        "g_thread_self",
        constants$52.g_thread_self$FUNC, false
    );
    static final FunctionDescriptor g_thread_exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_exit$MH = RuntimeHelper.downcallHandle(
        "g_thread_exit",
        constants$52.g_thread_exit$FUNC, false
    );
    static final FunctionDescriptor g_thread_join$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_join$MH = RuntimeHelper.downcallHandle(
        "g_thread_join",
        constants$52.g_thread_join$FUNC, false
    );
}


