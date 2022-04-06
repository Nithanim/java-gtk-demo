// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GtkClipboardImageReceivedFunc {

    void apply(jdk.incubator.foreign.MemoryAddress clipboard, jdk.incubator.foreign.MemoryAddress pixbuf, jdk.incubator.foreign.MemoryAddress data);
    static NativeSymbol allocate(GtkClipboardImageReceivedFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GtkClipboardImageReceivedFunc.class, fi, constants$1693.GtkClipboardImageReceivedFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GtkClipboardImageReceivedFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GtkClipboardImageReceivedFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress clipboard, jdk.incubator.foreign.MemoryAddress pixbuf, jdk.incubator.foreign.MemoryAddress data) -> {
            try {
                constants$1693.GtkClipboardImageReceivedFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)clipboard, (jdk.incubator.foreign.Addressable)pixbuf, (jdk.incubator.foreign.Addressable)data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


