// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GtkSearchEntryClass {

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
            Constants$root.C_POINTER$LAYOUT.withName("populate_popup"),
            Constants$root.C_POINTER$LAYOUT.withName("activate"),
            Constants$root.C_POINTER$LAYOUT.withName("move_cursor"),
            Constants$root.C_POINTER$LAYOUT.withName("insert_at_cursor"),
            Constants$root.C_POINTER$LAYOUT.withName("delete_from_cursor"),
            Constants$root.C_POINTER$LAYOUT.withName("backspace"),
            Constants$root.C_POINTER$LAYOUT.withName("cut_clipboard"),
            Constants$root.C_POINTER$LAYOUT.withName("copy_clipboard"),
            Constants$root.C_POINTER$LAYOUT.withName("paste_clipboard"),
            Constants$root.C_POINTER$LAYOUT.withName("toggle_overwrite"),
            Constants$root.C_POINTER$LAYOUT.withName("get_text_area_size"),
            Constants$root.C_POINTER$LAYOUT.withName("get_frame_size"),
            Constants$root.C_POINTER$LAYOUT.withName("insert_emoji"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved5"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved6")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("search_changed"),
        Constants$root.C_POINTER$LAYOUT.withName("next_match"),
        Constants$root.C_POINTER$LAYOUT.withName("previous_match"),
        Constants$root.C_POINTER$LAYOUT.withName("stop_search")
    ).withName("_GtkSearchEntryClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkSearchEntryClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 976);
    }
    static final FunctionDescriptor search_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle search_changed$MH = RuntimeHelper.downcallHandle(
        _GtkSearchEntryClass.search_changed$FUNC, false
    );
    public interface search_changed {

        void apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(search_changed fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(search_changed.class, fi, _GtkSearchEntryClass.search_changed$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static search_changed ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("search_changed::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    _GtkSearchEntryClass.search_changed$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle search_changed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("search_changed"));
    public static VarHandle search_changed$VH() {
        return _GtkSearchEntryClass.search_changed$VH;
    }
    public static MemoryAddress search_changed$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkSearchEntryClass.search_changed$VH.get(seg);
    }
    public static void search_changed$set( MemorySegment seg, MemoryAddress x) {
        _GtkSearchEntryClass.search_changed$VH.set(seg, x);
    }
    public static MemoryAddress search_changed$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkSearchEntryClass.search_changed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void search_changed$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkSearchEntryClass.search_changed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static search_changed search_changed (MemorySegment segment, ResourceScope scope) {
        return search_changed.ofAddress(search_changed$get(segment), scope);
    }
    static final FunctionDescriptor next_match$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle next_match$MH = RuntimeHelper.downcallHandle(
        _GtkSearchEntryClass.next_match$FUNC, false
    );
    public interface next_match {

        void apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(next_match fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(next_match.class, fi, _GtkSearchEntryClass.next_match$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static next_match ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("next_match::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    _GtkSearchEntryClass.next_match$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle next_match$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next_match"));
    public static VarHandle next_match$VH() {
        return _GtkSearchEntryClass.next_match$VH;
    }
    public static MemoryAddress next_match$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkSearchEntryClass.next_match$VH.get(seg);
    }
    public static void next_match$set( MemorySegment seg, MemoryAddress x) {
        _GtkSearchEntryClass.next_match$VH.set(seg, x);
    }
    public static MemoryAddress next_match$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkSearchEntryClass.next_match$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next_match$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkSearchEntryClass.next_match$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static next_match next_match (MemorySegment segment, ResourceScope scope) {
        return next_match.ofAddress(next_match$get(segment), scope);
    }
    static final FunctionDescriptor previous_match$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle previous_match$MH = RuntimeHelper.downcallHandle(
        _GtkSearchEntryClass.previous_match$FUNC, false
    );
    public interface previous_match {

        void apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(previous_match fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(previous_match.class, fi, _GtkSearchEntryClass.previous_match$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static previous_match ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("previous_match::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    _GtkSearchEntryClass.previous_match$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle previous_match$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("previous_match"));
    public static VarHandle previous_match$VH() {
        return _GtkSearchEntryClass.previous_match$VH;
    }
    public static MemoryAddress previous_match$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkSearchEntryClass.previous_match$VH.get(seg);
    }
    public static void previous_match$set( MemorySegment seg, MemoryAddress x) {
        _GtkSearchEntryClass.previous_match$VH.set(seg, x);
    }
    public static MemoryAddress previous_match$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkSearchEntryClass.previous_match$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void previous_match$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkSearchEntryClass.previous_match$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static previous_match previous_match (MemorySegment segment, ResourceScope scope) {
        return previous_match.ofAddress(previous_match$get(segment), scope);
    }
    static final FunctionDescriptor stop_search$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle stop_search$MH = RuntimeHelper.downcallHandle(
        _GtkSearchEntryClass.stop_search$FUNC, false
    );
    public interface stop_search {

        void apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(stop_search fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(stop_search.class, fi, _GtkSearchEntryClass.stop_search$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static stop_search ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("stop_search::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    _GtkSearchEntryClass.stop_search$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle stop_search$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("stop_search"));
    public static VarHandle stop_search$VH() {
        return _GtkSearchEntryClass.stop_search$VH;
    }
    public static MemoryAddress stop_search$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkSearchEntryClass.stop_search$VH.get(seg);
    }
    public static void stop_search$set( MemorySegment seg, MemoryAddress x) {
        _GtkSearchEntryClass.stop_search$VH.set(seg, x);
    }
    public static MemoryAddress stop_search$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GtkSearchEntryClass.stop_search$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void stop_search$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkSearchEntryClass.stop_search$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static stop_search stop_search (MemorySegment segment, ResourceScope scope) {
        return stop_search.ofAddress(stop_search$get(segment), scope);
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


