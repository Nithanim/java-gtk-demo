// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GPollableOutputStreamInterface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("can_poll"),
        Constants$root.C_POINTER$LAYOUT.withName("is_writable"),
        Constants$root.C_POINTER$LAYOUT.withName("create_source"),
        Constants$root.C_POINTER$LAYOUT.withName("write_nonblocking"),
        Constants$root.C_POINTER$LAYOUT.withName("writev_nonblocking")
    ).withName("_GPollableOutputStreamInterface");
    public static MemoryLayout $LAYOUT() {
        return _GPollableOutputStreamInterface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor can_poll$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle can_poll$MH = RuntimeHelper.downcallHandle(
        _GPollableOutputStreamInterface.can_poll$FUNC, false
    );
    public interface can_poll {

        int apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(can_poll fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(can_poll.class, fi, _GPollableOutputStreamInterface.can_poll$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static can_poll ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("can_poll::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    return (int)_GPollableOutputStreamInterface.can_poll$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle can_poll$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("can_poll"));
    public static VarHandle can_poll$VH() {
        return _GPollableOutputStreamInterface.can_poll$VH;
    }
    public static MemoryAddress can_poll$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GPollableOutputStreamInterface.can_poll$VH.get(seg);
    }
    public static void can_poll$set( MemorySegment seg, MemoryAddress x) {
        _GPollableOutputStreamInterface.can_poll$VH.set(seg, x);
    }
    public static MemoryAddress can_poll$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GPollableOutputStreamInterface.can_poll$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void can_poll$set(MemorySegment seg, long index, MemoryAddress x) {
        _GPollableOutputStreamInterface.can_poll$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static can_poll can_poll (MemorySegment segment, ResourceScope scope) {
        return can_poll.ofAddress(can_poll$get(segment), scope);
    }
    static final FunctionDescriptor is_writable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_writable$MH = RuntimeHelper.downcallHandle(
        _GPollableOutputStreamInterface.is_writable$FUNC, false
    );
    public interface is_writable {

        int apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(is_writable fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(is_writable.class, fi, _GPollableOutputStreamInterface.is_writable$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static is_writable ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("is_writable::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    return (int)_GPollableOutputStreamInterface.is_writable$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle is_writable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_writable"));
    public static VarHandle is_writable$VH() {
        return _GPollableOutputStreamInterface.is_writable$VH;
    }
    public static MemoryAddress is_writable$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GPollableOutputStreamInterface.is_writable$VH.get(seg);
    }
    public static void is_writable$set( MemorySegment seg, MemoryAddress x) {
        _GPollableOutputStreamInterface.is_writable$VH.set(seg, x);
    }
    public static MemoryAddress is_writable$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GPollableOutputStreamInterface.is_writable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_writable$set(MemorySegment seg, long index, MemoryAddress x) {
        _GPollableOutputStreamInterface.is_writable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_writable is_writable (MemorySegment segment, ResourceScope scope) {
        return is_writable.ofAddress(is_writable$get(segment), scope);
    }
    static final FunctionDescriptor create_source$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle create_source$MH = RuntimeHelper.downcallHandle(
        _GPollableOutputStreamInterface.create_source$FUNC, false
    );
    public interface create_source {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1);
        static NativeSymbol allocate(create_source fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(create_source.class, fi, _GPollableOutputStreamInterface.create_source$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static create_source ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("create_source::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GPollableOutputStreamInterface.create_source$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle create_source$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("create_source"));
    public static VarHandle create_source$VH() {
        return _GPollableOutputStreamInterface.create_source$VH;
    }
    public static MemoryAddress create_source$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GPollableOutputStreamInterface.create_source$VH.get(seg);
    }
    public static void create_source$set( MemorySegment seg, MemoryAddress x) {
        _GPollableOutputStreamInterface.create_source$VH.set(seg, x);
    }
    public static MemoryAddress create_source$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GPollableOutputStreamInterface.create_source$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void create_source$set(MemorySegment seg, long index, MemoryAddress x) {
        _GPollableOutputStreamInterface.create_source$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static create_source create_source (MemorySegment segment, ResourceScope scope) {
        return create_source.ofAddress(create_source$get(segment), scope);
    }
    static final FunctionDescriptor write_nonblocking$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle write_nonblocking$MH = RuntimeHelper.downcallHandle(
        _GPollableOutputStreamInterface.write_nonblocking$FUNC, false
    );
    public interface write_nonblocking {

        long apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, long _x2, jdk.incubator.foreign.MemoryAddress _x3);
        static NativeSymbol allocate(write_nonblocking fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(write_nonblocking.class, fi, _GPollableOutputStreamInterface.write_nonblocking$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)J", scope);
        }
        static write_nonblocking ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("write_nonblocking::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, long _x2, jdk.incubator.foreign.MemoryAddress _x3) -> {
                try {
                    return (long)_GPollableOutputStreamInterface.write_nonblocking$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, _x2, (jdk.incubator.foreign.Addressable)_x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle write_nonblocking$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("write_nonblocking"));
    public static VarHandle write_nonblocking$VH() {
        return _GPollableOutputStreamInterface.write_nonblocking$VH;
    }
    public static MemoryAddress write_nonblocking$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GPollableOutputStreamInterface.write_nonblocking$VH.get(seg);
    }
    public static void write_nonblocking$set( MemorySegment seg, MemoryAddress x) {
        _GPollableOutputStreamInterface.write_nonblocking$VH.set(seg, x);
    }
    public static MemoryAddress write_nonblocking$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GPollableOutputStreamInterface.write_nonblocking$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void write_nonblocking$set(MemorySegment seg, long index, MemoryAddress x) {
        _GPollableOutputStreamInterface.write_nonblocking$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static write_nonblocking write_nonblocking (MemorySegment segment, ResourceScope scope) {
        return write_nonblocking.ofAddress(write_nonblocking$get(segment), scope);
    }
    static final FunctionDescriptor writev_nonblocking$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle writev_nonblocking$MH = RuntimeHelper.downcallHandle(
        _GPollableOutputStreamInterface.writev_nonblocking$FUNC, false
    );
    public interface writev_nonblocking {

        int apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, long _x2, jdk.incubator.foreign.MemoryAddress _x3, jdk.incubator.foreign.MemoryAddress _x4);
        static NativeSymbol allocate(writev_nonblocking fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(writev_nonblocking.class, fi, _GPollableOutputStreamInterface.writev_nonblocking$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static writev_nonblocking ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("writev_nonblocking::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, long _x2, jdk.incubator.foreign.MemoryAddress _x3, jdk.incubator.foreign.MemoryAddress _x4) -> {
                try {
                    return (int)_GPollableOutputStreamInterface.writev_nonblocking$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, _x2, (jdk.incubator.foreign.Addressable)_x3, (jdk.incubator.foreign.Addressable)_x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle writev_nonblocking$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("writev_nonblocking"));
    public static VarHandle writev_nonblocking$VH() {
        return _GPollableOutputStreamInterface.writev_nonblocking$VH;
    }
    public static MemoryAddress writev_nonblocking$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GPollableOutputStreamInterface.writev_nonblocking$VH.get(seg);
    }
    public static void writev_nonblocking$set( MemorySegment seg, MemoryAddress x) {
        _GPollableOutputStreamInterface.writev_nonblocking$VH.set(seg, x);
    }
    public static MemoryAddress writev_nonblocking$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GPollableOutputStreamInterface.writev_nonblocking$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void writev_nonblocking$set(MemorySegment seg, long index, MemoryAddress x) {
        _GPollableOutputStreamInterface.writev_nonblocking$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static writev_nonblocking writev_nonblocking (MemorySegment segment, ResourceScope scope) {
        return writev_nonblocking.ofAddress(writev_nonblocking$get(segment), scope);
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


