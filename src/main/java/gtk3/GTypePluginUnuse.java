// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GTypePluginUnuse {

    void apply(jdk.incubator.foreign.MemoryAddress plugin);
    static NativeSymbol allocate(GTypePluginUnuse fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GTypePluginUnuse.class, fi, constants$492.GTypePluginUnuse$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GTypePluginUnuse ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GTypePluginUnuse::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress plugin) -> {
            try {
                constants$492.GTypePluginUnuse$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)plugin);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


