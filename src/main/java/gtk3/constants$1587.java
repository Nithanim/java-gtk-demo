// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1587 {

    static final FunctionDescriptor gtk_entry_buffer_set_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_buffer_set_text$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_buffer_set_text",
        constants$1587.gtk_entry_buffer_set_text$FUNC, false
    );
    static final FunctionDescriptor gtk_entry_buffer_set_max_length$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_buffer_set_max_length$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_buffer_set_max_length",
        constants$1587.gtk_entry_buffer_set_max_length$FUNC, false
    );
    static final FunctionDescriptor gtk_entry_buffer_get_max_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_buffer_get_max_length$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_buffer_get_max_length",
        constants$1587.gtk_entry_buffer_get_max_length$FUNC, false
    );
    static final FunctionDescriptor gtk_entry_buffer_insert_text$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_buffer_insert_text$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_buffer_insert_text",
        constants$1587.gtk_entry_buffer_insert_text$FUNC, false
    );
    static final FunctionDescriptor gtk_entry_buffer_delete_text$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_buffer_delete_text$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_buffer_delete_text",
        constants$1587.gtk_entry_buffer_delete_text$FUNC, false
    );
    static final FunctionDescriptor gtk_entry_buffer_emit_inserted_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_buffer_emit_inserted_text$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_buffer_emit_inserted_text",
        constants$1587.gtk_entry_buffer_emit_inserted_text$FUNC, false
    );
}


