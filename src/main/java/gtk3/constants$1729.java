// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1729 {

    static final FunctionDescriptor gtk_file_chooser_set_uri$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_set_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_set_uri",
        constants$1729.gtk_file_chooser_set_uri$FUNC, false
    );
    static final FunctionDescriptor gtk_file_chooser_select_uri$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_select_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_select_uri",
        constants$1729.gtk_file_chooser_select_uri$FUNC, false
    );
    static final FunctionDescriptor gtk_file_chooser_unselect_uri$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_unselect_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_unselect_uri",
        constants$1729.gtk_file_chooser_unselect_uri$FUNC, false
    );
    static final FunctionDescriptor gtk_file_chooser_get_uris$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_get_uris$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_uris",
        constants$1729.gtk_file_chooser_get_uris$FUNC, false
    );
    static final FunctionDescriptor gtk_file_chooser_set_current_folder_uri$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_set_current_folder_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_set_current_folder_uri",
        constants$1729.gtk_file_chooser_set_current_folder_uri$FUNC, false
    );
    static final FunctionDescriptor gtk_file_chooser_get_current_folder_uri$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_file_chooser_get_current_folder_uri$MH = RuntimeHelper.downcallHandle(
        "gtk_file_chooser_get_current_folder_uri",
        constants$1729.gtk_file_chooser_get_current_folder_uri$FUNC, false
    );
}


