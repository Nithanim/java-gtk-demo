// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1064 {

    static final FunctionDescriptor pango_fontset_simple_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_fontset_simple_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_fontset_simple_get_type",
        constants$1064.pango_fontset_simple_get_type$FUNC, false
    );
    static final FunctionDescriptor pango_fontset_simple_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_fontset_simple_new$MH = RuntimeHelper.downcallHandle(
        "pango_fontset_simple_new",
        constants$1064.pango_fontset_simple_new$FUNC, false
    );
    static final FunctionDescriptor pango_fontset_simple_append$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_fontset_simple_append$MH = RuntimeHelper.downcallHandle(
        "pango_fontset_simple_append",
        constants$1064.pango_fontset_simple_append$FUNC, false
    );
    static final FunctionDescriptor pango_fontset_simple_size$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_fontset_simple_size$MH = RuntimeHelper.downcallHandle(
        "pango_fontset_simple_size",
        constants$1064.pango_fontset_simple_size$FUNC, false
    );
    static final FunctionDescriptor pango_fontset_get_font$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_fontset_get_font$MH = RuntimeHelper.downcallHandle(
        "pango_fontset_get_font",
        constants$1064.pango_fontset_get_font$FUNC, false
    );
    static final FunctionDescriptor pango_fontset_get_metrics$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_fontset_get_metrics$MH = RuntimeHelper.downcallHandle(
        "pango_fontset_get_metrics",
        constants$1064.pango_fontset_get_metrics$FUNC, false
    );
}

