// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1728 {

    static final FunctionDescriptor gtk_file_chooser_select_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_select_all$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_select_all",
        constants$1728.gtk_file_chooser_select_all$FUNC, false
    );
    static final FunctionDescriptor gtk_file_chooser_unselect_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_unselect_all$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_unselect_all",
        constants$1728.gtk_file_chooser_unselect_all$FUNC, false
    );
    static final FunctionDescriptor gtk_file_chooser_get_filenames$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_get_filenames$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_filenames",
        constants$1728.gtk_file_chooser_get_filenames$FUNC, false
    );
    static final FunctionDescriptor gtk_file_chooser_set_current_folder$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_set_current_folder$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_set_current_folder",
        constants$1728.gtk_file_chooser_set_current_folder$FUNC, false
    );
    static final FunctionDescriptor gtk_file_chooser_get_current_folder$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_get_current_folder$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_current_folder",
        constants$1728.gtk_file_chooser_get_current_folder$FUNC, false
    );
    static final FunctionDescriptor gtk_file_chooser_get_uri$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_get_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_uri",
        constants$1728.gtk_file_chooser_get_uri$FUNC, false
    );
}


