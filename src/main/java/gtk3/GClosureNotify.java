// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GClosureNotify {

    void apply(jdk.incubator.foreign.MemoryAddress data, jdk.incubator.foreign.MemoryAddress closure);
    static NativeSymbol allocate(GClosureNotify fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GClosureNotify.class, fi, constants$438.GClosureNotify$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GClosureNotify ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GClosureNotify::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress data, jdk.incubator.foreign.MemoryAddress closure) -> {
            try {
                constants$438.GClosureNotify$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)data, (jdk.incubator.foreign.Addressable)closure);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


