// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GtkMenuDetachFunc {

    void apply(jdk.incubator.foreign.MemoryAddress attach_widget, jdk.incubator.foreign.MemoryAddress menu);
    static NativeSymbol allocate(GtkMenuDetachFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GtkMenuDetachFunc.class, fi, constants$1481.GtkMenuDetachFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GtkMenuDetachFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GtkMenuDetachFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress attach_widget, jdk.incubator.foreign.MemoryAddress menu) -> {
            try {
                constants$1481.GtkMenuDetachFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)attach_widget, (jdk.incubator.foreign.Addressable)menu);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


