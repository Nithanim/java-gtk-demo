// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1780 {

    static final FunctionDescriptor gtk_icon_size_lookup_for_settings$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_size_lookup_for_settings$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_size_lookup_for_settings",
        constants$1780.gtk_icon_size_lookup_for_settings$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_size_register$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_icon_size_register$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_size_register",
        constants$1780.gtk_icon_size_register$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_size_register_alias$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_icon_size_register_alias$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_size_register_alias",
        constants$1780.gtk_icon_size_register_alias$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_size_from_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_size_from_name$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_size_from_name",
        constants$1780.gtk_icon_size_from_name$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_size_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_icon_size_get_name$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_size_get_name",
        constants$1780.gtk_icon_size_get_name$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_set_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_icon_set_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_set_get_type",
        constants$1780.gtk_icon_set_get_type$FUNC, false
    );
}

