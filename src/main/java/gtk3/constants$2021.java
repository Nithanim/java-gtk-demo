// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$2021 {

    static final FunctionDescriptor gtk_tool_palette_get_style$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_get_style$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_get_style",
        constants$2021.gtk_tool_palette_get_style$FUNC, false
    );
    static final FunctionDescriptor gtk_tool_palette_get_drop_item$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_get_drop_item$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_get_drop_item",
        constants$2021.gtk_tool_palette_get_drop_item$FUNC, false
    );
    static final FunctionDescriptor gtk_tool_palette_get_drop_group$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_get_drop_group$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_get_drop_group",
        constants$2021.gtk_tool_palette_get_drop_group$FUNC, false
    );
    static final FunctionDescriptor gtk_tool_palette_get_drag_item$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_get_drag_item$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_get_drag_item",
        constants$2021.gtk_tool_palette_get_drag_item$FUNC, false
    );
    static final FunctionDescriptor gtk_tool_palette_set_drag_source$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_set_drag_source$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_set_drag_source",
        constants$2021.gtk_tool_palette_set_drag_source$FUNC, false
    );
    static final FunctionDescriptor gtk_tool_palette_add_drag_dest$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_add_drag_dest$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_add_drag_dest",
        constants$2021.gtk_tool_palette_add_drag_dest$FUNC, false
    );
}


