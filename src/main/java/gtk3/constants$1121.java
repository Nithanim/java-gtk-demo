// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1121 {

    static final FunctionDescriptor cairo_push_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_push_group$MH = RuntimeHelper.downcallHandle(
        "cairo_push_group",
        constants$1121.cairo_push_group$FUNC, false
    );
    static final FunctionDescriptor cairo_push_group_with_content$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_push_group_with_content$MH = RuntimeHelper.downcallHandle(
        "cairo_push_group_with_content",
        constants$1121.cairo_push_group_with_content$FUNC, false
    );
    static final FunctionDescriptor cairo_pop_group$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_pop_group$MH = RuntimeHelper.downcallHandle(
        "cairo_pop_group",
        constants$1121.cairo_pop_group$FUNC, false
    );
    static final FunctionDescriptor cairo_pop_group_to_source$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_pop_group_to_source$MH = RuntimeHelper.downcallHandle(
        "cairo_pop_group_to_source",
        constants$1121.cairo_pop_group_to_source$FUNC, false
    );
    static final FunctionDescriptor cairo_set_operator$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_set_operator$MH = RuntimeHelper.downcallHandle(
        "cairo_set_operator",
        constants$1121.cairo_set_operator$FUNC, false
    );
    static final FunctionDescriptor cairo_set_source$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_set_source$MH = RuntimeHelper.downcallHandle(
        "cairo_set_source",
        constants$1121.cairo_set_source$FUNC, false
    );
}


