// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1661 {

    static final FunctionDescriptor gtk_builder_new_from_file$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_new_from_file$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_new_from_file",
        constants$1661.gtk_builder_new_from_file$FUNC, false
    );
    static final FunctionDescriptor gtk_builder_new_from_resource$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_new_from_resource$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_new_from_resource",
        constants$1661.gtk_builder_new_from_resource$FUNC, false
    );
    static final FunctionDescriptor gtk_builder_new_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gtk_builder_new_from_string$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_new_from_string",
        constants$1661.gtk_builder_new_from_string$FUNC, false
    );
    static final FunctionDescriptor gtk_builder_add_callback_symbol$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_add_callback_symbol$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_add_callback_symbol",
        constants$1661.gtk_builder_add_callback_symbol$FUNC, false
    );
    static final FunctionDescriptor gtk_builder_add_callback_symbols$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_add_callback_symbols$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_add_callback_symbols",
        constants$1661.gtk_builder_add_callback_symbols$FUNC, true
    );
    static final FunctionDescriptor gtk_builder_lookup_callback_symbol$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_builder_lookup_callback_symbol$MH = RuntimeHelper.downcallHandle(
        "gtk_builder_lookup_callback_symbol",
        constants$1661.gtk_builder_lookup_callback_symbol$FUNC, false
    );
}


