// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GSocketSourceFunc {

    int apply(jdk.incubator.foreign.MemoryAddress socket, int condition, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GSocketSourceFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GSocketSourceFunc.class, fi, constants$510.GSocketSourceFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GSocketSourceFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GSocketSourceFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress socket, int condition, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                return (int)constants$510.GSocketSourceFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)socket, condition, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

