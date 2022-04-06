// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _GScannerConfig {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("cset_skip_characters"),
        Constants$root.C_POINTER$LAYOUT.withName("cset_identifier_first"),
        Constants$root.C_POINTER$LAYOUT.withName("cset_identifier_nth"),
        Constants$root.C_POINTER$LAYOUT.withName("cpair_comment_single"),
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(1).withName("case_sensitive"),
            MemoryLayout.paddingLayout(1).withName("skip_comment_multi"),
            MemoryLayout.paddingLayout(1).withName("skip_comment_single"),
            MemoryLayout.paddingLayout(1).withName("scan_comment_multi"),
            MemoryLayout.paddingLayout(1).withName("scan_identifier"),
            MemoryLayout.paddingLayout(1).withName("scan_identifier_1char"),
            MemoryLayout.paddingLayout(1).withName("scan_identifier_NULL"),
            MemoryLayout.paddingLayout(1).withName("scan_symbols"),
            MemoryLayout.paddingLayout(1).withName("scan_binary"),
            MemoryLayout.paddingLayout(1).withName("scan_octal"),
            MemoryLayout.paddingLayout(1).withName("scan_float"),
            MemoryLayout.paddingLayout(1).withName("scan_hex"),
            MemoryLayout.paddingLayout(1).withName("scan_hex_dollar"),
            MemoryLayout.paddingLayout(1).withName("scan_string_sq"),
            MemoryLayout.paddingLayout(1).withName("scan_string_dq"),
            MemoryLayout.paddingLayout(1).withName("numbers_2_int"),
            MemoryLayout.paddingLayout(1).withName("int_2_float"),
            MemoryLayout.paddingLayout(1).withName("identifier_2_string"),
            MemoryLayout.paddingLayout(1).withName("char_2_token"),
            MemoryLayout.paddingLayout(1).withName("symbol_2_token"),
            MemoryLayout.paddingLayout(1).withName("scope_0_fallback"),
            MemoryLayout.paddingLayout(1).withName("store_int64"),
            MemoryLayout.paddingLayout(10)
        ),
        Constants$root.C_INT$LAYOUT.withName("padding_dummy")
    ).withName("_GScannerConfig");
    public static MemoryLayout $LAYOUT() {
        return _GScannerConfig.$struct$LAYOUT;
    }
    static final VarHandle cset_skip_characters$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cset_skip_characters"));
    public static VarHandle cset_skip_characters$VH() {
        return _GScannerConfig.cset_skip_characters$VH;
    }
    public static MemoryAddress cset_skip_characters$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GScannerConfig.cset_skip_characters$VH.get(seg);
    }
    public static void cset_skip_characters$set( MemorySegment seg, MemoryAddress x) {
        _GScannerConfig.cset_skip_characters$VH.set(seg, x);
    }
    public static MemoryAddress cset_skip_characters$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GScannerConfig.cset_skip_characters$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cset_skip_characters$set(MemorySegment seg, long index, MemoryAddress x) {
        _GScannerConfig.cset_skip_characters$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cset_identifier_first$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_first"));
    public static VarHandle cset_identifier_first$VH() {
        return _GScannerConfig.cset_identifier_first$VH;
    }
    public static MemoryAddress cset_identifier_first$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GScannerConfig.cset_identifier_first$VH.get(seg);
    }
    public static void cset_identifier_first$set( MemorySegment seg, MemoryAddress x) {
        _GScannerConfig.cset_identifier_first$VH.set(seg, x);
    }
    public static MemoryAddress cset_identifier_first$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GScannerConfig.cset_identifier_first$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cset_identifier_first$set(MemorySegment seg, long index, MemoryAddress x) {
        _GScannerConfig.cset_identifier_first$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cset_identifier_nth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cset_identifier_nth"));
    public static VarHandle cset_identifier_nth$VH() {
        return _GScannerConfig.cset_identifier_nth$VH;
    }
    public static MemoryAddress cset_identifier_nth$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GScannerConfig.cset_identifier_nth$VH.get(seg);
    }
    public static void cset_identifier_nth$set( MemorySegment seg, MemoryAddress x) {
        _GScannerConfig.cset_identifier_nth$VH.set(seg, x);
    }
    public static MemoryAddress cset_identifier_nth$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GScannerConfig.cset_identifier_nth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cset_identifier_nth$set(MemorySegment seg, long index, MemoryAddress x) {
        _GScannerConfig.cset_identifier_nth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cpair_comment_single$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cpair_comment_single"));
    public static VarHandle cpair_comment_single$VH() {
        return _GScannerConfig.cpair_comment_single$VH;
    }
    public static MemoryAddress cpair_comment_single$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_GScannerConfig.cpair_comment_single$VH.get(seg);
    }
    public static void cpair_comment_single$set( MemorySegment seg, MemoryAddress x) {
        _GScannerConfig.cpair_comment_single$VH.set(seg, x);
    }
    public static MemoryAddress cpair_comment_single$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_GScannerConfig.cpair_comment_single$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cpair_comment_single$set(MemorySegment seg, long index, MemoryAddress x) {
        _GScannerConfig.cpair_comment_single$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle padding_dummy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("padding_dummy"));
    public static VarHandle padding_dummy$VH() {
        return _GScannerConfig.padding_dummy$VH;
    }
    public static int padding_dummy$get(MemorySegment seg) {
        return (int)_GScannerConfig.padding_dummy$VH.get(seg);
    }
    public static void padding_dummy$set( MemorySegment seg, int x) {
        _GScannerConfig.padding_dummy$VH.set(seg, x);
    }
    public static int padding_dummy$get(MemorySegment seg, long index) {
        return (int)_GScannerConfig.padding_dummy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void padding_dummy$set(MemorySegment seg, long index, int x) {
        _GScannerConfig.padding_dummy$VH.set(seg.asSlice(index*sizeof()), x);
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


