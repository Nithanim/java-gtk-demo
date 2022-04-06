// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _hb_var_int_t {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        Constants$root.C_INT$LAYOUT.withName("u32"),
        Constants$root.C_INT$LAYOUT.withName("i32"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("u16"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_SHORT$LAYOUT).withName("i16"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("u8"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("i8")
    ).withName("_hb_var_int_t");
    public static MemoryLayout $LAYOUT() {
        return _hb_var_int_t.$union$LAYOUT;
    }
    static final VarHandle u32$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("u32"));
    public static VarHandle u32$VH() {
        return _hb_var_int_t.u32$VH;
    }
    public static int u32$get(MemorySegment seg) {
        return (int)_hb_var_int_t.u32$VH.get(seg);
    }
    public static void u32$set( MemorySegment seg, int x) {
        _hb_var_int_t.u32$VH.set(seg, x);
    }
    public static int u32$get(MemorySegment seg, long index) {
        return (int)_hb_var_int_t.u32$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void u32$set(MemorySegment seg, long index, int x) {
        _hb_var_int_t.u32$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle i32$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("i32"));
    public static VarHandle i32$VH() {
        return _hb_var_int_t.i32$VH;
    }
    public static int i32$get(MemorySegment seg) {
        return (int)_hb_var_int_t.i32$VH.get(seg);
    }
    public static void i32$set( MemorySegment seg, int x) {
        _hb_var_int_t.i32$VH.set(seg, x);
    }
    public static int i32$get(MemorySegment seg, long index) {
        return (int)_hb_var_int_t.i32$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void i32$set(MemorySegment seg, long index, int x) {
        _hb_var_int_t.i32$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment u16$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static MemorySegment i16$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static MemorySegment u8$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static MemorySegment i8$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
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


