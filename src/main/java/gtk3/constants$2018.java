// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$2018 {

    static final FunctionDescriptor gtk_tool_item_group_set_item_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tool_item_group_set_item_position$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_item_group_set_item_position",
        constants$2018.gtk_tool_item_group_set_item_position$FUNC, false
    );
    static final FunctionDescriptor gtk_tool_item_group_get_item_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tool_item_group_get_item_position$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_item_group_get_item_position",
        constants$2018.gtk_tool_item_group_get_item_position$FUNC, false
    );
    static final FunctionDescriptor gtk_tool_item_group_get_n_items$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tool_item_group_get_n_items$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_item_group_get_n_items",
        constants$2018.gtk_tool_item_group_get_n_items$FUNC, false
    );
    static final FunctionDescriptor gtk_tool_item_group_get_nth_item$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tool_item_group_get_nth_item$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_item_group_get_nth_item",
        constants$2018.gtk_tool_item_group_get_nth_item$FUNC, false
    );
    static final FunctionDescriptor gtk_tool_item_group_get_drop_item$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tool_item_group_get_drop_item$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_item_group_get_drop_item",
        constants$2018.gtk_tool_item_group_get_drop_item$FUNC, false
    );
    static final FunctionDescriptor gtk_tool_palette_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_tool_palette_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_get_type",
        constants$2018.gtk_tool_palette_get_type$FUNC, false
    );
}


