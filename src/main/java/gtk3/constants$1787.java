// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1787 {

    static final FunctionDescriptor gtk_style_properties_map_color$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_properties_map_color$MH = RuntimeHelper.downcallHandle(
        "gtk_style_properties_map_color",
        constants$1787.gtk_style_properties_map_color$FUNC, false
    );
    static final FunctionDescriptor gtk_style_properties_lookup_color$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_properties_lookup_color$MH = RuntimeHelper.downcallHandle(
        "gtk_style_properties_lookup_color",
        constants$1787.gtk_style_properties_lookup_color$FUNC, false
    );
    static final FunctionDescriptor gtk_style_properties_set_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_properties_set_property$MH = RuntimeHelper.downcallHandle(
        "gtk_style_properties_set_property",
        constants$1787.gtk_style_properties_set_property$FUNC, false
    );
    static final FunctionDescriptor gtk_style_properties_set_valist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_properties_set_valist$MH = RuntimeHelper.downcallHandle(
        "gtk_style_properties_set_valist",
        constants$1787.gtk_style_properties_set_valist$FUNC, false
    );
    static final FunctionDescriptor gtk_style_properties_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_style_properties_set$MH = RuntimeHelper.downcallHandle(
        "gtk_style_properties_set",
        constants$1787.gtk_style_properties_set$FUNC, true
    );
    static final FunctionDescriptor gtk_style_properties_get_property$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_style_properties_get_property$MH = RuntimeHelper.downcallHandle(
        "gtk_style_properties_get_property",
        constants$1787.gtk_style_properties_get_property$FUNC, false
    );
}

