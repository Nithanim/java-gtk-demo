// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GdkSeatGrabPrepareFunc {

    void apply(jdk.incubator.foreign.MemoryAddress seat, jdk.incubator.foreign.MemoryAddress window, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GdkSeatGrabPrepareFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GdkSeatGrabPrepareFunc.class, fi, constants$1229.GdkSeatGrabPrepareFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GdkSeatGrabPrepareFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GdkSeatGrabPrepareFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress seat, jdk.incubator.foreign.MemoryAddress window, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                constants$1229.GdkSeatGrabPrepareFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)seat, (jdk.incubator.foreign.Addressable)window, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


