// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GtkKeySnoopFunc {

    int apply(jdk.incubator.foreign.MemoryAddress grab_widget, jdk.incubator.foreign.MemoryAddress event, jdk.incubator.foreign.MemoryAddress func_data);
    static NativeSymbol allocate(GtkKeySnoopFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GtkKeySnoopFunc.class, fi, constants$1842.GtkKeySnoopFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GtkKeySnoopFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GtkKeySnoopFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress grab_widget, jdk.incubator.foreign.MemoryAddress event, jdk.incubator.foreign.MemoryAddress func_data) -> {
            try {
                return (int)constants$1843.GtkKeySnoopFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)grab_widget, (jdk.incubator.foreign.Addressable)event, (jdk.incubator.foreign.Addressable)func_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


