// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1070 {

    static final FunctionDescriptor pango_context_set_matrix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_context_set_matrix$MH = RuntimeHelper.downcallHandle(
        "pango_context_set_matrix",
        constants$1070.pango_context_set_matrix$FUNC, false
    );
    static final FunctionDescriptor pango_context_get_matrix$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_context_get_matrix$MH = RuntimeHelper.downcallHandle(
        "pango_context_get_matrix",
        constants$1070.pango_context_get_matrix$FUNC, false
    );
    static final FunctionDescriptor pango_context_set_round_glyph_positions$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_context_set_round_glyph_positions$MH = RuntimeHelper.downcallHandle(
        "pango_context_set_round_glyph_positions",
        constants$1070.pango_context_set_round_glyph_positions$FUNC, false
    );
    static final FunctionDescriptor pango_context_get_round_glyph_positions$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_context_get_round_glyph_positions$MH = RuntimeHelper.downcallHandle(
        "pango_context_get_round_glyph_positions",
        constants$1070.pango_context_get_round_glyph_positions$FUNC, false
    );
    static final FunctionDescriptor pango_itemize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_itemize$MH = RuntimeHelper.downcallHandle(
        "pango_itemize",
        constants$1070.pango_itemize$FUNC, false
    );
    static final FunctionDescriptor pango_itemize_with_base_dir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_itemize_with_base_dir$MH = RuntimeHelper.downcallHandle(
        "pango_itemize_with_base_dir",
        constants$1070.pango_itemize_with_base_dir$FUNC, false
    );
}

