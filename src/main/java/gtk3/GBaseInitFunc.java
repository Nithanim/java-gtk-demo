// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GBaseInitFunc {

    void apply(jdk.incubator.foreign.MemoryAddress g_class);
    static NativeSymbol allocate(GBaseInitFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GBaseInitFunc.class, fi, constants$420.GBaseInitFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GBaseInitFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GBaseInitFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress g_class) -> {
            try {
                constants$420.GBaseInitFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)g_class);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


