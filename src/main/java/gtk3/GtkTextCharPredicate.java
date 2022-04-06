// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GtkTextCharPredicate {

    int apply(int ch, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GtkTextCharPredicate fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GtkTextCharPredicate.class, fi, constants$1568.GtkTextCharPredicate$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GtkTextCharPredicate ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GtkTextCharPredicate::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (int ch, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                return (int)constants$1569.GtkTextCharPredicate$MH.invokeExact(symbol, ch, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


