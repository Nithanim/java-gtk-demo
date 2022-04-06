// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GPollableSourceFunc {

    int apply(jdk.incubator.foreign.MemoryAddress pollable_stream, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GPollableSourceFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GPollableSourceFunc.class, fi, constants$511.GPollableSourceFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GPollableSourceFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GPollableSourceFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress pollable_stream, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                return (int)constants$511.GPollableSourceFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)pollable_stream, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

