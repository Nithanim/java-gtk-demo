// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1554 {

    static final FunctionDescriptor gtk_text_tag_get_priority$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_tag_get_priority$MH = RuntimeHelper.downcallHandle(
        "gtk_text_tag_get_priority",
        constants$1554.gtk_text_tag_get_priority$FUNC, false
    );
    static final FunctionDescriptor gtk_text_tag_set_priority$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_tag_set_priority$MH = RuntimeHelper.downcallHandle(
        "gtk_text_tag_set_priority",
        constants$1554.gtk_text_tag_set_priority$FUNC, false
    );
    static final FunctionDescriptor gtk_text_tag_event$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_tag_event$MH = RuntimeHelper.downcallHandle(
        "gtk_text_tag_event",
        constants$1554.gtk_text_tag_event$FUNC, false
    );
    static final FunctionDescriptor gtk_text_tag_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_tag_changed$MH = RuntimeHelper.downcallHandle(
        "gtk_text_tag_changed",
        constants$1554.gtk_text_tag_changed$FUNC, false
    );
    static final FunctionDescriptor gtk_text_iter_get_buffer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_iter_get_buffer$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_get_buffer",
        constants$1554.gtk_text_iter_get_buffer$FUNC, false
    );
    static final FunctionDescriptor gtk_text_iter_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_iter_copy$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_copy",
        constants$1554.gtk_text_iter_copy$FUNC, false
    );
}


