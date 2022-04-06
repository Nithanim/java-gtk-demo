// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _AtkStreamableContentIface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("parent"),
        Constants$root.C_POINTER$LAYOUT.withName("get_n_mime_types"),
        Constants$root.C_POINTER$LAYOUT.withName("get_mime_type"),
        Constants$root.C_POINTER$LAYOUT.withName("get_stream"),
        Constants$root.C_POINTER$LAYOUT.withName("get_uri"),
        Constants$root.C_POINTER$LAYOUT.withName("pad1"),
        Constants$root.C_POINTER$LAYOUT.withName("pad2"),
        Constants$root.C_POINTER$LAYOUT.withName("pad3")
    ).withName("_AtkStreamableContentIface");
    public static MemoryLayout $LAYOUT() {
        return _AtkStreamableContentIface.$struct$LAYOUT;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor get_n_mime_types$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_n_mime_types$MH = RuntimeHelper.downcallHandle(
        _AtkStreamableContentIface.get_n_mime_types$FUNC, false
    );
    public interface get_n_mime_types {

        int apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(get_n_mime_types fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_n_mime_types.class, fi, _AtkStreamableContentIface.get_n_mime_types$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static get_n_mime_types ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_n_mime_types::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    return (int)_AtkStreamableContentIface.get_n_mime_types$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_n_mime_types$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_n_mime_types"));
    public static VarHandle get_n_mime_types$VH() {
        return _AtkStreamableContentIface.get_n_mime_types$VH;
    }
    public static MemoryAddress get_n_mime_types$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.get_n_mime_types$VH.get(seg);
    }
    public static void get_n_mime_types$set( MemorySegment seg, MemoryAddress x) {
        _AtkStreamableContentIface.get_n_mime_types$VH.set(seg, x);
    }
    public static MemoryAddress get_n_mime_types$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.get_n_mime_types$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_n_mime_types$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkStreamableContentIface.get_n_mime_types$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_n_mime_types get_n_mime_types (MemorySegment segment, ResourceScope scope) {
        return get_n_mime_types.ofAddress(get_n_mime_types$get(segment), scope);
    }
    static final FunctionDescriptor get_mime_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle get_mime_type$MH = RuntimeHelper.downcallHandle(
        _AtkStreamableContentIface.get_mime_type$FUNC, false
    );
    public interface get_mime_type {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0, int _x1);
        static NativeSymbol allocate(get_mime_type fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_mime_type.class, fi, _AtkStreamableContentIface.get_mime_type$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_mime_type ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_mime_type::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, int _x1) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.get_mime_type$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, _x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_mime_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_mime_type"));
    public static VarHandle get_mime_type$VH() {
        return _AtkStreamableContentIface.get_mime_type$VH;
    }
    public static MemoryAddress get_mime_type$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.get_mime_type$VH.get(seg);
    }
    public static void get_mime_type$set( MemorySegment seg, MemoryAddress x) {
        _AtkStreamableContentIface.get_mime_type$VH.set(seg, x);
    }
    public static MemoryAddress get_mime_type$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.get_mime_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_mime_type$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkStreamableContentIface.get_mime_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_mime_type get_mime_type (MemorySegment segment, ResourceScope scope) {
        return get_mime_type.ofAddress(get_mime_type$get(segment), scope);
    }
    static final FunctionDescriptor get_stream$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_stream$MH = RuntimeHelper.downcallHandle(
        _AtkStreamableContentIface.get_stream$FUNC, false
    );
    public interface get_stream {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1);
        static NativeSymbol allocate(get_stream fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_stream.class, fi, _AtkStreamableContentIface.get_stream$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_stream ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_stream::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.get_stream$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_stream$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_stream"));
    public static VarHandle get_stream$VH() {
        return _AtkStreamableContentIface.get_stream$VH;
    }
    public static MemoryAddress get_stream$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.get_stream$VH.get(seg);
    }
    public static void get_stream$set( MemorySegment seg, MemoryAddress x) {
        _AtkStreamableContentIface.get_stream$VH.set(seg, x);
    }
    public static MemoryAddress get_stream$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.get_stream$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_stream$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkStreamableContentIface.get_stream$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_stream get_stream (MemorySegment segment, ResourceScope scope) {
        return get_stream.ofAddress(get_stream$get(segment), scope);
    }
    static final FunctionDescriptor get_uri$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_uri$MH = RuntimeHelper.downcallHandle(
        _AtkStreamableContentIface.get_uri$FUNC, false
    );
    public interface get_uri {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1);
        static NativeSymbol allocate(get_uri fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_uri.class, fi, _AtkStreamableContentIface.get_uri$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_uri ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_uri::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.get_uri$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_uri$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_uri"));
    public static VarHandle get_uri$VH() {
        return _AtkStreamableContentIface.get_uri$VH;
    }
    public static MemoryAddress get_uri$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.get_uri$VH.get(seg);
    }
    public static void get_uri$set( MemorySegment seg, MemoryAddress x) {
        _AtkStreamableContentIface.get_uri$VH.set(seg, x);
    }
    public static MemoryAddress get_uri$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.get_uri$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_uri$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkStreamableContentIface.get_uri$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_uri get_uri (MemorySegment segment, ResourceScope scope) {
        return get_uri.ofAddress(get_uri$get(segment), scope);
    }
    static final VarHandle pad1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pad1"));
    public static VarHandle pad1$VH() {
        return _AtkStreamableContentIface.pad1$VH;
    }
    public static MemoryAddress pad1$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.pad1$VH.get(seg);
    }
    public static void pad1$set( MemorySegment seg, MemoryAddress x) {
        _AtkStreamableContentIface.pad1$VH.set(seg, x);
    }
    public static MemoryAddress pad1$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.pad1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pad1$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkStreamableContentIface.pad1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AtkFunction pad1 (MemorySegment segment, ResourceScope scope) {
        return AtkFunction.ofAddress(pad1$get(segment), scope);
    }
    static final VarHandle pad2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pad2"));
    public static VarHandle pad2$VH() {
        return _AtkStreamableContentIface.pad2$VH;
    }
    public static MemoryAddress pad2$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.pad2$VH.get(seg);
    }
    public static void pad2$set( MemorySegment seg, MemoryAddress x) {
        _AtkStreamableContentIface.pad2$VH.set(seg, x);
    }
    public static MemoryAddress pad2$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.pad2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pad2$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkStreamableContentIface.pad2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AtkFunction pad2 (MemorySegment segment, ResourceScope scope) {
        return AtkFunction.ofAddress(pad2$get(segment), scope);
    }
    static final VarHandle pad3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pad3"));
    public static VarHandle pad3$VH() {
        return _AtkStreamableContentIface.pad3$VH;
    }
    public static MemoryAddress pad3$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.pad3$VH.get(seg);
    }
    public static void pad3$set( MemorySegment seg, MemoryAddress x) {
        _AtkStreamableContentIface.pad3$VH.set(seg, x);
    }
    public static MemoryAddress pad3$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkStreamableContentIface.pad3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pad3$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkStreamableContentIface.pad3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AtkFunction pad3 (MemorySegment segment, ResourceScope scope) {
        return AtkFunction.ofAddress(pad3$get(segment), scope);
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


