// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1722 {

    static final FunctionDescriptor gtk_fixed_put$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_fixed_put$MH = RuntimeHelper.downcallHandle(
        "gtk_fixed_put",
        constants$1722.gtk_fixed_put$FUNC, false
    );
    static final FunctionDescriptor gtk_fixed_move$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_fixed_move$MH = RuntimeHelper.downcallHandle(
        "gtk_fixed_move",
        constants$1722.gtk_fixed_move$FUNC, false
    );
    static final FunctionDescriptor GtkFileFilterFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkFileFilterFunc$MH = RuntimeHelper.downcallHandle(
        constants$1722.GtkFileFilterFunc$FUNC, false
    );
    static final FunctionDescriptor gtk_file_filter_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_file_filter_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_file_filter_get_type",
        constants$1722.gtk_file_filter_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_file_filter_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_file_filter_new$MH = RuntimeHelper.downcallHandle(
        "gtk_file_filter_new",
        constants$1722.gtk_file_filter_new$FUNC, false
    );
}


