// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GdkEventProperty {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("window"),
        Constants$root.C_CHAR$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(56),
        Constants$root.C_POINTER$LAYOUT.withName("atom"),
        Constants$root.C_INT$LAYOUT.withName("time"),
        Constants$root.C_INT$LAYOUT.withName("state")
    ).withName("_GdkEventProperty");
    public static MemoryLayout $LAYOUT() {
        return _GdkEventProperty.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return _GdkEventProperty.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)_GdkEventProperty.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        _GdkEventProperty.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)_GdkEventProperty.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        _GdkEventProperty.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return _GdkEventProperty.window$VH;
    }
    public static MemoryAddress window$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GdkEventProperty.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, MemoryAddress x) {
        _GdkEventProperty.window$VH.set(seg, x);
    }
    public static MemoryAddress window$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GdkEventProperty.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, MemoryAddress x) {
        _GdkEventProperty.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return _GdkEventProperty.send_event$VH;
    }
    public static byte send_event$get(MemorySegment seg) {
        return (byte)_GdkEventProperty.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, byte x) {
        _GdkEventProperty.send_event$VH.set(seg, x);
    }
    public static byte send_event$get(MemorySegment seg, long index) {
        return (byte)_GdkEventProperty.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, byte x) {
        _GdkEventProperty.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle atom$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("atom"));
    public static VarHandle atom$VH() {
        return _GdkEventProperty.atom$VH;
    }
    public static MemoryAddress atom$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GdkEventProperty.atom$VH.get(seg);
    }
    public static void atom$set( MemorySegment seg, MemoryAddress x) {
        _GdkEventProperty.atom$VH.set(seg, x);
    }
    public static MemoryAddress atom$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GdkEventProperty.atom$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void atom$set(MemorySegment seg, long index, MemoryAddress x) {
        _GdkEventProperty.atom$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return _GdkEventProperty.time$VH;
    }
    public static int time$get(MemorySegment seg) {
        return (int)_GdkEventProperty.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, int x) {
        _GdkEventProperty.time$VH.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)_GdkEventProperty.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        _GdkEventProperty.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle state$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("state"));
    public static VarHandle state$VH() {
        return _GdkEventProperty.state$VH;
    }
    public static int state$get(MemorySegment seg) {
        return (int)_GdkEventProperty.state$VH.get(seg);
    }
    public static void state$set( MemorySegment seg, int x) {
        _GdkEventProperty.state$VH.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)_GdkEventProperty.state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        _GdkEventProperty.state$VH.set(seg.asSlice(index*sizeof()), x);
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


