// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$2109 {

    static final FunctionDescriptor gtk_rc_get_default_files$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_rc_get_default_files$MH = RuntimeHelper.downcallHandle(
        "gtk_rc_get_default_files",
        constants$2109.gtk_rc_get_default_files$FUNC, false
    );
    static final FunctionDescriptor gtk_rc_get_style$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_rc_get_style$MH = RuntimeHelper.downcallHandle(
        "gtk_rc_get_style",
        constants$2109.gtk_rc_get_style$FUNC, false
    );
    static final FunctionDescriptor gtk_rc_get_style_by_paths$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gtk_rc_get_style_by_paths$MH = RuntimeHelper.downcallHandle(
        "gtk_rc_get_style_by_paths",
        constants$2109.gtk_rc_get_style_by_paths$FUNC, false
    );
    static final FunctionDescriptor gtk_rc_reparse_all_for_settings$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_rc_reparse_all_for_settings$MH = RuntimeHelper.downcallHandle(
        "gtk_rc_reparse_all_for_settings",
        constants$2109.gtk_rc_reparse_all_for_settings$FUNC, false
    );
    static final FunctionDescriptor gtk_rc_reset_styles$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_rc_reset_styles$MH = RuntimeHelper.downcallHandle(
        "gtk_rc_reset_styles",
        constants$2109.gtk_rc_reset_styles$FUNC, false
    );
    static final FunctionDescriptor gtk_rc_find_pixmap_in_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_rc_find_pixmap_in_path$MH = RuntimeHelper.downcallHandle(
        "gtk_rc_find_pixmap_in_path",
        constants$2109.gtk_rc_find_pixmap_in_path$FUNC, false
    );
}

