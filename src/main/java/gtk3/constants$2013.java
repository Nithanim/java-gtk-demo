// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$2013 {

    static final FunctionDescriptor gtk_toolbar_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_toolbar_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_toolbar_get_type",
        constants$2013.gtk_toolbar_get_type$FUNC, false
    );
    static final FunctionDescriptor gtk_toolbar_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_toolbar_new$MH = RuntimeHelper.downcallHandle(
        "gtk_toolbar_new",
        constants$2013.gtk_toolbar_new$FUNC, false
    );
    static final FunctionDescriptor gtk_toolbar_insert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_toolbar_insert$MH = RuntimeHelper.downcallHandle(
        "gtk_toolbar_insert",
        constants$2013.gtk_toolbar_insert$FUNC, false
    );
    static final FunctionDescriptor gtk_toolbar_get_item_index$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_toolbar_get_item_index$MH = RuntimeHelper.downcallHandle(
        "gtk_toolbar_get_item_index",
        constants$2013.gtk_toolbar_get_item_index$FUNC, false
    );
    static final FunctionDescriptor gtk_toolbar_get_n_items$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_toolbar_get_n_items$MH = RuntimeHelper.downcallHandle(
        "gtk_toolbar_get_n_items",
        constants$2013.gtk_toolbar_get_n_items$FUNC, false
    );
    static final FunctionDescriptor gtk_toolbar_get_nth_item$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_toolbar_get_nth_item$MH = RuntimeHelper.downcallHandle(
        "gtk_toolbar_get_nth_item",
        constants$2013.gtk_toolbar_get_nth_item$FUNC, false
    );
}


