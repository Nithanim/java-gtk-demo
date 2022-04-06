// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GtkTextBufferSerializeFunc {

    jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress register_buffer, jdk.incubator.foreign.MemoryAddress content_buffer, jdk.incubator.foreign.MemoryAddress start, jdk.incubator.foreign.MemoryAddress end, jdk.incubator.foreign.MemoryAddress length, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GtkTextBufferSerializeFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GtkTextBufferSerializeFunc.class, fi, constants$1998.GtkTextBufferSerializeFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
    }
    static GtkTextBufferSerializeFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GtkTextBufferSerializeFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress register_buffer, jdk.incubator.foreign.MemoryAddress content_buffer, jdk.incubator.foreign.MemoryAddress start, jdk.incubator.foreign.MemoryAddress end, jdk.incubator.foreign.MemoryAddress length, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)constants$1998.GtkTextBufferSerializeFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)register_buffer, (jdk.incubator.foreign.Addressable)content_buffer, (jdk.incubator.foreign.Addressable)start, (jdk.incubator.foreign.Addressable)end, (jdk.incubator.foreign.Addressable)length, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

