// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GPollFD {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("fd"),
        Constants$root.C_SHORT$LAYOUT.withName("events"),
        Constants$root.C_SHORT$LAYOUT.withName("revents")
    ).withName("_GPollFD");
    public static MemoryLayout $LAYOUT() {
        return _GPollFD.$struct$LAYOUT;
    }
    static final VarHandle fd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fd"));
    public static VarHandle fd$VH() {
        return _GPollFD.fd$VH;
    }
    public static int fd$get(MemorySegment seg) {
        return (int)_GPollFD.fd$VH.get(seg);
    }
    public static void fd$set( MemorySegment seg, int x) {
        _GPollFD.fd$VH.set(seg, x);
    }
    public static int fd$get(MemorySegment seg, long index) {
        return (int)_GPollFD.fd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fd$set(MemorySegment seg, long index, int x) {
        _GPollFD.fd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle events$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("events"));
    public static VarHandle events$VH() {
        return _GPollFD.events$VH;
    }
    public static short events$get(MemorySegment seg) {
        return (short)_GPollFD.events$VH.get(seg);
    }
    public static void events$set( MemorySegment seg, short x) {
        _GPollFD.events$VH.set(seg, x);
    }
    public static short events$get(MemorySegment seg, long index) {
        return (short)_GPollFD.events$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void events$set(MemorySegment seg, long index, short x) {
        _GPollFD.events$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle revents$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("revents"));
    public static VarHandle revents$VH() {
        return _GPollFD.revents$VH;
    }
    public static short revents$get(MemorySegment seg) {
        return (short)_GPollFD.revents$VH.get(seg);
    }
    public static void revents$set( MemorySegment seg, short x) {
        _GPollFD.revents$VH.set(seg, x);
    }
    public static short revents$get(MemorySegment seg, long index) {
        return (short)_GPollFD.revents$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void revents$set(MemorySegment seg, long index, short x) {
        _GPollFD.revents$VH.set(seg.asSlice(index*sizeof()), x);
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


