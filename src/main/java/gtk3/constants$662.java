// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$662 {

    static final FunctionDescriptor g_file_delete$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_delete$MH = RuntimeHelper.downcallHandle(
        "g_file_delete",
        constants$662.g_file_delete$FUNC, false
    );
    static final FunctionDescriptor g_file_delete_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_delete_async$MH = RuntimeHelper.downcallHandle(
        "g_file_delete_async",
        constants$662.g_file_delete_async$FUNC, false
    );
    static final FunctionDescriptor g_file_delete_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_delete_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_delete_finish",
        constants$662.g_file_delete_finish$FUNC, false
    );
    static final FunctionDescriptor g_file_trash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_trash$MH = RuntimeHelper.downcallHandle(
        "g_file_trash",
        constants$662.g_file_trash$FUNC, false
    );
    static final FunctionDescriptor g_file_trash_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_trash_async$MH = RuntimeHelper.downcallHandle(
        "g_file_trash_async",
        constants$662.g_file_trash_async$FUNC, false
    );
    static final FunctionDescriptor g_file_trash_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_trash_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_trash_finish",
        constants$662.g_file_trash_finish$FUNC, false
    );
}

