// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GOptionParseFunc {

    int apply(jdk.incubator.foreign.MemoryAddress context, jdk.incubator.foreign.MemoryAddress group, jdk.incubator.foreign.MemoryAddress data, jdk.incubator.foreign.MemoryAddress error);
    static NativeSymbol allocate(GOptionParseFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GOptionParseFunc.class, fi, constants$241.GOptionParseFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GOptionParseFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GOptionParseFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress context, jdk.incubator.foreign.MemoryAddress group, jdk.incubator.foreign.MemoryAddress data, jdk.incubator.foreign.MemoryAddress error) -> {
            try {
                return (int)constants$242.GOptionParseFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)context, (jdk.incubator.foreign.Addressable)group, (jdk.incubator.foreign.Addressable)data, (jdk.incubator.foreign.Addressable)error);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

