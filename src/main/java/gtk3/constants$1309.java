// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1309 {

    static final FunctionDescriptor gdk_atom_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_atom_name$MH = RuntimeHelper.downcallHandle(
        "gdk_atom_name",
        constants$1309.gdk_atom_name$FUNC, false
    );
    static final FunctionDescriptor gdk_property_get$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_property_get$MH = RuntimeHelper.downcallHandle(
        "gdk_property_get",
        constants$1309.gdk_property_get$FUNC, false
    );
    static final FunctionDescriptor gdk_property_change$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_property_change$MH = RuntimeHelper.downcallHandle(
        "gdk_property_change",
        constants$1309.gdk_property_change$FUNC, false
    );
    static final FunctionDescriptor gdk_property_delete$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_property_delete$MH = RuntimeHelper.downcallHandle(
        "gdk_property_delete",
        constants$1309.gdk_property_delete$FUNC, false
    );
    static final FunctionDescriptor gdk_text_property_to_utf8_list_for_display$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_text_property_to_utf8_list_for_display$MH = RuntimeHelper.downcallHandle(
        "gdk_text_property_to_utf8_list_for_display",
        constants$1309.gdk_text_property_to_utf8_list_for_display$FUNC, false
    );
    static final FunctionDescriptor gdk_utf8_to_string_target$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_utf8_to_string_target$MH = RuntimeHelper.downcallHandle(
        "gdk_utf8_to_string_target",
        constants$1309.gdk_utf8_to_string_target$FUNC, false
    );
}


