// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1189 {

    static final FunctionDescriptor GdkFilterFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GdkFilterFunc$MH = RuntimeHelper.downcallHandle(
        constants$1189.GdkFilterFunc$FUNC, false
    );
    static final FunctionDescriptor gdk_event_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_event_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_event_get_type",
        constants$1189.gdk_event_get_type$FUNC, false
    );
    static final FunctionDescriptor gdk_event_sequence_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_event_sequence_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_event_sequence_get_type",
        constants$1189.gdk_event_sequence_get_type$FUNC, false
    );
    static final FunctionDescriptor gdk_events_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gdk_events_pending$MH = RuntimeHelper.downcallHandle(
        "gdk_events_pending",
        constants$1189.gdk_events_pending$FUNC, false
    );
    static final FunctionDescriptor gdk_event_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_event_get$MH = RuntimeHelper.downcallHandle(
        "gdk_event_get",
        constants$1189.gdk_event_get$FUNC, false
    );
}

