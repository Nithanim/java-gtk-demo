// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1269 {

    static final FunctionDescriptor gdk_pixbuf_get_file_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_get_file_info$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_get_file_info",
        constants$1269.gdk_pixbuf_get_file_info$FUNC, false
    );
    static final FunctionDescriptor gdk_pixbuf_get_file_info_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_get_file_info_async$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_get_file_info_async",
        constants$1269.gdk_pixbuf_get_file_info_async$FUNC, false
    );
    static final FunctionDescriptor gdk_pixbuf_get_file_info_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_get_file_info_finish$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_get_file_info_finish",
        constants$1269.gdk_pixbuf_get_file_info_finish$FUNC, false
    );
    static final FunctionDescriptor gdk_pixbuf_format_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_format_copy$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_format_copy",
        constants$1269.gdk_pixbuf_format_copy$FUNC, false
    );
    static final FunctionDescriptor gdk_pixbuf_format_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_pixbuf_format_free$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_format_free",
        constants$1269.gdk_pixbuf_format_free$FUNC, false
    );
    static final FunctionDescriptor gdk_pixbuf_loader_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_pixbuf_loader_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_pixbuf_loader_get_type",
        constants$1269.gdk_pixbuf_loader_get_type$FUNC, false
    );
}


