// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface hb_unicode_compose_func_t {

    int apply(jdk.incubator.foreign.MemoryAddress ufuncs, int a, int b, jdk.incubator.foreign.MemoryAddress ab, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(hb_unicode_compose_func_t fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(hb_unicode_compose_func_t.class, fi, constants$979.hb_unicode_compose_func_t$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static hb_unicode_compose_func_t ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("hb_unicode_compose_func_t::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress ufuncs, int a, int b, jdk.incubator.foreign.MemoryAddress ab, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                return (int)constants$979.hb_unicode_compose_func_t$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)ufuncs, a, b, (jdk.incubator.foreign.Addressable)ab, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

