// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1879 {

    static final FunctionDescriptor gtk_orientable_get_orientation$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_orientable_get_orientation$MH = RuntimeHelper.downcallHandle(
        "gtk_orientable_get_orientation",
        constants$1879.gtk_orientable_get_orientation$FUNC, false
    );
    static final FunctionDescriptor gtk_overlay_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_overlay_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_get_type",
        constants$1879.gtk_overlay_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_overlay_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_overlay_new$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_new",
        constants$1879.gtk_overlay_new$FUNC, false
    );
    static final FunctionDescriptor gtk_overlay_add_overlay$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_overlay_add_overlay$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_add_overlay",
        constants$1879.gtk_overlay_add_overlay$FUNC, false
    );
    static final FunctionDescriptor gtk_overlay_reorder_overlay$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_overlay_reorder_overlay$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_reorder_overlay",
        constants$1879.gtk_overlay_reorder_overlay$FUNC, false
    );
    static final FunctionDescriptor gtk_overlay_get_overlay_pass_through$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_overlay_get_overlay_pass_through$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_get_overlay_pass_through",
        constants$1879.gtk_overlay_get_overlay_pass_through$FUNC, false
    );
}


