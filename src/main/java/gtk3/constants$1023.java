// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1023 {

    static final FunctionDescriptor hb_unicode_funcs_set_decompose_compatibility_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_unicode_funcs_set_decompose_compatibility_func$MH = RuntimeHelper.downcallHandle(
        "hb_unicode_funcs_set_decompose_compatibility_func",
        constants$1023.hb_unicode_funcs_set_decompose_compatibility_func$FUNC, false
    );
    static final FunctionDescriptor hb_unicode_decompose_compatibility$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_unicode_decompose_compatibility$MH = RuntimeHelper.downcallHandle(
        "hb_unicode_decompose_compatibility",
        constants$1023.hb_unicode_decompose_compatibility$FUNC, false
    );
    static final FunctionDescriptor hb_font_get_glyph_v_kerning_func_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_v_kerning_func_t$MH = RuntimeHelper.downcallHandle(
        constants$1023.hb_font_get_glyph_v_kerning_func_t$FUNC, false
    );
    static final FunctionDescriptor hb_font_funcs_set_glyph_v_kerning_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_funcs_set_glyph_v_kerning_func$MH = RuntimeHelper.downcallHandle(
        "hb_font_funcs_set_glyph_v_kerning_func",
        constants$1023.hb_font_funcs_set_glyph_v_kerning_func$FUNC, false
    );
    static final FunctionDescriptor hb_font_get_glyph_v_kerning$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_v_kerning$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_v_kerning",
        constants$1023.hb_font_get_glyph_v_kerning$FUNC, false
    );
}


