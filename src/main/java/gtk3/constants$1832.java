// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1832 {

    static final FunctionDescriptor gtk_link_button_set_visited$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_link_button_set_visited$MH = RuntimeHelper.downcallHandle(
        "gtk_link_button_set_visited",
        constants$1832.gtk_link_button_set_visited$FUNC, false
    );
    static final FunctionDescriptor GtkListBoxFilterFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxFilterFunc$MH = RuntimeHelper.downcallHandle(
        constants$1832.GtkListBoxFilterFunc$FUNC, false
    );
    static final FunctionDescriptor GtkListBoxSortFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxSortFunc$MH = RuntimeHelper.downcallHandle(
        constants$1832.GtkListBoxSortFunc$FUNC, false
    );
    static final FunctionDescriptor GtkListBoxUpdateHeaderFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}

