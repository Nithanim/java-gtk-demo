package gtktest;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SymbolLookup;

import static gtk3.test_h.C_INT;
import static gtk3.test_h.GTK_WINDOW_TOPLEVEL;
import static gtk3.test_h.g_signal_connect_data;
import static gtk3.test_h.gtk_init;
import static gtk3.test_h.gtk_main;
import static gtk3.test_h.gtk_widget_show;
import static gtk3.test_h.gtk_window_new;
import static gtk3.test_h.gtk_window_set_title;

public class Main {
  public static void main(String[] args) {
    // System.loadLibrary("libgtk-3");
    // System.loadLibrary("gtk+-3.0");
    System.load("/usr/lib/x86_64-linux-gnu/libgtk-3.so");

    try (var scope = ResourceScope.newConfinedScope()) {
      var memorySegment = MemorySegment.allocateNative(C_INT, scope);
      memorySegment.set(C_INT, 0, 0);
      gtk_init(memorySegment, MemoryAddress.NULL);

      MemoryAddress window = gtk_window_new(GTK_WINDOW_TOPLEVEL());
      gtk_window_set_title(window, convertStringToNative("GTK Java Test App", scope));
      gtk_widget_show(window);

      MemorySegment signal = convertStringToNative("destroy", scope);

      // Original code:
      // g_signal_connect(window, "destroy", G_CALLBACK(gtk_main_quit), NULL);

      // Function defined over header only:
      // #define g_signal_connect(instance, detailed_signal, c_handler, data) \
      //    g_signal_connect_data ((instance), (detailed_signal), (c_handler), (data), NULL,
      // (GConnectFlags) 0)

      // Also, generated code from jextract ist "hidden", so we to lookup the method ref again.
      MemoryAddress gtk_main_quit =
          SymbolLookup.loaderLookup().lookup("gtk_main_quit").orElseThrow().address();

      g_signal_connect_data(
          window, signal, gtk_main_quit, MemoryAddress.NULL, MemoryAddress.NULL, 0);
    }

    gtk_main();
  }

  private static MemorySegment convertStringToNative(String string, ResourceScope scope) {
    var memorySegment = MemorySegment.allocateNative(string.length() + 1, scope);
    memorySegment.setUtf8String(0, string);
    return memorySegment;
  }
}
