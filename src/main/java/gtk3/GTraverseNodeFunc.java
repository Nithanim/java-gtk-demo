// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GTraverseNodeFunc {

    int apply(jdk.incubator.foreign.MemoryAddress node, jdk.incubator.foreign.MemoryAddress data);
    static NativeSymbol allocate(GTraverseNodeFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GTraverseNodeFunc.class, fi, constants$322.GTraverseNodeFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GTraverseNodeFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GTraverseNodeFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress node, jdk.incubator.foreign.MemoryAddress data) -> {
            try {
                return (int)constants$322.GTraverseNodeFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)node, (jdk.incubator.foreign.Addressable)data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

