// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$249 {

    static final FunctionDescriptor g_queue_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_queue_new$MH = RuntimeHelper.downcallHandle(
        "g_queue_new",
        constants$249.g_queue_new$FUNC, false
    );
    static final FunctionDescriptor g_queue_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_free$MH = RuntimeHelper.downcallHandle(
        "g_queue_free",
        constants$249.g_queue_free$FUNC, false
    );
    static final FunctionDescriptor g_queue_free_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_free_full$MH = RuntimeHelper.downcallHandle(
        "g_queue_free_full",
        constants$249.g_queue_free_full$FUNC, false
    );
    static final FunctionDescriptor g_queue_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_init$MH = RuntimeHelper.downcallHandle(
        "g_queue_init",
        constants$249.g_queue_init$FUNC, false
    );
    static final FunctionDescriptor g_queue_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_clear$MH = RuntimeHelper.downcallHandle(
        "g_queue_clear",
        constants$249.g_queue_clear$FUNC, false
    );
    static final FunctionDescriptor g_queue_is_empty$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_is_empty$MH = RuntimeHelper.downcallHandle(
        "g_queue_is_empty",
        constants$249.g_queue_is_empty$FUNC, false
    );
}


