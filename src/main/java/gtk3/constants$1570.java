// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1570 {

    static final FunctionDescriptor gtk_text_iter_compare$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_iter_compare$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_compare",
        constants$1570.gtk_text_iter_compare$FUNC, false
    );
    static final FunctionDescriptor gtk_text_iter_in_range$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_iter_in_range$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_in_range",
        constants$1570.gtk_text_iter_in_range$FUNC, false
    );
    static final FunctionDescriptor gtk_text_iter_order$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_iter_order$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_order",
        constants$1570.gtk_text_iter_order$FUNC, false
    );
    static final FunctionDescriptor gtk_target_list_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_target_list_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_target_list_get_type",
        constants$1570.gtk_target_list_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_target_list_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_target_list_new$MH = RuntimeHelper.downcallHandle(
        "gtk_target_list_new",
        constants$1570.gtk_target_list_new$FUNC, false
    );
    static final FunctionDescriptor gtk_target_list_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_target_list_ref$MH = RuntimeHelper.downcallHandle(
        "gtk_target_list_ref",
        constants$1570.gtk_target_list_ref$FUNC, false
    );
}


