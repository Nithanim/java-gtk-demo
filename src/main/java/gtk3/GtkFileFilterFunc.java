// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GtkFileFilterFunc {

    int apply(jdk.incubator.foreign.MemoryAddress filter_info, jdk.incubator.foreign.MemoryAddress data);
    static NativeSymbol allocate(GtkFileFilterFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GtkFileFilterFunc.class, fi, constants$1722.GtkFileFilterFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GtkFileFilterFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GtkFileFilterFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress filter_info, jdk.incubator.foreign.MemoryAddress data) -> {
            try {
                return (int)constants$1722.GtkFileFilterFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)filter_info, (jdk.incubator.foreign.Addressable)data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


