// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1845 {

    static final FunctionDescriptor gtk_disable_setlocale$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gtk_disable_setlocale$MH = RuntimeHelper.downcallHandle(
        "gtk_disable_setlocale",
        constants$1845.gtk_disable_setlocale$FUNC, false
    );
    static final FunctionDescriptor gtk_get_default_language$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_get_default_language$MH = RuntimeHelper.downcallHandle(
        "gtk_get_default_language",
        constants$1845.gtk_get_default_language$FUNC, false
    );
    static final FunctionDescriptor gtk_get_locale_direction$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gtk_get_locale_direction$MH = RuntimeHelper.downcallHandle(
        "gtk_get_locale_direction",
        constants$1845.gtk_get_locale_direction$FUNC, false
    );
    static final FunctionDescriptor gtk_events_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gtk_events_pending$MH = RuntimeHelper.downcallHandle(
        "gtk_events_pending",
        constants$1845.gtk_events_pending$FUNC, false
    );
    static final FunctionDescriptor gtk_main_do_event$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_main_do_event$MH = RuntimeHelper.downcallHandle(
        "gtk_main_do_event",
        constants$1845.gtk_main_do_event$FUNC, false
    );
    static final FunctionDescriptor gtk_main$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gtk_main$MH = RuntimeHelper.downcallHandle(
        "gtk_main",
        constants$1845.gtk_main$FUNC, false
    );
}


