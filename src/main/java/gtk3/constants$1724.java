// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1724 {

    static final FunctionDescriptor gtk_file_filter_get_needed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_filter_get_needed$MH = RuntimeHelper.downcallHandle(
        "gtk_file_filter_get_needed",
        constants$1724.gtk_file_filter_get_needed$FUNC, false
    );
    static final FunctionDescriptor gtk_file_filter_filter$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_filter_filter$MH = RuntimeHelper.downcallHandle(
        "gtk_file_filter_filter",
        constants$1724.gtk_file_filter_filter$FUNC, false
    );
    static final FunctionDescriptor gtk_file_filter_to_gvariant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_filter_to_gvariant$MH = RuntimeHelper.downcallHandle(
        "gtk_file_filter_to_gvariant",
        constants$1724.gtk_file_filter_to_gvariant$FUNC, false
    );
    static final FunctionDescriptor gtk_file_filter_new_from_gvariant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_filter_new_from_gvariant$MH = RuntimeHelper.downcallHandle(
        "gtk_file_filter_new_from_gvariant",
        constants$1724.gtk_file_filter_new_from_gvariant$FUNC, false
    );
    static final FunctionDescriptor gtk_file_chooser_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_file_chooser_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_type",
        constants$1724.gtk_file_chooser_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_file_chooser_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gtk_file_chooser_error_quark$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_error_quark",
        constants$1724.gtk_file_chooser_error_quark$FUNC, false
    );
}

