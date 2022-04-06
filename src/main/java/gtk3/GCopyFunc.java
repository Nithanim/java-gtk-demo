// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GCopyFunc {

    jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress src, jdk.incubator.foreign.MemoryAddress data);
    static NativeSymbol allocate(GCopyFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GCopyFunc.class, fi, constants$8.GCopyFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
    }
    static GCopyFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GCopyFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress src, jdk.incubator.foreign.MemoryAddress data) -> {
            try {
                return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)constants$8.GCopyFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)src, (jdk.incubator.foreign.Addressable)data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


