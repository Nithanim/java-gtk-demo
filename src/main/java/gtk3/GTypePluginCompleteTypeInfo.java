// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GTypePluginCompleteTypeInfo {

    void apply(jdk.incubator.foreign.MemoryAddress plugin, long g_type, jdk.incubator.foreign.MemoryAddress info, jdk.incubator.foreign.MemoryAddress value_table);
    static NativeSymbol allocate(GTypePluginCompleteTypeInfo fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GTypePluginCompleteTypeInfo.class, fi, constants$492.GTypePluginCompleteTypeInfo$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GTypePluginCompleteTypeInfo ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GTypePluginCompleteTypeInfo::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress plugin, long g_type, jdk.incubator.foreign.MemoryAddress info, jdk.incubator.foreign.MemoryAddress value_table) -> {
            try {
                constants$492.GTypePluginCompleteTypeInfo$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)plugin, g_type, (jdk.incubator.foreign.Addressable)info, (jdk.incubator.foreign.Addressable)value_table);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


