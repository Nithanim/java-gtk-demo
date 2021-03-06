// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GFileMeasureProgressCallback {

    void apply(int reporting, long current_size, long num_dirs, long num_files, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(GFileMeasureProgressCallback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GFileMeasureProgressCallback.class, fi, constants$509.GFileMeasureProgressCallback$FUNC, "(IJJJLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GFileMeasureProgressCallback ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GFileMeasureProgressCallback::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (int reporting, long current_size, long num_dirs, long num_files, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                constants$509.GFileMeasureProgressCallback$MH.invokeExact(symbol, reporting, current_size, num_dirs, num_files, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


