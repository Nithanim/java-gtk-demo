// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GtkPageSetupDoneFunc {

    void apply(jdk.incubator.foreign.MemoryAddress page_setup, jdk.incubator.foreign.MemoryAddress data);
    static NativeSymbol allocate(GtkPageSetupDoneFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GtkPageSetupDoneFunc.class, fi, constants$1918.GtkPageSetupDoneFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GtkPageSetupDoneFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GtkPageSetupDoneFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress page_setup, jdk.incubator.foreign.MemoryAddress data) -> {
            try {
                constants$1918.GtkPageSetupDoneFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)page_setup, (jdk.incubator.foreign.Addressable)data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


