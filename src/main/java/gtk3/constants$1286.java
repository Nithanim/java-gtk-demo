// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1286 {

    static final FunctionDescriptor gdk_cursor_get_surface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cursor_get_surface$MH = RuntimeHelper.downcallHandle(
        "gdk_cursor_get_surface",
        constants$1286.gdk_cursor_get_surface$FUNC, false
    );
    static final FunctionDescriptor gdk_cursor_get_cursor_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cursor_get_cursor_type$MH = RuntimeHelper.downcallHandle(
        "gdk_cursor_get_cursor_type",
        constants$1286.gdk_cursor_get_cursor_type$FUNC, false
    );
    static final FunctionDescriptor gdk_device_pad_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_device_pad_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_device_pad_get_type",
        constants$1286.gdk_device_pad_get_type$FUNC, false
    );
    static final FunctionDescriptor gdk_device_pad_get_n_groups$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_pad_get_n_groups$MH = RuntimeHelper.downcallHandle(
        "gdk_device_pad_get_n_groups",
        constants$1286.gdk_device_pad_get_n_groups$FUNC, false
    );
    static final FunctionDescriptor gdk_device_pad_get_group_n_modes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_device_pad_get_group_n_modes$MH = RuntimeHelper.downcallHandle(
        "gdk_device_pad_get_group_n_modes",
        constants$1286.gdk_device_pad_get_group_n_modes$FUNC, false
    );
    static final FunctionDescriptor gdk_device_pad_get_n_features$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_device_pad_get_n_features$MH = RuntimeHelper.downcallHandle(
        "gdk_device_pad_get_n_features",
        constants$1286.gdk_device_pad_get_n_features$FUNC, false
    );
}


