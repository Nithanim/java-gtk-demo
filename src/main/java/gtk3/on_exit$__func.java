// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface on_exit$__func {

    void apply(int _x0, jdk.incubator.foreign.MemoryAddress _x1);
    static NativeSymbol allocate(on_exit$__func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(on_exit$__func.class, fi, constants$44.on_exit$__func$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static on_exit$__func ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("on_exit$__func::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (int _x0, jdk.incubator.foreign.MemoryAddress _x1) -> {
            try {
                constants$44.on_exit$__func$MH.invokeExact(symbol, _x0, (jdk.incubator.foreign.Addressable)_x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


