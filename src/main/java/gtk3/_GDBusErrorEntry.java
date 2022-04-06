// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GDBusErrorEntry {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("error_code"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("dbus_error_name")
    ).withName("_GDBusErrorEntry");
    public static MemoryLayout $LAYOUT() {
        return _GDBusErrorEntry.$struct$LAYOUT;
    }
    static final VarHandle error_code$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("error_code"));
    public static VarHandle error_code$VH() {
        return _GDBusErrorEntry.error_code$VH;
    }
    public static int error_code$get(MemorySegment seg) {
        return (int)_GDBusErrorEntry.error_code$VH.get(seg);
    }
    public static void error_code$set( MemorySegment seg, int x) {
        _GDBusErrorEntry.error_code$VH.set(seg, x);
    }
    public static int error_code$get(MemorySegment seg, long index) {
        return (int)_GDBusErrorEntry.error_code$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void error_code$set(MemorySegment seg, long index, int x) {
        _GDBusErrorEntry.error_code$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dbus_error_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dbus_error_name"));
    public static VarHandle dbus_error_name$VH() {
        return _GDBusErrorEntry.dbus_error_name$VH;
    }
    public static MemoryAddress dbus_error_name$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GDBusErrorEntry.dbus_error_name$VH.get(seg);
    }
    public static void dbus_error_name$set( MemorySegment seg, MemoryAddress x) {
        _GDBusErrorEntry.dbus_error_name$VH.set(seg, x);
    }
    public static MemoryAddress dbus_error_name$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GDBusErrorEntry.dbus_error_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dbus_error_name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusErrorEntry.dbus_error_name$VH.set(seg.asSlice(index*sizeof()), x);
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


