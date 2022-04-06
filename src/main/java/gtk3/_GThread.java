// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GThread {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("func"),
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_INT$LAYOUT.withName("joinable"),
        Constants$root.C_INT$LAYOUT.withName("priority")
    ).withName("_GThread");
    public static MemoryLayout $LAYOUT() {
        return _GThread.$struct$LAYOUT;
    }
    static final VarHandle func$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("func"));
    public static VarHandle func$VH() {
        return _GThread.func$VH;
    }
    public static MemoryAddress func$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GThread.func$VH.get(seg);
    }
    public static void func$set( MemorySegment seg, MemoryAddress x) {
        _GThread.func$VH.set(seg, x);
    }
    public static MemoryAddress func$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GThread.func$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void func$set(MemorySegment seg, long index, MemoryAddress x) {
        _GThread.func$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GThreadFunc func (MemorySegment segment, ResourceScope scope) {
        return GThreadFunc.ofAddress(func$get(segment), scope);
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return _GThread.data$VH;
    }
    public static MemoryAddress data$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GThread.data$VH.get(seg);
    }
    public static void data$set( MemorySegment seg, MemoryAddress x) {
        _GThread.data$VH.set(seg, x);
    }
    public static MemoryAddress data$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GThread.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemoryAddress x) {
        _GThread.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle joinable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("joinable"));
    public static VarHandle joinable$VH() {
        return _GThread.joinable$VH;
    }
    public static int joinable$get(MemorySegment seg) {
        return (int)_GThread.joinable$VH.get(seg);
    }
    public static void joinable$set( MemorySegment seg, int x) {
        _GThread.joinable$VH.set(seg, x);
    }
    public static int joinable$get(MemorySegment seg, long index) {
        return (int)_GThread.joinable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void joinable$set(MemorySegment seg, long index, int x) {
        _GThread.joinable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle priority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priority"));
    public static VarHandle priority$VH() {
        return _GThread.priority$VH;
    }
    public static int priority$get(MemorySegment seg) {
        return (int)_GThread.priority$VH.get(seg);
    }
    public static void priority$set( MemorySegment seg, int x) {
        _GThread.priority$VH.set(seg, x);
    }
    public static int priority$get(MemorySegment seg, long index) {
        return (int)_GThread.priority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void priority$set(MemorySegment seg, long index, int x) {
        _GThread.priority$VH.set(seg.asSlice(index*sizeof()), x);
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


