// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GtkModuleInitFunc {

    void apply(jdk.incubator.foreign.MemoryAddress argc, jdk.incubator.foreign.MemoryAddress argv);
    static NativeSymbol allocate(GtkModuleInitFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GtkModuleInitFunc.class, fi, constants$1868.GtkModuleInitFunc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GtkModuleInitFunc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GtkModuleInitFunc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress argc, jdk.incubator.foreign.MemoryAddress argv) -> {
            try {
                constants$1868.GtkModuleInitFunc$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)argc, (jdk.incubator.foreign.Addressable)argv);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


