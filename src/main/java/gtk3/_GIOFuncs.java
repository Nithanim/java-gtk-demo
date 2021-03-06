// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GIOFuncs {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("io_read"),
        Constants$root.C_POINTER$LAYOUT.withName("io_write"),
        Constants$root.C_POINTER$LAYOUT.withName("io_seek"),
        Constants$root.C_POINTER$LAYOUT.withName("io_close"),
        Constants$root.C_POINTER$LAYOUT.withName("io_create_watch"),
        Constants$root.C_POINTER$LAYOUT.withName("io_free"),
        Constants$root.C_POINTER$LAYOUT.withName("io_set_flags"),
        Constants$root.C_POINTER$LAYOUT.withName("io_get_flags")
    ).withName("_GIOFuncs");
    public static MemoryLayout $LAYOUT() {
        return _GIOFuncs.$struct$LAYOUT;
    }
    static final FunctionDescriptor io_read$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_read$MH = RuntimeHelper.downcallHandle(
        _GIOFuncs.io_read$FUNC, false
    );
    public interface io_read {

        int apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, long _x2, jdk.incubator.foreign.MemoryAddress _x3, jdk.incubator.foreign.MemoryAddress _x4);
        static NativeSymbol allocate(io_read fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(io_read.class, fi, _GIOFuncs.io_read$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static io_read ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("io_read::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, long _x2, jdk.incubator.foreign.MemoryAddress _x3, jdk.incubator.foreign.MemoryAddress _x4) -> {
                try {
                    return (int)_GIOFuncs.io_read$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, _x2, (jdk.incubator.foreign.Addressable)_x3, (jdk.incubator.foreign.Addressable)_x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle io_read$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("io_read"));
    public static VarHandle io_read$VH() {
        return _GIOFuncs.io_read$VH;
    }
    public static MemoryAddress io_read$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_read$VH.get(seg);
    }
    public static void io_read$set( MemorySegment seg, MemoryAddress x) {
        _GIOFuncs.io_read$VH.set(seg, x);
    }
    public static MemoryAddress io_read$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_read$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void io_read$set(MemorySegment seg, long index, MemoryAddress x) {
        _GIOFuncs.io_read$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static io_read io_read (MemorySegment segment, ResourceScope scope) {
        return io_read.ofAddress(io_read$get(segment), scope);
    }
    static final FunctionDescriptor io_write$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_write$MH = RuntimeHelper.downcallHandle(
        _GIOFuncs.io_write$FUNC, false
    );
    public interface io_write {

        int apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, long _x2, jdk.incubator.foreign.MemoryAddress _x3, jdk.incubator.foreign.MemoryAddress _x4);
        static NativeSymbol allocate(io_write fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(io_write.class, fi, _GIOFuncs.io_write$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static io_write ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("io_write::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, long _x2, jdk.incubator.foreign.MemoryAddress _x3, jdk.incubator.foreign.MemoryAddress _x4) -> {
                try {
                    return (int)_GIOFuncs.io_write$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, _x2, (jdk.incubator.foreign.Addressable)_x3, (jdk.incubator.foreign.Addressable)_x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle io_write$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("io_write"));
    public static VarHandle io_write$VH() {
        return _GIOFuncs.io_write$VH;
    }
    public static MemoryAddress io_write$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_write$VH.get(seg);
    }
    public static void io_write$set( MemorySegment seg, MemoryAddress x) {
        _GIOFuncs.io_write$VH.set(seg, x);
    }
    public static MemoryAddress io_write$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_write$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void io_write$set(MemorySegment seg, long index, MemoryAddress x) {
        _GIOFuncs.io_write$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static io_write io_write (MemorySegment segment, ResourceScope scope) {
        return io_write.ofAddress(io_write$get(segment), scope);
    }
    static final FunctionDescriptor io_seek$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_seek$MH = RuntimeHelper.downcallHandle(
        _GIOFuncs.io_seek$FUNC, false
    );
    public interface io_seek {

        int apply(jdk.incubator.foreign.MemoryAddress _x0, long _x1, int _x2, jdk.incubator.foreign.MemoryAddress _x3);
        static NativeSymbol allocate(io_seek fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(io_seek.class, fi, _GIOFuncs.io_seek$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static io_seek ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("io_seek::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, long _x1, int _x2, jdk.incubator.foreign.MemoryAddress _x3) -> {
                try {
                    return (int)_GIOFuncs.io_seek$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, _x1, _x2, (jdk.incubator.foreign.Addressable)_x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle io_seek$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("io_seek"));
    public static VarHandle io_seek$VH() {
        return _GIOFuncs.io_seek$VH;
    }
    public static MemoryAddress io_seek$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_seek$VH.get(seg);
    }
    public static void io_seek$set( MemorySegment seg, MemoryAddress x) {
        _GIOFuncs.io_seek$VH.set(seg, x);
    }
    public static MemoryAddress io_seek$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_seek$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void io_seek$set(MemorySegment seg, long index, MemoryAddress x) {
        _GIOFuncs.io_seek$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static io_seek io_seek (MemorySegment segment, ResourceScope scope) {
        return io_seek.ofAddress(io_seek$get(segment), scope);
    }
    static final FunctionDescriptor io_close$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_close$MH = RuntimeHelper.downcallHandle(
        _GIOFuncs.io_close$FUNC, false
    );
    public interface io_close {

        int apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1);
        static NativeSymbol allocate(io_close fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(io_close.class, fi, _GIOFuncs.io_close$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static io_close ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("io_close::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1) -> {
                try {
                    return (int)_GIOFuncs.io_close$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle io_close$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("io_close"));
    public static VarHandle io_close$VH() {
        return _GIOFuncs.io_close$VH;
    }
    public static MemoryAddress io_close$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_close$VH.get(seg);
    }
    public static void io_close$set( MemorySegment seg, MemoryAddress x) {
        _GIOFuncs.io_close$VH.set(seg, x);
    }
    public static MemoryAddress io_close$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_close$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void io_close$set(MemorySegment seg, long index, MemoryAddress x) {
        _GIOFuncs.io_close$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static io_close io_close (MemorySegment segment, ResourceScope scope) {
        return io_close.ofAddress(io_close$get(segment), scope);
    }
    static final FunctionDescriptor io_create_watch$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_create_watch$MH = RuntimeHelper.downcallHandle(
        _GIOFuncs.io_create_watch$FUNC, false
    );
    public interface io_create_watch {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0, int _x1);
        static NativeSymbol allocate(io_create_watch fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(io_create_watch.class, fi, _GIOFuncs.io_create_watch$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static io_create_watch ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("io_create_watch::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, int _x1) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_create_watch$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, _x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle io_create_watch$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("io_create_watch"));
    public static VarHandle io_create_watch$VH() {
        return _GIOFuncs.io_create_watch$VH;
    }
    public static MemoryAddress io_create_watch$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_create_watch$VH.get(seg);
    }
    public static void io_create_watch$set( MemorySegment seg, MemoryAddress x) {
        _GIOFuncs.io_create_watch$VH.set(seg, x);
    }
    public static MemoryAddress io_create_watch$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_create_watch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void io_create_watch$set(MemorySegment seg, long index, MemoryAddress x) {
        _GIOFuncs.io_create_watch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static io_create_watch io_create_watch (MemorySegment segment, ResourceScope scope) {
        return io_create_watch.ofAddress(io_create_watch$get(segment), scope);
    }
    static final FunctionDescriptor io_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_free$MH = RuntimeHelper.downcallHandle(
        _GIOFuncs.io_free$FUNC, false
    );
    public interface io_free {

        void apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(io_free fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(io_free.class, fi, _GIOFuncs.io_free$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static io_free ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("io_free::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    _GIOFuncs.io_free$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle io_free$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("io_free"));
    public static VarHandle io_free$VH() {
        return _GIOFuncs.io_free$VH;
    }
    public static MemoryAddress io_free$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_free$VH.get(seg);
    }
    public static void io_free$set( MemorySegment seg, MemoryAddress x) {
        _GIOFuncs.io_free$VH.set(seg, x);
    }
    public static MemoryAddress io_free$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_free$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void io_free$set(MemorySegment seg, long index, MemoryAddress x) {
        _GIOFuncs.io_free$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static io_free io_free (MemorySegment segment, ResourceScope scope) {
        return io_free.ofAddress(io_free$get(segment), scope);
    }
    static final FunctionDescriptor io_set_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_set_flags$MH = RuntimeHelper.downcallHandle(
        _GIOFuncs.io_set_flags$FUNC, false
    );
    public interface io_set_flags {

        int apply(jdk.incubator.foreign.MemoryAddress _x0, int _x1, jdk.incubator.foreign.MemoryAddress _x2);
        static NativeSymbol allocate(io_set_flags fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(io_set_flags.class, fi, _GIOFuncs.io_set_flags$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static io_set_flags ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("io_set_flags::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, int _x1, jdk.incubator.foreign.MemoryAddress _x2) -> {
                try {
                    return (int)_GIOFuncs.io_set_flags$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, _x1, (jdk.incubator.foreign.Addressable)_x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle io_set_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("io_set_flags"));
    public static VarHandle io_set_flags$VH() {
        return _GIOFuncs.io_set_flags$VH;
    }
    public static MemoryAddress io_set_flags$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_set_flags$VH.get(seg);
    }
    public static void io_set_flags$set( MemorySegment seg, MemoryAddress x) {
        _GIOFuncs.io_set_flags$VH.set(seg, x);
    }
    public static MemoryAddress io_set_flags$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_set_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void io_set_flags$set(MemorySegment seg, long index, MemoryAddress x) {
        _GIOFuncs.io_set_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static io_set_flags io_set_flags (MemorySegment segment, ResourceScope scope) {
        return io_set_flags.ofAddress(io_set_flags$get(segment), scope);
    }
    static final FunctionDescriptor io_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_get_flags$MH = RuntimeHelper.downcallHandle(
        _GIOFuncs.io_get_flags$FUNC, false
    );
    public interface io_get_flags {

        int apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(io_get_flags fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(io_get_flags.class, fi, _GIOFuncs.io_get_flags$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static io_get_flags ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("io_get_flags::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    return (int)_GIOFuncs.io_get_flags$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle io_get_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("io_get_flags"));
    public static VarHandle io_get_flags$VH() {
        return _GIOFuncs.io_get_flags$VH;
    }
    public static MemoryAddress io_get_flags$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_get_flags$VH.get(seg);
    }
    public static void io_get_flags$set( MemorySegment seg, MemoryAddress x) {
        _GIOFuncs.io_get_flags$VH.set(seg, x);
    }
    public static MemoryAddress io_get_flags$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GIOFuncs.io_get_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void io_get_flags$set(MemorySegment seg, long index, MemoryAddress x) {
        _GIOFuncs.io_get_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static io_get_flags io_get_flags (MemorySegment segment, ResourceScope scope) {
        return io_get_flags.ofAddress(io_get_flags$get(segment), scope);
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


