// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1833 {

    static final FunctionDescriptor GtkListBoxUpdateHeaderFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxUpdateHeaderFunc$MH = RuntimeHelper.downcallHandle(
        constants$1833.GtkListBoxUpdateHeaderFunc$FUNC, false
    );
    static final FunctionDescriptor GtkListBoxCreateWidgetFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxCreateWidgetFunc$MH = RuntimeHelper.downcallHandle(
        constants$1833.GtkListBoxCreateWidgetFunc$FUNC, false
    );
    static final FunctionDescriptor gtk_list_box_row_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_list_box_row_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_row_get_type",
        constants$1833.gtk_list_box_row_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_list_box_row_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_list_box_row_new$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_row_new",
        constants$1833.gtk_list_box_row_new$FUNC, false
    );
    static final FunctionDescriptor gtk_list_box_row_get_header$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_row_get_header$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_row_get_header",
        constants$1833.gtk_list_box_row_get_header$FUNC, false
    );
}

