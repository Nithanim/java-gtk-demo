// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GdkWindowInvalidateHandlerFunc {

    void apply(jdk.incubator.foreign.MemoryAddress window, jdk.incubator.foreign.MemoryAddress region);
    static NativeSymbol allocate(GdkWindowInvalidateHandlerFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GdkWindowInvalidateHandlerFunc.class, fi, constants$1209.GdkWindowInvalidateHandlerFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GdkWindowInvalidateHandlerFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GdkWindowInvalidateHandlerFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress window, jdk.incubator.foreign.MemoryAddress region) -> {
            try {
                constants$1209.GdkWindowInvalidateHandlerFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)window, (jdk.incubator.foreign.Addressable)region);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


