// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GNodeForeachFunc {

    void apply(jdk.incubator.foreign.MemoryAddress node, jdk.incubator.foreign.MemoryAddress data);
    static NativeSymbol allocate(GNodeForeachFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GNodeForeachFunc.class, fi, constants$124.GNodeForeachFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GNodeForeachFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GNodeForeachFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress node, jdk.incubator.foreign.MemoryAddress data) -> {
            try {
                constants$124.GNodeForeachFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)node, (jdk.incubator.foreign.Addressable)data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

