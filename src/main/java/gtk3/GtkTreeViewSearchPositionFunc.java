// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GtkTreeViewSearchPositionFunc {

    void apply(jdk.incubator.foreign.MemoryAddress tree_view, jdk.incubator.foreign.MemoryAddress search_dialog, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GtkTreeViewSearchPositionFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GtkTreeViewSearchPositionFunc.class, fi, constants$1618.GtkTreeViewSearchPositionFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GtkTreeViewSearchPositionFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GtkTreeViewSearchPositionFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress tree_view, jdk.incubator.foreign.MemoryAddress search_dialog, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                constants$1618.GtkTreeViewSearchPositionFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)tree_view, (jdk.incubator.foreign.Addressable)search_dialog, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


