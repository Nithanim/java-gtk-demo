// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1500 {

    static final FunctionDescriptor GtkAccelMapForeach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle GtkAccelMapForeach$MH = RuntimeHelper.downcallHandle(
        constants$1500.GtkAccelMapForeach$FUNC, false
    );
    static final FunctionDescriptor gtk_accel_map_add_entry$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_accel_map_add_entry$MH = RuntimeHelper.downcallHandle(
        "gtk_accel_map_add_entry",
        constants$1500.gtk_accel_map_add_entry$FUNC, false
    );
    static final FunctionDescriptor gtk_accel_map_lookup_entry$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_accel_map_lookup_entry$MH = RuntimeHelper.downcallHandle(
        "gtk_accel_map_lookup_entry",
        constants$1500.gtk_accel_map_lookup_entry$FUNC, false
    );
    static final FunctionDescriptor gtk_accel_map_change_entry$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_accel_map_change_entry$MH = RuntimeHelper.downcallHandle(
        "gtk_accel_map_change_entry",
        constants$1500.gtk_accel_map_change_entry$FUNC, false
    );
    static final FunctionDescriptor gtk_accel_map_load$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_accel_map_load$MH = RuntimeHelper.downcallHandle(
        "gtk_accel_map_load",
        constants$1500.gtk_accel_map_load$FUNC, false
    );
}


