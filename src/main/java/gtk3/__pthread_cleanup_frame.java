// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class __pthread_cleanup_frame {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("__cancel_routine"),
        Constants$root.C_POINTER$LAYOUT.withName("__cancel_arg"),
        Constants$root.C_INT$LAYOUT.withName("__do_it"),
        Constants$root.C_INT$LAYOUT.withName("__cancel_type")
    ).withName("__pthread_cleanup_frame");
    public static MemoryLayout $LAYOUT() {
        return __pthread_cleanup_frame.$struct$LAYOUT;
    }
    static final FunctionDescriptor __cancel_routine$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __cancel_routine$MH = RuntimeHelper.downcallHandle(
        __pthread_cleanup_frame.__cancel_routine$FUNC, false
    );
    public interface __cancel_routine {

        void apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(__cancel_routine fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(__cancel_routine.class, fi, __pthread_cleanup_frame.__cancel_routine$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static __cancel_routine ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("__cancel_routine::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    __pthread_cleanup_frame.__cancel_routine$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle __cancel_routine$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__cancel_routine"));
    public static VarHandle __cancel_routine$VH() {
        return __pthread_cleanup_frame.__cancel_routine$VH;
    }
    public static MemoryAddress __cancel_routine$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__pthread_cleanup_frame.__cancel_routine$VH.get(seg);
    }
    public static void __cancel_routine$set( MemorySegment seg, MemoryAddress x) {
        __pthread_cleanup_frame.__cancel_routine$VH.set(seg, x);
    }
    public static MemoryAddress __cancel_routine$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__pthread_cleanup_frame.__cancel_routine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __cancel_routine$set(MemorySegment seg, long index, MemoryAddress x) {
        __pthread_cleanup_frame.__cancel_routine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static __cancel_routine __cancel_routine (MemorySegment segment, ResourceScope scope) {
        return __cancel_routine.ofAddress(__cancel_routine$get(segment), scope);
    }
    static final VarHandle __cancel_arg$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__cancel_arg"));
    public static VarHandle __cancel_arg$VH() {
        return __pthread_cleanup_frame.__cancel_arg$VH;
    }
    public static MemoryAddress __cancel_arg$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__pthread_cleanup_frame.__cancel_arg$VH.get(seg);
    }
    public static void __cancel_arg$set( MemorySegment seg, MemoryAddress x) {
        __pthread_cleanup_frame.__cancel_arg$VH.set(seg, x);
    }
    public static MemoryAddress __cancel_arg$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__pthread_cleanup_frame.__cancel_arg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __cancel_arg$set(MemorySegment seg, long index, MemoryAddress x) {
        __pthread_cleanup_frame.__cancel_arg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __do_it$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__do_it"));
    public static VarHandle __do_it$VH() {
        return __pthread_cleanup_frame.__do_it$VH;
    }
    public static int __do_it$get(MemorySegment seg) {
        return (int)__pthread_cleanup_frame.__do_it$VH.get(seg);
    }
    public static void __do_it$set( MemorySegment seg, int x) {
        __pthread_cleanup_frame.__do_it$VH.set(seg, x);
    }
    public static int __do_it$get(MemorySegment seg, long index) {
        return (int)__pthread_cleanup_frame.__do_it$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __do_it$set(MemorySegment seg, long index, int x) {
        __pthread_cleanup_frame.__do_it$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __cancel_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__cancel_type"));
    public static VarHandle __cancel_type$VH() {
        return __pthread_cleanup_frame.__cancel_type$VH;
    }
    public static int __cancel_type$get(MemorySegment seg) {
        return (int)__pthread_cleanup_frame.__cancel_type$VH.get(seg);
    }
    public static void __cancel_type$set( MemorySegment seg, int x) {
        __pthread_cleanup_frame.__cancel_type$VH.set(seg, x);
    }
    public static int __cancel_type$get(MemorySegment seg, long index) {
        return (int)__pthread_cleanup_frame.__cancel_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __cancel_type$set(MemorySegment seg, long index, int x) {
        __pthread_cleanup_frame.__cancel_type$VH.set(seg.asSlice(index*sizeof()), x);
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


