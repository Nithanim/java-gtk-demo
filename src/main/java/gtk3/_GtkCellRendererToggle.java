// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GtkCellRendererToggle {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_POINTER$LAYOUT.withName("g_class")
                ).withName("g_type_instance"),
                Constants$root.C_INT$LAYOUT.withName("ref_count"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("qdata")
            ).withName("parent_instance"),
            Constants$root.C_POINTER$LAYOUT.withName("priv")
        ).withName("parent"),
        Constants$root.C_POINTER$LAYOUT.withName("priv")
    ).withName("_GtkCellRendererToggle");
    public static MemoryLayout $LAYOUT() {
        return _GtkCellRendererToggle.$struct$LAYOUT;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    static final VarHandle priv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    public static VarHandle priv$VH() {
        return _GtkCellRendererToggle.priv$VH;
    }
    public static MemoryAddress priv$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkCellRendererToggle.priv$VH.get(seg);
    }
    public static void priv$set( MemorySegment seg, MemoryAddress x) {
        _GtkCellRendererToggle.priv$VH.set(seg, x);
    }
    public static MemoryAddress priv$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkCellRendererToggle.priv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCellRendererToggle.priv$VH.set(seg.asSlice(index*sizeof()), x);
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


