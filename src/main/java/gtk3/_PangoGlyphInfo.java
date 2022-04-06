// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _PangoGlyphInfo {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("glyph"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("width"),
            Constants$root.C_INT$LAYOUT.withName("x_offset"),
            Constants$root.C_INT$LAYOUT.withName("y_offset")
        ).withName("geometry"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(1).withName("is_cluster_start"),
                MemoryLayout.paddingLayout(31)
            )
        ).withName("attr")
    ).withName("_PangoGlyphInfo");
    public static MemoryLayout $LAYOUT() {
        return _PangoGlyphInfo.$struct$LAYOUT;
    }
    static final VarHandle glyph$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("glyph"));
    public static VarHandle glyph$VH() {
        return _PangoGlyphInfo.glyph$VH;
    }
    public static int glyph$get(MemorySegment seg) {
        return (int)_PangoGlyphInfo.glyph$VH.get(seg);
    }
    public static void glyph$set( MemorySegment seg, int x) {
        _PangoGlyphInfo.glyph$VH.set(seg, x);
    }
    public static int glyph$get(MemorySegment seg, long index) {
        return (int)_PangoGlyphInfo.glyph$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void glyph$set(MemorySegment seg, long index, int x) {
        _PangoGlyphInfo.glyph$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment geometry$slice(MemorySegment seg) {
        return seg.asSlice(4, 12);
    }
    public static MemorySegment attr$slice(MemorySegment seg) {
        return seg.asSlice(16, 4);
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


