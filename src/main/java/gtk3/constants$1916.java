// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1916 {

    static final FunctionDescriptor gtk_print_operation_get_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_get_status$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_get_status",
        constants$1916.gtk_print_operation_get_status$FUNC, false
    );
    static final FunctionDescriptor gtk_print_operation_get_status_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_get_status_string$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_get_status_string",
        constants$1916.gtk_print_operation_get_status_string$FUNC, false
    );
    static final FunctionDescriptor gtk_print_operation_is_finished$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_is_finished$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_is_finished",
        constants$1916.gtk_print_operation_is_finished$FUNC, false
    );
    static final FunctionDescriptor gtk_print_operation_cancel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_cancel$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_cancel",
        constants$1916.gtk_print_operation_cancel$FUNC, false
    );
    static final FunctionDescriptor gtk_print_operation_draw_page_finish$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_draw_page_finish$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_draw_page_finish",
        constants$1916.gtk_print_operation_draw_page_finish$FUNC, false
    );
    static final FunctionDescriptor gtk_print_operation_set_defer_drawing$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_set_defer_drawing$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_set_defer_drawing",
        constants$1916.gtk_print_operation_set_defer_drawing$FUNC, false
    );
}


