// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GCompletionStrncmpFunc {

    int apply(jdk.incubator.foreign.MemoryAddress s1, jdk.incubator.foreign.MemoryAddress s2, long n);
    static NativeSymbol allocate(GCompletionStrncmpFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GCompletionStrncmpFunc.class, fi, constants$340.GCompletionStrncmpFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I", scope);
    }
    static GCompletionStrncmpFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GCompletionStrncmpFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress s1, jdk.incubator.foreign.MemoryAddress s2, long n) -> {
            try {
                return (int)constants$340.GCompletionStrncmpFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)s1, (jdk.incubator.foreign.Addressable)s2, n);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


