// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1933 {

    static final FunctionDescriptor gtk_recent_manager_move_item$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_move_item$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_move_item",
        constants$1933.gtk_recent_manager_move_item$FUNC, false
    );
    static final FunctionDescriptor gtk_recent_manager_get_items$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_get_items$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_get_items",
        constants$1933.gtk_recent_manager_get_items$FUNC, false
    );
    static final FunctionDescriptor gtk_recent_manager_purge_items$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_purge_items$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_purge_items",
        constants$1933.gtk_recent_manager_purge_items$FUNC, false
    );
    static final FunctionDescriptor gtk_recent_info_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_recent_info_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_get_type",
        constants$1933.gtk_recent_info_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_recent_info_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_ref$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_ref",
        constants$1933.gtk_recent_info_ref$FUNC, false
    );
    static final FunctionDescriptor gtk_recent_info_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_unref$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_unref",
        constants$1933.gtk_recent_info_unref$FUNC, false
    );
}

