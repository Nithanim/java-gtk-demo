// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GBoxedFreeFunc {

    void apply(jdk.incubator.foreign.MemoryAddress boxed);
    static NativeSymbol allocate(GBoxedFreeFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GBoxedFreeFunc.class, fi, constants$463.GBoxedFreeFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GBoxedFreeFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GBoxedFreeFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress boxed) -> {
            try {
                constants$463.GBoxedFreeFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)boxed);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


