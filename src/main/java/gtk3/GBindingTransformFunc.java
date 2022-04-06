// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GBindingTransformFunc {

    int apply(jdk.incubator.foreign.MemoryAddress binding, jdk.incubator.foreign.MemoryAddress from_value, jdk.incubator.foreign.MemoryAddress to_value, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GBindingTransformFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GBindingTransformFunc.class, fi, constants$479.GBindingTransformFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GBindingTransformFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GBindingTransformFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress binding, jdk.incubator.foreign.MemoryAddress from_value, jdk.incubator.foreign.MemoryAddress to_value, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                return (int)constants$479.GBindingTransformFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)binding, (jdk.incubator.foreign.Addressable)from_value, (jdk.incubator.foreign.Addressable)to_value, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


