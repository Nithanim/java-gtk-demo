// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$2026 {

    static final FunctionDescriptor gtk_test_widget_wait_for_draw$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_test_widget_wait_for_draw$MH = RuntimeHelper.downcallHandle(
        "gtk_test_widget_wait_for_draw",
        constants$2026.gtk_test_widget_wait_for_draw$FUNC, false
    );
    static final FunctionDescriptor gtk_test_widget_click$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_test_widget_click$MH = RuntimeHelper.downcallHandle(
        "gtk_test_widget_click",
        constants$2026.gtk_test_widget_click$FUNC, false
    );
    static final FunctionDescriptor gtk_test_widget_send_key$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_test_widget_send_key$MH = RuntimeHelper.downcallHandle(
        "gtk_test_widget_send_key",
        constants$2026.gtk_test_widget_send_key$FUNC, false
    );
    static final FunctionDescriptor gtk_test_text_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_test_text_set$MH = RuntimeHelper.downcallHandle(
        "gtk_test_text_set",
        constants$2026.gtk_test_text_set$FUNC, false
    );
    static final FunctionDescriptor gtk_test_text_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_test_text_get$MH = RuntimeHelper.downcallHandle(
        "gtk_test_text_get",
        constants$2026.gtk_test_text_get$FUNC, false
    );
    static final FunctionDescriptor gtk_test_find_sibling$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gtk_test_find_sibling$MH = RuntimeHelper.downcallHandle(
        "gtk_test_find_sibling",
        constants$2026.gtk_test_find_sibling$FUNC, false
    );
}


