// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GtkHButtonBox {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.structLayout(
                            MemoryLayout.structLayout(
                                Constants$root.C_POINTER$LAYOUT.withName("g_class")
                            ).withName("g_type_instance"),
                            Constants$root.C_INT$LAYOUT.withName("ref_count"),
                            MemoryLayout.paddingLayout(32),
                            Constants$root.C_POINTER$LAYOUT.withName("qdata")
                        ).withName("parent_instance"),
                        Constants$root.C_POINTER$LAYOUT.withName("priv")
                    ).withName("widget"),
                    Constants$root.C_POINTER$LAYOUT.withName("priv")
                ).withName("container"),
                Constants$root.C_POINTER$LAYOUT.withName("priv")
            ).withName("box"),
            Constants$root.C_POINTER$LAYOUT.withName("priv")
        ).withName("button_box")
    ).withName("_GtkHButtonBox");
    public static MemoryLayout $LAYOUT() {
        return _GtkHButtonBox.$struct$LAYOUT;
    }
    public static MemorySegment button_box$slice(MemorySegment seg) {
        return seg.asSlice(0, 56);
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


