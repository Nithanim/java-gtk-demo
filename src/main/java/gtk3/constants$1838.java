// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1838 {

    static final FunctionDescriptor gtk_list_box_unselect_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_unselect_all$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_unselect_all",
        constants$1838.gtk_list_box_unselect_all$FUNC, false
    );
    static final FunctionDescriptor gtk_list_box_set_selection_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_list_box_set_selection_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_set_selection_mode",
        constants$1838.gtk_list_box_set_selection_mode$FUNC, false
    );
    static final FunctionDescriptor gtk_list_box_get_selection_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_get_selection_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_get_selection_mode",
        constants$1838.gtk_list_box_get_selection_mode$FUNC, false
    );
    static final FunctionDescriptor gtk_list_box_set_filter_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_set_filter_func$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_set_filter_func",
        constants$1838.gtk_list_box_set_filter_func$FUNC, false
    );
    static final FunctionDescriptor gtk_list_box_set_header_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_set_header_func$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_set_header_func",
        constants$1838.gtk_list_box_set_header_func$FUNC, false
    );
    static final FunctionDescriptor gtk_list_box_invalidate_filter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_invalidate_filter$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_invalidate_filter",
        constants$1838.gtk_list_box_invalidate_filter$FUNC, false
    );
}


