// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1097 {

    static final FunctionDescriptor pango_layout_iter_get_line_yrange$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_iter_get_line_yrange$MH = RuntimeHelper.downcallHandle(
        "pango_layout_iter_get_line_yrange",
        constants$1097.pango_layout_iter_get_line_yrange$FUNC, false
    );
    static final FunctionDescriptor pango_layout_iter_get_layout_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_iter_get_layout_extents$MH = RuntimeHelper.downcallHandle(
        "pango_layout_iter_get_layout_extents",
        constants$1097.pango_layout_iter_get_layout_extents$FUNC, false
    );
    static final FunctionDescriptor pango_layout_iter_get_baseline$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_iter_get_baseline$MH = RuntimeHelper.downcallHandle(
        "pango_layout_iter_get_baseline",
        constants$1097.pango_layout_iter_get_baseline$FUNC, false
    );
    static final FunctionDescriptor pango_renderer_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_renderer_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_get_type",
        constants$1097.pango_renderer_get_type$FUNC, false
    );
    static final FunctionDescriptor pango_renderer_draw_layout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_renderer_draw_layout$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_draw_layout",
        constants$1097.pango_renderer_draw_layout$FUNC, false
    );
    static final FunctionDescriptor pango_renderer_draw_layout_line$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_renderer_draw_layout_line$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_draw_layout_line",
        constants$1097.pango_renderer_draw_layout_line$FUNC, false
    );
}

