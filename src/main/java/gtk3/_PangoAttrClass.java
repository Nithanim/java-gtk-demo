// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class _PangoAttrClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("copy"),
        Constants$root.C_POINTER$LAYOUT.withName("destroy"),
        Constants$root.C_POINTER$LAYOUT.withName("equal")
    ).withName("_PangoAttrClass");
    public static MemoryLayout $LAYOUT() {
        return _PangoAttrClass.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return _PangoAttrClass.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)_PangoAttrClass.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        _PangoAttrClass.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)_PangoAttrClass.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        _PangoAttrClass.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle copy$MH = RuntimeHelper.downcallHandle(
        _PangoAttrClass.copy$FUNC, false
    );
    public interface copy {

        jdk.incubator.foreign.Addressable apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(copy fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(copy.class, fi, _PangoAttrClass.copy$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/Addressable;", scope);
        }
        static copy ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("copy::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    return (jdk.incubator.foreign.Addressable)(jdk.incubator.foreign.MemoryAddress)_PangoAttrClass.copy$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle copy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("copy"));
    public static VarHandle copy$VH() {
        return _PangoAttrClass.copy$VH;
    }
    public static MemoryAddress copy$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PangoAttrClass.copy$VH.get(seg);
    }
    public static void copy$set( MemorySegment seg, MemoryAddress x) {
        _PangoAttrClass.copy$VH.set(seg, x);
    }
    public static MemoryAddress copy$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PangoAttrClass.copy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void copy$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoAttrClass.copy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static copy copy (MemorySegment segment, ResourceScope scope) {
        return copy.ofAddress(copy$get(segment), scope);
    }
    static final FunctionDescriptor destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle destroy$MH = RuntimeHelper.downcallHandle(
        _PangoAttrClass.destroy$FUNC, false
    );
    public interface destroy {

        void apply(jdk.incubator.foreign.MemoryAddress _x0);
        static NativeSymbol allocate(destroy fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(destroy.class, fi, _PangoAttrClass.destroy$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static destroy ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("destroy::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0) -> {
                try {
                    _PangoAttrClass.destroy$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle destroy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("destroy"));
    public static VarHandle destroy$VH() {
        return _PangoAttrClass.destroy$VH;
    }
    public static MemoryAddress destroy$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PangoAttrClass.destroy$VH.get(seg);
    }
    public static void destroy$set( MemorySegment seg, MemoryAddress x) {
        _PangoAttrClass.destroy$VH.set(seg, x);
    }
    public static MemoryAddress destroy$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PangoAttrClass.destroy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void destroy$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoAttrClass.destroy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static destroy destroy (MemorySegment segment, ResourceScope scope) {
        return destroy.ofAddress(destroy$get(segment), scope);
    }
    static final FunctionDescriptor equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle equal$MH = RuntimeHelper.downcallHandle(
        _PangoAttrClass.equal$FUNC, false
    );
    public interface equal {

        int apply(jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1);
        static NativeSymbol allocate(equal fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(equal.class, fi, _PangoAttrClass.equal$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static equal ofAddress(MemoryAddress addr, ResourceScope scope) {
            NativeSymbol symbol = NativeSymbol.ofAddress("equal::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress _x0, jdk.incubator.foreign.MemoryAddress _x1) -> {
                try {
                    return (int)_PangoAttrClass.equal$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)_x0, (jdk.incubator.foreign.Addressable)_x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle equal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("equal"));
    public static VarHandle equal$VH() {
        return _PangoAttrClass.equal$VH;
    }
    public static MemoryAddress equal$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PangoAttrClass.equal$VH.get(seg);
    }
    public static void equal$set( MemorySegment seg, MemoryAddress x) {
        _PangoAttrClass.equal$VH.set(seg, x);
    }
    public static MemoryAddress equal$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PangoAttrClass.equal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void equal$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoAttrClass.equal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static equal equal (MemorySegment segment, ResourceScope scope) {
        return equal.ofAddress(equal$get(segment), scope);
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


