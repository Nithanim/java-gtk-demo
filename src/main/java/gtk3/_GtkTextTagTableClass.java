// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GtkTextTagTableClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("tag_changed"),
        Constants$root.C_POINTER$LAYOUT.withName("tag_added"),
        Constants$root.C_POINTER$LAYOUT.withName("tag_removed"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
    ).withName("_GtkTextTagTableClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkTextTagTableClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor tag_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle tag_changed$MH = RuntimeHelper.downcallHandle(
        _GtkTextTagTableClass.tag_changed$FUNC, false
    );
    public interface tag_changed {

        void apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, int _x2);
        static NativeSymbol allocate(tag_changed fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(tag_changed.class, fi, _GtkTextTagTableClass.tag_changed$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V", scope);
        }
        static tag_changed ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("tag_changed::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, int _x2) -> {
                try {
                    _GtkTextTagTableClass.tag_changed$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, _x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle tag_changed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tag_changed"));
    public static VarHandle tag_changed$VH() {
        return _GtkTextTagTableClass.tag_changed$VH;
    }
    public static MemoryAddress tag_changed$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkTextTagTableClass.tag_changed$VH.get(seg);
    }
    public static void tag_changed$set( MemorySegment seg, MemoryAddress x) {
        _GtkTextTagTableClass.tag_changed$VH.set(seg, x);
    }
    public static MemoryAddress tag_changed$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkTextTagTableClass.tag_changed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tag_changed$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkTextTagTableClass.tag_changed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static tag_changed tag_changed (MemorySegment segment, ResourceScope scope) {
        return tag_changed.ofAddress(tag_changed$get(segment), scope);
    }
    static final FunctionDescriptor tag_added$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle tag_added$MH = RuntimeHelper.downcallHandle(
        _GtkTextTagTableClass.tag_added$FUNC, false
    );
    public interface tag_added {

        void apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1);
        static NativeSymbol allocate(tag_added fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(tag_added.class, fi, _GtkTextTagTableClass.tag_added$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static tag_added ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("tag_added::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1) -> {
                try {
                    _GtkTextTagTableClass.tag_added$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle tag_added$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tag_added"));
    public static VarHandle tag_added$VH() {
        return _GtkTextTagTableClass.tag_added$VH;
    }
    public static MemoryAddress tag_added$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkTextTagTableClass.tag_added$VH.get(seg);
    }
    public static void tag_added$set( MemorySegment seg, MemoryAddress x) {
        _GtkTextTagTableClass.tag_added$VH.set(seg, x);
    }
    public static MemoryAddress tag_added$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkTextTagTableClass.tag_added$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tag_added$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkTextTagTableClass.tag_added$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static tag_added tag_added (MemorySegment segment, ResourceScope scope) {
        return tag_added.ofAddress(tag_added$get(segment), scope);
    }
    static final FunctionDescriptor tag_removed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle tag_removed$MH = RuntimeHelper.downcallHandle(
        _GtkTextTagTableClass.tag_removed$FUNC, false
    );
    public interface tag_removed {

        void apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1);
        static NativeSymbol allocate(tag_removed fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(tag_removed.class, fi, _GtkTextTagTableClass.tag_removed$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static tag_removed ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("tag_removed::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1) -> {
                try {
                    _GtkTextTagTableClass.tag_removed$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle tag_removed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tag_removed"));
    public static VarHandle tag_removed$VH() {
        return _GtkTextTagTableClass.tag_removed$VH;
    }
    public static MemoryAddress tag_removed$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkTextTagTableClass.tag_removed$VH.get(seg);
    }
    public static void tag_removed$set( MemorySegment seg, MemoryAddress x) {
        _GtkTextTagTableClass.tag_removed$VH.set(seg, x);
    }
    public static MemoryAddress tag_removed$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkTextTagTableClass.tag_removed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tag_removed$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkTextTagTableClass.tag_removed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static tag_removed tag_removed (MemorySegment segment, ResourceScope scope) {
        return tag_removed.ofAddress(tag_removed$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1$MH = RuntimeHelper.downcallHandle(
        _GtkTextTagTableClass._gtk_reserved1$FUNC, false
    );
    public interface _gtk_reserved1 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved1 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved1.class, fi, _GtkTextTagTableClass._gtk_reserved1$FUNC, "()V", scope);
        }
        static _gtk_reserved1 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved1::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkTextTagTableClass._gtk_reserved1$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    public static VarHandle _gtk_reserved1$VH() {
        return _GtkTextTagTableClass._gtk_reserved1$VH;
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkTextTagTableClass._gtk_reserved1$VH.get(seg);
    }
    public static void _gtk_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GtkTextTagTableClass._gtk_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkTextTagTableClass._gtk_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkTextTagTableClass._gtk_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2$MH = RuntimeHelper.downcallHandle(
        _GtkTextTagTableClass._gtk_reserved2$FUNC, false
    );
    public interface _gtk_reserved2 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved2 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved2.class, fi, _GtkTextTagTableClass._gtk_reserved2$FUNC, "()V", scope);
        }
        static _gtk_reserved2 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved2::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkTextTagTableClass._gtk_reserved2$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    public static VarHandle _gtk_reserved2$VH() {
        return _GtkTextTagTableClass._gtk_reserved2$VH;
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkTextTagTableClass._gtk_reserved2$VH.get(seg);
    }
    public static void _gtk_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GtkTextTagTableClass._gtk_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkTextTagTableClass._gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkTextTagTableClass._gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3$MH = RuntimeHelper.downcallHandle(
        _GtkTextTagTableClass._gtk_reserved3$FUNC, false
    );
    public interface _gtk_reserved3 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved3 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved3.class, fi, _GtkTextTagTableClass._gtk_reserved3$FUNC, "()V", scope);
        }
        static _gtk_reserved3 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved3::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkTextTagTableClass._gtk_reserved3$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    public static VarHandle _gtk_reserved3$VH() {
        return _GtkTextTagTableClass._gtk_reserved3$VH;
    }
    public static MemoryAddress _gtk_reserved3$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkTextTagTableClass._gtk_reserved3$VH.get(seg);
    }
    public static void _gtk_reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GtkTextTagTableClass._gtk_reserved3$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved3$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkTextTagTableClass._gtk_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkTextTagTableClass._gtk_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4$MH = RuntimeHelper.downcallHandle(
        _GtkTextTagTableClass._gtk_reserved4$FUNC, false
    );
    public interface _gtk_reserved4 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved4 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved4.class, fi, _GtkTextTagTableClass._gtk_reserved4$FUNC, "()V", scope);
        }
        static _gtk_reserved4 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved4::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkTextTagTableClass._gtk_reserved4$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    public static VarHandle _gtk_reserved4$VH() {
        return _GtkTextTagTableClass._gtk_reserved4$VH;
    }
    public static MemoryAddress _gtk_reserved4$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkTextTagTableClass._gtk_reserved4$VH.get(seg);
    }
    public static void _gtk_reserved4$set( MemorySegment seg, MemoryAddress x) {
        _GtkTextTagTableClass._gtk_reserved4$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved4$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkTextTagTableClass._gtk_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkTextTagTableClass._gtk_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), scope);
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


