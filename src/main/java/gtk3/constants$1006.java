// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1006 {

    static final FunctionDescriptor hb_font_get_glyph_extents_for_origin$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_extents_for_origin$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_extents_for_origin",
        constants$1006.hb_font_get_glyph_extents_for_origin$FUNC, false
    );
    static final FunctionDescriptor hb_font_get_glyph_contour_point_for_origin$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_contour_point_for_origin$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_contour_point_for_origin",
        constants$1006.hb_font_get_glyph_contour_point_for_origin$FUNC, false
    );
    static final FunctionDescriptor hb_font_glyph_to_string$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_font_glyph_to_string$MH = RuntimeHelper.downcallHandle(
        "hb_font_glyph_to_string",
        constants$1006.hb_font_glyph_to_string$FUNC, false
    );
    static final FunctionDescriptor hb_font_glyph_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_glyph_from_string$MH = RuntimeHelper.downcallHandle(
        "hb_font_glyph_from_string",
        constants$1006.hb_font_glyph_from_string$FUNC, false
    );
    static final FunctionDescriptor hb_font_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_create$MH = RuntimeHelper.downcallHandle(
        "hb_font_create",
        constants$1006.hb_font_create$FUNC, false
    );
    static final FunctionDescriptor hb_font_create_sub_font$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_create_sub_font$MH = RuntimeHelper.downcallHandle(
        "hb_font_create_sub_font",
        constants$1006.hb_font_create_sub_font$FUNC, false
    );
}

