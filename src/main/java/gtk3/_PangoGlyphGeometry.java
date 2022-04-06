// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _PangoGlyphGeometry {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("width"),
        Constants$root.C_INT$LAYOUT.withName("x_offset"),
        Constants$root.C_INT$LAYOUT.withName("y_offset")
    ).withName("_PangoGlyphGeometry");
    public static MemoryLayout $LAYOUT() {
        return _PangoGlyphGeometry.$struct$LAYOUT;
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return _PangoGlyphGeometry.width$VH;
    }
    public static int width$get(MemorySegment seg) {
        return (int)_PangoGlyphGeometry.width$VH.get(seg);
    }
    public static void width$set( MemorySegment seg, int x) {
        _PangoGlyphGeometry.width$VH.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)_PangoGlyphGeometry.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        _PangoGlyphGeometry.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x_offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x_offset"));
    public static VarHandle x_offset$VH() {
        return _PangoGlyphGeometry.x_offset$VH;
    }
    public static int x_offset$get(MemorySegment seg) {
        return (int)_PangoGlyphGeometry.x_offset$VH.get(seg);
    }
    public static void x_offset$set( MemorySegment seg, int x) {
        _PangoGlyphGeometry.x_offset$VH.set(seg, x);
    }
    public static int x_offset$get(MemorySegment seg, long index) {
        return (int)_PangoGlyphGeometry.x_offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x_offset$set(MemorySegment seg, long index, int x) {
        _PangoGlyphGeometry.x_offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y_offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y_offset"));
    public static VarHandle y_offset$VH() {
        return _PangoGlyphGeometry.y_offset$VH;
    }
    public static int y_offset$get(MemorySegment seg) {
        return (int)_PangoGlyphGeometry.y_offset$VH.get(seg);
    }
    public static void y_offset$set( MemorySegment seg, int x) {
        _PangoGlyphGeometry.y_offset$VH.set(seg, x);
    }
    public static int y_offset$get(MemorySegment seg, long index) {
        return (int)_PangoGlyphGeometry.y_offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y_offset$set(MemorySegment seg, long index, int x) {
        _PangoGlyphGeometry.y_offset$VH.set(seg.asSlice(index*sizeof()), x);
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


