// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$360 {

    static final FunctionDescriptor pthread_rwlockattr_getkind_np$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_rwlockattr_getkind_np$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlockattr_getkind_np",
        constants$360.pthread_rwlockattr_getkind_np$FUNC, false
    );
    static final FunctionDescriptor pthread_rwlockattr_setkind_np$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_rwlockattr_setkind_np$MH = RuntimeHelper.downcallHandle(
        "pthread_rwlockattr_setkind_np",
        constants$360.pthread_rwlockattr_setkind_np$FUNC, false
    );
    static final FunctionDescriptor pthread_cond_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_cond_init$MH = RuntimeHelper.downcallHandle(
        "pthread_cond_init",
        constants$360.pthread_cond_init$FUNC, false
    );
    static final FunctionDescriptor pthread_cond_destroy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_cond_destroy$MH = RuntimeHelper.downcallHandle(
        "pthread_cond_destroy",
        constants$360.pthread_cond_destroy$FUNC, false
    );
    static final FunctionDescriptor pthread_cond_signal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_cond_signal$MH = RuntimeHelper.downcallHandle(
        "pthread_cond_signal",
        constants$360.pthread_cond_signal$FUNC, false
    );
    static final FunctionDescriptor pthread_cond_broadcast$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_cond_broadcast$MH = RuntimeHelper.downcallHandle(
        "pthread_cond_broadcast",
        constants$360.pthread_cond_broadcast$FUNC, false
    );
}

