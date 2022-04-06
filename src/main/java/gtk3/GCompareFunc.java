// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GCompareFunc {

    int apply(jdk.incubator.foreign.MemoryAddress a, jdk.incubator.foreign.MemoryAddress b);
    static NativeSymbol allocate(GCompareFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GCompareFunc.class, fi, constants$6.GCompareFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GCompareFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GCompareFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress a, jdk.incubator.foreign.MemoryAddress b) -> {
            try {
                return (int)constants$6.GCompareFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)a, (jdk.incubator.foreign.Addressable)b);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


