// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1071 {

    static final FunctionDescriptor pango_glyph_string_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle pango_glyph_string_new$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_string_new",
        constants$1071.pango_glyph_string_new$FUNC, false
    );
    static final FunctionDescriptor pango_glyph_string_set_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_glyph_string_set_size$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_string_set_size",
        constants$1071.pango_glyph_string_set_size$FUNC, false
    );
    static final FunctionDescriptor pango_glyph_string_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_glyph_string_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_string_get_type",
        constants$1071.pango_glyph_string_get_type$FUNC, false
    );
    static final FunctionDescriptor pango_glyph_string_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_glyph_string_copy$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_string_copy",
        constants$1071.pango_glyph_string_copy$FUNC, false
    );
    static final FunctionDescriptor pango_glyph_string_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_glyph_string_free$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_string_free",
        constants$1071.pango_glyph_string_free$FUNC, false
    );
    static final FunctionDescriptor pango_glyph_string_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_glyph_string_extents$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_string_extents",
        constants$1071.pango_glyph_string_extents$FUNC, false
    );
}


