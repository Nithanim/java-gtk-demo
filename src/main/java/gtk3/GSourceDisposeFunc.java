// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GSourceDisposeFunc {

    void apply(jdk.incubator.foreign.MemoryAddress source);
    static NativeSymbol allocate(GSourceDisposeFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GSourceDisposeFunc.class, fi, constants$156.GSourceDisposeFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GSourceDisposeFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GSourceDisposeFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress source) -> {
            try {
                constants$156.GSourceDisposeFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)source);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


