// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GtkFixedChild {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("widget"),
        Constants$root.C_INT$LAYOUT.withName("x"),
        Constants$root.C_INT$LAYOUT.withName("y")
    ).withName("_GtkFixedChild");
    public static MemoryLayout $LAYOUT() {
        return _GtkFixedChild.$struct$LAYOUT;
    }
    static final VarHandle widget$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("widget"));
    public static VarHandle widget$VH() {
        return _GtkFixedChild.widget$VH;
    }
    public static MemoryAddress widget$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkFixedChild.widget$VH.get(seg);
    }
    public static void widget$set( MemorySegment seg, MemoryAddress x) {
        _GtkFixedChild.widget$VH.set(seg, x);
    }
    public static MemoryAddress widget$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkFixedChild.widget$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void widget$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkFixedChild.widget$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return _GtkFixedChild.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)_GtkFixedChild.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        _GtkFixedChild.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)_GtkFixedChild.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        _GtkFixedChild.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return _GtkFixedChild.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)_GtkFixedChild.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        _GtkFixedChild.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)_GtkFixedChild.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        _GtkFixedChild.y$VH.set(seg.asSlice(index*sizeof()), x);
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

