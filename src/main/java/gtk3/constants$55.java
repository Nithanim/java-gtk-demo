// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$55 {

    static final FunctionDescriptor g_rw_lock_reader_trylock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_rw_lock_reader_trylock$MH = RuntimeHelper.downcallHandle(
        "g_rw_lock_reader_trylock",
        constants$55.g_rw_lock_reader_trylock$FUNC, false
    );
    static final FunctionDescriptor g_rw_lock_reader_unlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_rw_lock_reader_unlock$MH = RuntimeHelper.downcallHandle(
        "g_rw_lock_reader_unlock",
        constants$55.g_rw_lock_reader_unlock$FUNC, false
    );
    static final FunctionDescriptor g_rec_mutex_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_rec_mutex_init$MH = RuntimeHelper.downcallHandle(
        "g_rec_mutex_init",
        constants$55.g_rec_mutex_init$FUNC, false
    );
    static final FunctionDescriptor g_rec_mutex_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_rec_mutex_clear$MH = RuntimeHelper.downcallHandle(
        "g_rec_mutex_clear",
        constants$55.g_rec_mutex_clear$FUNC, false
    );
    static final FunctionDescriptor g_rec_mutex_lock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_rec_mutex_lock$MH = RuntimeHelper.downcallHandle(
        "g_rec_mutex_lock",
        constants$55.g_rec_mutex_lock$FUNC, false
    );
    static final FunctionDescriptor g_rec_mutex_trylock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_rec_mutex_trylock$MH = RuntimeHelper.downcallHandle(
        "g_rec_mutex_trylock",
        constants$55.g_rec_mutex_trylock$FUNC, false
    );
}

