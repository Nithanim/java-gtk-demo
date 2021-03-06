// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GOutputVector {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("buffer"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("size")
    ).withName("_GOutputVector");
    public static MemoryLayout $LAYOUT() {
        return _GOutputVector.$struct$LAYOUT;
    }
    static final VarHandle buffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("buffer"));
    public static VarHandle buffer$VH() {
        return _GOutputVector.buffer$VH;
    }
    public static MemoryAddress buffer$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GOutputVector.buffer$VH.get(seg);
    }
    public static void buffer$set( MemorySegment seg, MemoryAddress x) {
        _GOutputVector.buffer$VH.set(seg, x);
    }
    public static MemoryAddress buffer$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GOutputVector.buffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void buffer$set(MemorySegment seg, long index, MemoryAddress x) {
        _GOutputVector.buffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("size"));
    public static VarHandle size$VH() {
        return _GOutputVector.size$VH;
    }
    public static long size$get(MemorySegment seg) {
        return (long)_GOutputVector.size$VH.get(seg);
    }
    public static void size$set( MemorySegment seg, long x) {
        _GOutputVector.size$VH.set(seg, x);
    }
    public static long size$get(MemorySegment seg, long index) {
        return (long)_GOutputVector.size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void size$set(MemorySegment seg, long index, long x) {
        _GOutputVector.size$VH.set(seg.asSlice(index*sizeof()), x);
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


