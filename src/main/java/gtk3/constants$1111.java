// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1111 {

    static final FunctionDescriptor fread_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fread_unlocked$MH = RuntimeHelper.downcallHandle(
        "fread_unlocked",
        constants$1111.fread_unlocked$FUNC, false
    );
    static final FunctionDescriptor fwrite_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fwrite_unlocked$MH = RuntimeHelper.downcallHandle(
        "fwrite_unlocked",
        constants$1111.fwrite_unlocked$FUNC, false
    );
    static final FunctionDescriptor fseek$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fseek$MH = RuntimeHelper.downcallHandle(
        "fseek",
        constants$1111.fseek$FUNC, false
    );
    static final FunctionDescriptor ftell$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ftell$MH = RuntimeHelper.downcallHandle(
        "ftell",
        constants$1111.ftell$FUNC, false
    );
    static final FunctionDescriptor rewind$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rewind$MH = RuntimeHelper.downcallHandle(
        "rewind",
        constants$1111.rewind$FUNC, false
    );
    static final FunctionDescriptor fseeko$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fseeko$MH = RuntimeHelper.downcallHandle(
        "fseeko",
        constants$1111.fseeko$FUNC, false
    );
}

