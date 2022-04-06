// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GtkMenuPositionFunc {

    void apply(jdk.incubator.foreign.MemoryAddress menu, jdk.incubator.foreign.MemoryAddress x, jdk.incubator.foreign.MemoryAddress y, jdk.incubator.foreign.MemoryAddress push_in, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GtkMenuPositionFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GtkMenuPositionFunc.class, fi, constants$1481.GtkMenuPositionFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GtkMenuPositionFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GtkMenuPositionFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress menu, jdk.incubator.foreign.MemoryAddress x, jdk.incubator.foreign.MemoryAddress y, jdk.incubator.foreign.MemoryAddress push_in, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                constants$1481.GtkMenuPositionFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)menu, (jdk.incubator.foreign.Addressable)x, (jdk.incubator.foreign.Addressable)y, (jdk.incubator.foreign.Addressable)push_in, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


