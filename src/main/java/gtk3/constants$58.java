// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$58 {

    static final FunctionDescriptor g_once_init_leave$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_once_init_leave$MH = RuntimeHelper.downcallHandle(
        "g_once_init_leave",
        constants$58.g_once_init_leave$FUNC, false
    );
    static final FunctionDescriptor g_get_num_processors$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_get_num_processors$MH = RuntimeHelper.downcallHandle(
        "g_get_num_processors",
        constants$58.g_get_num_processors$FUNC, false
    );
    static final FunctionDescriptor g_mutex_locker_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mutex_locker_new$MH = RuntimeHelper.downcallHandle(
        "g_mutex_locker_new",
        constants$58.g_mutex_locker_new$FUNC, false
    );
    static final FunctionDescriptor g_mutex_locker_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mutex_locker_free$MH = RuntimeHelper.downcallHandle(
        "g_mutex_locker_free",
        constants$58.g_mutex_locker_free$FUNC, false
    );
    static final FunctionDescriptor g_rec_mutex_locker_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_rec_mutex_locker_new$MH = RuntimeHelper.downcallHandle(
        "g_rec_mutex_locker_new",
        constants$58.g_rec_mutex_locker_new$FUNC, false
    );
    static final FunctionDescriptor g_rec_mutex_locker_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_rec_mutex_locker_free$MH = RuntimeHelper.downcallHandle(
        "g_rec_mutex_locker_free",
        constants$58.g_rec_mutex_locker_free$FUNC, false
    );
}

