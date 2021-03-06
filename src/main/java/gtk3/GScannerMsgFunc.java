// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GScannerMsgFunc {

    void apply(jdk.incubator.foreign.MemoryAddress scanner, jdk.incubator.foreign.MemoryAddress message, int error);
    static NativeSymbol allocate(GScannerMsgFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GScannerMsgFunc.class, fi, constants$270.GScannerMsgFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static GScannerMsgFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GScannerMsgFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress scanner, jdk.incubator.foreign.MemoryAddress message, int error) -> {
            try {
                constants$270.GScannerMsgFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)scanner, (jdk.incubator.foreign.Addressable)message, error);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


