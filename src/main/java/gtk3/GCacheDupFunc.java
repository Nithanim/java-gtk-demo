// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GCacheDupFunc {

    jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress value);
    static NativeSymbol allocate(GCacheDupFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GCacheDupFunc.class, fi, constants$338.GCacheDupFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
    }
    static GCacheDupFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GCacheDupFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress value) -> {
            try {
                return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)constants$338.GCacheDupFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)value);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


