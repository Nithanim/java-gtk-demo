// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1303 {

    static final FunctionDescriptor gdk_unicode_to_keyval$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_unicode_to_keyval$MH = RuntimeHelper.downcallHandle(
        "gdk_unicode_to_keyval",
        constants$1303.gdk_unicode_to_keyval$FUNC, false
    );
    static final FunctionDescriptor gdk_parse_args$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_parse_args$MH = RuntimeHelper.downcallHandle(
        "gdk_parse_args",
        constants$1303.gdk_parse_args$FUNC, false
    );
    static final FunctionDescriptor gdk_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_init$MH = RuntimeHelper.downcallHandle(
        "gdk_init",
        constants$1303.gdk_init$FUNC, false
    );
    static final FunctionDescriptor gdk_init_check$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_init_check$MH = RuntimeHelper.downcallHandle(
        "gdk_init_check",
        constants$1303.gdk_init_check$FUNC, false
    );
    static final FunctionDescriptor gdk_add_option_entries_libgtk_only$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_add_option_entries_libgtk_only$MH = RuntimeHelper.downcallHandle(
        "gdk_add_option_entries_libgtk_only",
        constants$1303.gdk_add_option_entries_libgtk_only$FUNC, false
    );
    static final FunctionDescriptor gdk_pre_parse_libgtk_only$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gdk_pre_parse_libgtk_only$MH = RuntimeHelper.downcallHandle(
        "gdk_pre_parse_libgtk_only",
        constants$1303.gdk_pre_parse_libgtk_only$FUNC, false
    );
}


