// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1831 {

    static final FunctionDescriptor gtk_link_button_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_link_button_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_link_button_get_type",
        constants$1831.gtk_link_button_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_link_button_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_link_button_new$MH = RuntimeHelper.downcallHandle(
        "gtk_link_button_new",
        constants$1831.gtk_link_button_new$FUNC, false
    );
    static final FunctionDescriptor gtk_link_button_new_with_label$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_link_button_new_with_label$MH = RuntimeHelper.downcallHandle(
        "gtk_link_button_new_with_label",
        constants$1831.gtk_link_button_new_with_label$FUNC, false
    );
    static final FunctionDescriptor gtk_link_button_get_uri$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_link_button_get_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_link_button_get_uri",
        constants$1831.gtk_link_button_get_uri$FUNC, false
    );
    static final FunctionDescriptor gtk_link_button_set_uri$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_link_button_set_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_link_button_set_uri",
        constants$1831.gtk_link_button_set_uri$FUNC, false
    );
    static final FunctionDescriptor gtk_link_button_get_visited$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_link_button_get_visited$MH = RuntimeHelper.downcallHandle(
        "gtk_link_button_get_visited",
        constants$1831.gtk_link_button_get_visited$FUNC, false
    );
}


