// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GSocketAddressEnumeratorClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("next"),
        Constants$root.C_POINTER$LAYOUT.withName("next_async"),
        Constants$root.C_POINTER$LAYOUT.withName("next_finish")
    ).withName("_GSocketAddressEnumeratorClass");
    public static MemoryLayout $LAYOUT() {
        return _GSocketAddressEnumeratorClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor next$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle next$MH = RuntimeHelper.downcallHandle(
        _GSocketAddressEnumeratorClass.next$FUNC, false
    );
    public interface next {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2);
        static NativeSymbol allocate(next fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(next.class, fi, _GSocketAddressEnumeratorClass.next$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static next ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("next::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, (jdk.incubator.foreign.Addressable)_x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next"));
    public static VarHandle next$VH() {
        return _GSocketAddressEnumeratorClass.next$VH;
    }
    public static MemoryAddress next$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next$VH.get(seg);
    }
    public static void next$set( MemorySegment seg, MemoryAddress x) {
        _GSocketAddressEnumeratorClass.next$VH.set(seg, x);
    }
    public static MemoryAddress next$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketAddressEnumeratorClass.next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static next next (MemorySegment segment, ResourceScope scope) {
        return next.ofAddress(next$get(segment), scope);
    }
    static final FunctionDescriptor next_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle next_async$MH = RuntimeHelper.downcallHandle(
        _GSocketAddressEnumeratorClass.next_async$FUNC, false
    );
    public interface next_async {

        void apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2, jdk.incubator.foreign.MemoryAddress _x3);
        static NativeSymbol allocate(next_async fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(next_async.class, fi, _GSocketAddressEnumeratorClass.next_async$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static next_async ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("next_async::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2, jdk.incubator.foreign.MemoryAddress _x3) -> {
                try {
                    _GSocketAddressEnumeratorClass.next_async$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, (jdk.incubator.foreign.Addressable)_x2, (jdk.incubator.foreign.Addressable)_x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle next_async$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next_async"));
    public static VarHandle next_async$VH() {
        return _GSocketAddressEnumeratorClass.next_async$VH;
    }
    public static MemoryAddress next_async$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next_async$VH.get(seg);
    }
    public static void next_async$set( MemorySegment seg, MemoryAddress x) {
        _GSocketAddressEnumeratorClass.next_async$VH.set(seg, x);
    }
    public static MemoryAddress next_async$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next_async$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next_async$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketAddressEnumeratorClass.next_async$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static next_async next_async (MemorySegment segment, ResourceScope scope) {
        return next_async.ofAddress(next_async$get(segment), scope);
    }
    static final FunctionDescriptor next_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle next_finish$MH = RuntimeHelper.downcallHandle(
        _GSocketAddressEnumeratorClass.next_finish$FUNC, false
    );
    public interface next_finish {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2);
        static NativeSymbol allocate(next_finish fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(next_finish.class, fi, _GSocketAddressEnumeratorClass.next_finish$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static next_finish ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("next_finish::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next_finish$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, (jdk.incubator.foreign.Addressable)_x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle next_finish$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next_finish"));
    public static VarHandle next_finish$VH() {
        return _GSocketAddressEnumeratorClass.next_finish$VH;
    }
    public static MemoryAddress next_finish$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next_finish$VH.get(seg);
    }
    public static void next_finish$set( MemorySegment seg, MemoryAddress x) {
        _GSocketAddressEnumeratorClass.next_finish$VH.set(seg, x);
    }
    public static MemoryAddress next_finish$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GSocketAddressEnumeratorClass.next_finish$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next_finish$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSocketAddressEnumeratorClass.next_finish$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static next_finish next_finish (MemorySegment segment, ResourceScope scope) {
        return next_finish.ofAddress(next_finish$get(segment), scope);
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

