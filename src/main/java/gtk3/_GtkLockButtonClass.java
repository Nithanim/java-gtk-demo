// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GtkLockButtonClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
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
                        Constants$root.C_INT$LAYOUT.withName("activate_signal"),
                        MemoryLayout.paddingLayout(32),
                        Constants$root.C_POINTER$LAYOUT.withName("dispatch_child_properties_changed"),
                        Constants$root.C_POINTER$LAYOUT.withName("destroy"),
                        Constants$root.C_POINTER$LAYOUT.withName("show"),
                        Constants$root.C_POINTER$LAYOUT.withName("show_all"),
                        Constants$root.C_POINTER$LAYOUT.withName("hide"),
                        Constants$root.C_POINTER$LAYOUT.withName("map"),
                        Constants$root.C_POINTER$LAYOUT.withName("unmap"),
                        Constants$root.C_POINTER$LAYOUT.withName("realize"),
                        Constants$root.C_POINTER$LAYOUT.withName("unrealize"),
                        Constants$root.C_POINTER$LAYOUT.withName("size_allocate"),
                        Constants$root.C_POINTER$LAYOUT.withName("state_changed"),
                        Constants$root.C_POINTER$LAYOUT.withName("state_flags_changed"),
                        Constants$root.C_POINTER$LAYOUT.withName("parent_set"),
                        Constants$root.C_POINTER$LAYOUT.withName("hierarchy_changed"),
                        Constants$root.C_POINTER$LAYOUT.withName("style_set"),
                        Constants$root.C_POINTER$LAYOUT.withName("direction_changed"),
                        Constants$root.C_POINTER$LAYOUT.withName("grab_notify"),
                        Constants$root.C_POINTER$LAYOUT.withName("child_notify"),
                        Constants$root.C_POINTER$LAYOUT.withName("draw"),
                        Constants$root.C_POINTER$LAYOUT.withName("get_request_mode"),
                        Constants$root.C_POINTER$LAYOUT.withName("get_preferred_height"),
                        Constants$root.C_POINTER$LAYOUT.withName("get_preferred_width_for_height"),
                        Constants$root.C_POINTER$LAYOUT.withName("get_preferred_width"),
                        Constants$root.C_POINTER$LAYOUT.withName("get_preferred_height_for_width"),
                        Constants$root.C_POINTER$LAYOUT.withName("mnemonic_activate"),
                        Constants$root.C_POINTER$LAYOUT.withName("grab_focus"),
                        Constants$root.C_POINTER$LAYOUT.withName("focus"),
                        Constants$root.C_POINTER$LAYOUT.withName("move_focus"),
                        Constants$root.C_POINTER$LAYOUT.withName("keynav_failed"),
                        Constants$root.C_POINTER$LAYOUT.withName("event"),
                        Constants$root.C_POINTER$LAYOUT.withName("button_press_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("button_release_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("scroll_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("motion_notify_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("delete_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("destroy_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("key_press_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("key_release_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("enter_notify_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("leave_notify_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("configure_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("focus_in_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("focus_out_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("map_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("unmap_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("property_notify_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("selection_clear_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("selection_request_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("selection_notify_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("proximity_in_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("proximity_out_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("visibility_notify_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("window_state_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("damage_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("grab_broken_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("selection_get"),
                        Constants$root.C_POINTER$LAYOUT.withName("selection_received"),
                        Constants$root.C_POINTER$LAYOUT.withName("drag_begin"),
                        Constants$root.C_POINTER$LAYOUT.withName("drag_end"),
                        Constants$root.C_POINTER$LAYOUT.withName("drag_data_get"),
                        Constants$root.C_POINTER$LAYOUT.withName("drag_data_delete"),
                        Constants$root.C_POINTER$LAYOUT.withName("drag_leave"),
                        Constants$root.C_POINTER$LAYOUT.withName("drag_motion"),
                        Constants$root.C_POINTER$LAYOUT.withName("drag_drop"),
                        Constants$root.C_POINTER$LAYOUT.withName("drag_data_received"),
                        Constants$root.C_POINTER$LAYOUT.withName("drag_failed"),
                        Constants$root.C_POINTER$LAYOUT.withName("popup_menu"),
                        Constants$root.C_POINTER$LAYOUT.withName("show_help"),
                        Constants$root.C_POINTER$LAYOUT.withName("get_accessible"),
                        Constants$root.C_POINTER$LAYOUT.withName("screen_changed"),
                        Constants$root.C_POINTER$LAYOUT.withName("can_activate_accel"),
                        Constants$root.C_POINTER$LAYOUT.withName("composited_changed"),
                        Constants$root.C_POINTER$LAYOUT.withName("query_tooltip"),
                        Constants$root.C_POINTER$LAYOUT.withName("compute_expand"),
                        Constants$root.C_POINTER$LAYOUT.withName("adjust_size_request"),
                        Constants$root.C_POINTER$LAYOUT.withName("adjust_size_allocation"),
                        Constants$root.C_POINTER$LAYOUT.withName("style_updated"),
                        Constants$root.C_POINTER$LAYOUT.withName("touch_event"),
                        Constants$root.C_POINTER$LAYOUT.withName("get_preferred_height_and_baseline_for_width"),
                        Constants$root.C_POINTER$LAYOUT.withName("adjust_baseline_request"),
                        Constants$root.C_POINTER$LAYOUT.withName("adjust_baseline_allocation"),
                        Constants$root.C_POINTER$LAYOUT.withName("queue_draw_region"),
                        Constants$root.C_POINTER$LAYOUT.withName("priv"),
                        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved6"),
                        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved7")
                    ).withName("parent_class"),
                    Constants$root.C_POINTER$LAYOUT.withName("add"),
                    Constants$root.C_POINTER$LAYOUT.withName("remove"),
                    Constants$root.C_POINTER$LAYOUT.withName("check_resize"),
                    Constants$root.C_POINTER$LAYOUT.withName("forall"),
                    Constants$root.C_POINTER$LAYOUT.withName("set_focus_child"),
                    Constants$root.C_POINTER$LAYOUT.withName("child_type"),
                    Constants$root.C_POINTER$LAYOUT.withName("composite_name"),
                    Constants$root.C_POINTER$LAYOUT.withName("set_child_property"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_child_property"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_path_for_child"),
                    MemoryLayout.structLayout(
                        MemoryLayout.paddingLayout(1).withName("_handle_border_width"),
                        MemoryLayout.paddingLayout(63)
                    ),
                    Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
                    Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
                    Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
                    Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4"),
                    Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved5"),
                    Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved6"),
                    Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved7"),
                    Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved8")
                ).withName("parent_class"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
            ).withName("parent_class"),
            Constants$root.C_POINTER$LAYOUT.withName("pressed"),
            Constants$root.C_POINTER$LAYOUT.withName("released"),
            Constants$root.C_POINTER$LAYOUT.withName("clicked"),
            Constants$root.C_POINTER$LAYOUT.withName("enter"),
            Constants$root.C_POINTER$LAYOUT.withName("leave"),
            Constants$root.C_POINTER$LAYOUT.withName("activate"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("reserved0"),
        Constants$root.C_POINTER$LAYOUT.withName("reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("reserved4"),
        Constants$root.C_POINTER$LAYOUT.withName("reserved5"),
        Constants$root.C_POINTER$LAYOUT.withName("reserved6"),
        Constants$root.C_POINTER$LAYOUT.withName("reserved7")
    ).withName("_GtkLockButtonClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkLockButtonClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 1088);
    }
    static final FunctionDescriptor reserved0$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle reserved0$MH = RuntimeHelper.downcallHandle(
        _GtkLockButtonClass.reserved0$FUNC, false
    );
    public interface reserved0 {

        void apply();
        static NativeSymbol allocate(reserved0 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(reserved0.class, fi, _GtkLockButtonClass.reserved0$FUNC, "()V", scope);
        }
        static reserved0 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("reserved0::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkLockButtonClass.reserved0$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reserved0$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved0"));
    public static VarHandle reserved0$VH() {
        return _GtkLockButtonClass.reserved0$VH;
    }
    public static MemoryAddress reserved0$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved0$VH.get(seg);
    }
    public static void reserved0$set( MemorySegment seg, MemoryAddress x) {
        _GtkLockButtonClass.reserved0$VH.set(seg, x);
    }
    public static MemoryAddress reserved0$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved0$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkLockButtonClass.reserved0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved0 reserved0 (MemorySegment segment, ResourceScope scope) {
        return reserved0.ofAddress(reserved0$get(segment), scope);
    }
    static final FunctionDescriptor reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle reserved1$MH = RuntimeHelper.downcallHandle(
        _GtkLockButtonClass.reserved1$FUNC, false
    );
    public interface reserved1 {

        void apply();
        static NativeSymbol allocate(reserved1 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(reserved1.class, fi, _GtkLockButtonClass.reserved1$FUNC, "()V", scope);
        }
        static reserved1 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("reserved1::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkLockButtonClass.reserved1$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved1"));
    public static VarHandle reserved1$VH() {
        return _GtkLockButtonClass.reserved1$VH;
    }
    public static MemoryAddress reserved1$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved1$VH.get(seg);
    }
    public static void reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GtkLockButtonClass.reserved1$VH.set(seg, x);
    }
    public static MemoryAddress reserved1$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkLockButtonClass.reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved1 reserved1 (MemorySegment segment, ResourceScope scope) {
        return reserved1.ofAddress(reserved1$get(segment), scope);
    }
    static final FunctionDescriptor reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle reserved2$MH = RuntimeHelper.downcallHandle(
        _GtkLockButtonClass.reserved2$FUNC, false
    );
    public interface reserved2 {

        void apply();
        static NativeSymbol allocate(reserved2 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(reserved2.class, fi, _GtkLockButtonClass.reserved2$FUNC, "()V", scope);
        }
        static reserved2 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("reserved2::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkLockButtonClass.reserved2$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved2"));
    public static VarHandle reserved2$VH() {
        return _GtkLockButtonClass.reserved2$VH;
    }
    public static MemoryAddress reserved2$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved2$VH.get(seg);
    }
    public static void reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GtkLockButtonClass.reserved2$VH.set(seg, x);
    }
    public static MemoryAddress reserved2$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkLockButtonClass.reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved2 reserved2 (MemorySegment segment, ResourceScope scope) {
        return reserved2.ofAddress(reserved2$get(segment), scope);
    }
    static final FunctionDescriptor reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle reserved3$MH = RuntimeHelper.downcallHandle(
        _GtkLockButtonClass.reserved3$FUNC, false
    );
    public interface reserved3 {

        void apply();
        static NativeSymbol allocate(reserved3 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(reserved3.class, fi, _GtkLockButtonClass.reserved3$FUNC, "()V", scope);
        }
        static reserved3 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("reserved3::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkLockButtonClass.reserved3$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved3"));
    public static VarHandle reserved3$VH() {
        return _GtkLockButtonClass.reserved3$VH;
    }
    public static MemoryAddress reserved3$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved3$VH.get(seg);
    }
    public static void reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GtkLockButtonClass.reserved3$VH.set(seg, x);
    }
    public static MemoryAddress reserved3$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkLockButtonClass.reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved3 reserved3 (MemorySegment segment, ResourceScope scope) {
        return reserved3.ofAddress(reserved3$get(segment), scope);
    }
    static final FunctionDescriptor reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle reserved4$MH = RuntimeHelper.downcallHandle(
        _GtkLockButtonClass.reserved4$FUNC, false
    );
    public interface reserved4 {

        void apply();
        static NativeSymbol allocate(reserved4 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(reserved4.class, fi, _GtkLockButtonClass.reserved4$FUNC, "()V", scope);
        }
        static reserved4 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("reserved4::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkLockButtonClass.reserved4$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved4"));
    public static VarHandle reserved4$VH() {
        return _GtkLockButtonClass.reserved4$VH;
    }
    public static MemoryAddress reserved4$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved4$VH.get(seg);
    }
    public static void reserved4$set( MemorySegment seg, MemoryAddress x) {
        _GtkLockButtonClass.reserved4$VH.set(seg, x);
    }
    public static MemoryAddress reserved4$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkLockButtonClass.reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved4 reserved4 (MemorySegment segment, ResourceScope scope) {
        return reserved4.ofAddress(reserved4$get(segment), scope);
    }
    static final FunctionDescriptor reserved5$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle reserved5$MH = RuntimeHelper.downcallHandle(
        _GtkLockButtonClass.reserved5$FUNC, false
    );
    public interface reserved5 {

        void apply();
        static NativeSymbol allocate(reserved5 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(reserved5.class, fi, _GtkLockButtonClass.reserved5$FUNC, "()V", scope);
        }
        static reserved5 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("reserved5::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkLockButtonClass.reserved5$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reserved5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved5"));
    public static VarHandle reserved5$VH() {
        return _GtkLockButtonClass.reserved5$VH;
    }
    public static MemoryAddress reserved5$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved5$VH.get(seg);
    }
    public static void reserved5$set( MemorySegment seg, MemoryAddress x) {
        _GtkLockButtonClass.reserved5$VH.set(seg, x);
    }
    public static MemoryAddress reserved5$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved5$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkLockButtonClass.reserved5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved5 reserved5 (MemorySegment segment, ResourceScope scope) {
        return reserved5.ofAddress(reserved5$get(segment), scope);
    }
    static final FunctionDescriptor reserved6$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle reserved6$MH = RuntimeHelper.downcallHandle(
        _GtkLockButtonClass.reserved6$FUNC, false
    );
    public interface reserved6 {

        void apply();
        static NativeSymbol allocate(reserved6 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(reserved6.class, fi, _GtkLockButtonClass.reserved6$FUNC, "()V", scope);
        }
        static reserved6 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("reserved6::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkLockButtonClass.reserved6$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reserved6$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved6"));
    public static VarHandle reserved6$VH() {
        return _GtkLockButtonClass.reserved6$VH;
    }
    public static MemoryAddress reserved6$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved6$VH.get(seg);
    }
    public static void reserved6$set( MemorySegment seg, MemoryAddress x) {
        _GtkLockButtonClass.reserved6$VH.set(seg, x);
    }
    public static MemoryAddress reserved6$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved6$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved6$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkLockButtonClass.reserved6$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved6 reserved6 (MemorySegment segment, ResourceScope scope) {
        return reserved6.ofAddress(reserved6$get(segment), scope);
    }
    static final FunctionDescriptor reserved7$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle reserved7$MH = RuntimeHelper.downcallHandle(
        _GtkLockButtonClass.reserved7$FUNC, false
    );
    public interface reserved7 {

        void apply();
        static NativeSymbol allocate(reserved7 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(reserved7.class, fi, _GtkLockButtonClass.reserved7$FUNC, "()V", scope);
        }
        static reserved7 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("reserved7::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkLockButtonClass.reserved7$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reserved7$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved7"));
    public static VarHandle reserved7$VH() {
        return _GtkLockButtonClass.reserved7$VH;
    }
    public static MemoryAddress reserved7$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved7$VH.get(seg);
    }
    public static void reserved7$set( MemorySegment seg, MemoryAddress x) {
        _GtkLockButtonClass.reserved7$VH.set(seg, x);
    }
    public static MemoryAddress reserved7$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkLockButtonClass.reserved7$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved7$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkLockButtonClass.reserved7$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reserved7 reserved7 (MemorySegment segment, ResourceScope scope) {
        return reserved7.ofAddress(reserved7$get(segment), scope);
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


