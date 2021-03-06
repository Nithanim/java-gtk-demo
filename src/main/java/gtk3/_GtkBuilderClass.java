// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GtkBuilderClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("get_type_from_name"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved5"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved6"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved7"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved8")
    ).withName("_GtkBuilderClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkBuilderClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor get_type_from_name$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_type_from_name$MH = RuntimeHelper.downcallHandle(
        _GtkBuilderClass.get_type_from_name$FUNC, false
    );
    public interface get_type_from_name {

        long apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1);
        static NativeSymbol allocate(get_type_from_name fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_type_from_name.class, fi, _GtkBuilderClass.get_type_from_name$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J", scope);
        }
        static get_type_from_name ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_type_from_name::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1) -> {
                try {
                    return (long)_GtkBuilderClass.get_type_from_name$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_type_from_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_type_from_name"));
    public static VarHandle get_type_from_name$VH() {
        return _GtkBuilderClass.get_type_from_name$VH;
    }
    public static MemoryAddress get_type_from_name$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass.get_type_from_name$VH.get(seg);
    }
    public static void get_type_from_name$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuilderClass.get_type_from_name$VH.set(seg, x);
    }
    public static MemoryAddress get_type_from_name$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass.get_type_from_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_type_from_name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuilderClass.get_type_from_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_type_from_name get_type_from_name (MemorySegment segment, ResourceScope scope) {
        return get_type_from_name.ofAddress(get_type_from_name$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1$MH = RuntimeHelper.downcallHandle(
        _GtkBuilderClass._gtk_reserved1$FUNC, false
    );
    public interface _gtk_reserved1 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved1 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved1.class, fi, _GtkBuilderClass._gtk_reserved1$FUNC, "()V", scope);
        }
        static _gtk_reserved1 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved1::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkBuilderClass._gtk_reserved1$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    public static VarHandle _gtk_reserved1$VH() {
        return _GtkBuilderClass._gtk_reserved1$VH;
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved1$VH.get(seg);
    }
    public static void _gtk_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2$MH = RuntimeHelper.downcallHandle(
        _GtkBuilderClass._gtk_reserved2$FUNC, false
    );
    public interface _gtk_reserved2 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved2 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved2.class, fi, _GtkBuilderClass._gtk_reserved2$FUNC, "()V", scope);
        }
        static _gtk_reserved2 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved2::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkBuilderClass._gtk_reserved2$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    public static VarHandle _gtk_reserved2$VH() {
        return _GtkBuilderClass._gtk_reserved2$VH;
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved2$VH.get(seg);
    }
    public static void _gtk_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3$MH = RuntimeHelper.downcallHandle(
        _GtkBuilderClass._gtk_reserved3$FUNC, false
    );
    public interface _gtk_reserved3 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved3 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved3.class, fi, _GtkBuilderClass._gtk_reserved3$FUNC, "()V", scope);
        }
        static _gtk_reserved3 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved3::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkBuilderClass._gtk_reserved3$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    public static VarHandle _gtk_reserved3$VH() {
        return _GtkBuilderClass._gtk_reserved3$VH;
    }
    public static MemoryAddress _gtk_reserved3$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved3$VH.get(seg);
    }
    public static void _gtk_reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved3$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved3$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4$MH = RuntimeHelper.downcallHandle(
        _GtkBuilderClass._gtk_reserved4$FUNC, false
    );
    public interface _gtk_reserved4 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved4 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved4.class, fi, _GtkBuilderClass._gtk_reserved4$FUNC, "()V", scope);
        }
        static _gtk_reserved4 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved4::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkBuilderClass._gtk_reserved4$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    public static VarHandle _gtk_reserved4$VH() {
        return _GtkBuilderClass._gtk_reserved4$VH;
    }
    public static MemoryAddress _gtk_reserved4$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved4$VH.get(seg);
    }
    public static void _gtk_reserved4$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved4$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved4$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved5$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved5$MH = RuntimeHelper.downcallHandle(
        _GtkBuilderClass._gtk_reserved5$FUNC, false
    );
    public interface _gtk_reserved5 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved5 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved5.class, fi, _GtkBuilderClass._gtk_reserved5$FUNC, "()V", scope);
        }
        static _gtk_reserved5 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved5::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkBuilderClass._gtk_reserved5$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved5"));
    public static VarHandle _gtk_reserved5$VH() {
        return _GtkBuilderClass._gtk_reserved5$VH;
    }
    public static MemoryAddress _gtk_reserved5$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved5$VH.get(seg);
    }
    public static void _gtk_reserved5$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved5$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved5$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved5$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved5 _gtk_reserved5 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved5.ofAddress(_gtk_reserved5$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved6$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved6$MH = RuntimeHelper.downcallHandle(
        _GtkBuilderClass._gtk_reserved6$FUNC, false
    );
    public interface _gtk_reserved6 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved6 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved6.class, fi, _GtkBuilderClass._gtk_reserved6$FUNC, "()V", scope);
        }
        static _gtk_reserved6 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved6::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkBuilderClass._gtk_reserved6$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved6$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved6"));
    public static VarHandle _gtk_reserved6$VH() {
        return _GtkBuilderClass._gtk_reserved6$VH;
    }
    public static MemoryAddress _gtk_reserved6$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved6$VH.get(seg);
    }
    public static void _gtk_reserved6$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved6$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved6$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved6$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved6$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved6$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved6 _gtk_reserved6 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved6.ofAddress(_gtk_reserved6$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved7$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved7$MH = RuntimeHelper.downcallHandle(
        _GtkBuilderClass._gtk_reserved7$FUNC, false
    );
    public interface _gtk_reserved7 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved7 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved7.class, fi, _GtkBuilderClass._gtk_reserved7$FUNC, "()V", scope);
        }
        static _gtk_reserved7 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved7::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkBuilderClass._gtk_reserved7$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved7$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved7"));
    public static VarHandle _gtk_reserved7$VH() {
        return _GtkBuilderClass._gtk_reserved7$VH;
    }
    public static MemoryAddress _gtk_reserved7$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved7$VH.get(seg);
    }
    public static void _gtk_reserved7$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved7$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved7$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved7$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved7$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved7$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved7 _gtk_reserved7 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved7.ofAddress(_gtk_reserved7$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved8$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved8$MH = RuntimeHelper.downcallHandle(
        _GtkBuilderClass._gtk_reserved8$FUNC, false
    );
    public interface _gtk_reserved8 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved8 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved8.class, fi, _GtkBuilderClass._gtk_reserved8$FUNC, "()V", scope);
        }
        static _gtk_reserved8 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved8::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkBuilderClass._gtk_reserved8$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved8$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved8"));
    public static VarHandle _gtk_reserved8$VH() {
        return _GtkBuilderClass._gtk_reserved8$VH;
    }
    public static MemoryAddress _gtk_reserved8$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved8$VH.get(seg);
    }
    public static void _gtk_reserved8$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved8$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved8$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuilderClass._gtk_reserved8$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved8$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuilderClass._gtk_reserved8$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved8 _gtk_reserved8 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved8.ofAddress(_gtk_reserved8$get(segment), scope);
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


