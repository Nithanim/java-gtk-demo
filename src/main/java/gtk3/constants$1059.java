// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1059 {

    static final FunctionDescriptor pango_attr_list_update$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_attr_list_update$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_update",
        constants$1059.pango_attr_list_update$FUNC, false
    );
    static final FunctionDescriptor pango_attr_list_filter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_filter$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_filter",
        constants$1059.pango_attr_list_filter$FUNC, false
    );
    static final FunctionDescriptor pango_attr_list_get_attributes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_get_attributes$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_get_attributes",
        constants$1059.pango_attr_list_get_attributes$FUNC, false
    );
    static final FunctionDescriptor pango_attr_list_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_equal$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_equal",
        constants$1059.pango_attr_list_equal$FUNC, false
    );
    static final FunctionDescriptor pango_attr_iterator_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_attr_iterator_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_attr_iterator_get_type",
        constants$1059.pango_attr_iterator_get_type$FUNC, false
    );
    static final FunctionDescriptor pango_attr_list_get_iterator$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_get_iterator$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_get_iterator",
        constants$1059.pango_attr_list_get_iterator$FUNC, false
    );
}


