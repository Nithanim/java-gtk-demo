// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$13 {

    static final FunctionDescriptor g_array_set_clear_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_array_set_clear_func$MH = RuntimeHelper.downcallHandle(
        "g_array_set_clear_func",
        constants$13.g_array_set_clear_func$FUNC, false
    );
    static final FunctionDescriptor g_ptr_array_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_ptr_array_new$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_new",
        constants$13.g_ptr_array_new$FUNC, false
    );
    static final FunctionDescriptor g_ptr_array_new_with_free_func$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ptr_array_new_with_free_func$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_new_with_free_func",
        constants$13.g_ptr_array_new_with_free_func$FUNC, false
    );
    static final FunctionDescriptor g_ptr_array_steal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ptr_array_steal$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_steal",
        constants$13.g_ptr_array_steal$FUNC, false
    );
    static final FunctionDescriptor g_ptr_array_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ptr_array_copy$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_copy",
        constants$13.g_ptr_array_copy$FUNC, false
    );
    static final FunctionDescriptor g_ptr_array_sized_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_ptr_array_sized_new$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_sized_new",
        constants$13.g_ptr_array_sized_new$FUNC, false
    );
}

