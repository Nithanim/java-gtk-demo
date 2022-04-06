// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GSourceFunc {

    int apply(jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GSourceFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GSourceFunc.class, fi, constants$156.GSourceFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GSourceFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GSourceFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                return (int)constants$156.GSourceFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


