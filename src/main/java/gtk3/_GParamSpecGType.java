// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GParamSpecGType {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("g_class")
            ).withName("g_type_instance"),
            Constants$root.C_POINTER$LAYOUT.withName("name"),
            Constants$root.C_INT$LAYOUT.withName("flags"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_LONG_LONG$LAYOUT.withName("value_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("owner_type"),
            Constants$root.C_POINTER$LAYOUT.withName("_nick"),
            Constants$root.C_POINTER$LAYOUT.withName("_blurb"),
            Constants$root.C_POINTER$LAYOUT.withName("qdata"),
            Constants$root.C_INT$LAYOUT.withName("ref_count"),
            Constants$root.C_INT$LAYOUT.withName("param_id")
        ).withName("parent_instance"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("is_a_type")
    ).withName("_GParamSpecGType");
    public static MemoryLayout $LAYOUT() {
        return _GParamSpecGType.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    static final VarHandle is_a_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_a_type"));
    public static VarHandle is_a_type$VH() {
        return _GParamSpecGType.is_a_type$VH;
    }
    public static long is_a_type$get(MemorySegment seg) {
        return (long)_GParamSpecGType.is_a_type$VH.get(seg);
    }
    public static void is_a_type$set( MemorySegment seg, long x) {
        _GParamSpecGType.is_a_type$VH.set(seg, x);
    }
    public static long is_a_type$get(MemorySegment seg, long index) {
        return (long)_GParamSpecGType.is_a_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_a_type$set(MemorySegment seg, long index, long x) {
        _GParamSpecGType.is_a_type$VH.set(seg.asSlice(index*sizeof()), x);
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


