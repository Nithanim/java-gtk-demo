// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1703 {

    static final FunctionDescriptor gtk_color_chooser_get_rgba$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_color_chooser_get_rgba$MH = RuntimeHelper.downcallHandle(
        "gtk_color_chooser_get_rgba",
        constants$1703.gtk_color_chooser_get_rgba$FUNC, false
    );
    static final FunctionDescriptor gtk_color_chooser_set_rgba$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_color_chooser_set_rgba$MH = RuntimeHelper.downcallHandle(
        "gtk_color_chooser_set_rgba",
        constants$1703.gtk_color_chooser_set_rgba$FUNC, false
    );
    static final FunctionDescriptor gtk_color_chooser_get_use_alpha$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_color_chooser_get_use_alpha$MH = RuntimeHelper.downcallHandle(
        "gtk_color_chooser_get_use_alpha",
        constants$1703.gtk_color_chooser_get_use_alpha$FUNC, false
    );
    static final FunctionDescriptor gtk_color_chooser_set_use_alpha$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_color_chooser_set_use_alpha$MH = RuntimeHelper.downcallHandle(
        "gtk_color_chooser_set_use_alpha",
        constants$1703.gtk_color_chooser_set_use_alpha$FUNC, false
    );
    static final FunctionDescriptor gtk_color_chooser_add_palette$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_color_chooser_add_palette$MH = RuntimeHelper.downcallHandle(
        "gtk_color_chooser_add_palette",
        constants$1703.gtk_color_chooser_add_palette$FUNC, false
    );
    static final FunctionDescriptor gtk_color_chooser_dialog_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_color_chooser_dialog_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_color_chooser_dialog_get_type",
        constants$1703.gtk_color_chooser_dialog_get_type$FUNC, false
    );
}


