// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1968 {

    static final FunctionDescriptor gtk_settings_get_for_screen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_settings_get_for_screen$MH = RuntimeHelper.downcallHandle(
        "gtk_settings_get_for_screen",
        constants$1968.gtk_settings_get_for_screen$FUNC, false
    );
    static final FunctionDescriptor gtk_settings_install_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_settings_install_property$MH = RuntimeHelper.downcallHandle(
        "gtk_settings_install_property",
        constants$1968.gtk_settings_install_property$FUNC, false
    );
    static final FunctionDescriptor gtk_settings_install_property_parser$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_settings_install_property_parser$MH = RuntimeHelper.downcallHandle(
        "gtk_settings_install_property_parser",
        constants$1968.gtk_settings_install_property_parser$FUNC, false
    );
    static final FunctionDescriptor gtk_rc_property_parse_color$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_rc_property_parse_color$MH = RuntimeHelper.downcallHandle(
        "gtk_rc_property_parse_color",
        constants$1968.gtk_rc_property_parse_color$FUNC, false
    );
    static final FunctionDescriptor gtk_rc_property_parse_enum$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_rc_property_parse_enum$MH = RuntimeHelper.downcallHandle(
        "gtk_rc_property_parse_enum",
        constants$1968.gtk_rc_property_parse_enum$FUNC, false
    );
    static final FunctionDescriptor gtk_rc_property_parse_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_rc_property_parse_flags$MH = RuntimeHelper.downcallHandle(
        "gtk_rc_property_parse_flags",
        constants$1968.gtk_rc_property_parse_flags$FUNC, false
    );
}


