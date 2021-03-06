// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GLogWriterFunc {

    int apply(int log_level, jdk.incubator.foreign.MemoryAddress fields, long n_fields, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GLogWriterFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GLogWriterFunc.class, fi, constants$237.GLogWriterFunc$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GLogWriterFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GLogWriterFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (int log_level, jdk.incubator.foreign.MemoryAddress fields, long n_fields, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                return (int)constants$237.GLogWriterFunc$MH.invokeExact(symbol, log_level, (jdk.incubator.foreign.Addressable)fields, n_fields, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


