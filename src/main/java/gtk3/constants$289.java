// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$289 {

    static final FunctionDescriptor strncasecmp_l$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strncasecmp_l$MH = RuntimeHelper.downcallHandle(
        "strncasecmp_l",
        constants$289.strncasecmp_l$FUNC, false
    );
    static final FunctionDescriptor explicit_bzero$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle explicit_bzero$MH = RuntimeHelper.downcallHandle(
        "explicit_bzero",
        constants$289.explicit_bzero$FUNC, false
    );
    static final FunctionDescriptor strsep$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strsep$MH = RuntimeHelper.downcallHandle(
        "strsep",
        constants$289.strsep$FUNC, false
    );
    static final FunctionDescriptor strsignal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strsignal$MH = RuntimeHelper.downcallHandle(
        "strsignal",
        constants$289.strsignal$FUNC, false
    );
    static final FunctionDescriptor __stpcpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __stpcpy$MH = RuntimeHelper.downcallHandle(
        "__stpcpy",
        constants$289.__stpcpy$FUNC, false
    );
    static final FunctionDescriptor stpcpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle stpcpy$MH = RuntimeHelper.downcallHandle(
        "stpcpy",
        constants$289.stpcpy$FUNC, false
    );
}


