// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GtkTableRowCol {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("requisition"),
        Constants$root.C_SHORT$LAYOUT.withName("allocation"),
        Constants$root.C_SHORT$LAYOUT.withName("spacing"),
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(1).withName("need_expand"),
            MemoryLayout.paddingLayout(1).withName("need_shrink"),
            MemoryLayout.paddingLayout(1).withName("expand"),
            MemoryLayout.paddingLayout(1).withName("shrink"),
            MemoryLayout.paddingLayout(1).withName("empty"),
            MemoryLayout.paddingLayout(11)
        )
    ).withName("_GtkTableRowCol");
    public static MemoryLayout $LAYOUT() {
        return _GtkTableRowCol.$struct$LAYOUT;
    }
    static final VarHandle requisition$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("requisition"));
    public static VarHandle requisition$VH() {
        return _GtkTableRowCol.requisition$VH;
    }
    public static short requisition$get(MemorySegment seg) {
        return (short)_GtkTableRowCol.requisition$VH.get(seg);
    }
    public static void requisition$set( MemorySegment seg, short x) {
        _GtkTableRowCol.requisition$VH.set(seg, x);
    }
    public static short requisition$get(MemorySegment seg, long index) {
        return (short)_GtkTableRowCol.requisition$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void requisition$set(MemorySegment seg, long index, short x) {
        _GtkTableRowCol.requisition$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle allocation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("allocation"));
    public static VarHandle allocation$VH() {
        return _GtkTableRowCol.allocation$VH;
    }
    public static short allocation$get(MemorySegment seg) {
        return (short)_GtkTableRowCol.allocation$VH.get(seg);
    }
    public static void allocation$set( MemorySegment seg, short x) {
        _GtkTableRowCol.allocation$VH.set(seg, x);
    }
    public static short allocation$get(MemorySegment seg, long index) {
        return (short)_GtkTableRowCol.allocation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void allocation$set(MemorySegment seg, long index, short x) {
        _GtkTableRowCol.allocation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle spacing$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("spacing"));
    public static VarHandle spacing$VH() {
        return _GtkTableRowCol.spacing$VH;
    }
    public static short spacing$get(MemorySegment seg) {
        return (short)_GtkTableRowCol.spacing$VH.get(seg);
    }
    public static void spacing$set( MemorySegment seg, short x) {
        _GtkTableRowCol.spacing$VH.set(seg, x);
    }
    public static short spacing$get(MemorySegment seg, long index) {
        return (short)_GtkTableRowCol.spacing$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void spacing$set(MemorySegment seg, long index, short x) {
        _GtkTableRowCol.spacing$VH.set(seg.asSlice(index*sizeof()), x);
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


