// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GtkTreeSelectionFunc {

    int apply(jdk.incubator.foreign.MemoryAddress selection, jdk.incubator.foreign.MemoryAddress model, jdk.incubator.foreign.MemoryAddress path, int path_currently_selected, jdk.incubator.foreign.MemoryAddress data);
    static NativeSymbol allocate(GtkTreeSelectionFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GtkTreeSelectionFunc.class, fi, constants$2030.GtkTreeSelectionFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GtkTreeSelectionFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GtkTreeSelectionFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress selection, jdk.incubator.foreign.MemoryAddress model, jdk.incubator.foreign.MemoryAddress path, int path_currently_selected, jdk.incubator.foreign.MemoryAddress data) -> {
            try {
                return (int)constants$2030.GtkTreeSelectionFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)selection, (jdk.incubator.foreign.Addressable)model, (jdk.incubator.foreign.Addressable)path, path_currently_selected, (jdk.incubator.foreign.Addressable)data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

