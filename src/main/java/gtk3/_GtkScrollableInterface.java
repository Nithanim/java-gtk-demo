// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GtkScrollableInterface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("base_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("get_border")
    ).withName("_GtkScrollableInterface");
    public static MemoryLayout $LAYOUT() {
        return _GtkScrollableInterface.$struct$LAYOUT;
    }
    public static MemorySegment base_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor get_border$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_border$MH = RuntimeHelper.downcallHandle(
        _GtkScrollableInterface.get_border$FUNC, false
    );
    public interface get_border {

        int apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1);
        static NativeSymbol allocate(get_border fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_border.class, fi, _GtkScrollableInterface.get_border$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static get_border ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_border::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1) -> {
                try {
                    return (int)_GtkScrollableInterface.get_border$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_border$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_border"));
    public static VarHandle get_border$VH() {
        return _GtkScrollableInterface.get_border$VH;
    }
    public static MemoryAddress get_border$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkScrollableInterface.get_border$VH.get(seg);
    }
    public static void get_border$set( MemorySegment seg, MemoryAddress x) {
        _GtkScrollableInterface.get_border$VH.set(seg, x);
    }
    public static MemoryAddress get_border$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkScrollableInterface.get_border$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_border$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkScrollableInterface.get_border$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_border get_border (MemorySegment segment, ResourceScope scope) {
        return get_border.ofAddress(get_border$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


