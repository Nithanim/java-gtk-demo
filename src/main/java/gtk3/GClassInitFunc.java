// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GClassInitFunc {

    void apply(jdk.incubator.foreign.MemoryAddress g_class, jdk.incubator.foreign.MemoryAddress class_data);
    static NativeSymbol allocate(GClassInitFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GClassInitFunc.class, fi, constants$420.GClassInitFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GClassInitFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GClassInitFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress g_class, jdk.incubator.foreign.MemoryAddress class_data) -> {
            try {
                constants$421.GClassInitFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)g_class, (jdk.incubator.foreign.Addressable)class_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

