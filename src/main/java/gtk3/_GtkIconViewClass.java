// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GtkIconViewClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
        Constants$root.C_POINTER$LAYOUT.withName("item_activated"),
        Constants$root.C_POINTER$LAYOUT.withName("selection_changed"),
        Constants$root.C_POINTER$LAYOUT.withName("select_all"),
        Constants$root.C_POINTER$LAYOUT.withName("unselect_all"),
        Constants$root.C_POINTER$LAYOUT.withName("select_cursor_item"),
        Constants$root.C_POINTER$LAYOUT.withName("toggle_cursor_item"),
        Constants$root.C_POINTER$LAYOUT.withName("move_cursor"),
        Constants$root.C_POINTER$LAYOUT.withName("activate_cursor_item"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
    ).withName("_GtkIconViewClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkIconViewClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 976);
    }
    static final FunctionDescriptor item_activated$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle item_activated$MH = RuntimeHelper.downcallHandle(
        _GtkIconViewClass.item_activated$FUNC, false
    );
    public interface item_activated {

        void apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1);
        static NativeSymbol allocate(item_activated fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(item_activated.class, fi, _GtkIconViewClass.item_activated$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static item_activated ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("item_activated::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1) -> {
                try {
                    _GtkIconViewClass.item_activated$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle item_activated$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("item_activated"));
    public static VarHandle item_activated$VH() {
        return _GtkIconViewClass.item_activated$VH;
    }
    public static MemoryAddress item_activated$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.item_activated$VH.get(seg);
    }
    public static void item_activated$set( MemorySegment seg, MemoryAddress x) {
        _GtkIconViewClass.item_activated$VH.set(seg, x);
    }
    public static MemoryAddress item_activated$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.item_activated$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void item_activated$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIconViewClass.item_activated$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static item_activated item_activated (MemorySegment segment, ResourceScope scope) {
        return item_activated.ofAddress(item_activated$get(segment), scope);
    }
    static final FunctionDescriptor selection_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle selection_changed$MH = RuntimeHelper.downcallHandle(
        _GtkIconViewClass.selection_changed$FUNC, false
    );
    public interface selection_changed {

        void apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(selection_changed fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(selection_changed.class, fi, _GtkIconViewClass.selection_changed$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static selection_changed ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("selection_changed::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    _GtkIconViewClass.selection_changed$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle selection_changed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("selection_changed"));
    public static VarHandle selection_changed$VH() {
        return _GtkIconViewClass.selection_changed$VH;
    }
    public static MemoryAddress selection_changed$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.selection_changed$VH.get(seg);
    }
    public static void selection_changed$set( MemorySegment seg, MemoryAddress x) {
        _GtkIconViewClass.selection_changed$VH.set(seg, x);
    }
    public static MemoryAddress selection_changed$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.selection_changed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void selection_changed$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIconViewClass.selection_changed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static selection_changed selection_changed (MemorySegment segment, ResourceScope scope) {
        return selection_changed.ofAddress(selection_changed$get(segment), scope);
    }
    static final FunctionDescriptor select_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle select_all$MH = RuntimeHelper.downcallHandle(
        _GtkIconViewClass.select_all$FUNC, false
    );
    public interface select_all {

        void apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(select_all fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(select_all.class, fi, _GtkIconViewClass.select_all$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static select_all ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("select_all::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    _GtkIconViewClass.select_all$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle select_all$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("select_all"));
    public static VarHandle select_all$VH() {
        return _GtkIconViewClass.select_all$VH;
    }
    public static MemoryAddress select_all$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.select_all$VH.get(seg);
    }
    public static void select_all$set( MemorySegment seg, MemoryAddress x) {
        _GtkIconViewClass.select_all$VH.set(seg, x);
    }
    public static MemoryAddress select_all$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.select_all$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void select_all$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIconViewClass.select_all$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static select_all select_all (MemorySegment segment, ResourceScope scope) {
        return select_all.ofAddress(select_all$get(segment), scope);
    }
    static final FunctionDescriptor unselect_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle unselect_all$MH = RuntimeHelper.downcallHandle(
        _GtkIconViewClass.unselect_all$FUNC, false
    );
    public interface unselect_all {

        void apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(unselect_all fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(unselect_all.class, fi, _GtkIconViewClass.unselect_all$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static unselect_all ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("unselect_all::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    _GtkIconViewClass.unselect_all$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle unselect_all$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("unselect_all"));
    public static VarHandle unselect_all$VH() {
        return _GtkIconViewClass.unselect_all$VH;
    }
    public static MemoryAddress unselect_all$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.unselect_all$VH.get(seg);
    }
    public static void unselect_all$set( MemorySegment seg, MemoryAddress x) {
        _GtkIconViewClass.unselect_all$VH.set(seg, x);
    }
    public static MemoryAddress unselect_all$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.unselect_all$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void unselect_all$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIconViewClass.unselect_all$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static unselect_all unselect_all (MemorySegment segment, ResourceScope scope) {
        return unselect_all.ofAddress(unselect_all$get(segment), scope);
    }
    static final FunctionDescriptor select_cursor_item$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle select_cursor_item$MH = RuntimeHelper.downcallHandle(
        _GtkIconViewClass.select_cursor_item$FUNC, false
    );
    public interface select_cursor_item {

        void apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(select_cursor_item fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(select_cursor_item.class, fi, _GtkIconViewClass.select_cursor_item$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static select_cursor_item ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("select_cursor_item::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    _GtkIconViewClass.select_cursor_item$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle select_cursor_item$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("select_cursor_item"));
    public static VarHandle select_cursor_item$VH() {
        return _GtkIconViewClass.select_cursor_item$VH;
    }
    public static MemoryAddress select_cursor_item$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.select_cursor_item$VH.get(seg);
    }
    public static void select_cursor_item$set( MemorySegment seg, MemoryAddress x) {
        _GtkIconViewClass.select_cursor_item$VH.set(seg, x);
    }
    public static MemoryAddress select_cursor_item$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.select_cursor_item$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void select_cursor_item$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIconViewClass.select_cursor_item$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static select_cursor_item select_cursor_item (MemorySegment segment, ResourceScope scope) {
        return select_cursor_item.ofAddress(select_cursor_item$get(segment), scope);
    }
    static final FunctionDescriptor toggle_cursor_item$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle toggle_cursor_item$MH = RuntimeHelper.downcallHandle(
        _GtkIconViewClass.toggle_cursor_item$FUNC, false
    );
    public interface toggle_cursor_item {

        void apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(toggle_cursor_item fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(toggle_cursor_item.class, fi, _GtkIconViewClass.toggle_cursor_item$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static toggle_cursor_item ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("toggle_cursor_item::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    _GtkIconViewClass.toggle_cursor_item$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle toggle_cursor_item$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("toggle_cursor_item"));
    public static VarHandle toggle_cursor_item$VH() {
        return _GtkIconViewClass.toggle_cursor_item$VH;
    }
    public static MemoryAddress toggle_cursor_item$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.toggle_cursor_item$VH.get(seg);
    }
    public static void toggle_cursor_item$set( MemorySegment seg, MemoryAddress x) {
        _GtkIconViewClass.toggle_cursor_item$VH.set(seg, x);
    }
    public static MemoryAddress toggle_cursor_item$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.toggle_cursor_item$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void toggle_cursor_item$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIconViewClass.toggle_cursor_item$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static toggle_cursor_item toggle_cursor_item (MemorySegment segment, ResourceScope scope) {
        return toggle_cursor_item.ofAddress(toggle_cursor_item$get(segment), scope);
    }
    static final FunctionDescriptor move_cursor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle move_cursor$MH = RuntimeHelper.downcallHandle(
        _GtkIconViewClass.move_cursor$FUNC, false
    );
    public interface move_cursor {

        int apply(jdk.incubator.foreign.MemoryAddress _x0, int _x1, int _x2);
        static NativeSymbol allocate(move_cursor fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(move_cursor.class, fi, _GtkIconViewClass.move_cursor$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;II)I", scope);
        }
        static move_cursor ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("move_cursor::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, int _x1, int _x2) -> {
                try {
                    return (int)_GtkIconViewClass.move_cursor$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, _x1, _x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle move_cursor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("move_cursor"));
    public static VarHandle move_cursor$VH() {
        return _GtkIconViewClass.move_cursor$VH;
    }
    public static MemoryAddress move_cursor$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.move_cursor$VH.get(seg);
    }
    public static void move_cursor$set( MemorySegment seg, MemoryAddress x) {
        _GtkIconViewClass.move_cursor$VH.set(seg, x);
    }
    public static MemoryAddress move_cursor$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.move_cursor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void move_cursor$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIconViewClass.move_cursor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static move_cursor move_cursor (MemorySegment segment, ResourceScope scope) {
        return move_cursor.ofAddress(move_cursor$get(segment), scope);
    }
    static final FunctionDescriptor activate_cursor_item$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle activate_cursor_item$MH = RuntimeHelper.downcallHandle(
        _GtkIconViewClass.activate_cursor_item$FUNC, false
    );
    public interface activate_cursor_item {

        int apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(activate_cursor_item fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(activate_cursor_item.class, fi, _GtkIconViewClass.activate_cursor_item$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static activate_cursor_item ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("activate_cursor_item::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    return (int)_GtkIconViewClass.activate_cursor_item$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle activate_cursor_item$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("activate_cursor_item"));
    public static VarHandle activate_cursor_item$VH() {
        return _GtkIconViewClass.activate_cursor_item$VH;
    }
    public static MemoryAddress activate_cursor_item$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.activate_cursor_item$VH.get(seg);
    }
    public static void activate_cursor_item$set( MemorySegment seg, MemoryAddress x) {
        _GtkIconViewClass.activate_cursor_item$VH.set(seg, x);
    }
    public static MemoryAddress activate_cursor_item$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass.activate_cursor_item$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void activate_cursor_item$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIconViewClass.activate_cursor_item$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate_cursor_item activate_cursor_item (MemorySegment segment, ResourceScope scope) {
        return activate_cursor_item.ofAddress(activate_cursor_item$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1$MH = RuntimeHelper.downcallHandle(
        _GtkIconViewClass._gtk_reserved1$FUNC, false
    );
    public interface _gtk_reserved1 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved1 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved1.class, fi, _GtkIconViewClass._gtk_reserved1$FUNC, "()V", scope);
        }
        static _gtk_reserved1 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved1::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkIconViewClass._gtk_reserved1$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    public static VarHandle _gtk_reserved1$VH() {
        return _GtkIconViewClass._gtk_reserved1$VH;
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass._gtk_reserved1$VH.get(seg);
    }
    public static void _gtk_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GtkIconViewClass._gtk_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass._gtk_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIconViewClass._gtk_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2$MH = RuntimeHelper.downcallHandle(
        _GtkIconViewClass._gtk_reserved2$FUNC, false
    );
    public interface _gtk_reserved2 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved2 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved2.class, fi, _GtkIconViewClass._gtk_reserved2$FUNC, "()V", scope);
        }
        static _gtk_reserved2 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved2::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkIconViewClass._gtk_reserved2$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    public static VarHandle _gtk_reserved2$VH() {
        return _GtkIconViewClass._gtk_reserved2$VH;
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass._gtk_reserved2$VH.get(seg);
    }
    public static void _gtk_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GtkIconViewClass._gtk_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass._gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIconViewClass._gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3$MH = RuntimeHelper.downcallHandle(
        _GtkIconViewClass._gtk_reserved3$FUNC, false
    );
    public interface _gtk_reserved3 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved3 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved3.class, fi, _GtkIconViewClass._gtk_reserved3$FUNC, "()V", scope);
        }
        static _gtk_reserved3 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved3::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkIconViewClass._gtk_reserved3$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    public static VarHandle _gtk_reserved3$VH() {
        return _GtkIconViewClass._gtk_reserved3$VH;
    }
    public static MemoryAddress _gtk_reserved3$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass._gtk_reserved3$VH.get(seg);
    }
    public static void _gtk_reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GtkIconViewClass._gtk_reserved3$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved3$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass._gtk_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIconViewClass._gtk_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3 (MemorySegment segment, ResourceScope scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4$MH = RuntimeHelper.downcallHandle(
        _GtkIconViewClass._gtk_reserved4$FUNC, false
    );
    public interface _gtk_reserved4 {

        void apply();
        static NativeSymbol allocate(_gtk_reserved4 fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_gtk_reserved4.class, fi, _GtkIconViewClass._gtk_reserved4$FUNC, "()V", scope);
        }
        static _gtk_reserved4 ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("_gtk_reserved4::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
                try {
                    _GtkIconViewClass._gtk_reserved4$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    public static VarHandle _gtk_reserved4$VH() {
        return _GtkIconViewClass._gtk_reserved4$VH;
    }
    public static MemoryAddress _gtk_reserved4$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass._gtk_reserved4$VH.get(seg);
    }
    public static void _gtk_reserved4$set( MemorySegment seg, MemoryAddress x) {
        _GtkIconViewClass._gtk_reserved4$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved4$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkIconViewClass._gtk_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkIconViewClass._gtk_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
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

