// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$111 {

    static final FunctionDescriptor opendir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle opendir$MH = RuntimeHelper.downcallHandle(
        "opendir",
        constants$111.opendir$FUNC, false
    );
    static final FunctionDescriptor fdopendir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle fdopendir$MH = RuntimeHelper.downcallHandle(
        "fdopendir",
        constants$111.fdopendir$FUNC, false
    );
    static final FunctionDescriptor closedir$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle closedir$MH = RuntimeHelper.downcallHandle(
        "closedir",
        constants$111.closedir$FUNC, false
    );
    static final FunctionDescriptor readdir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle readdir$MH = RuntimeHelper.downcallHandle(
        "readdir",
        constants$111.readdir$FUNC, false
    );
    static final FunctionDescriptor readdir_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle readdir_r$MH = RuntimeHelper.downcallHandle(
        "readdir_r",
        constants$111.readdir_r$FUNC, false
    );
    static final FunctionDescriptor rewinddir$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rewinddir$MH = RuntimeHelper.downcallHandle(
        "rewinddir",
        constants$111.rewinddir$FUNC, false
    );
}


