// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1151 {

    static final FunctionDescriptor cairo_surface_create_similar$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_surface_create_similar$MH = RuntimeHelper.downcallHandle(
        "cairo_surface_create_similar",
        constants$1151.cairo_surface_create_similar$FUNC, false
    );
    static final FunctionDescriptor cairo_surface_create_similar_image$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_surface_create_similar_image$MH = RuntimeHelper.downcallHandle(
        "cairo_surface_create_similar_image",
        constants$1151.cairo_surface_create_similar_image$FUNC, false
    );
    static final FunctionDescriptor cairo_surface_map_to_image$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_surface_map_to_image$MH = RuntimeHelper.downcallHandle(
        "cairo_surface_map_to_image",
        constants$1151.cairo_surface_map_to_image$FUNC, false
    );
    static final FunctionDescriptor cairo_surface_unmap_image$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_surface_unmap_image$MH = RuntimeHelper.downcallHandle(
        "cairo_surface_unmap_image",
        constants$1151.cairo_surface_unmap_image$FUNC, false
    );
    static final FunctionDescriptor cairo_surface_create_for_rectangle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_surface_create_for_rectangle$MH = RuntimeHelper.downcallHandle(
        "cairo_surface_create_for_rectangle",
        constants$1151.cairo_surface_create_for_rectangle$FUNC, false
    );
    static final FunctionDescriptor cairo_surface_create_observer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_surface_create_observer$MH = RuntimeHelper.downcallHandle(
        "cairo_surface_create_observer",
        constants$1151.cairo_surface_create_observer$FUNC, false
    );
}

