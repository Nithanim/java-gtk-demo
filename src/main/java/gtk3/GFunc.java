// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GFunc {

    void apply(jdk.incubator.foreign.MemoryAddress data, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GFunc.class, fi, constants$7.GFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress data, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                constants$7.GFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)data, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


