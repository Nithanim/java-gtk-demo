// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _AtkHyperlinkClass {

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
        ).withName("parent"),
        Constants$root.C_POINTER$LAYOUT.withName("get_uri"),
        Constants$root.C_POINTER$LAYOUT.withName("get_object"),
        Constants$root.C_POINTER$LAYOUT.withName("get_end_index"),
        Constants$root.C_POINTER$LAYOUT.withName("get_start_index"),
        Constants$root.C_POINTER$LAYOUT.withName("is_valid"),
        Constants$root.C_POINTER$LAYOUT.withName("get_n_anchors"),
        Constants$root.C_POINTER$LAYOUT.withName("link_state"),
        Constants$root.C_POINTER$LAYOUT.withName("is_selected_link"),
        Constants$root.C_POINTER$LAYOUT.withName("link_activated"),
        Constants$root.C_POINTER$LAYOUT.withName("pad1")
    ).withName("_AtkHyperlinkClass");
    public static MemoryLayout $LAYOUT() {
        return _AtkHyperlinkClass.$struct$LAYOUT;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor get_uri$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle get_uri$MH = RuntimeHelper.downcallHandle(
        _AtkHyperlinkClass.get_uri$FUNC, false
    );
    public interface get_uri {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0, int _x1);
        static NativeSymbol allocate(get_uri fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_uri.class, fi, _AtkHyperlinkClass.get_uri$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_uri ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_uri::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, int _x1) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.get_uri$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, _x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_uri$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_uri"));
    public static VarHandle get_uri$VH() {
        return _AtkHyperlinkClass.get_uri$VH;
    }
    public static MemoryAddress get_uri$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.get_uri$VH.get(seg);
    }
    public static void get_uri$set( MemorySegment seg, MemoryAddress x) {
        _AtkHyperlinkClass.get_uri$VH.set(seg, x);
    }
    public static MemoryAddress get_uri$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.get_uri$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_uri$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkHyperlinkClass.get_uri$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_uri get_uri (MemorySegment segment, ResourceScope scope) {
        return get_uri.ofAddress(get_uri$get(segment), scope);
    }
    static final FunctionDescriptor get_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle get_object$MH = RuntimeHelper.downcallHandle(
        _AtkHyperlinkClass.get_object$FUNC, false
    );
    public interface get_object {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0, int _x1);
        static NativeSymbol allocate(get_object fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_object.class, fi, _AtkHyperlinkClass.get_object$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_object ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_object::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, int _x1) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.get_object$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, _x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_object$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_object"));
    public static VarHandle get_object$VH() {
        return _AtkHyperlinkClass.get_object$VH;
    }
    public static MemoryAddress get_object$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.get_object$VH.get(seg);
    }
    public static void get_object$set( MemorySegment seg, MemoryAddress x) {
        _AtkHyperlinkClass.get_object$VH.set(seg, x);
    }
    public static MemoryAddress get_object$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.get_object$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_object$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkHyperlinkClass.get_object$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_object get_object (MemorySegment segment, ResourceScope scope) {
        return get_object.ofAddress(get_object$get(segment), scope);
    }
    static final FunctionDescriptor get_end_index$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_end_index$MH = RuntimeHelper.downcallHandle(
        _AtkHyperlinkClass.get_end_index$FUNC, false
    );
    public interface get_end_index {

        int apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(get_end_index fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_end_index.class, fi, _AtkHyperlinkClass.get_end_index$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static get_end_index ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_end_index::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    return (int)_AtkHyperlinkClass.get_end_index$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_end_index$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_end_index"));
    public static VarHandle get_end_index$VH() {
        return _AtkHyperlinkClass.get_end_index$VH;
    }
    public static MemoryAddress get_end_index$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.get_end_index$VH.get(seg);
    }
    public static void get_end_index$set( MemorySegment seg, MemoryAddress x) {
        _AtkHyperlinkClass.get_end_index$VH.set(seg, x);
    }
    public static MemoryAddress get_end_index$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.get_end_index$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_end_index$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkHyperlinkClass.get_end_index$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_end_index get_end_index (MemorySegment segment, ResourceScope scope) {
        return get_end_index.ofAddress(get_end_index$get(segment), scope);
    }
    static final FunctionDescriptor get_start_index$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_start_index$MH = RuntimeHelper.downcallHandle(
        _AtkHyperlinkClass.get_start_index$FUNC, false
    );
    public interface get_start_index {

        int apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(get_start_index fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_start_index.class, fi, _AtkHyperlinkClass.get_start_index$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static get_start_index ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_start_index::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    return (int)_AtkHyperlinkClass.get_start_index$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_start_index$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_start_index"));
    public static VarHandle get_start_index$VH() {
        return _AtkHyperlinkClass.get_start_index$VH;
    }
    public static MemoryAddress get_start_index$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.get_start_index$VH.get(seg);
    }
    public static void get_start_index$set( MemorySegment seg, MemoryAddress x) {
        _AtkHyperlinkClass.get_start_index$VH.set(seg, x);
    }
    public static MemoryAddress get_start_index$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.get_start_index$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_start_index$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkHyperlinkClass.get_start_index$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_start_index get_start_index (MemorySegment segment, ResourceScope scope) {
        return get_start_index.ofAddress(get_start_index$get(segment), scope);
    }
    static final FunctionDescriptor is_valid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_valid$MH = RuntimeHelper.downcallHandle(
        _AtkHyperlinkClass.is_valid$FUNC, false
    );
    public interface is_valid {

        int apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(is_valid fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(is_valid.class, fi, _AtkHyperlinkClass.is_valid$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static is_valid ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("is_valid::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    return (int)_AtkHyperlinkClass.is_valid$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle is_valid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_valid"));
    public static VarHandle is_valid$VH() {
        return _AtkHyperlinkClass.is_valid$VH;
    }
    public static MemoryAddress is_valid$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.is_valid$VH.get(seg);
    }
    public static void is_valid$set( MemorySegment seg, MemoryAddress x) {
        _AtkHyperlinkClass.is_valid$VH.set(seg, x);
    }
    public static MemoryAddress is_valid$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.is_valid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_valid$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkHyperlinkClass.is_valid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_valid is_valid (MemorySegment segment, ResourceScope scope) {
        return is_valid.ofAddress(is_valid$get(segment), scope);
    }
    static final FunctionDescriptor get_n_anchors$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_n_anchors$MH = RuntimeHelper.downcallHandle(
        _AtkHyperlinkClass.get_n_anchors$FUNC, false
    );
    public interface get_n_anchors {

        int apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(get_n_anchors fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_n_anchors.class, fi, _AtkHyperlinkClass.get_n_anchors$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static get_n_anchors ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_n_anchors::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    return (int)_AtkHyperlinkClass.get_n_anchors$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_n_anchors$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_n_anchors"));
    public static VarHandle get_n_anchors$VH() {
        return _AtkHyperlinkClass.get_n_anchors$VH;
    }
    public static MemoryAddress get_n_anchors$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.get_n_anchors$VH.get(seg);
    }
    public static void get_n_anchors$set( MemorySegment seg, MemoryAddress x) {
        _AtkHyperlinkClass.get_n_anchors$VH.set(seg, x);
    }
    public static MemoryAddress get_n_anchors$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.get_n_anchors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_n_anchors$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkHyperlinkClass.get_n_anchors$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_n_anchors get_n_anchors (MemorySegment segment, ResourceScope scope) {
        return get_n_anchors.ofAddress(get_n_anchors$get(segment), scope);
    }
    static final FunctionDescriptor link_state$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle link_state$MH = RuntimeHelper.downcallHandle(
        _AtkHyperlinkClass.link_state$FUNC, false
    );
    public interface link_state {

        int apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(link_state fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(link_state.class, fi, _AtkHyperlinkClass.link_state$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static link_state ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("link_state::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    return (int)_AtkHyperlinkClass.link_state$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle link_state$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("link_state"));
    public static VarHandle link_state$VH() {
        return _AtkHyperlinkClass.link_state$VH;
    }
    public static MemoryAddress link_state$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.link_state$VH.get(seg);
    }
    public static void link_state$set( MemorySegment seg, MemoryAddress x) {
        _AtkHyperlinkClass.link_state$VH.set(seg, x);
    }
    public static MemoryAddress link_state$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.link_state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void link_state$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkHyperlinkClass.link_state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static link_state link_state (MemorySegment segment, ResourceScope scope) {
        return link_state.ofAddress(link_state$get(segment), scope);
    }
    static final FunctionDescriptor is_selected_link$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_selected_link$MH = RuntimeHelper.downcallHandle(
        _AtkHyperlinkClass.is_selected_link$FUNC, false
    );
    public interface is_selected_link {

        int apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(is_selected_link fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(is_selected_link.class, fi, _AtkHyperlinkClass.is_selected_link$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static is_selected_link ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("is_selected_link::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    return (int)_AtkHyperlinkClass.is_selected_link$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle is_selected_link$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_selected_link"));
    public static VarHandle is_selected_link$VH() {
        return _AtkHyperlinkClass.is_selected_link$VH;
    }
    public static MemoryAddress is_selected_link$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.is_selected_link$VH.get(seg);
    }
    public static void is_selected_link$set( MemorySegment seg, MemoryAddress x) {
        _AtkHyperlinkClass.is_selected_link$VH.set(seg, x);
    }
    public static MemoryAddress is_selected_link$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.is_selected_link$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_selected_link$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkHyperlinkClass.is_selected_link$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_selected_link is_selected_link (MemorySegment segment, ResourceScope scope) {
        return is_selected_link.ofAddress(is_selected_link$get(segment), scope);
    }
    static final FunctionDescriptor link_activated$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle link_activated$MH = RuntimeHelper.downcallHandle(
        _AtkHyperlinkClass.link_activated$FUNC, false
    );
    public interface link_activated {

        void apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(link_activated fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(link_activated.class, fi, _AtkHyperlinkClass.link_activated$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static link_activated ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("link_activated::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    _AtkHyperlinkClass.link_activated$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle link_activated$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("link_activated"));
    public static VarHandle link_activated$VH() {
        return _AtkHyperlinkClass.link_activated$VH;
    }
    public static MemoryAddress link_activated$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.link_activated$VH.get(seg);
    }
    public static void link_activated$set( MemorySegment seg, MemoryAddress x) {
        _AtkHyperlinkClass.link_activated$VH.set(seg, x);
    }
    public static MemoryAddress link_activated$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.link_activated$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void link_activated$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkHyperlinkClass.link_activated$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static link_activated link_activated (MemorySegment segment, ResourceScope scope) {
        return link_activated.ofAddress(link_activated$get(segment), scope);
    }
    static final VarHandle pad1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pad1"));
    public static VarHandle pad1$VH() {
        return _AtkHyperlinkClass.pad1$VH;
    }
    public static MemoryAddress pad1$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.pad1$VH.get(seg);
    }
    public static void pad1$set( MemorySegment seg, MemoryAddress x) {
        _AtkHyperlinkClass.pad1$VH.set(seg, x);
    }
    public static MemoryAddress pad1$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_AtkHyperlinkClass.pad1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pad1$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkHyperlinkClass.pad1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AtkFunction pad1 (MemorySegment segment, ResourceScope scope) {
        return AtkFunction.ofAddress(pad1$get(segment), scope);
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


