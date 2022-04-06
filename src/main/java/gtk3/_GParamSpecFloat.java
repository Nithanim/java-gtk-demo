// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GParamSpecFloat {

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
        Constants$root.C_FLOAT$LAYOUT.withName("minimum"),
        Constants$root.C_FLOAT$LAYOUT.withName("maximum"),
        Constants$root.C_FLOAT$LAYOUT.withName("default_value"),
        Constants$root.C_FLOAT$LAYOUT.withName("epsilon")
    ).withName("_GParamSpecFloat");
    public static MemoryLayout $LAYOUT() {
        return _GParamSpecFloat.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    static final VarHandle minimum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("minimum"));
    public static VarHandle minimum$VH() {
        return _GParamSpecFloat.minimum$VH;
    }
    public static float minimum$get(MemorySegment seg) {
        return (float)_GParamSpecFloat.minimum$VH.get(seg);
    }
    public static void minimum$set( MemorySegment seg, float x) {
        _GParamSpecFloat.minimum$VH.set(seg, x);
    }
    public static float minimum$get(MemorySegment seg, long index) {
        return (float)_GParamSpecFloat.minimum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void minimum$set(MemorySegment seg, long index, float x) {
        _GParamSpecFloat.minimum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle maximum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("maximum"));
    public static VarHandle maximum$VH() {
        return _GParamSpecFloat.maximum$VH;
    }
    public static float maximum$get(MemorySegment seg) {
        return (float)_GParamSpecFloat.maximum$VH.get(seg);
    }
    public static void maximum$set( MemorySegment seg, float x) {
        _GParamSpecFloat.maximum$VH.set(seg, x);
    }
    public static float maximum$get(MemorySegment seg, long index) {
        return (float)_GParamSpecFloat.maximum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void maximum$set(MemorySegment seg, long index, float x) {
        _GParamSpecFloat.maximum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle default_value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("default_value"));
    public static VarHandle default_value$VH() {
        return _GParamSpecFloat.default_value$VH;
    }
    public static float default_value$get(MemorySegment seg) {
        return (float)_GParamSpecFloat.default_value$VH.get(seg);
    }
    public static void default_value$set( MemorySegment seg, float x) {
        _GParamSpecFloat.default_value$VH.set(seg, x);
    }
    public static float default_value$get(MemorySegment seg, long index) {
        return (float)_GParamSpecFloat.default_value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void default_value$set(MemorySegment seg, long index, float x) {
        _GParamSpecFloat.default_value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle epsilon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("epsilon"));
    public static VarHandle epsilon$VH() {
        return _GParamSpecFloat.epsilon$VH;
    }
    public static float epsilon$get(MemorySegment seg) {
        return (float)_GParamSpecFloat.epsilon$VH.get(seg);
    }
    public static void epsilon$set( MemorySegment seg, float x) {
        _GParamSpecFloat.epsilon$VH.set(seg, x);
    }
    public static float epsilon$get(MemorySegment seg, long index) {
        return (float)_GParamSpecFloat.epsilon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void epsilon$set(MemorySegment seg, long index, float x) {
        _GParamSpecFloat.epsilon$VH.set(seg.asSlice(index*sizeof()), x);
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

