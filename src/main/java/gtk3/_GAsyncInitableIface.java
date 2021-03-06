// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GAsyncInitableIface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("init_async"),
        Constants$root.C_POINTER$LAYOUT.withName("init_finish")
    ).withName("_GAsyncInitableIface");
    public static MemoryLayout $LAYOUT() {
        return _GAsyncInitableIface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor init_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle init_async$MH = RuntimeHelper.downcallHandle(
        _GAsyncInitableIface.init_async$FUNC, false
    );
    public interface init_async {

        void apply(jdk.incubator.foreign.MemoryAddress _x0, int _x1, jdk.incubator.foreign.MemoryAddress _x2, jdk.incubator.foreign.MemoryAddress _x3, jdk.incubator.foreign.MemoryAddress _x4);
        static NativeSymbol allocate(init_async fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(init_async.class, fi, _GAsyncInitableIface.init_async$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static init_async ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("init_async::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, int _x1, jdk.incubator.foreign.MemoryAddress _x2, jdk.incubator.foreign.MemoryAddress _x3, jdk.incubator.foreign.MemoryAddress _x4) -> {
                try {
                    _GAsyncInitableIface.init_async$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, _x1, (jdk.incubator.foreign.Addressable)_x2, (jdk.incubator.foreign.Addressable)_x3, (jdk.incubator.foreign.Addressable)_x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle init_async$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("init_async"));
    public static VarHandle init_async$VH() {
        return _GAsyncInitableIface.init_async$VH;
    }
    public static MemoryAddress init_async$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GAsyncInitableIface.init_async$VH.get(seg);
    }
    public static void init_async$set( MemorySegment seg, MemoryAddress x) {
        _GAsyncInitableIface.init_async$VH.set(seg, x);
    }
    public static MemoryAddress init_async$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GAsyncInitableIface.init_async$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void init_async$set(MemorySegment seg, long index, MemoryAddress x) {
        _GAsyncInitableIface.init_async$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static init_async init_async (MemorySegment segment, ResourceScope scope) {
        return init_async.ofAddress(init_async$get(segment), scope);
    }
    static final FunctionDescriptor init_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle init_finish$MH = RuntimeHelper.downcallHandle(
        _GAsyncInitableIface.init_finish$FUNC, false
    );
    public interface init_finish {

        int apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2);
        static NativeSymbol allocate(init_finish fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(init_finish.class, fi, _GAsyncInitableIface.init_finish$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static init_finish ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("init_finish::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2) -> {
                try {
                    return (int)_GAsyncInitableIface.init_finish$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, (jdk.incubator.foreign.Addressable)_x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle init_finish$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("init_finish"));
    public static VarHandle init_finish$VH() {
        return _GAsyncInitableIface.init_finish$VH;
    }
    public static MemoryAddress init_finish$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GAsyncInitableIface.init_finish$VH.get(seg);
    }
    public static void init_finish$set( MemorySegment seg, MemoryAddress x) {
        _GAsyncInitableIface.init_finish$VH.set(seg, x);
    }
    public static MemoryAddress init_finish$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GAsyncInitableIface.init_finish$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void init_finish$set(MemorySegment seg, long index, MemoryAddress x) {
        _GAsyncInitableIface.init_finish$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static init_finish init_finish (MemorySegment segment, ResourceScope scope) {
        return init_finish.ofAddress(init_finish$get(segment), scope);
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


