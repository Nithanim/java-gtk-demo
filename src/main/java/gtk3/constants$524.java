// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$524 {

    static final FunctionDescriptor g_app_info_launch_default_for_uri_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_launch_default_for_uri_finish$MH = RuntimeHelper.downcallHandle(
        "g_app_info_launch_default_for_uri_finish",
        constants$524.g_app_info_launch_default_for_uri_finish$FUNC, false
    );
    static final FunctionDescriptor g_app_launch_context_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_app_launch_context_get_type$MH = RuntimeHelper.downcallHandle(
        "g_app_launch_context_get_type",
        constants$524.g_app_launch_context_get_type$FUNC, false
    );
    static final FunctionDescriptor g_app_launch_context_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_app_launch_context_new$MH = RuntimeHelper.downcallHandle(
        "g_app_launch_context_new",
        constants$524.g_app_launch_context_new$FUNC, false
    );
    static final FunctionDescriptor g_app_launch_context_setenv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_launch_context_setenv$MH = RuntimeHelper.downcallHandle(
        "g_app_launch_context_setenv",
        constants$524.g_app_launch_context_setenv$FUNC, false
    );
    static final FunctionDescriptor g_app_launch_context_unsetenv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_launch_context_unsetenv$MH = RuntimeHelper.downcallHandle(
        "g_app_launch_context_unsetenv",
        constants$524.g_app_launch_context_unsetenv$FUNC, false
    );
    static final FunctionDescriptor g_app_launch_context_get_environment$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_launch_context_get_environment$MH = RuntimeHelper.downcallHandle(
        "g_app_launch_context_get_environment",
        constants$524.g_app_launch_context_get_environment$FUNC, false
    );
}

