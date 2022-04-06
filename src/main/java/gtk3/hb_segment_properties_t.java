// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class hb_segment_properties_t {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("direction"),
        Constants$root.C_INT$LAYOUT.withName("script"),
        Constants$root.C_POINTER$LAYOUT.withName("language"),
        Constants$root.C_POINTER$LAYOUT.withName("reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("reserved2")
    ).withName("hb_segment_properties_t");
    public static MemoryLayout $LAYOUT() {
        return hb_segment_properties_t.$struct$LAYOUT;
    }
    static final VarHandle direction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("direction"));
    public static VarHandle direction$VH() {
        return hb_segment_properties_t.direction$VH;
    }
    public static int direction$get(MemorySegment seg) {
        return (int)hb_segment_properties_t.direction$VH.get(seg);
    }
    public static void direction$set( MemorySegment seg, int x) {
        hb_segment_properties_t.direction$VH.set(seg, x);
    }
    public static int direction$get(MemorySegment seg, long index) {
        return (int)hb_segment_properties_t.direction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void direction$set(MemorySegment seg, long index, int x) {
        hb_segment_properties_t.direction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle script$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("script"));
    public static VarHandle script$VH() {
        return hb_segment_properties_t.script$VH;
    }
    public static int script$get(MemorySegment seg) {
        return (int)hb_segment_properties_t.script$VH.get(seg);
    }
    public static void script$set( MemorySegment seg, int x) {
        hb_segment_properties_t.script$VH.set(seg, x);
    }
    public static int script$get(MemorySegment seg, long index) {
        return (int)hb_segment_properties_t.script$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void script$set(MemorySegment seg, long index, int x) {
        hb_segment_properties_t.script$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle language$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("language"));
    public static VarHandle language$VH() {
        return hb_segment_properties_t.language$VH;
    }
    public static MemoryAddress language$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)hb_segment_properties_t.language$VH.get(seg);
    }
    public static void language$set( MemorySegment seg, MemoryAddress x) {
        hb_segment_properties_t.language$VH.set(seg, x);
    }
    public static MemoryAddress language$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)hb_segment_properties_t.language$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void language$set(MemorySegment seg, long index, MemoryAddress x) {
        hb_segment_properties_t.language$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved1"));
    public static VarHandle reserved1$VH() {
        return hb_segment_properties_t.reserved1$VH;
    }
    public static MemoryAddress reserved1$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)hb_segment_properties_t.reserved1$VH.get(seg);
    }
    public static void reserved1$set( MemorySegment seg, MemoryAddress x) {
        hb_segment_properties_t.reserved1$VH.set(seg, x);
    }
    public static MemoryAddress reserved1$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)hb_segment_properties_t.reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        hb_segment_properties_t.reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved2"));
    public static VarHandle reserved2$VH() {
        return hb_segment_properties_t.reserved2$VH;
    }
    public static MemoryAddress reserved2$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)hb_segment_properties_t.reserved2$VH.get(seg);
    }
    public static void reserved2$set( MemorySegment seg, MemoryAddress x) {
        hb_segment_properties_t.reserved2$VH.set(seg, x);
    }
    public static MemoryAddress reserved2$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)hb_segment_properties_t.reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        hb_segment_properties_t.reserved2$VH.set(seg.asSlice(index*sizeof()), x);
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


