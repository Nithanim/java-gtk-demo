// Generated by jextract

package gtk3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface hb_font_get_glyph_from_name_func_t {

    int apply(jdk.incubator.foreign.MemoryAddress font, jdk.incubator.foreign.MemoryAddress font_data, jdk.incubator.foreign.MemoryAddress name, int len, jdk.incubator.foreign.MemoryAddress glyph, jdk.incubator.foreign.MemoryAddress user_data);
    static NativeSymbol allocate(hb_font_get_glyph_from_name_func_t fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(hb_font_get_glyph_from_name_func_t.class, fi, constants$999.hb_font_get_glyph_from_name_func_t$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static hb_font_get_glyph_from_name_func_t ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("hb_font_get_glyph_from_name_func_t::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress font, jdk.incubator.foreign.MemoryAddress font_data, jdk.incubator.foreign.MemoryAddress name, int len, jdk.incubator.foreign.MemoryAddress glyph, jdk.incubator.foreign.MemoryAddress user_data) -> {
            try {
                return (int)constants$999.hb_font_get_glyph_from_name_func_t$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)font, (jdk.incubator.foreign.Addressable)font_data, (jdk.incubator.foreign.Addressable)name, len, (jdk.incubator.foreign.Addressable)glyph, (jdk.incubator.foreign.Addressable)user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

