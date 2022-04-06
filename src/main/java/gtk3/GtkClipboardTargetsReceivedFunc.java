// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GtkClipboardTargetsReceivedFunc {

    void apply(jdk.incubator.foreign.MemoryAddress clipboard, jdk.incubator.foreign.MemoryAddress atoms, int n_atoms, jdk.incubator.foreign.MemoryAddress data);
    static NativeSymbol allocate(GtkClipboardTargetsReceivedFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GtkClipboardTargetsReceivedFunc.class, fi, constants$1694.GtkClipboardTargetsReceivedFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GtkClipboardTargetsReceivedFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GtkClipboardTargetsReceivedFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress clipboard, jdk.incubator.foreign.MemoryAddress atoms, int n_atoms, jdk.incubator.foreign.MemoryAddress data) -> {
            try {
                constants$1694.GtkClipboardTargetsReceivedFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)clipboard, (jdk.incubator.foreign.Addressable)atoms, n_atoms, (jdk.incubator.foreign.Addressable)data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


