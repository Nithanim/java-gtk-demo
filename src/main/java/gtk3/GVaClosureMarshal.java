// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GVaClosureMarshal {

    void apply(jdk.incubator.foreign.MemoryAddress closure, jdk.incubator.foreign.MemoryAddress return_value, jdk.incubator.foreign.MemoryAddress instance, jdk.incubator.foreign.MemoryAddress args, jdk.incubator.foreign.MemoryAddress marshal_data, int n_params, jdk.incubator.foreign.MemoryAddress param_types);
    static NativeSymbol allocate(GVaClosureMarshal fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GVaClosureMarshal.class, fi, constants$439.GVaClosureMarshal$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GVaClosureMarshal ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GVaClosureMarshal::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress closure, jdk.incubator.foreign.MemoryAddress return_value, jdk.incubator.foreign.MemoryAddress instance, jdk.incubator.foreign.MemoryAddress args, jdk.incubator.foreign.MemoryAddress marshal_data, int n_params, jdk.incubator.foreign.MemoryAddress param_types) -> {
            try {
                constants$439.GVaClosureMarshal$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)closure, (jdk.incubator.foreign.Addressable)return_value, (jdk.incubator.foreign.Addressable)instance, (jdk.incubator.foreign.Addressable)args, (jdk.incubator.foreign.Addressable)marshal_data, n_params, (jdk.incubator.foreign.Addressable)param_types);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


