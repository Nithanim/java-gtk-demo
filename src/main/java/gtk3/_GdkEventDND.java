// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GdkEventDND {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("window"),
        Constants$root.C_CHAR$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(56),
        Constants$root.C_POINTER$LAYOUT.withName("context"),
        Constants$root.C_INT$LAYOUT.withName("time"),
        Constants$root.C_SHORT$LAYOUT.withName("x_root"),
        Constants$root.C_SHORT$LAYOUT.withName("y_root")
    ).withName("_GdkEventDND");
    public static MemoryLayout $LAYOUT() {
        return _GdkEventDND.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return _GdkEventDND.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)_GdkEventDND.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        _GdkEventDND.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)_GdkEventDND.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        _GdkEventDND.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return _GdkEventDND.window$VH;
    }
    public static MemoryAddress window$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GdkEventDND.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, MemoryAddress x) {
        _GdkEventDND.window$VH.set(seg, x);
    }
    public static MemoryAddress window$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GdkEventDND.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, MemoryAddress x) {
        _GdkEventDND.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return _GdkEventDND.send_event$VH;
    }
    public static byte send_event$get(MemorySegment seg) {
        return (byte)_GdkEventDND.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, byte x) {
        _GdkEventDND.send_event$VH.set(seg, x);
    }
    public static byte send_event$get(MemorySegment seg, long index) {
        return (byte)_GdkEventDND.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, byte x) {
        _GdkEventDND.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle context$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("context"));
    public static VarHandle context$VH() {
        return _GdkEventDND.context$VH;
    }
    public static MemoryAddress context$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GdkEventDND.context$VH.get(seg);
    }
    public static void context$set( MemorySegment seg, MemoryAddress x) {
        _GdkEventDND.context$VH.set(seg, x);
    }
    public static MemoryAddress context$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GdkEventDND.context$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void context$set(MemorySegment seg, long index, MemoryAddress x) {
        _GdkEventDND.context$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return _GdkEventDND.time$VH;
    }
    public static int time$get(MemorySegment seg) {
        return (int)_GdkEventDND.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, int x) {
        _GdkEventDND.time$VH.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)_GdkEventDND.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        _GdkEventDND.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x_root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x_root"));
    public static VarHandle x_root$VH() {
        return _GdkEventDND.x_root$VH;
    }
    public static short x_root$get(MemorySegment seg) {
        return (short)_GdkEventDND.x_root$VH.get(seg);
    }
    public static void x_root$set( MemorySegment seg, short x) {
        _GdkEventDND.x_root$VH.set(seg, x);
    }
    public static short x_root$get(MemorySegment seg, long index) {
        return (short)_GdkEventDND.x_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x_root$set(MemorySegment seg, long index, short x) {
        _GdkEventDND.x_root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y_root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y_root"));
    public static VarHandle y_root$VH() {
        return _GdkEventDND.y_root$VH;
    }
    public static short y_root$get(MemorySegment seg) {
        return (short)_GdkEventDND.y_root$VH.get(seg);
    }
    public static void y_root$set( MemorySegment seg, short x) {
        _GdkEventDND.y_root$VH.set(seg, x);
    }
    public static short y_root$get(MemorySegment seg, long index) {
        return (short)_GdkEventDND.y_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y_root$set(MemorySegment seg, long index, short x) {
        _GdkEventDND.y_root$VH.set(seg.asSlice(index*sizeof()), x);
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

