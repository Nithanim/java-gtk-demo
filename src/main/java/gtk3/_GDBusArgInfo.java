// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GDBusArgInfo {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("name"),
        Constants$root.C_POINTER$LAYOUT.withName("signature"),
        Constants$root.C_POINTER$LAYOUT.withName("annotations")
    ).withName("_GDBusArgInfo");
    public static MemoryLayout $LAYOUT() {
        return _GDBusArgInfo.$struct$LAYOUT;
    }
    static final VarHandle ref_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ref_count"));
    public static VarHandle ref_count$VH() {
        return _GDBusArgInfo.ref_count$VH;
    }
    public static int ref_count$get(MemorySegment seg) {
        return (int)_GDBusArgInfo.ref_count$VH.get(seg);
    }
    public static void ref_count$set( MemorySegment seg, int x) {
        _GDBusArgInfo.ref_count$VH.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)_GDBusArgInfo.ref_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        _GDBusArgInfo.ref_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return _GDBusArgInfo.name$VH;
    }
    public static MemoryAddress name$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GDBusArgInfo.name$VH.get(seg);
    }
    public static void name$set( MemorySegment seg, MemoryAddress x) {
        _GDBusArgInfo.name$VH.set(seg, x);
    }
    public static MemoryAddress name$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GDBusArgInfo.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusArgInfo.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle signature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("signature"));
    public static VarHandle signature$VH() {
        return _GDBusArgInfo.signature$VH;
    }
    public static MemoryAddress signature$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GDBusArgInfo.signature$VH.get(seg);
    }
    public static void signature$set( MemorySegment seg, MemoryAddress x) {
        _GDBusArgInfo.signature$VH.set(seg, x);
    }
    public static MemoryAddress signature$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GDBusArgInfo.signature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void signature$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusArgInfo.signature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle annotations$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("annotations"));
    public static VarHandle annotations$VH() {
        return _GDBusArgInfo.annotations$VH;
    }
    public static MemoryAddress annotations$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GDBusArgInfo.annotations$VH.get(seg);
    }
    public static void annotations$set( MemorySegment seg, MemoryAddress x) {
        _GDBusArgInfo.annotations$VH.set(seg, x);
    }
    public static MemoryAddress annotations$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GDBusArgInfo.annotations$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void annotations$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusArgInfo.annotations$VH.set(seg.asSlice(index*sizeof()), x);
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


