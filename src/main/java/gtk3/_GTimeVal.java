// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GTimeVal {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("tv_sec"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("tv_usec")
    ).withName("_GTimeVal");
    public static MemoryLayout $LAYOUT() {
        return _GTimeVal.$struct$LAYOUT;
    }
    static final VarHandle tv_sec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tv_sec"));
    public static VarHandle tv_sec$VH() {
        return _GTimeVal.tv_sec$VH;
    }
    public static long tv_sec$get(MemorySegment seg) {
        return (long)_GTimeVal.tv_sec$VH.get(seg);
    }
    public static void tv_sec$set( MemorySegment seg, long x) {
        _GTimeVal.tv_sec$VH.set(seg, x);
    }
    public static long tv_sec$get(MemorySegment seg, long index) {
        return (long)_GTimeVal.tv_sec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_sec$set(MemorySegment seg, long index, long x) {
        _GTimeVal.tv_sec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tv_usec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tv_usec"));
    public static VarHandle tv_usec$VH() {
        return _GTimeVal.tv_usec$VH;
    }
    public static long tv_usec$get(MemorySegment seg) {
        return (long)_GTimeVal.tv_usec$VH.get(seg);
    }
    public static void tv_usec$set( MemorySegment seg, long x) {
        _GTimeVal.tv_usec$VH.set(seg, x);
    }
    public static long tv_usec$get(MemorySegment seg, long index) {
        return (long)_GTimeVal.tv_usec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tv_usec$set(MemorySegment seg, long index, long x) {
        _GTimeVal.tv_usec$VH.set(seg.asSlice(index*sizeof()), x);
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


