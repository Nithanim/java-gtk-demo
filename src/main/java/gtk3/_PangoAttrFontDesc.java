// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _PangoAttrFontDesc {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("klass"),
            Constants$root.C_INT$LAYOUT.withName("start_index"),
            Constants$root.C_INT$LAYOUT.withName("end_index")
        ).withName("attr"),
        Constants$root.C_POINTER$LAYOUT.withName("desc")
    ).withName("_PangoAttrFontDesc");
    public static MemoryLayout $LAYOUT() {
        return _PangoAttrFontDesc.$struct$LAYOUT;
    }
    public static MemorySegment attr$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle desc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("desc"));
    public static VarHandle desc$VH() {
        return _PangoAttrFontDesc.desc$VH;
    }
    public static MemoryAddress desc$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PangoAttrFontDesc.desc$VH.get(seg);
    }
    public static void desc$set( MemorySegment seg, MemoryAddress x) {
        _PangoAttrFontDesc.desc$VH.set(seg, x);
    }
    public static MemoryAddress desc$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PangoAttrFontDesc.desc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void desc$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoAttrFontDesc.desc$VH.set(seg.asSlice(index*sizeof()), x);
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

