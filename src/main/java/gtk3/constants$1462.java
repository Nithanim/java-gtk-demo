// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1462 {

    static final FunctionDescriptor gtk_window_get_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_position$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_position",
        constants$1462.gtk_window_get_position$FUNC, false
    );
    static final FunctionDescriptor gtk_window_parse_geometry$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_parse_geometry$MH = RuntimeHelper.downcallHandle(
        "gtk_window_parse_geometry",
        constants$1462.gtk_window_parse_geometry$FUNC, false
    );
    static final FunctionDescriptor gtk_window_set_default_geometry$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_set_default_geometry$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_default_geometry",
        constants$1462.gtk_window_set_default_geometry$FUNC, false
    );
    static final FunctionDescriptor gtk_window_resize_to_geometry$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_resize_to_geometry$MH = RuntimeHelper.downcallHandle(
        "gtk_window_resize_to_geometry",
        constants$1462.gtk_window_resize_to_geometry$FUNC, false
    );
    static final FunctionDescriptor gtk_window_get_group$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_group$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_group",
        constants$1462.gtk_window_get_group$FUNC, false
    );
    static final FunctionDescriptor gtk_window_has_group$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_has_group$MH = RuntimeHelper.downcallHandle(
        "gtk_window_has_group",
        constants$1462.gtk_window_has_group$FUNC, false
    );
}


