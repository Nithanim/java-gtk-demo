// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1139 {

    static final FunctionDescriptor cairo_font_face_set_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_face_set_user_data$MH = RuntimeHelper.downcallHandle(
        "cairo_font_face_set_user_data",
        constants$1139.cairo_font_face_set_user_data$FUNC, false
    );
    static final FunctionDescriptor cairo_scaled_font_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_scaled_font_create$MH = RuntimeHelper.downcallHandle(
        "cairo_scaled_font_create",
        constants$1139.cairo_scaled_font_create$FUNC, false
    );
    static final FunctionDescriptor cairo_scaled_font_reference$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_scaled_font_reference$MH = RuntimeHelper.downcallHandle(
        "cairo_scaled_font_reference",
        constants$1139.cairo_scaled_font_reference$FUNC, false
    );
    static final FunctionDescriptor cairo_scaled_font_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_scaled_font_destroy$MH = RuntimeHelper.downcallHandle(
        "cairo_scaled_font_destroy",
        constants$1139.cairo_scaled_font_destroy$FUNC, false
    );
    static final FunctionDescriptor cairo_scaled_font_get_reference_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_scaled_font_get_reference_count$MH = RuntimeHelper.downcallHandle(
        "cairo_scaled_font_get_reference_count",
        constants$1139.cairo_scaled_font_get_reference_count$FUNC, false
    );
    static final FunctionDescriptor cairo_scaled_font_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_scaled_font_status$MH = RuntimeHelper.downcallHandle(
        "cairo_scaled_font_status",
        constants$1139.cairo_scaled_font_status$FUNC, false
    );
}


