// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1839 {

    static final FunctionDescriptor gtk_list_box_invalidate_sort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_invalidate_sort$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_invalidate_sort",
        constants$1839.gtk_list_box_invalidate_sort$FUNC, false
    );
    static final FunctionDescriptor gtk_list_box_invalidate_headers$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_invalidate_headers$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_invalidate_headers",
        constants$1839.gtk_list_box_invalidate_headers$FUNC, false
    );
    static final FunctionDescriptor gtk_list_box_set_sort_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_set_sort_func$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_set_sort_func",
        constants$1839.gtk_list_box_set_sort_func$FUNC, false
    );
    static final FunctionDescriptor gtk_list_box_set_activate_on_single_click$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_list_box_set_activate_on_single_click$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_set_activate_on_single_click",
        constants$1839.gtk_list_box_set_activate_on_single_click$FUNC, false
    );
    static final FunctionDescriptor gtk_list_box_get_activate_on_single_click$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_get_activate_on_single_click$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_get_activate_on_single_click",
        constants$1839.gtk_list_box_get_activate_on_single_click$FUNC, false
    );
    static final FunctionDescriptor gtk_list_box_drag_unhighlight_row$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_drag_unhighlight_row$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_drag_unhighlight_row",
        constants$1839.gtk_list_box_drag_unhighlight_row$FUNC, false
    );
}


