// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1712 {

    static final FunctionDescriptor gtk_drag_dest_set_track_motion$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_set_track_motion$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_set_track_motion",
        constants$1712.gtk_drag_dest_set_track_motion$FUNC, false
    );
    static final FunctionDescriptor gtk_drag_dest_get_track_motion$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_get_track_motion$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_get_track_motion",
        constants$1712.gtk_drag_dest_get_track_motion$FUNC, false
    );
    static final FunctionDescriptor gtk_drag_source_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_drag_source_set$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_set",
        constants$1712.gtk_drag_source_set$FUNC, false
    );
    static final FunctionDescriptor gtk_drag_source_unset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_source_unset$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_unset",
        constants$1712.gtk_drag_source_unset$FUNC, false
    );
    static final FunctionDescriptor gtk_drag_source_get_target_list$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_source_get_target_list$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_get_target_list",
        constants$1712.gtk_drag_source_get_target_list$FUNC, false
    );
    static final FunctionDescriptor gtk_drag_source_set_target_list$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_source_set_target_list$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_source_set_target_list",
        constants$1712.gtk_drag_source_set_target_list$FUNC, false
    );
}


