// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$2085 {

    static final FunctionDescriptor GtkColorSelectionChangePaletteWithScreenFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle GtkColorSelectionChangePaletteWithScreenFunc$MH = RuntimeHelper.downcallHandle(
        constants$2085.GtkColorSelectionChangePaletteWithScreenFunc$FUNC, false
    );
    static final FunctionDescriptor gtk_color_selection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_color_selection_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_color_selection_get_type",
        constants$2085.gtk_color_selection_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_color_selection_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_color_selection_new$MH = RuntimeHelper.downcallHandle(
        "gtk_color_selection_new",
        constants$2085.gtk_color_selection_new$FUNC, false
    );
    static final FunctionDescriptor gtk_color_selection_get_has_opacity_control$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_color_selection_get_has_opacity_control$MH = RuntimeHelper.downcallHandle(
        "gtk_color_selection_get_has_opacity_control",
        constants$2085.gtk_color_selection_get_has_opacity_control$FUNC, false
    );
    static final FunctionDescriptor gtk_color_selection_set_has_opacity_control$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_color_selection_set_has_opacity_control$MH = RuntimeHelper.downcallHandle(
        "gtk_color_selection_set_has_opacity_control",
        constants$2085.gtk_color_selection_set_has_opacity_control$FUNC, false
    );
}


