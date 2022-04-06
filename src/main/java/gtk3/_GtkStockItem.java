// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GtkStockItem {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("stock_id"),
        Constants$root.C_POINTER$LAYOUT.withName("label"),
        Constants$root.C_INT$LAYOUT.withName("modifier"),
        Constants$root.C_INT$LAYOUT.withName("keyval"),
        Constants$root.C_POINTER$LAYOUT.withName("translation_domain")
    ).withName("_GtkStockItem");
    public static MemoryLayout $LAYOUT() {
        return _GtkStockItem.$struct$LAYOUT;
    }
    static final VarHandle stock_id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("stock_id"));
    public static VarHandle stock_id$VH() {
        return _GtkStockItem.stock_id$VH;
    }
    public static MemoryAddress stock_id$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkStockItem.stock_id$VH.get(seg);
    }
    public static void stock_id$set( MemorySegment seg, MemoryAddress x) {
        _GtkStockItem.stock_id$VH.set(seg, x);
    }
    public static MemoryAddress stock_id$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkStockItem.stock_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void stock_id$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkStockItem.stock_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle label$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("label"));
    public static VarHandle label$VH() {
        return _GtkStockItem.label$VH;
    }
    public static MemoryAddress label$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkStockItem.label$VH.get(seg);
    }
    public static void label$set( MemorySegment seg, MemoryAddress x) {
        _GtkStockItem.label$VH.set(seg, x);
    }
    public static MemoryAddress label$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkStockItem.label$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void label$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkStockItem.label$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle modifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("modifier"));
    public static VarHandle modifier$VH() {
        return _GtkStockItem.modifier$VH;
    }
    public static int modifier$get(MemorySegment seg) {
        return (int)_GtkStockItem.modifier$VH.get(seg);
    }
    public static void modifier$set( MemorySegment seg, int x) {
        _GtkStockItem.modifier$VH.set(seg, x);
    }
    public static int modifier$get(MemorySegment seg, long index) {
        return (int)_GtkStockItem.modifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void modifier$set(MemorySegment seg, long index, int x) {
        _GtkStockItem.modifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle keyval$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("keyval"));
    public static VarHandle keyval$VH() {
        return _GtkStockItem.keyval$VH;
    }
    public static int keyval$get(MemorySegment seg) {
        return (int)_GtkStockItem.keyval$VH.get(seg);
    }
    public static void keyval$set( MemorySegment seg, int x) {
        _GtkStockItem.keyval$VH.set(seg, x);
    }
    public static int keyval$get(MemorySegment seg, long index) {
        return (int)_GtkStockItem.keyval$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void keyval$set(MemorySegment seg, long index, int x) {
        _GtkStockItem.keyval$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle translation_domain$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("translation_domain"));
    public static VarHandle translation_domain$VH() {
        return _GtkStockItem.translation_domain$VH;
    }
    public static MemoryAddress translation_domain$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkStockItem.translation_domain$VH.get(seg);
    }
    public static void translation_domain$set( MemorySegment seg, MemoryAddress x) {
        _GtkStockItem.translation_domain$VH.set(seg, x);
    }
    public static MemoryAddress translation_domain$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkStockItem.translation_domain$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void translation_domain$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkStockItem.translation_domain$VH.set(seg.asSlice(index*sizeof()), x);
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


