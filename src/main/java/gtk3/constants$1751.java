// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1751 {

    static final FunctionDescriptor gtk_flow_box_set_hadjustment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_set_hadjustment$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_set_hadjustment",
        constants$1751.gtk_flow_box_set_hadjustment$FUNC, false
    );
    static final FunctionDescriptor gtk_flow_box_set_vadjustment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_set_vadjustment$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_set_vadjustment",
        constants$1751.gtk_flow_box_set_vadjustment$FUNC, false
    );
    static final FunctionDescriptor GtkFlowBoxFilterFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkFlowBoxFilterFunc$MH = RuntimeHelper.downcallHandle(
        constants$1751.GtkFlowBoxFilterFunc$FUNC, false
    );
    static final FunctionDescriptor gtk_flow_box_set_filter_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_set_filter_func$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_set_filter_func",
        constants$1751.gtk_flow_box_set_filter_func$FUNC, false
    );
    static final FunctionDescriptor gtk_flow_box_invalidate_filter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_invalidate_filter$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_invalidate_filter",
        constants$1751.gtk_flow_box_invalidate_filter$FUNC, false
    );
}


