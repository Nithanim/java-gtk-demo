// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _PangoLogAttr {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(1).withName("is_line_break"),
            MemoryLayout.paddingLayout(1).withName("is_mandatory_break"),
            MemoryLayout.paddingLayout(1).withName("is_char_break"),
            MemoryLayout.paddingLayout(1).withName("is_white"),
            MemoryLayout.paddingLayout(1).withName("is_cursor_position"),
            MemoryLayout.paddingLayout(1).withName("is_word_start"),
            MemoryLayout.paddingLayout(1).withName("is_word_end"),
            MemoryLayout.paddingLayout(1).withName("is_sentence_boundary"),
            MemoryLayout.paddingLayout(1).withName("is_sentence_start"),
            MemoryLayout.paddingLayout(1).withName("is_sentence_end"),
            MemoryLayout.paddingLayout(1).withName("backspace_deletes_character"),
            MemoryLayout.paddingLayout(1).withName("is_expandable_space"),
            MemoryLayout.paddingLayout(1).withName("is_word_boundary"),
            MemoryLayout.paddingLayout(19)
        )
    ).withName("_PangoLogAttr");
    public static MemoryLayout $LAYOUT() {
        return _PangoLogAttr.$struct$LAYOUT;
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

