// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GtkAccelGroupFindFunc {

    int apply(jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress closure, jdk.incubator.foreign.MemoryAddress data);
    static NativeSymbol allocate(GtkAccelGroupFindFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GtkAccelGroupFindFunc.class, fi, constants$1330.GtkAccelGroupFindFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GtkAccelGroupFindFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GtkAccelGroupFindFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress closure, jdk.incubator.foreign.MemoryAddress data) -> {
            try {
                return (int)constants$1330.GtkAccelGroupFindFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)key, (jdk.incubator.foreign.Addressable)closure, (jdk.incubator.foreign.Addressable)data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


