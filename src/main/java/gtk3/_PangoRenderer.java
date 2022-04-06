// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _PangoRenderer {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("g_class")
            ).withName("g_type_instance"),
            Constants$root.C_INT$LAYOUT.withName("ref_count"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("qdata")
        ).withName("parent_instance"),
        Constants$root.C_INT$LAYOUT.withName("underline"),
        Constants$root.C_INT$LAYOUT.withName("strikethrough"),
        Constants$root.C_INT$LAYOUT.withName("active_count"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("matrix"),
        Constants$root.C_POINTER$LAYOUT.withName("priv")
    ).withName("_PangoRenderer");
    public static MemoryLayout $LAYOUT() {
        return _PangoRenderer.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    static final VarHandle underline$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("underline"));
    public static VarHandle underline$VH() {
        return _PangoRenderer.underline$VH;
    }
    public static int underline$get(MemorySegment seg) {
        return (int)_PangoRenderer.underline$VH.get(seg);
    }
    public static void underline$set( MemorySegment seg, int x) {
        _PangoRenderer.underline$VH.set(seg, x);
    }
    public static int underline$get(MemorySegment seg, long index) {
        return (int)_PangoRenderer.underline$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void underline$set(MemorySegment seg, long index, int x) {
        _PangoRenderer.underline$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle strikethrough$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("strikethrough"));
    public static VarHandle strikethrough$VH() {
        return _PangoRenderer.strikethrough$VH;
    }
    public static int strikethrough$get(MemorySegment seg) {
        return (int)_PangoRenderer.strikethrough$VH.get(seg);
    }
    public static void strikethrough$set( MemorySegment seg, int x) {
        _PangoRenderer.strikethrough$VH.set(seg, x);
    }
    public static int strikethrough$get(MemorySegment seg, long index) {
        return (int)_PangoRenderer.strikethrough$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void strikethrough$set(MemorySegment seg, long index, int x) {
        _PangoRenderer.strikethrough$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle active_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("active_count"));
    public static VarHandle active_count$VH() {
        return _PangoRenderer.active_count$VH;
    }
    public static int active_count$get(MemorySegment seg) {
        return (int)_PangoRenderer.active_count$VH.get(seg);
    }
    public static void active_count$set( MemorySegment seg, int x) {
        _PangoRenderer.active_count$VH.set(seg, x);
    }
    public static int active_count$get(MemorySegment seg, long index) {
        return (int)_PangoRenderer.active_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void active_count$set(MemorySegment seg, long index, int x) {
        _PangoRenderer.active_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle matrix$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("matrix"));
    public static VarHandle matrix$VH() {
        return _PangoRenderer.matrix$VH;
    }
    public static MemoryAddress matrix$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PangoRenderer.matrix$VH.get(seg);
    }
    public static void matrix$set( MemorySegment seg, MemoryAddress x) {
        _PangoRenderer.matrix$VH.set(seg, x);
    }
    public static MemoryAddress matrix$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PangoRenderer.matrix$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void matrix$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoRenderer.matrix$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle priv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    public static VarHandle priv$VH() {
        return _PangoRenderer.priv$VH;
    }
    public static MemoryAddress priv$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PangoRenderer.priv$VH.get(seg);
    }
    public static void priv$set( MemorySegment seg, MemoryAddress x) {
        _PangoRenderer.priv$VH.set(seg, x);
    }
    public static MemoryAddress priv$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PangoRenderer.priv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoRenderer.priv$VH.set(seg.asSlice(index*sizeof()), x);
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


