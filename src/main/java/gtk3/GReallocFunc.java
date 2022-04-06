// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GReallocFunc {

    jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress data, long size);
    static NativeSymbol allocate(GReallocFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GReallocFunc.class, fi, constants$732.GReallocFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/Addressable;", scope);
    }
    static GReallocFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GReallocFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress data, long size) -> {
            try {
                return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)constants$732.GReallocFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)data, size);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

