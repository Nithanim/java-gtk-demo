// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1844 {

    static final FunctionDescriptor gtk_check_version$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_check_version$MH = RuntimeHelper.downcallHandle(
        "gtk_check_version",
        constants$1844.gtk_check_version$FUNC, false
    );
    static final FunctionDescriptor gtk_parse_args$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_parse_args$MH = RuntimeHelper.downcallHandle(
        "gtk_parse_args",
        constants$1844.gtk_parse_args$FUNC, false
    );
    static final FunctionDescriptor gtk_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_init$MH = RuntimeHelper.downcallHandle(
        "gtk_init",
        constants$1844.gtk_init$FUNC, false
    );
    static final FunctionDescriptor gtk_init_check$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_init_check$MH = RuntimeHelper.downcallHandle(
        "gtk_init_check",
        constants$1844.gtk_init_check$FUNC, false
    );
    static final FunctionDescriptor gtk_init_with_args$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_init_with_args$MH = RuntimeHelper.downcallHandle(
        "gtk_init_with_args",
        constants$1844.gtk_init_with_args$FUNC, false
    );
    static final FunctionDescriptor gtk_get_option_group$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_get_option_group$MH = RuntimeHelper.downcallHandle(
        "gtk_get_option_group",
        constants$1844.gtk_get_option_group$FUNC, false
    );
}


