// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$1386 {

    static final FunctionDescriptor atk_table_cell_get_table$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_cell_get_table$MH = RuntimeHelper.downcallHandle(
        "atk_table_cell_get_table",
        constants$1386.atk_table_cell_get_table$FUNC, false
    );
    static final  OfAddress atk_misc_instance$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle atk_misc_instance$VH = constants$1386.atk_misc_instance$LAYOUT.varHandle();
    static final MemorySegment atk_misc_instance$SEGMENT = RuntimeHelper.lookupGlobalVariable("atk_misc_instance", constants$1386.atk_misc_instance$LAYOUT);
    static final FunctionDescriptor atk_misc_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle atk_misc_get_type$MH = RuntimeHelper.downcallHandle(
        "atk_misc_get_type",
        constants$1386.atk_misc_get_type$FUNC, false
    );
    static final FunctionDescriptor atk_misc_threads_enter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_misc_threads_enter$MH = RuntimeHelper.downcallHandle(
        "atk_misc_threads_enter",
        constants$1386.atk_misc_threads_enter$FUNC, false
    );
    static final FunctionDescriptor atk_misc_threads_leave$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_misc_threads_leave$MH = RuntimeHelper.downcallHandle(
        "atk_misc_threads_leave",
        constants$1386.atk_misc_threads_leave$FUNC, false
    );
    static final FunctionDescriptor atk_misc_get_instance$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle atk_misc_get_instance$MH = RuntimeHelper.downcallHandle(
        "atk_misc_get_instance",
        constants$1386.atk_misc_get_instance$FUNC, false
    );
}


