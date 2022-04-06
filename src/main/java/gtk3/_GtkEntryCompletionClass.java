// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GtkEntryCompletionClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("match_selected"),
        Constants$root.C_POINTER$LAYOUT.withName("action_activated"),
        Constants$root.C_POINTER$LAYOUT.withName("insert_prefix"),
        Constants$root.C_POINTER$LAYOUT.withName("cursor_on_match"),
        Constants$root.C_POINTER$LAYOUT.withName("no_matches"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved0"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2")
    ).withName("_GtkEntryCompletionClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkEntryCompletionClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor match_selected$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle match_selected$MH = RuntimeHelper.downcallHandle(
        _GtkEntryCompletionClass.match_selected$FUNC, false
    );
    public interface match_selected {

        int apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2);
        static NativeSymbol allocate(match_selected fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(match_selected.class, fi, _GtkEntryCompletionClass.match_selected$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static match_selected ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("match_selected::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2) -> {
                try {
                    return (int)_GtkEntryCompletionClass.match_selected$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, (jdk.incubator.foreign.Addressable)_x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle match_selected$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("match_selected"));
    public static VarHandle match_selected$VH() {
        return _GtkEntryCompletionClass.match_selected$VH;
    }
    public static MemoryAddress match_selected$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass.match_selected$VH.get(seg);
    }
    public static void match_selected$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryCompletionClass.match_selected$VH.set(seg, x);
    }
    public static MemoryAddress match_selected$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass.match_selected$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void match_selected$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryCompletionClass.match_selected$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static match_selected match_selected (MemorySegment segment, ResourceScope scope) {
        return match_selected.ofAddress(match_selected$get(segment), scope);
    }
    static final FunctionDescriptor action_activated$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle action_activated$MH = RuntimeHelper.downcallHandle(
        _GtkEntryCompletionClass.action_activated$FUNC, false
    );
    public interface action_activated {

        void apply(jdk.incubator.foreign.MemoryAddress _x0, int _x1);
        static NativeSymbol allocate(action_activated fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(action_activated.class, fi, _GtkEntryCompletionClass.action_activated$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)V", scope);
        }
        static action_activated ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("action_activated::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, int _x1) -> {
                try {
                    _GtkEntryCompletionClass.action_activated$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, _x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle action_activated$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("action_activated"));
    public static VarHandle action_activated$VH() {
        return _GtkEntryCompletionClass.action_activated$VH;
    }
    public static MemoryAddress action_activated$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass.action_activated$VH.get(seg);
    }
    public static void action_activated$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryCompletionClass.action_activated$VH.set(seg, x);
    }
    public static MemoryAddress action_activated$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass.action_activated$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void action_activated$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryCompletionClass.action_activated$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static action_activated action_activated (MemorySegment segment, ResourceScope scope) {
        return action_activated.ofAddress(action_activated$get(segment), scope);
    }
    static final FunctionDescriptor insert_prefix$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle insert_prefix$MH = RuntimeHelper.downcallHandle(
        _GtkEntryCompletionClass.insert_prefix$FUNC, false
    );
    public interface insert_prefix {

        int apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1);
        static NativeSymbol allocate(insert_prefix fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(insert_prefix.class, fi, _GtkEntryCompletionClass.insert_prefix$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static insert_prefix ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("insert_prefix::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1) -> {
                try {
                    return (int)_GtkEntryCompletionClass.insert_prefix$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle insert_prefix$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("insert_prefix"));
    public static VarHandle insert_prefix$VH() {
        return _GtkEntryCompletionClass.insert_prefix$VH;
    }
    public static MemoryAddress insert_prefix$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass.insert_prefix$VH.get(seg);
    }
    public static void insert_prefix$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryCompletionClass.insert_prefix$VH.set(seg, x);
    }
    public static MemoryAddress insert_prefix$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass.insert_prefix$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void insert_prefix$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryCompletionClass.insert_prefix$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static insert_prefix insert_prefix (MemorySegment segment, ResourceScope scope) {
        return insert_prefix.ofAddress(insert_prefix$get(segment), scope);
    }
    static final FunctionDescriptor cursor_on_match$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cursor_on_match$MH = RuntimeHelper.downcallHandle(
        _GtkEntryCompletionClass.cursor_on_match$FUNC, false
    );
    public interface cursor_on_match {

        int apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2);
        static NativeSymbol allocate(cursor_on_match fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(cursor_on_match.class, fi, _GtkEntryCompletionClass.cursor_on_match$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static cursor_on_match ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("cursor_on_match::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2) -> {
                try {
                    return (int)_GtkEntryCompletionClass.cursor_on_match$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, (jdk.incubator.foreign.Addressable)_x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle cursor_on_match$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cursor_on_match"));
    public static VarHandle cursor_on_match$VH() {
        return _GtkEntryCompletionClass.cursor_on_match$VH;
    }
    public static MemoryAddress cursor_on_match$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass.cursor_on_match$VH.get(seg);
    }
    public static void cursor_on_match$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryCompletionClass.cursor_on_match$VH.set(seg, x);
    }
    public static MemoryAddress cursor_on_match$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass.cursor_on_match$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cursor_on_match$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryCompletionClass.cursor_on_match$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static cursor_on_match cursor_on_match (MemorySegment segment, ResourceScope scope) {
        return cursor_on_match.ofAddress(cursor_on_match$get(segment), scope);
    }
    static final FunctionDescriptor no_matches$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle no_matches$MH = RuntimeHelper.downcallHandle(
        _GtkEntryCompletionClass.no_matches$FUNC, false
    );
    public interface no_matches {

        void apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(no_matches fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(no_matches.class, fi, _GtkEntryCompletionClass.no_matches$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static no_matches ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("no_matches::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    _GtkEntryCompletionClass.no_matches$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle no_matches$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("no_matches"));
    public static VarHandle no_matches$VH() {
        return _GtkEntryCompletionClass.no_matches$VH;
    }
    public static MemoryAddress no_matches$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass.no_matches$VH.get(seg);
    }
    public static void no_matches$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryCompletionClass.no_matches$VH.set(seg, x);
    }
    public static MemoryAddress no_matches$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass.no_matches$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void no_matches$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryCompletionClass.no_matches$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static no_matches no_matches (MemorySegment segment, ResourceScope scope) {
        return no_matches.ofAddress(no_matches$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved0$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved0$MH = RuntimeHelper.downcallHandle(
        _GtkEntryCompletionClass._gtk_reserved0$FUNC, false
    );
    public interface _gtk_reserved0 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved0 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved0.class, fi, _GtkEntryCompletionClass._gtk_reserved0$FUNC, "()V", scope);
        }
        static _gtk_reserved0 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved0::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkEntryCompletionClass._gtk_reserved0$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved0$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved0"));
    public static VarHandle _gtk_reserved0$VH() {
        return _GtkEntryCompletionClass._gtk_reserved0$VH;
    }
    public static MemoryAddress _gtk_reserved0$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass._gtk_reserved0$VH.get(seg);
    }
    public static void _gtk_reserved0$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryCompletionClass._gtk_reserved0$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved0$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass._gtk_reserved0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved0$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryCompletionClass._gtk_reserved0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved0 _gtk_reserved0 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved0.ofAddress(_gtk_reserved0$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1$MH = RuntimeHelper.downcallHandle(
        _GtkEntryCompletionClass._gtk_reserved1$FUNC, false
    );
    public interface _gtk_reserved1 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved1 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved1.class, fi, _GtkEntryCompletionClass._gtk_reserved1$FUNC, "()V", scope);
        }
        static _gtk_reserved1 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved1::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkEntryCompletionClass._gtk_reserved1$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    public static VarHandle _gtk_reserved1$VH() {
        return _GtkEntryCompletionClass._gtk_reserved1$VH;
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass._gtk_reserved1$VH.get(seg);
    }
    public static void _gtk_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryCompletionClass._gtk_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass._gtk_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryCompletionClass._gtk_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2$MH = RuntimeHelper.downcallHandle(
        _GtkEntryCompletionClass._gtk_reserved2$FUNC, false
    );
    public interface _gtk_reserved2 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved2 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved2.class, fi, _GtkEntryCompletionClass._gtk_reserved2$FUNC, "()V", scope);
        }
        static _gtk_reserved2 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved2::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkEntryCompletionClass._gtk_reserved2$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    public static VarHandle _gtk_reserved2$VH() {
        return _GtkEntryCompletionClass._gtk_reserved2$VH;
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass._gtk_reserved2$VH.get(seg);
    }
    public static void _gtk_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryCompletionClass._gtk_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkEntryCompletionClass._gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryCompletionClass._gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
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

