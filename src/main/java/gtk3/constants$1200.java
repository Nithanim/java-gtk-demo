// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1200 {

    static final FunctionDescriptor gdk_frame_clock_request_phase$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_frame_clock_request_phase$MH = RuntimeHelper.downcallHandle(
        "gdk_frame_clock_request_phase",
        constants$1200.gdk_frame_clock_request_phase$FUNC, false
    );
    static final FunctionDescriptor gdk_frame_clock_begin_updating$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_frame_clock_begin_updating$MH = RuntimeHelper.downcallHandle(
        "gdk_frame_clock_begin_updating",
        constants$1200.gdk_frame_clock_begin_updating$FUNC, false
    );
    static final FunctionDescriptor gdk_frame_clock_end_updating$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_frame_clock_end_updating$MH = RuntimeHelper.downcallHandle(
        "gdk_frame_clock_end_updating",
        constants$1200.gdk_frame_clock_end_updating$FUNC, false
    );
    static final FunctionDescriptor gdk_frame_clock_get_frame_counter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_frame_clock_get_frame_counter$MH = RuntimeHelper.downcallHandle(
        "gdk_frame_clock_get_frame_counter",
        constants$1200.gdk_frame_clock_get_frame_counter$FUNC, false
    );
    static final FunctionDescriptor gdk_frame_clock_get_history_start$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_frame_clock_get_history_start$MH = RuntimeHelper.downcallHandle(
        "gdk_frame_clock_get_history_start",
        constants$1200.gdk_frame_clock_get_history_start$FUNC, false
    );
    static final FunctionDescriptor gdk_frame_clock_get_timings$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gdk_frame_clock_get_timings$MH = RuntimeHelper.downcallHandle(
        "gdk_frame_clock_get_timings",
        constants$1200.gdk_frame_clock_get_timings$FUNC, false
    );
}


