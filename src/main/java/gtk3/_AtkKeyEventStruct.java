// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _AtkKeyEventStruct {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        Constants$root.C_INT$LAYOUT.withName("state"),
        Constants$root.C_INT$LAYOUT.withName("keyval"),
        Constants$root.C_INT$LAYOUT.withName("length"),
        Constants$root.C_POINTER$LAYOUT.withName("string"),
        Constants$root.C_SHORT$LAYOUT.withName("keycode"),
        MemoryLayout.paddingLayout(16),
        Constants$root.C_INT$LAYOUT.withName("timestamp")
    ).withName("_AtkKeyEventStruct");
    public static MemoryLayout $LAYOUT() {
        return _AtkKeyEventStruct.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return _AtkKeyEventStruct.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)_AtkKeyEventStruct.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        _AtkKeyEventStruct.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)_AtkKeyEventStruct.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        _AtkKeyEventStruct.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle state$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("state"));
    public static VarHandle state$VH() {
        return _AtkKeyEventStruct.state$VH;
    }
    public static int state$get(MemorySegment seg) {
        return (int)_AtkKeyEventStruct.state$VH.get(seg);
    }
    public static void state$set( MemorySegment seg, int x) {
        _AtkKeyEventStruct.state$VH.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)_AtkKeyEventStruct.state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        _AtkKeyEventStruct.state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle keyval$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("keyval"));
    public static VarHandle keyval$VH() {
        return _AtkKeyEventStruct.keyval$VH;
    }
    public static int keyval$get(MemorySegment seg) {
        return (int)_AtkKeyEventStruct.keyval$VH.get(seg);
    }
    public static void keyval$set( MemorySegment seg, int x) {
        _AtkKeyEventStruct.keyval$VH.set(seg, x);
    }
    public static int keyval$get(MemorySegment seg, long index) {
        return (int)_AtkKeyEventStruct.keyval$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void keyval$set(MemorySegment seg, long index, int x) {
        _AtkKeyEventStruct.keyval$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("length"));
    public static VarHandle length$VH() {
        return _AtkKeyEventStruct.length$VH;
    }
    public static int length$get(MemorySegment seg) {
        return (int)_AtkKeyEventStruct.length$VH.get(seg);
    }
    public static void length$set( MemorySegment seg, int x) {
        _AtkKeyEventStruct.length$VH.set(seg, x);
    }
    public static int length$get(MemorySegment seg, long index) {
        return (int)_AtkKeyEventStruct.length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, int x) {
        _AtkKeyEventStruct.length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle string$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("string"));
    public static VarHandle string$VH() {
        return _AtkKeyEventStruct.string$VH;
    }
    public static MemoryAddress string$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkKeyEventStruct.string$VH.get(seg);
    }
    public static void string$set( MemorySegment seg, MemoryAddress x) {
        _AtkKeyEventStruct.string$VH.set(seg, x);
    }
    public static MemoryAddress string$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkKeyEventStruct.string$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void string$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkKeyEventStruct.string$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle keycode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("keycode"));
    public static VarHandle keycode$VH() {
        return _AtkKeyEventStruct.keycode$VH;
    }
    public static short keycode$get(MemorySegment seg) {
        return (short)_AtkKeyEventStruct.keycode$VH.get(seg);
    }
    public static void keycode$set( MemorySegment seg, short x) {
        _AtkKeyEventStruct.keycode$VH.set(seg, x);
    }
    public static short keycode$get(MemorySegment seg, long index) {
        return (short)_AtkKeyEventStruct.keycode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void keycode$set(MemorySegment seg, long index, short x) {
        _AtkKeyEventStruct.keycode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle timestamp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("timestamp"));
    public static VarHandle timestamp$VH() {
        return _AtkKeyEventStruct.timestamp$VH;
    }
    public static int timestamp$get(MemorySegment seg) {
        return (int)_AtkKeyEventStruct.timestamp$VH.get(seg);
    }
    public static void timestamp$set( MemorySegment seg, int x) {
        _AtkKeyEventStruct.timestamp$VH.set(seg, x);
    }
    public static int timestamp$get(MemorySegment seg, long index) {
        return (int)_AtkKeyEventStruct.timestamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void timestamp$set(MemorySegment seg, long index, int x) {
        _AtkKeyEventStruct.timestamp$VH.set(seg.asSlice(index*sizeof()), x);
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


