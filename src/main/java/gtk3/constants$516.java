// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$516 {

    static final FunctionDescriptor g_action_group_action_added$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_action_added$MH = RuntimeHelper.downcallHandle(
        "g_action_group_action_added",
        constants$516.g_action_group_action_added$FUNC, false
    );
    static final FunctionDescriptor g_action_group_action_removed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_action_removed$MH = RuntimeHelper.downcallHandle(
        "g_action_group_action_removed",
        constants$516.g_action_group_action_removed$FUNC, false
    );
    static final FunctionDescriptor g_action_group_action_enabled_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_action_group_action_enabled_changed$MH = RuntimeHelper.downcallHandle(
        "g_action_group_action_enabled_changed",
        constants$516.g_action_group_action_enabled_changed$FUNC, false
    );
    static final FunctionDescriptor g_action_group_action_state_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_action_state_changed$MH = RuntimeHelper.downcallHandle(
        "g_action_group_action_state_changed",
        constants$516.g_action_group_action_state_changed$FUNC, false
    );
    static final FunctionDescriptor g_action_group_query_action$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_group_query_action$MH = RuntimeHelper.downcallHandle(
        "g_action_group_query_action",
        constants$516.g_action_group_query_action$FUNC, false
    );
    static final FunctionDescriptor g_dbus_connection_export_action_group$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_export_action_group$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_export_action_group",
        constants$516.g_dbus_connection_export_action_group$FUNC, false
    );
}


