// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _xsave_hdr {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("xstate_bv"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_LONG_LONG$LAYOUT).withName("__glibc_reserved1"),
        MemoryLayout.sequenceLayout(5, Constants$root.C_LONG_LONG$LAYOUT).withName("__glibc_reserved2")
    ).withName("_xsave_hdr");
    public static MemoryLayout $LAYOUT() {
        return _xsave_hdr.$struct$LAYOUT;
    }
    static final VarHandle xstate_bv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xstate_bv"));
    public static VarHandle xstate_bv$VH() {
        return _xsave_hdr.xstate_bv$VH;
    }
    public static long xstate_bv$get(MemorySegment seg) {
        return (long)_xsave_hdr.xstate_bv$VH.get(seg);
    }
    public static void xstate_bv$set( MemorySegment seg, long x) {
        _xsave_hdr.xstate_bv$VH.set(seg, x);
    }
    public static long xstate_bv$get(MemorySegment seg, long index) {
        return (long)_xsave_hdr.xstate_bv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xstate_bv$set(MemorySegment seg, long index, long x) {
        _xsave_hdr.xstate_bv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __glibc_reserved1$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static MemorySegment __glibc_reserved2$slice(MemorySegment seg) {
        return seg.asSlice(24, 40);
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


