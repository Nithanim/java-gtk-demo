// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GBoxedCopyFunc {

    jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress boxed);
    static NativeSymbol allocate(GBoxedCopyFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GBoxedCopyFunc.class, fi, constants$463.GBoxedCopyFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
    }
    static GBoxedCopyFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GBoxedCopyFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress boxed) -> {
            try {
                return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)constants$463.GBoxedCopyFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)boxed);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


