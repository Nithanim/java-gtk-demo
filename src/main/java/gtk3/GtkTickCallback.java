// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GtkTickCallback {

    int apply(jdk.incubator.foreign.MemoryAddress widget, jdk.incubator.foreign.MemoryAddress frame_clock, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GtkTickCallback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GtkTickCallback.class, fi, constants$1389.GtkTickCallback$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GtkTickCallback ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GtkTickCallback::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress widget, jdk.incubator.foreign.MemoryAddress frame_clock, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                return (int)constants$1389.GtkTickCallback$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)widget, (jdk.incubator.foreign.Addressable)frame_clock, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


