// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$355 {

    static final FunctionDescriptor pthread_mutex_timedlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutex_timedlock$MH = RuntimeHelper.downcallHandle(
        "pthread_mutex_timedlock",
        constants$355.pthread_mutex_timedlock$FUNC, false
    );
    static final FunctionDescriptor pthread_mutex_unlock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutex_unlock$MH = RuntimeHelper.downcallHandle(
        "pthread_mutex_unlock",
        constants$355.pthread_mutex_unlock$FUNC, false
    );
    static final FunctionDescriptor pthread_mutex_getprioceiling$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutex_getprioceiling$MH = RuntimeHelper.downcallHandle(
        "pthread_mutex_getprioceiling",
        constants$355.pthread_mutex_getprioceiling$FUNC, false
    );
    static final FunctionDescriptor pthread_mutex_setprioceiling$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutex_setprioceiling$MH = RuntimeHelper.downcallHandle(
        "pthread_mutex_setprioceiling",
        constants$355.pthread_mutex_setprioceiling$FUNC, false
    );
    static final FunctionDescriptor pthread_mutex_consistent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutex_consistent$MH = RuntimeHelper.downcallHandle(
        "pthread_mutex_consistent",
        constants$355.pthread_mutex_consistent$FUNC, false
    );
    static final FunctionDescriptor pthread_mutexattr_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_mutexattr_init$MH = RuntimeHelper.downcallHandle(
        "pthread_mutexattr_init",
        constants$355.pthread_mutexattr_init$FUNC, false
    );
}

