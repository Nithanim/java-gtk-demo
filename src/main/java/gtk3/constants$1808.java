// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1808 {

    static final FunctionDescriptor gtk_icon_info_get_embedded_rect$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_info_get_embedded_rect$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_info_get_embedded_rect",
        constants$1808.gtk_icon_info_get_embedded_rect$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_info_get_attach_points$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_info_get_attach_points$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_info_get_attach_points",
        constants$1808.gtk_icon_info_get_attach_points$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_info_get_display_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_info_get_display_name$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_info_get_display_name",
        constants$1808.gtk_icon_info_get_display_name$FUNC, false
    );
    static final FunctionDescriptor gtk_tooltip_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_tooltip_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_tooltip_get_type",
        constants$1808.gtk_tooltip_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_tooltip_set_markup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tooltip_set_markup$MH = RuntimeHelper.downcallHandle(
        "gtk_tooltip_set_markup",
        constants$1808.gtk_tooltip_set_markup$FUNC, false
    );
    static final FunctionDescriptor gtk_tooltip_set_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tooltip_set_text$MH = RuntimeHelper.downcallHandle(
        "gtk_tooltip_set_text",
        constants$1808.gtk_tooltip_set_text$FUNC, false
    );
}


