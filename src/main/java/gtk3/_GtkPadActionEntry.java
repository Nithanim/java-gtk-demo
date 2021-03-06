// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GtkPadActionEntry {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        Constants$root.C_INT$LAYOUT.withName("index"),
        Constants$root.C_INT$LAYOUT.withName("mode"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("label"),
        Constants$root.C_POINTER$LAYOUT.withName("action_name")
    ).withName("_GtkPadActionEntry");
    public static MemoryLayout $LAYOUT() {
        return _GtkPadActionEntry.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return _GtkPadActionEntry.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)_GtkPadActionEntry.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        _GtkPadActionEntry.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)_GtkPadActionEntry.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        _GtkPadActionEntry.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle index$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("index"));
    public static VarHandle index$VH() {
        return _GtkPadActionEntry.index$VH;
    }
    public static int index$get(MemorySegment seg) {
        return (int)_GtkPadActionEntry.index$VH.get(seg);
    }
    public static void index$set( MemorySegment seg, int x) {
        _GtkPadActionEntry.index$VH.set(seg, x);
    }
    public static int index$get(MemorySegment seg, long index) {
        return (int)_GtkPadActionEntry.index$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void index$set(MemorySegment seg, long index, int x) {
        _GtkPadActionEntry.index$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mode"));
    public static VarHandle mode$VH() {
        return _GtkPadActionEntry.mode$VH;
    }
    public static int mode$get(MemorySegment seg) {
        return (int)_GtkPadActionEntry.mode$VH.get(seg);
    }
    public static void mode$set( MemorySegment seg, int x) {
        _GtkPadActionEntry.mode$VH.set(seg, x);
    }
    public static int mode$get(MemorySegment seg, long index) {
        return (int)_GtkPadActionEntry.mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mode$set(MemorySegment seg, long index, int x) {
        _GtkPadActionEntry.mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle label$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("label"));
    public static VarHandle label$VH() {
        return _GtkPadActionEntry.label$VH;
    }
    public static MemoryAddress label$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkPadActionEntry.label$VH.get(seg);
    }
    public static void label$set( MemorySegment seg, MemoryAddress x) {
        _GtkPadActionEntry.label$VH.set(seg, x);
    }
    public static MemoryAddress label$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkPadActionEntry.label$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void label$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkPadActionEntry.label$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle action_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("action_name"));
    public static VarHandle action_name$VH() {
        return _GtkPadActionEntry.action_name$VH;
    }
    public static MemoryAddress action_name$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkPadActionEntry.action_name$VH.get(seg);
    }
    public static void action_name$set( MemorySegment seg, MemoryAddress x) {
        _GtkPadActionEntry.action_name$VH.set(seg, x);
    }
    public static MemoryAddress action_name$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkPadActionEntry.action_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void action_name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkPadActionEntry.action_name$VH.set(seg.asSlice(index*sizeof()), x);
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


