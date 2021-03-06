// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GInetAddressClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("to_string"),
        Constants$root.C_POINTER$LAYOUT.withName("to_bytes")
    ).withName("_GInetAddressClass");
    public static MemoryLayout $LAYOUT() {
        return _GInetAddressClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle to_string$MH = RuntimeHelper.downcallHandle(
        _GInetAddressClass.to_string$FUNC, false
    );
    public interface to_string {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(to_string fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(to_string.class, fi, _GInetAddressClass.to_string$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static to_string ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("to_string::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GInetAddressClass.to_string$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle to_string$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("to_string"));
    public static VarHandle to_string$VH() {
        return _GInetAddressClass.to_string$VH;
    }
    public static MemoryAddress to_string$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GInetAddressClass.to_string$VH.get(seg);
    }
    public static void to_string$set( MemorySegment seg, MemoryAddress x) {
        _GInetAddressClass.to_string$VH.set(seg, x);
    }
    public static MemoryAddress to_string$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GInetAddressClass.to_string$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void to_string$set(MemorySegment seg, long index, MemoryAddress x) {
        _GInetAddressClass.to_string$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static to_string to_string (MemorySegment segment, ResourceScope scope) {
        return to_string.ofAddress(to_string$get(segment), scope);
    }
    static final FunctionDescriptor to_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle to_bytes$MH = RuntimeHelper.downcallHandle(
        _GInetAddressClass.to_bytes$FUNC, false
    );
    public interface to_bytes {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(to_bytes fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(to_bytes.class, fi, _GInetAddressClass.to_bytes$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static to_bytes ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("to_bytes::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GInetAddressClass.to_bytes$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle to_bytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("to_bytes"));
    public static VarHandle to_bytes$VH() {
        return _GInetAddressClass.to_bytes$VH;
    }
    public static MemoryAddress to_bytes$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GInetAddressClass.to_bytes$VH.get(seg);
    }
    public static void to_bytes$set( MemorySegment seg, MemoryAddress x) {
        _GInetAddressClass.to_bytes$VH.set(seg, x);
    }
    public static MemoryAddress to_bytes$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GInetAddressClass.to_bytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void to_bytes$set(MemorySegment seg, long index, MemoryAddress x) {
        _GInetAddressClass.to_bytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static to_bytes to_bytes (MemorySegment segment, ResourceScope scope) {
        return to_bytes.ofAddress(to_bytes$get(segment), scope);
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


