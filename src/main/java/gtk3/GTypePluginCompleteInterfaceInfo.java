// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GTypePluginCompleteInterfaceInfo {

    void apply(jdk.incubator.foreign.MemoryAddress plugin, long instance_type, long interface_type, jdk.incubator.foreign.MemoryAddress info);
    static NativeSymbol allocate(GTypePluginCompleteInterfaceInfo fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GTypePluginCompleteInterfaceInfo.class, fi, constants$492.GTypePluginCompleteInterfaceInfo$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GTypePluginCompleteInterfaceInfo ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GTypePluginCompleteInterfaceInfo::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress plugin, long instance_type, long interface_type, jdk.incubator.foreign.MemoryAddress info) -> {
            try {
                constants$492.GTypePluginCompleteInterfaceInfo$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)plugin, instance_type, interface_type, (jdk.incubator.foreign.Addressable)info);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


