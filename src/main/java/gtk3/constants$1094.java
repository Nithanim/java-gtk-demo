// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1094 {

    static final FunctionDescriptor pango_layout_get_iter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_iter$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_iter",
        constants$1094.pango_layout_get_iter$FUNC, false
    );
    static final FunctionDescriptor pango_layout_iter_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_iter_copy$MH = RuntimeHelper.downcallHandle(
        "pango_layout_iter_copy",
        constants$1094.pango_layout_iter_copy$FUNC, false
    );
    static final FunctionDescriptor pango_layout_iter_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_iter_free$MH = RuntimeHelper.downcallHandle(
        "pango_layout_iter_free",
        constants$1094.pango_layout_iter_free$FUNC, false
    );
    static final FunctionDescriptor pango_layout_iter_get_index$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_iter_get_index$MH = RuntimeHelper.downcallHandle(
        "pango_layout_iter_get_index",
        constants$1094.pango_layout_iter_get_index$FUNC, false
    );
    static final FunctionDescriptor pango_layout_iter_get_run$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_iter_get_run$MH = RuntimeHelper.downcallHandle(
        "pango_layout_iter_get_run",
        constants$1094.pango_layout_iter_get_run$FUNC, false
    );
    static final FunctionDescriptor pango_layout_iter_get_run_readonly$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_iter_get_run_readonly$MH = RuntimeHelper.downcallHandle(
        "pango_layout_iter_get_run_readonly",
        constants$1094.pango_layout_iter_get_run_readonly$FUNC, false
    );
}


