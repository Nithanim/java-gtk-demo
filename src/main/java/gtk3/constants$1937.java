// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1937 {

    static final FunctionDescriptor gtk_recent_info_get_uri_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_get_uri_display$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_get_uri_display",
        constants$1937.gtk_recent_info_get_uri_display$FUNC, false
    );
    static final FunctionDescriptor gtk_recent_info_get_age$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_get_age$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_get_age",
        constants$1937.gtk_recent_info_get_age$FUNC, false
    );
    static final FunctionDescriptor gtk_recent_info_is_local$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_is_local$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_is_local",
        constants$1937.gtk_recent_info_is_local$FUNC, false
    );
    static final FunctionDescriptor gtk_recent_info_exists$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_exists$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_exists",
        constants$1937.gtk_recent_info_exists$FUNC, false
    );
    static final FunctionDescriptor gtk_recent_info_match$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_match$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_match",
        constants$1937.gtk_recent_info_match$FUNC, false
    );
    static final FunctionDescriptor _gtk_recent_manager_sync$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_recent_manager_sync$MH = RuntimeHelper.downcallHandle(
        "_gtk_recent_manager_sync",
        constants$1937._gtk_recent_manager_sync$FUNC, false
    );
}


