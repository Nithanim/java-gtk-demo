// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GMenuAttributeIterClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("g_type")
            ).withName("g_type_class"),
            Constants$root.C_POINTER$LAYOUT.withName("construct_properties"),
            Constants$root.C_POINTER$LAYOUT.withName("constructor"),
            Constants$root.C_POINTER$LAYOUT.withName("set_property"),
            Constants$root.C_POINTER$LAYOUT.withName("get_property"),
            Constants$root.C_POINTER$LAYOUT.withName("dispose"),
            Constants$root.C_POINTER$LAYOUT.withName("finalize"),
            Constants$root.C_POINTER$LAYOUT.withName("dispatch_properties_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("notify"),
            Constants$root.C_POINTER$LAYOUT.withName("constructed"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("flags"),
            MemoryLayout.sequenceLayout(6, Constants$root.C_POINTER$LAYOUT).withName("pdummy")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("get_next")
    ).withName("_GMenuAttributeIterClass");
    public static MemoryLayout $LAYOUT() {
        return _GMenuAttributeIterClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor get_next$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_next$MH = RuntimeHelper.downcallHandle(
        _GMenuAttributeIterClass.get_next$FUNC, false
    );
    public interface get_next {

        int apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2);
        static NativeSymbol allocate(get_next fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_next.class, fi, _GMenuAttributeIterClass.get_next$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static get_next ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_next::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2) -> {
                try {
                    return (int)_GMenuAttributeIterClass.get_next$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, (jdk.incubator.foreign.Addressable)_x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_next"));
    public static VarHandle get_next$VH() {
        return _GMenuAttributeIterClass.get_next$VH;
    }
    public static MemoryAddress get_next$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GMenuAttributeIterClass.get_next$VH.get(seg);
    }
    public static void get_next$set( MemorySegment seg, MemoryAddress x) {
        _GMenuAttributeIterClass.get_next$VH.set(seg, x);
    }
    public static MemoryAddress get_next$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GMenuAttributeIterClass.get_next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_next$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMenuAttributeIterClass.get_next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_next get_next (MemorySegment segment, ResourceScope scope) {
        return get_next.ofAddress(get_next$get(segment), scope);
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


