// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface pthread_create$__start_routine {

    jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0);
    static NativeSymbol allocate(pthread_create$__start_routine fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(pthread_create$__start_routine.class, fi, constants$347.pthread_create$__start_routine$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
    }
    static pthread_create$__start_routine ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("pthread_create$__start_routine::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
            try {
                return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)constants$347.pthread_create$__start_routine$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

