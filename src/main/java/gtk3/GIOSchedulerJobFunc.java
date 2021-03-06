// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GIOSchedulerJobFunc {

    int apply(jdk.incubator.foreign.MemoryAddress job, jdk.incubator.foreign.MemoryAddress cancellable, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GIOSchedulerJobFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GIOSchedulerJobFunc.class, fi, constants$510.GIOSchedulerJobFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static GIOSchedulerJobFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GIOSchedulerJobFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress job, jdk.incubator.foreign.MemoryAddress cancellable, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                return (int)constants$510.GIOSchedulerJobFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)job, (jdk.incubator.foreign.Addressable)cancellable, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


