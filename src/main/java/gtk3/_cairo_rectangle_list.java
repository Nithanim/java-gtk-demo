// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _cairo_rectangle_list {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("status"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rectangles"),
        Constants$root.C_INT$LAYOUT.withName("num_rectangles"),
        MemoryLayout.paddingLayout(32)
    ).withName("_cairo_rectangle_list");
    public static MemoryLayout $LAYOUT() {
        return _cairo_rectangle_list.$struct$LAYOUT;
    }
    static final VarHandle status$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("status"));
    public static VarHandle status$VH() {
        return _cairo_rectangle_list.status$VH;
    }
    public static int status$get(MemorySegment seg) {
        return (int)_cairo_rectangle_list.status$VH.get(seg);
    }
    public static void status$set( MemorySegment seg, int x) {
        _cairo_rectangle_list.status$VH.set(seg, x);
    }
    public static int status$get(MemorySegment seg, long index) {
        return (int)_cairo_rectangle_list.status$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void status$set(MemorySegment seg, long index, int x) {
        _cairo_rectangle_list.status$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rectangles$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rectangles"));
    public static VarHandle rectangles$VH() {
        return _cairo_rectangle_list.rectangles$VH;
    }
    public static MemoryAddress rectangles$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_cairo_rectangle_list.rectangles$VH.get(seg);
    }
    public static void rectangles$set( MemorySegment seg, MemoryAddress x) {
        _cairo_rectangle_list.rectangles$VH.set(seg, x);
    }
    public static MemoryAddress rectangles$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_cairo_rectangle_list.rectangles$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rectangles$set(MemorySegment seg, long index, MemoryAddress x) {
        _cairo_rectangle_list.rectangles$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle num_rectangles$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("num_rectangles"));
    public static VarHandle num_rectangles$VH() {
        return _cairo_rectangle_list.num_rectangles$VH;
    }
    public static int num_rectangles$get(MemorySegment seg) {
        return (int)_cairo_rectangle_list.num_rectangles$VH.get(seg);
    }
    public static void num_rectangles$set( MemorySegment seg, int x) {
        _cairo_rectangle_list.num_rectangles$VH.set(seg, x);
    }
    public static int num_rectangles$get(MemorySegment seg, long index) {
        return (int)_cairo_rectangle_list.num_rectangles$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void num_rectangles$set(MemorySegment seg, long index, int x) {
        _cairo_rectangle_list.num_rectangles$VH.set(seg.asSlice(index*sizeof()), x);
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


