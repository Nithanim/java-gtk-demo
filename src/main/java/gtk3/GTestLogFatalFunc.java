// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GTestLogFatalFunc {

    int apply(jdk.incubator.foreign.MemoryAddress log_domain, int log_level, jdk.incubator.foreign.MemoryAddress message, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GTestLogFatalFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GTestLogFatalFunc.class, fi, constants$315.GTestLogFatalFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GTestLogFatalFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GTestLogFatalFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress log_domain, int log_level, jdk.incubator.foreign.MemoryAddress message, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                return (int)constants$315.GTestLogFatalFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)log_domain, log_level, (jdk.incubator.foreign.Addressable)message, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

