// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1298 {

    static final FunctionDescriptor gdk_gl_context_set_use_es$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_gl_context_set_use_es$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_set_use_es",
        constants$1298.gdk_gl_context_set_use_es$FUNC, false
    );
    static final FunctionDescriptor gdk_gl_context_get_use_es$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_get_use_es$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_get_use_es",
        constants$1298.gdk_gl_context_get_use_es$FUNC, false
    );
    static final FunctionDescriptor gdk_gl_context_realize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_realize$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_realize",
        constants$1298.gdk_gl_context_realize$FUNC, false
    );
    static final FunctionDescriptor gdk_gl_context_make_current$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_gl_context_make_current$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_make_current",
        constants$1298.gdk_gl_context_make_current$FUNC, false
    );
    static final FunctionDescriptor gdk_gl_context_get_current$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_gl_context_get_current$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_get_current",
        constants$1298.gdk_gl_context_get_current$FUNC, false
    );
    static final FunctionDescriptor gdk_gl_context_clear_current$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle gdk_gl_context_clear_current$MH = RuntimeHelper.downcallHandle(
        "gdk_gl_context_clear_current",
        constants$1298.gdk_gl_context_clear_current$FUNC, false
    );
}


