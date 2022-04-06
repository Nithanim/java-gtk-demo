// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GDBusSignalInfo {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("name"),
        Constants$root.C_POINTER$LAYOUT.withName("args"),
        Constants$root.C_POINTER$LAYOUT.withName("annotations")
    ).withName("_GDBusSignalInfo");
    public static MemoryLayout $LAYOUT() {
        return _GDBusSignalInfo.$struct$LAYOUT;
    }
    static final VarHandle ref_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ref_count"));
    public static VarHandle ref_count$VH() {
        return _GDBusSignalInfo.ref_count$VH;
    }
    public static int ref_count$get(MemorySegment seg) {
        return (int)_GDBusSignalInfo.ref_count$VH.get(seg);
    }
    public static void ref_count$set( MemorySegment seg, int x) {
        _GDBusSignalInfo.ref_count$VH.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)_GDBusSignalInfo.ref_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        _GDBusSignalInfo.ref_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return _GDBusSignalInfo.name$VH;
    }
    public static MemoryAddress name$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GDBusSignalInfo.name$VH.get(seg);
    }
    public static void name$set( MemorySegment seg, MemoryAddress x) {
        _GDBusSignalInfo.name$VH.set(seg, x);
    }
    public static MemoryAddress name$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GDBusSignalInfo.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusSignalInfo.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle args$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("args"));
    public static VarHandle args$VH() {
        return _GDBusSignalInfo.args$VH;
    }
    public static MemoryAddress args$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GDBusSignalInfo.args$VH.get(seg);
    }
    public static void args$set( MemorySegment seg, MemoryAddress x) {
        _GDBusSignalInfo.args$VH.set(seg, x);
    }
    public static MemoryAddress args$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GDBusSignalInfo.args$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void args$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusSignalInfo.args$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle annotations$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("annotations"));
    public static VarHandle annotations$VH() {
        return _GDBusSignalInfo.annotations$VH;
    }
    public static MemoryAddress annotations$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GDBusSignalInfo.annotations$VH.get(seg);
    }
    public static void annotations$set( MemorySegment seg, MemoryAddress x) {
        _GDBusSignalInfo.annotations$VH.set(seg, x);
    }
    public static MemoryAddress annotations$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GDBusSignalInfo.annotations$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void annotations$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusSignalInfo.annotations$VH.set(seg.asSlice(index*sizeof()), x);
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


