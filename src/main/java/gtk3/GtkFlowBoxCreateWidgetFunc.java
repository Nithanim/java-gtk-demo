// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GtkFlowBoxCreateWidgetFunc {

    jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress item, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GtkFlowBoxCreateWidgetFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GtkFlowBoxCreateWidgetFunc.class, fi, constants$1745.GtkFlowBoxCreateWidgetFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
    }
    static GtkFlowBoxCreateWidgetFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GtkFlowBoxCreateWidgetFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress item, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)constants$1745.GtkFlowBoxCreateWidgetFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)item, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

