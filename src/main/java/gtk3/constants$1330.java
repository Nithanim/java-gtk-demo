// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1330 {

    static final FunctionDescriptor glib_queueautoptr_cleanup_GdkRGBA$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_queueautoptr_cleanup_GdkRGBA$MH = RuntimeHelper.downcallHandle(
        "glib_queueautoptr_cleanup_GdkRGBA",
        constants$1330.glib_queueautoptr_cleanup_GdkRGBA$FUNC, false
    );
    static final FunctionDescriptor GtkAccelGroupActivate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle GtkAccelGroupActivate$MH = RuntimeHelper.downcallHandle(
        constants$1330.GtkAccelGroupActivate$FUNC, false
    );
    static final FunctionDescriptor GtkAccelGroupFindFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkAccelGroupFindFunc$MH = RuntimeHelper.downcallHandle(
        constants$1330.GtkAccelGroupFindFunc$FUNC, false
    );
    static final FunctionDescriptor gtk_accel_group_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_accel_group_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_accel_group_get_type",
        constants$1330.gtk_accel_group_get_type$FUNC, false
    );
}

