// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1249 {

    static final FunctionDescriptor gdk_color_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_color_copy$MH = RuntimeHelper.downcallHandle(
        "gdk_color_copy",
        constants$1249.gdk_color_copy$FUNC, false
    );
    static final FunctionDescriptor gdk_color_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_color_free$MH = RuntimeHelper.downcallHandle(
        "gdk_color_free",
        constants$1249.gdk_color_free$FUNC, false
    );
    static final FunctionDescriptor gdk_color_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_color_hash$MH = RuntimeHelper.downcallHandle(
        "gdk_color_hash",
        constants$1249.gdk_color_hash$FUNC, false
    );
    static final FunctionDescriptor gdk_color_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_color_equal$MH = RuntimeHelper.downcallHandle(
        "gdk_color_equal",
        constants$1249.gdk_color_equal$FUNC, false
    );
    static final FunctionDescriptor gdk_color_parse$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_color_parse$MH = RuntimeHelper.downcallHandle(
        "gdk_color_parse",
        constants$1249.gdk_color_parse$FUNC, false
    );
    static final FunctionDescriptor gdk_color_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_color_to_string$MH = RuntimeHelper.downcallHandle(
        "gdk_color_to_string",
        constants$1249.gdk_color_to_string$FUNC, false
    );
}

