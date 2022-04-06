// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface AtkFocusHandler {

    void apply(jdk.incubator.foreign.MemoryAddress object, int focus_in);
    static NativeSymbol allocate(AtkFocusHandler fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(AtkFocusHandler.class, fi, constants$1350.AtkFocusHandler$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static AtkFocusHandler ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("AtkFocusHandler::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress object, int focus_in) -> {
            try {
                constants$1350.AtkFocusHandler$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)object, focus_in);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

