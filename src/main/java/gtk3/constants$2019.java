// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$2019 {

    static final FunctionDescriptor gtk_tool_palette_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_tool_palette_new$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_new",
        constants$2019.gtk_tool_palette_new$FUNC, false
    );
    static final FunctionDescriptor gtk_tool_palette_set_group_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_set_group_position$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_set_group_position",
        constants$2019.gtk_tool_palette_set_group_position$FUNC, false
    );
    static final FunctionDescriptor gtk_tool_palette_set_exclusive$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_set_exclusive$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_set_exclusive",
        constants$2019.gtk_tool_palette_set_exclusive$FUNC, false
    );
    static final FunctionDescriptor gtk_tool_palette_set_expand$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_set_expand$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_set_expand",
        constants$2019.gtk_tool_palette_set_expand$FUNC, false
    );
    static final FunctionDescriptor gtk_tool_palette_get_group_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_get_group_position$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_get_group_position",
        constants$2019.gtk_tool_palette_get_group_position$FUNC, false
    );
    static final FunctionDescriptor gtk_tool_palette_get_exclusive$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_get_exclusive$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_get_exclusive",
        constants$2019.gtk_tool_palette_get_exclusive$FUNC, false
    );
}


