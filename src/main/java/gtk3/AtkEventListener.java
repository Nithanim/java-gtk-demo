// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface AtkEventListener {

    void apply(jdk.incubator.foreign.MemoryAddress obj);
    static NativeSymbol allocate(AtkEventListener fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(AtkEventListener.class, fi, constants$1347.AtkEventListener$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static AtkEventListener ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("AtkEventListener::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress obj) -> {
            try {
                constants$1347.AtkEventListener$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)obj);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


