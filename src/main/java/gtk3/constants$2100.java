// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$2100 {

    static final FunctionDescriptor gtk_hsv_get_metrics$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_hsv_get_metrics$MH = RuntimeHelper.downcallHandle(
        "gtk_hsv_get_metrics",
        constants$2100.gtk_hsv_get_metrics$FUNC, false
    );
    static final FunctionDescriptor gtk_hsv_is_adjusting$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_hsv_is_adjusting$MH = RuntimeHelper.downcallHandle(
        "gtk_hsv_is_adjusting",
        constants$2100.gtk_hsv_is_adjusting$FUNC, false
    );
    static final FunctionDescriptor gtk_hscale_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_hscale_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_hscale_get_type",
        constants$2100.gtk_hscale_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_hscale_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_hscale_new$MH = RuntimeHelper.downcallHandle(
        "gtk_hscale_new",
        constants$2100.gtk_hscale_new$FUNC, false
    );
    static final FunctionDescriptor gtk_hscale_new_with_range$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_hscale_new_with_range$MH = RuntimeHelper.downcallHandle(
        "gtk_hscale_new_with_range",
        constants$2100.gtk_hscale_new_with_range$FUNC, false
    );
    static final FunctionDescriptor gtk_hscrollbar_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_hscrollbar_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_hscrollbar_get_type",
        constants$2100.gtk_hscrollbar_get_type$FUNC, false
    );
}


