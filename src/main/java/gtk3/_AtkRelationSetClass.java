// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _AtkRelationSetClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("g_type")
            ).withName("g_type_class"),
            Constants$root.C_POINTER$LAYOUT.withName("construct_properties"),
            Constants$root.C_POINTER$LAYOUT.withName("constructor"),
            Constants$root.C_POINTER$LAYOUT.withName("set_property"),
            Constants$root.C_POINTER$LAYOUT.withName("get_property"),
            Constants$root.C_POINTER$LAYOUT.withName("dispose"),
            Constants$root.C_POINTER$LAYOUT.withName("finalize"),
            Constants$root.C_POINTER$LAYOUT.withName("dispatch_properties_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("notify"),
            Constants$root.C_POINTER$LAYOUT.withName("constructed"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("flags"),
            MemoryLayout.sequenceLayout(6, Constants$root.C_POINTER$LAYOUT).withName("pdummy")
        ).withName("parent"),
        Constants$root.C_POINTER$LAYOUT.withName("pad1"),
        Constants$root.C_POINTER$LAYOUT.withName("pad2")
    ).withName("_AtkRelationSetClass");
    public static MemoryLayout $LAYOUT() {
        return _AtkRelationSetClass.$struct$LAYOUT;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final VarHandle pad1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pad1"));
    public static VarHandle pad1$VH() {
        return _AtkRelationSetClass.pad1$VH;
    }
    public static MemoryAddress pad1$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkRelationSetClass.pad1$VH.get(seg);
    }
    public static void pad1$set( MemorySegment seg, MemoryAddress x) {
        _AtkRelationSetClass.pad1$VH.set(seg, x);
    }
    public static MemoryAddress pad1$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkRelationSetClass.pad1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pad1$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkRelationSetClass.pad1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AtkFunction pad1 (MemorySegment segment, ResourceScope scope) {
        return AtkFunction.ofAddress(pad1$get(segment), scope);
    }
    static final VarHandle pad2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pad2"));
    public static VarHandle pad2$VH() {
        return _AtkRelationSetClass.pad2$VH;
    }
    public static MemoryAddress pad2$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkRelationSetClass.pad2$VH.get(seg);
    }
    public static void pad2$set( MemorySegment seg, MemoryAddress x) {
        _AtkRelationSetClass.pad2$VH.set(seg, x);
    }
    public static MemoryAddress pad2$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkRelationSetClass.pad2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pad2$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkRelationSetClass.pad2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AtkFunction pad2 (MemorySegment segment, ResourceScope scope) {
        return AtkFunction.ofAddress(pad2$get(segment), scope);
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


