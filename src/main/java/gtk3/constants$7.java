// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$7 {

    static final FunctionDescriptor GDestroyNotify$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GDestroyNotify$MH = RuntimeHelper.downcallHandle(
        constants$7.GDestroyNotify$FUNC, false
    );
    static final FunctionDescriptor GFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GFunc$MH = RuntimeHelper.downcallHandle(
        constants$7.GFunc$FUNC, false
    );
    static final FunctionDescriptor GHashFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHashFunc$MH = RuntimeHelper.downcallHandle(
        constants$7.GHashFunc$FUNC, false
    );
}


