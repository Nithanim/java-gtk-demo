// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1711 {

    static final FunctionDescriptor gtk_drag_dest_find_target$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_find_target$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_find_target",
        constants$1711.gtk_drag_dest_find_target$FUNC, false
    );
    static final FunctionDescriptor gtk_drag_dest_get_target_list$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_get_target_list$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_get_target_list",
        constants$1711.gtk_drag_dest_get_target_list$FUNC, false
    );
    static final FunctionDescriptor gtk_drag_dest_set_target_list$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_set_target_list$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_set_target_list",
        constants$1711.gtk_drag_dest_set_target_list$FUNC, false
    );
    static final FunctionDescriptor gtk_drag_dest_add_text_targets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_add_text_targets$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_add_text_targets",
        constants$1711.gtk_drag_dest_add_text_targets$FUNC, false
    );
    static final FunctionDescriptor gtk_drag_dest_add_image_targets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_add_image_targets$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_add_image_targets",
        constants$1711.gtk_drag_dest_add_image_targets$FUNC, false
    );
    static final FunctionDescriptor gtk_drag_dest_add_uri_targets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_add_uri_targets$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_add_uri_targets",
        constants$1711.gtk_drag_dest_add_uri_targets$FUNC, false
    );
}

