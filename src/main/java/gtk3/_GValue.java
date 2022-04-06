// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GValue {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
        MemoryLayout.sequenceLayout(2, MemoryLayout.unionLayout(
            Constants$root.C_INT$LAYOUT.withName("v_int"),
            Constants$root.C_INT$LAYOUT.withName("v_uint"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("v_long"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("v_ulong"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("v_int64"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("v_uint64"),
            Constants$root.C_FLOAT$LAYOUT.withName("v_float"),
            Constants$root.C_DOUBLE$LAYOUT.withName("v_double"),
            Constants$root.C_POINTER$LAYOUT.withName("v_pointer")
        )).withName("data")
    ).withName("_GValue");
    public static MemoryLayout $LAYOUT() {
        return _GValue.$struct$LAYOUT;
    }
    static final VarHandle g_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("g_type"));
    public static VarHandle g_type$VH() {
        return _GValue.g_type$VH;
    }
    public static long g_type$get(MemorySegment seg) {
        return (long)_GValue.g_type$VH.get(seg);
    }
    public static void g_type$set( MemorySegment seg, long x) {
        _GValue.g_type$VH.set(seg, x);
    }
    public static long g_type$get(MemorySegment seg, long index) {
        return (long)_GValue.g_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void g_type$set(MemorySegment seg, long index, long x) {
        _GValue.g_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment data$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
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


