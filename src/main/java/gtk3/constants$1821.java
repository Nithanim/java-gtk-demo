// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1821 {

    static final FunctionDescriptor gtk_icon_view_set_tooltip_column$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_icon_view_set_tooltip_column$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_set_tooltip_column",
        constants$1821.gtk_icon_view_set_tooltip_column$FUNC, false
    );
    static final FunctionDescriptor gtk_icon_view_get_tooltip_column$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_view_get_tooltip_column$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_view_get_tooltip_column",
        constants$1821.gtk_icon_view_get_tooltip_column$FUNC, false
    );
    static final FunctionDescriptor gtk_im_context_simple_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_im_context_simple_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_im_context_simple_get_type",
        constants$1821.gtk_im_context_simple_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_im_context_simple_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_im_context_simple_new$MH = RuntimeHelper.downcallHandle(
        "gtk_im_context_simple_new",
        constants$1821.gtk_im_context_simple_new$FUNC, false
    );
    static final FunctionDescriptor gtk_im_context_simple_add_table$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_im_context_simple_add_table$MH = RuntimeHelper.downcallHandle(
        "gtk_im_context_simple_add_table",
        constants$1821.gtk_im_context_simple_add_table$FUNC, false
    );
    static final FunctionDescriptor gtk_im_context_simple_add_compose_file$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_im_context_simple_add_compose_file$MH = RuntimeHelper.downcallHandle(
        "gtk_im_context_simple_add_compose_file",
        constants$1821.gtk_im_context_simple_add_compose_file$FUNC, false
    );
}


