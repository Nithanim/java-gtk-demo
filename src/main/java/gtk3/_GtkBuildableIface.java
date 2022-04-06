// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GtkBuildableIface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("set_name"),
        Constants$root.C_POINTER$LAYOUT.withName("get_name"),
        Constants$root.C_POINTER$LAYOUT.withName("add_child"),
        Constants$root.C_POINTER$LAYOUT.withName("set_buildable_property"),
        Constants$root.C_POINTER$LAYOUT.withName("construct_child"),
        Constants$root.C_POINTER$LAYOUT.withName("custom_tag_start"),
        Constants$root.C_POINTER$LAYOUT.withName("custom_tag_end"),
        Constants$root.C_POINTER$LAYOUT.withName("custom_finished"),
        Constants$root.C_POINTER$LAYOUT.withName("parser_finished"),
        Constants$root.C_POINTER$LAYOUT.withName("get_internal_child")
    ).withName("_GtkBuildableIface");
    public static MemoryLayout $LAYOUT() {
        return _GtkBuildableIface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor set_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_name$MH = RuntimeHelper.downcallHandle(
        _GtkBuildableIface.set_name$FUNC, false
    );
    public interface set_name {

        void apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1);
        static NativeSymbol allocate(set_name fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(set_name.class, fi, _GtkBuildableIface.set_name$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static set_name ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("set_name::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1) -> {
                try {
                    _GtkBuildableIface.set_name$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle set_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_name"));
    public static VarHandle set_name$VH() {
        return _GtkBuildableIface.set_name$VH;
    }
    public static MemoryAddress set_name$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.set_name$VH.get(seg);
    }
    public static void set_name$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuildableIface.set_name$VH.set(seg, x);
    }
    public static MemoryAddress set_name$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.set_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuildableIface.set_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_name set_name (MemorySegment segment, ResourceScope scope) {
        return set_name.ofAddress(set_name$get(segment), scope);
    }
    static final FunctionDescriptor get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_name$MH = RuntimeHelper.downcallHandle(
        _GtkBuildableIface.get_name$FUNC, false
    );
    public interface get_name {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(get_name fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_name.class, fi, _GtkBuildableIface.get_name$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_name ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_name::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.get_name$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_name"));
    public static VarHandle get_name$VH() {
        return _GtkBuildableIface.get_name$VH;
    }
    public static MemoryAddress get_name$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.get_name$VH.get(seg);
    }
    public static void get_name$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuildableIface.get_name$VH.set(seg, x);
    }
    public static MemoryAddress get_name$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.get_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuildableIface.get_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_name get_name (MemorySegment segment, ResourceScope scope) {
        return get_name.ofAddress(get_name$get(segment), scope);
    }
    static final FunctionDescriptor add_child$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle add_child$MH = RuntimeHelper.downcallHandle(
        _GtkBuildableIface.add_child$FUNC, false
    );
    public interface add_child {

        void apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2, jdk.incubator.foreign.MemoryAddress _x3);
        static NativeSymbol allocate(add_child fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(add_child.class, fi, _GtkBuildableIface.add_child$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static add_child ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("add_child::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2, jdk.incubator.foreign.MemoryAddress _x3) -> {
                try {
                    _GtkBuildableIface.add_child$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, (jdk.incubator.foreign.Addressable)_x2, (jdk.incubator.foreign.Addressable)_x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle add_child$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("add_child"));
    public static VarHandle add_child$VH() {
        return _GtkBuildableIface.add_child$VH;
    }
    public static MemoryAddress add_child$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.add_child$VH.get(seg);
    }
    public static void add_child$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuildableIface.add_child$VH.set(seg, x);
    }
    public static MemoryAddress add_child$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.add_child$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void add_child$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuildableIface.add_child$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static add_child add_child (MemorySegment segment, ResourceScope scope) {
        return add_child.ofAddress(add_child$get(segment), scope);
    }
    static final FunctionDescriptor set_buildable_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_buildable_property$MH = RuntimeHelper.downcallHandle(
        _GtkBuildableIface.set_buildable_property$FUNC, false
    );
    public interface set_buildable_property {

        void apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2, jdk.incubator.foreign.MemoryAddress _x3);
        static NativeSymbol allocate(set_buildable_property fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(set_buildable_property.class, fi, _GtkBuildableIface.set_buildable_property$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static set_buildable_property ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("set_buildable_property::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2, jdk.incubator.foreign.MemoryAddress _x3) -> {
                try {
                    _GtkBuildableIface.set_buildable_property$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, (jdk.incubator.foreign.Addressable)_x2, (jdk.incubator.foreign.Addressable)_x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle set_buildable_property$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_buildable_property"));
    public static VarHandle set_buildable_property$VH() {
        return _GtkBuildableIface.set_buildable_property$VH;
    }
    public static MemoryAddress set_buildable_property$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.set_buildable_property$VH.get(seg);
    }
    public static void set_buildable_property$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuildableIface.set_buildable_property$VH.set(seg, x);
    }
    public static MemoryAddress set_buildable_property$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.set_buildable_property$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_buildable_property$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuildableIface.set_buildable_property$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_buildable_property set_buildable_property (MemorySegment segment, ResourceScope scope) {
        return set_buildable_property.ofAddress(set_buildable_property$get(segment), scope);
    }
    static final FunctionDescriptor construct_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle construct_child$MH = RuntimeHelper.downcallHandle(
        _GtkBuildableIface.construct_child$FUNC, false
    );
    public interface construct_child {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2);
        static NativeSymbol allocate(construct_child fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(construct_child.class, fi, _GtkBuildableIface.construct_child$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static construct_child ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("construct_child::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.construct_child$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, (jdk.incubator.foreign.Addressable)_x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle construct_child$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("construct_child"));
    public static VarHandle construct_child$VH() {
        return _GtkBuildableIface.construct_child$VH;
    }
    public static MemoryAddress construct_child$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.construct_child$VH.get(seg);
    }
    public static void construct_child$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuildableIface.construct_child$VH.set(seg, x);
    }
    public static MemoryAddress construct_child$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.construct_child$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void construct_child$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuildableIface.construct_child$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static construct_child construct_child (MemorySegment segment, ResourceScope scope) {
        return construct_child.ofAddress(construct_child$get(segment), scope);
    }
    static final FunctionDescriptor custom_tag_start$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle custom_tag_start$MH = RuntimeHelper.downcallHandle(
        _GtkBuildableIface.custom_tag_start$FUNC, false
    );
    public interface custom_tag_start {

        int apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2, jdk.incubator.foreign.MemoryAddress _x3, jdk.incubator.foreign.MemoryAddress _x4, jdk.incubator.foreign.MemoryAddress _x5);
        static NativeSymbol allocate(custom_tag_start fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(custom_tag_start.class, fi, _GtkBuildableIface.custom_tag_start$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static custom_tag_start ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("custom_tag_start::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2, jdk.incubator.foreign.MemoryAddress _x3, jdk.incubator.foreign.MemoryAddress _x4, jdk.incubator.foreign.MemoryAddress _x5) -> {
                try {
                    return (int)_GtkBuildableIface.custom_tag_start$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, (jdk.incubator.foreign.Addressable)_x2, (jdk.incubator.foreign.Addressable)_x3, (jdk.incubator.foreign.Addressable)_x4, (jdk.incubator.foreign.Addressable)_x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle custom_tag_start$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("custom_tag_start"));
    public static VarHandle custom_tag_start$VH() {
        return _GtkBuildableIface.custom_tag_start$VH;
    }
    public static MemoryAddress custom_tag_start$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.custom_tag_start$VH.get(seg);
    }
    public static void custom_tag_start$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuildableIface.custom_tag_start$VH.set(seg, x);
    }
    public static MemoryAddress custom_tag_start$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.custom_tag_start$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void custom_tag_start$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuildableIface.custom_tag_start$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static custom_tag_start custom_tag_start (MemorySegment segment, ResourceScope scope) {
        return custom_tag_start.ofAddress(custom_tag_start$get(segment), scope);
    }
    static final FunctionDescriptor custom_tag_end$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle custom_tag_end$MH = RuntimeHelper.downcallHandle(
        _GtkBuildableIface.custom_tag_end$FUNC, false
    );
    public interface custom_tag_end {

        void apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2, jdk.incubator.foreign.MemoryAddress _x3, jdk.incubator.foreign.MemoryAddress _x4);
        static NativeSymbol allocate(custom_tag_end fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(custom_tag_end.class, fi, _GtkBuildableIface.custom_tag_end$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static custom_tag_end ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("custom_tag_end::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2, jdk.incubator.foreign.MemoryAddress _x3, jdk.incubator.foreign.MemoryAddress _x4) -> {
                try {
                    _GtkBuildableIface.custom_tag_end$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, (jdk.incubator.foreign.Addressable)_x2, (jdk.incubator.foreign.Addressable)_x3, (jdk.incubator.foreign.Addressable)_x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle custom_tag_end$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("custom_tag_end"));
    public static VarHandle custom_tag_end$VH() {
        return _GtkBuildableIface.custom_tag_end$VH;
    }
    public static MemoryAddress custom_tag_end$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.custom_tag_end$VH.get(seg);
    }
    public static void custom_tag_end$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuildableIface.custom_tag_end$VH.set(seg, x);
    }
    public static MemoryAddress custom_tag_end$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.custom_tag_end$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void custom_tag_end$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuildableIface.custom_tag_end$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static custom_tag_end custom_tag_end (MemorySegment segment, ResourceScope scope) {
        return custom_tag_end.ofAddress(custom_tag_end$get(segment), scope);
    }
    static final FunctionDescriptor custom_finished$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle custom_finished$MH = RuntimeHelper.downcallHandle(
        _GtkBuildableIface.custom_finished$FUNC, false
    );
    public interface custom_finished {

        void apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2, jdk.incubator.foreign.MemoryAddress _x3, jdk.incubator.foreign.MemoryAddress _x4);
        static NativeSymbol allocate(custom_finished fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(custom_finished.class, fi, _GtkBuildableIface.custom_finished$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static custom_finished ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("custom_finished::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2, jdk.incubator.foreign.MemoryAddress _x3, jdk.incubator.foreign.MemoryAddress _x4) -> {
                try {
                    _GtkBuildableIface.custom_finished$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, (jdk.incubator.foreign.Addressable)_x2, (jdk.incubator.foreign.Addressable)_x3, (jdk.incubator.foreign.Addressable)_x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle custom_finished$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("custom_finished"));
    public static VarHandle custom_finished$VH() {
        return _GtkBuildableIface.custom_finished$VH;
    }
    public static MemoryAddress custom_finished$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.custom_finished$VH.get(seg);
    }
    public static void custom_finished$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuildableIface.custom_finished$VH.set(seg, x);
    }
    public static MemoryAddress custom_finished$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.custom_finished$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void custom_finished$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuildableIface.custom_finished$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static custom_finished custom_finished (MemorySegment segment, ResourceScope scope) {
        return custom_finished.ofAddress(custom_finished$get(segment), scope);
    }
    static final FunctionDescriptor parser_finished$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle parser_finished$MH = RuntimeHelper.downcallHandle(
        _GtkBuildableIface.parser_finished$FUNC, false
    );
    public interface parser_finished {

        void apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1);
        static NativeSymbol allocate(parser_finished fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(parser_finished.class, fi, _GtkBuildableIface.parser_finished$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static parser_finished ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("parser_finished::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1) -> {
                try {
                    _GtkBuildableIface.parser_finished$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle parser_finished$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("parser_finished"));
    public static VarHandle parser_finished$VH() {
        return _GtkBuildableIface.parser_finished$VH;
    }
    public static MemoryAddress parser_finished$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.parser_finished$VH.get(seg);
    }
    public static void parser_finished$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuildableIface.parser_finished$VH.set(seg, x);
    }
    public static MemoryAddress parser_finished$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.parser_finished$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void parser_finished$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuildableIface.parser_finished$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static parser_finished parser_finished (MemorySegment segment, ResourceScope scope) {
        return parser_finished.ofAddress(parser_finished$get(segment), scope);
    }
    static final FunctionDescriptor get_internal_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_internal_child$MH = RuntimeHelper.downcallHandle(
        _GtkBuildableIface.get_internal_child$FUNC, false
    );
    public interface get_internal_child {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2);
        static NativeSymbol allocate(get_internal_child fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(get_internal_child.class, fi, _GtkBuildableIface.get_internal_child$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static get_internal_child ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("get_internal_child::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1, jdk.incubator.foreign.MemoryAddress _x2) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.get_internal_child$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1, (jdk.incubator.foreign.Addressable)_x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_internal_child$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_internal_child"));
    public static VarHandle get_internal_child$VH() {
        return _GtkBuildableIface.get_internal_child$VH;
    }
    public static MemoryAddress get_internal_child$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.get_internal_child$VH.get(seg);
    }
    public static void get_internal_child$set( MemorySegment seg, MemoryAddress x) {
        _GtkBuildableIface.get_internal_child$VH.set(seg, x);
    }
    public static MemoryAddress get_internal_child$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkBuildableIface.get_internal_child$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_internal_child$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBuildableIface.get_internal_child$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_internal_child get_internal_child (MemorySegment segment, ResourceScope scope) {
        return get_internal_child.ofAddress(get_internal_child$get(segment), scope);
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

