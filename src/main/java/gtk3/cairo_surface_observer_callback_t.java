// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface cairo_surface_observer_callback_t {

    void apply(jdk.incubator.foreign.MemoryAddress observer, jdk.incubator.foreign.MemoryAddress target, jdk.incubator.foreign.MemoryAddress data);
    static NativeSymbol allocate(cairo_surface_observer_callback_t fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(cairo_surface_observer_callback_t.class, fi, constants$1152.cairo_surface_observer_callback_t$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static cairo_surface_observer_callback_t ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("cairo_surface_observer_callback_t::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress observer, jdk.incubator.foreign.MemoryAddress target, jdk.incubator.foreign.MemoryAddress data) -> {
            try {
                constants$1152.cairo_surface_observer_callback_t$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)observer, (jdk.incubator.foreign.Addressable)target, (jdk.incubator.foreign.Addressable)data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


