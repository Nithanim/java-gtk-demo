// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1699 {

    static final FunctionDescriptor gtk_clipboard_wait_for_targets$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_clipboard_wait_for_targets$MH = RuntimeHelper.downcallHandle(
        "gtk_clipboard_wait_for_targets",
        constants$1699.gtk_clipboard_wait_for_targets$FUNC, false
    );
    static final FunctionDescriptor gtk_clipboard_wait_is_text_available$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_clipboard_wait_is_text_available$MH = RuntimeHelper.downcallHandle(
        "gtk_clipboard_wait_is_text_available",
        constants$1699.gtk_clipboard_wait_is_text_available$FUNC, false
    );
    static final FunctionDescriptor gtk_clipboard_wait_is_rich_text_available$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_clipboard_wait_is_rich_text_available$MH = RuntimeHelper.downcallHandle(
        "gtk_clipboard_wait_is_rich_text_available",
        constants$1699.gtk_clipboard_wait_is_rich_text_available$FUNC, false
    );
    static final FunctionDescriptor gtk_clipboard_wait_is_image_available$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_clipboard_wait_is_image_available$MH = RuntimeHelper.downcallHandle(
        "gtk_clipboard_wait_is_image_available",
        constants$1699.gtk_clipboard_wait_is_image_available$FUNC, false
    );
    static final FunctionDescriptor gtk_clipboard_wait_is_uris_available$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_clipboard_wait_is_uris_available$MH = RuntimeHelper.downcallHandle(
        "gtk_clipboard_wait_is_uris_available",
        constants$1699.gtk_clipboard_wait_is_uris_available$FUNC, false
    );
    static final FunctionDescriptor gtk_clipboard_wait_is_target_available$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_clipboard_wait_is_target_available$MH = RuntimeHelper.downcallHandle(
        "gtk_clipboard_wait_is_target_available",
        constants$1699.gtk_clipboard_wait_is_target_available$FUNC, false
    );
}

