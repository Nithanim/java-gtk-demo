// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1877 {

    static final FunctionDescriptor gtk_notebook_set_tab_reorderable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_notebook_set_tab_reorderable$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_set_tab_reorderable",
        constants$1877.gtk_notebook_set_tab_reorderable$FUNC, false
    );
    static final FunctionDescriptor gtk_notebook_get_tab_detachable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_get_tab_detachable$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_get_tab_detachable",
        constants$1877.gtk_notebook_get_tab_detachable$FUNC, false
    );
    static final FunctionDescriptor gtk_notebook_set_tab_detachable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_notebook_set_tab_detachable$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_set_tab_detachable",
        constants$1877.gtk_notebook_set_tab_detachable$FUNC, false
    );
    static final FunctionDescriptor gtk_notebook_detach_tab$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_notebook_detach_tab$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_detach_tab",
        constants$1877.gtk_notebook_detach_tab$FUNC, false
    );
    static final FunctionDescriptor gtk_notebook_get_action_widget$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_notebook_get_action_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_get_action_widget",
        constants$1877.gtk_notebook_get_action_widget$FUNC, false
    );
    static final FunctionDescriptor gtk_notebook_set_action_widget$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_notebook_set_action_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_notebook_set_action_widget",
        constants$1877.gtk_notebook_set_action_widget$FUNC, false
    );
}

