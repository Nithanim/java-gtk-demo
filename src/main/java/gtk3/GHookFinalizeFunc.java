// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GHookFinalizeFunc {

    void apply(jdk.incubator.foreign.MemoryAddress hook_list, jdk.incubator.foreign.MemoryAddress hook);
    static NativeSymbol allocate(GHookFinalizeFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GHookFinalizeFunc.class, fi, constants$145.GHookFinalizeFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GHookFinalizeFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GHookFinalizeFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress hook_list, jdk.incubator.foreign.MemoryAddress hook) -> {
            try {
                constants$145.GHookFinalizeFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)hook_list, (jdk.incubator.foreign.Addressable)hook);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


