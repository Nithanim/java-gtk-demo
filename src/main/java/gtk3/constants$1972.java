// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1972 {

    static final FunctionDescriptor gtk_stack_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_stack_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_get_type",
        constants$1972.gtk_stack_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_stack_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_stack_new$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_new",
        constants$1972.gtk_stack_new$FUNC, false
    );
    static final FunctionDescriptor gtk_stack_add_named$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stack_add_named$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_add_named",
        constants$1972.gtk_stack_add_named$FUNC, false
    );
    static final FunctionDescriptor gtk_stack_add_titled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stack_add_titled$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_add_titled",
        constants$1972.gtk_stack_add_titled$FUNC, false
    );
    static final FunctionDescriptor gtk_stack_get_child_by_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stack_get_child_by_name$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_get_child_by_name",
        constants$1972.gtk_stack_get_child_by_name$FUNC, false
    );
    static final FunctionDescriptor gtk_stack_set_visible_child$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_stack_set_visible_child$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_set_visible_child",
        constants$1972.gtk_stack_set_visible_child$FUNC, false
    );
}


