// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1581 {

    static final FunctionDescriptor gtk_drag_set_icon_surface$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_set_icon_surface$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_set_icon_surface",
        constants$1581.gtk_drag_set_icon_surface$FUNC, false
    );
    static final FunctionDescriptor gtk_drag_set_icon_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_drag_set_icon_name$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_set_icon_name",
        constants$1581.gtk_drag_set_icon_name$FUNC, false
    );
    static final FunctionDescriptor gtk_drag_set_icon_gicon$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_drag_set_icon_gicon$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_set_icon_gicon",
        constants$1581.gtk_drag_set_icon_gicon$FUNC, false
    );
    static final FunctionDescriptor gtk_drag_set_icon_default$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_set_icon_default$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_set_icon_default",
        constants$1581.gtk_drag_set_icon_default$FUNC, false
    );
    static final FunctionDescriptor gtk_drag_check_threshold$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_drag_check_threshold$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_check_threshold",
        constants$1581.gtk_drag_check_threshold$FUNC, false
    );
    static final FunctionDescriptor gtk_editable_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_editable_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_get_type",
        constants$1581.gtk_editable_get_type$FUNC, false
    );
}


