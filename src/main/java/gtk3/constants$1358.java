// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1358 {

    static final FunctionDescriptor atk_text_get_selection$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_text_get_selection$MH = RuntimeHelper.downcallHandle(
        "atk_text_get_selection",
        constants$1358.atk_text_get_selection$FUNC, false
    );
    static final FunctionDescriptor atk_text_add_selection$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_text_add_selection$MH = RuntimeHelper.downcallHandle(
        "atk_text_add_selection",
        constants$1358.atk_text_add_selection$FUNC, false
    );
    static final FunctionDescriptor atk_text_remove_selection$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_text_remove_selection$MH = RuntimeHelper.downcallHandle(
        "atk_text_remove_selection",
        constants$1358.atk_text_remove_selection$FUNC, false
    );
    static final FunctionDescriptor atk_text_set_selection$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_text_set_selection$MH = RuntimeHelper.downcallHandle(
        "atk_text_set_selection",
        constants$1358.atk_text_set_selection$FUNC, false
    );
    static final FunctionDescriptor atk_text_set_caret_offset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_text_set_caret_offset$MH = RuntimeHelper.downcallHandle(
        "atk_text_set_caret_offset",
        constants$1358.atk_text_set_caret_offset$FUNC, false
    );
    static final FunctionDescriptor atk_text_get_range_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_text_get_range_extents$MH = RuntimeHelper.downcallHandle(
        "atk_text_get_range_extents",
        constants$1358.atk_text_get_range_extents$FUNC, false
    );
}


