// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1100 {

    static final FunctionDescriptor pango_renderer_get_alpha$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_renderer_get_alpha$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_get_alpha",
        constants$1100.pango_renderer_get_alpha$FUNC, false
    );
    static final FunctionDescriptor pango_renderer_set_matrix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_renderer_set_matrix$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_set_matrix",
        constants$1100.pango_renderer_set_matrix$FUNC, false
    );
    static final FunctionDescriptor pango_renderer_get_matrix$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_renderer_get_matrix$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_get_matrix",
        constants$1100.pango_renderer_get_matrix$FUNC, false
    );
    static final FunctionDescriptor pango_renderer_get_layout$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_renderer_get_layout$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_get_layout",
        constants$1100.pango_renderer_get_layout$FUNC, false
    );
    static final FunctionDescriptor pango_renderer_get_layout_line$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_renderer_get_layout_line$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_get_layout_line",
        constants$1100.pango_renderer_get_layout_line$FUNC, false
    );
    static final  OfAddress stdin$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle stdin$VH = constants$1100.stdin$LAYOUT.varHandle();
    static final MemorySegment stdin$SEGMENT = RuntimeHelper.lookupGlobalVariable("stdin", constants$1100.stdin$LAYOUT);
}


