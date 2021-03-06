// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GSettingsBindSetMapping {

    jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress value, jdk.incubator.foreign.MemoryAddress expected_type, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GSettingsBindSetMapping fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GSettingsBindSetMapping.class, fi, constants$789.GSettingsBindSetMapping$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
    }
    static GSettingsBindSetMapping ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GSettingsBindSetMapping::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress value, jdk.incubator.foreign.MemoryAddress expected_type, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)constants$789.GSettingsBindSetMapping$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)value, (jdk.incubator.foreign.Addressable)expected_type, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


