// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1495 {

    static final FunctionDescriptor gtk_label_get_layout_offsets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_get_layout_offsets$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_layout_offsets",
        constants$1495.gtk_label_get_layout_offsets$FUNC, false
    );
    static final FunctionDescriptor gtk_label_set_single_line_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_label_set_single_line_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_label_set_single_line_mode",
        constants$1495.gtk_label_set_single_line_mode$FUNC, false
    );
    static final FunctionDescriptor gtk_label_get_single_line_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_get_single_line_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_single_line_mode",
        constants$1495.gtk_label_get_single_line_mode$FUNC, false
    );
    static final FunctionDescriptor gtk_label_get_current_uri$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_get_current_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_current_uri",
        constants$1495.gtk_label_get_current_uri$FUNC, false
    );
    static final FunctionDescriptor gtk_label_set_track_visited_links$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_label_set_track_visited_links$MH = RuntimeHelper.downcallHandle(
        "gtk_label_set_track_visited_links",
        constants$1495.gtk_label_set_track_visited_links$FUNC, false
    );
    static final FunctionDescriptor gtk_label_get_track_visited_links$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_get_track_visited_links$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_track_visited_links",
        constants$1495.gtk_label_get_track_visited_links$FUNC, false
    );
}


