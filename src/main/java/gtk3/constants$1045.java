// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1045 {

    static final FunctionDescriptor pango_font_metrics_get_underline_thickness$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_metrics_get_underline_thickness$MH = RuntimeHelper.downcallHandle(
        "pango_font_metrics_get_underline_thickness",
        constants$1045.pango_font_metrics_get_underline_thickness$FUNC, false
    );
    static final FunctionDescriptor pango_font_metrics_get_strikethrough_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_metrics_get_strikethrough_position$MH = RuntimeHelper.downcallHandle(
        "pango_font_metrics_get_strikethrough_position",
        constants$1045.pango_font_metrics_get_strikethrough_position$FUNC, false
    );
    static final FunctionDescriptor pango_font_metrics_get_strikethrough_thickness$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_metrics_get_strikethrough_thickness$MH = RuntimeHelper.downcallHandle(
        "pango_font_metrics_get_strikethrough_thickness",
        constants$1045.pango_font_metrics_get_strikethrough_thickness$FUNC, false
    );
    static final FunctionDescriptor pango_font_family_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_font_family_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_font_family_get_type",
        constants$1045.pango_font_family_get_type$FUNC, false
    );
    static final FunctionDescriptor pango_font_family_list_faces$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_family_list_faces$MH = RuntimeHelper.downcallHandle(
        "pango_font_family_list_faces",
        constants$1045.pango_font_family_list_faces$FUNC, false
    );
    static final FunctionDescriptor pango_font_family_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_family_get_name$MH = RuntimeHelper.downcallHandle(
        "pango_font_family_get_name",
        constants$1045.pango_font_family_get_name$FUNC, false
    );
}

