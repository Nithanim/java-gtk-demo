// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1428 {

    static final FunctionDescriptor gtk_widget_add_tick_callback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_add_tick_callback$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_add_tick_callback",
        constants$1428.gtk_widget_add_tick_callback$FUNC, false
    );
    static final FunctionDescriptor gtk_widget_remove_tick_callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_remove_tick_callback$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_remove_tick_callback",
        constants$1428.gtk_widget_remove_tick_callback$FUNC, false
    );
    static final FunctionDescriptor gtk_widget_init_template$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_init_template$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_init_template",
        constants$1428.gtk_widget_init_template$FUNC, false
    );
    static final FunctionDescriptor gtk_widget_get_template_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_template_child$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_template_child",
        constants$1428.gtk_widget_get_template_child$FUNC, false
    );
    static final FunctionDescriptor gtk_widget_class_set_template$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_class_set_template$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_class_set_template",
        constants$1428.gtk_widget_class_set_template$FUNC, false
    );
    static final FunctionDescriptor gtk_widget_class_set_template_from_resource$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_class_set_template_from_resource$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_class_set_template_from_resource",
        constants$1428.gtk_widget_class_set_template_from_resource$FUNC, false
    );
}

