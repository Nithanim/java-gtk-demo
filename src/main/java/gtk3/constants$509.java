// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$509 {

    static final FunctionDescriptor GFileProgressCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GFileProgressCallback$MH = RuntimeHelper.downcallHandle(
        constants$509.GFileProgressCallback$FUNC, false
    );
    static final FunctionDescriptor GFileReadMoreCallback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GFileReadMoreCallback$MH = RuntimeHelper.downcallHandle(
        constants$509.GFileReadMoreCallback$FUNC, false
    );
    static final FunctionDescriptor GFileMeasureProgressCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GFileMeasureProgressCallback$MH = RuntimeHelper.downcallHandle(
        constants$509.GFileMeasureProgressCallback$FUNC, false
    );
}

