// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GDBusSubtreeIntrospectFunc {

    jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress connection, jdk.incubator.foreign.MemoryAddress sender, jdk.incubator.foreign.MemoryAddress object_path, jdk.incubator.foreign.MemoryAddress node, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GDBusSubtreeIntrospectFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GDBusSubtreeIntrospectFunc.class, fi, constants$596.GDBusSubtreeIntrospectFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
    }
    static GDBusSubtreeIntrospectFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GDBusSubtreeIntrospectFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress connection, jdk.incubator.foreign.MemoryAddress sender, jdk.incubator.foreign.MemoryAddress object_path, jdk.incubator.foreign.MemoryAddress node, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)constants$596.GDBusSubtreeIntrospectFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)connection, (jdk.incubator.foreign.Addressable)sender, (jdk.incubator.foreign.Addressable)object_path, (jdk.incubator.foreign.Addressable)node, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

