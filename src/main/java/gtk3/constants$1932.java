// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1932 {

    static final FunctionDescriptor gtk_recent_manager_get_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_recent_manager_get_default$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_get_default",
        constants$1932.gtk_recent_manager_get_default$FUNC, false
    );
    static final FunctionDescriptor gtk_recent_manager_add_item$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_add_item$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_add_item",
        constants$1932.gtk_recent_manager_add_item$FUNC, false
    );
    static final FunctionDescriptor gtk_recent_manager_add_full$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_add_full$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_add_full",
        constants$1932.gtk_recent_manager_add_full$FUNC, false
    );
    static final FunctionDescriptor gtk_recent_manager_remove_item$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_remove_item$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_remove_item",
        constants$1932.gtk_recent_manager_remove_item$FUNC, false
    );
    static final FunctionDescriptor gtk_recent_manager_lookup_item$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_lookup_item$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_lookup_item",
        constants$1932.gtk_recent_manager_lookup_item$FUNC, false
    );
    static final FunctionDescriptor gtk_recent_manager_has_item$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_has_item$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_has_item",
        constants$1932.gtk_recent_manager_has_item$FUNC, false
    );
}

