/*
 ===========================================================================
 @    $Author$
 @  $Revision$
 @      $Date$
 @
 ===========================================================================
 */
package org.assertj.swing.keystroke;

import static java.awt.event.InputEvent.SHIFT_MASK;
import static java.awt.event.KeyEvent.VK_0;
import static java.awt.event.KeyEvent.VK_1;
import static java.awt.event.KeyEvent.VK_2;
import static java.awt.event.KeyEvent.VK_3;
import static java.awt.event.KeyEvent.VK_4;
import static java.awt.event.KeyEvent.VK_5;
import static java.awt.event.KeyEvent.VK_6;
import static java.awt.event.KeyEvent.VK_7;
import static java.awt.event.KeyEvent.VK_8;
import static java.awt.event.KeyEvent.VK_9;
import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.VK_B;
import static java.awt.event.KeyEvent.VK_C;
import static java.awt.event.KeyEvent.VK_COMMA;
import static java.awt.event.KeyEvent.VK_D;
import static java.awt.event.KeyEvent.VK_DOLLAR;
import static java.awt.event.KeyEvent.VK_E;
import static java.awt.event.KeyEvent.VK_F;
import static java.awt.event.KeyEvent.VK_G;
import static java.awt.event.KeyEvent.VK_H;
import static java.awt.event.KeyEvent.VK_I;
import static java.awt.event.KeyEvent.VK_J;
import static java.awt.event.KeyEvent.VK_K;
import static java.awt.event.KeyEvent.VK_L;
import static java.awt.event.KeyEvent.VK_LESS;
import static java.awt.event.KeyEvent.VK_M;
import static java.awt.event.KeyEvent.VK_MINUS;
import static java.awt.event.KeyEvent.VK_N;
import static java.awt.event.KeyEvent.VK_O;
import static java.awt.event.KeyEvent.VK_P;
import static java.awt.event.KeyEvent.VK_PERIOD;
import static java.awt.event.KeyEvent.VK_Q;
import static java.awt.event.KeyEvent.VK_QUOTE;
import static java.awt.event.KeyEvent.VK_R;
import static java.awt.event.KeyEvent.VK_S;
import static java.awt.event.KeyEvent.VK_T;
import static java.awt.event.KeyEvent.VK_U;
import static java.awt.event.KeyEvent.VK_V;
import static java.awt.event.KeyEvent.VK_W;
import static java.awt.event.KeyEvent.VK_X;
import static java.awt.event.KeyEvent.VK_Y;
import static java.awt.event.KeyEvent.VK_Z;
import static org.assertj.core.util.Lists.newArrayList;
import static org.assertj.swing.keystroke.KeyStrokeMapping.mapping;
import static org.assertj.swing.keystroke.KeyStrokeMappings.defaultMappings;

import java.util.Collection;
import java.util.List;

import org.assertj.swing.dependency.jsr305.Nonnull;

/**
 * 
 */
public class KeyStrokeMappingProvider_win_de_CH implements KeyStrokeMappingProvider {
  // Thread-safe, lazy-loading singleton.
  private static class SingletonHolder {
    static List<KeyStrokeMapping> instance = createMappings();
  }

  private static @Nonnull
  List<KeyStrokeMapping> createMappings() {
    // Alle NICHT gemappten KeyStrokes werden durch den Robot mittels KeyDown-KeyUp
    // ebenfalls geschrieben & dies mit den korrekten Zeichen.
    // Ich vermute, dass via untenstehendes Mapping lediglich die Eingbe effizienter
    // erfolgt. Anders gesagt: wenn kein einziges Mapping hier aufgelistet wird,
    // funktionieren Texteingaben dennoch...
    List<KeyStrokeMapping> mappings = newArrayList(defaultMappings());
    mappings.add(mapping('0', VK_0, NO_MASK));
    mappings.add(mapping('=', VK_0, SHIFT_MASK));
    mappings.add(mapping('1', VK_1, NO_MASK));
    mappings.add(mapping('+', VK_1, SHIFT_MASK));
    // mappings.add(mapping('¦', VK_1, ALT_GRAPH_MASK));
    mappings.add(mapping('2', VK_2, NO_MASK));
    mappings.add(mapping('"', VK_2, SHIFT_MASK));
    // mappings.add(mapping('@', VK_2, ALT_GRAPH_MASK));
    mappings.add(mapping('3', VK_3, NO_MASK));
    mappings.add(mapping('*', VK_3, SHIFT_MASK));
    // mappings.add(mapping('#', VK_3, ALT_GRAPH_MASK));
    mappings.add(mapping('4', VK_4, NO_MASK));
    mappings.add(mapping('ç', VK_4, SHIFT_MASK));
    mappings.add(mapping('5', VK_5, NO_MASK));
    mappings.add(mapping('%', VK_5, SHIFT_MASK));
    mappings.add(mapping('6', VK_6, NO_MASK));
    mappings.add(mapping('&', VK_6, SHIFT_MASK));
    // mappings.add(mapping('¬', VK_6, ALT_GRAPH_MASK));
    mappings.add(mapping('7', VK_7, NO_MASK));
    mappings.add(mapping('/', VK_7, SHIFT_MASK));
    // mappings.add(mapping('|', VK_7, ALT_GRAPH_MASK));
    mappings.add(mapping('8', VK_8, NO_MASK));
    mappings.add(mapping('(', VK_8, SHIFT_MASK));
    // mappings.add(mapping('¢', VK_8, ALT_GRAPH_MASK));
    mappings.add(mapping('9', VK_9, NO_MASK));
    mappings.add(mapping(')', VK_9, SHIFT_MASK));
    mappings.add(mapping('\'', VK_QUOTE, NO_MASK));
    mappings.add(mapping('?', VK_QUOTE, SHIFT_MASK));
    // mappings.add(mapping('~', VK_QUOTE, ALT_GRAPH_MASK));

    mappings.add(mapping('a', VK_A, NO_MASK));
    mappings.add(mapping('A', VK_A, SHIFT_MASK));
    mappings.add(mapping('b', VK_B, NO_MASK));
    mappings.add(mapping('B', VK_B, SHIFT_MASK));
    mappings.add(mapping('c', VK_C, NO_MASK));
    mappings.add(mapping('C', VK_C, SHIFT_MASK));
    mappings.add(mapping('d', VK_D, NO_MASK));
    mappings.add(mapping('D', VK_D, SHIFT_MASK));
    mappings.add(mapping('e', VK_E, NO_MASK));
    mappings.add(mapping('E', VK_E, SHIFT_MASK));
    mappings.add(mapping('f', VK_F, NO_MASK));
    mappings.add(mapping('F', VK_F, SHIFT_MASK));
    mappings.add(mapping('g', VK_G, NO_MASK));
    mappings.add(mapping('G', VK_G, SHIFT_MASK));
    mappings.add(mapping('h', VK_H, NO_MASK));
    mappings.add(mapping('H', VK_H, SHIFT_MASK));
    mappings.add(mapping('i', VK_I, NO_MASK));
    mappings.add(mapping('I', VK_I, SHIFT_MASK));
    mappings.add(mapping('j', VK_J, NO_MASK));
    mappings.add(mapping('J', VK_J, SHIFT_MASK));
    mappings.add(mapping('k', VK_K, NO_MASK));
    mappings.add(mapping('K', VK_K, SHIFT_MASK));
    mappings.add(mapping('l', VK_L, NO_MASK));
    mappings.add(mapping('L', VK_L, SHIFT_MASK));
    mappings.add(mapping('m', VK_M, NO_MASK));
    mappings.add(mapping('M', VK_M, SHIFT_MASK));
    mappings.add(mapping('n', VK_N, NO_MASK));
    mappings.add(mapping('N', VK_N, SHIFT_MASK));
    mappings.add(mapping('o', VK_O, NO_MASK));
    mappings.add(mapping('O', VK_O, SHIFT_MASK));
    mappings.add(mapping('p', VK_P, NO_MASK));
    mappings.add(mapping('P', VK_P, SHIFT_MASK));
    mappings.add(mapping('q', VK_Q, NO_MASK));
    mappings.add(mapping('Q', VK_Q, SHIFT_MASK));
    mappings.add(mapping('r', VK_R, NO_MASK));
    mappings.add(mapping('R', VK_R, SHIFT_MASK));
    mappings.add(mapping('s', VK_S, NO_MASK));
    mappings.add(mapping('S', VK_S, SHIFT_MASK));
    mappings.add(mapping('t', VK_T, NO_MASK));
    mappings.add(mapping('T', VK_T, SHIFT_MASK));
    mappings.add(mapping('u', VK_U, NO_MASK));
    mappings.add(mapping('U', VK_U, SHIFT_MASK));
    mappings.add(mapping('v', VK_V, NO_MASK));
    mappings.add(mapping('V', VK_V, SHIFT_MASK));
    mappings.add(mapping('w', VK_W, NO_MASK));
    mappings.add(mapping('W', VK_W, SHIFT_MASK));
    mappings.add(mapping('x', VK_X, NO_MASK));
    mappings.add(mapping('X', VK_X, SHIFT_MASK));
    mappings.add(mapping('y', VK_Y, NO_MASK));
    mappings.add(mapping('Y', VK_Y, SHIFT_MASK));
    mappings.add(mapping('z', VK_Z, NO_MASK));
    mappings.add(mapping('Z', VK_Z, SHIFT_MASK));

    mappings.add(mapping('$', VK_DOLLAR, NO_MASK));
    mappings.add(mapping('£', VK_DOLLAR, SHIFT_MASK));
    mappings.add(mapping('<', VK_LESS, NO_MASK));
    mappings.add(mapping('>', VK_LESS, SHIFT_MASK));
    // mappings.add(mapping('\\', VK_LESS, ALT_GRAPH_MASK));
    mappings.add(mapping(',', VK_COMMA, NO_MASK));
    mappings.add(mapping(';', VK_COMMA, SHIFT_MASK));
    mappings.add(mapping('.', VK_PERIOD, NO_MASK));
    mappings.add(mapping(':', VK_PERIOD, SHIFT_MASK));
    mappings.add(mapping('-', VK_MINUS, NO_MASK));
    mappings.add(mapping('_', VK_MINUS, SHIFT_MASK));

    return mappings;
  }

  /**
   * @return the mapping between characters and {@code KeyStroke}s for locale {@code Locale.GERMAN}.
   */
  @Override
  public @Nonnull
  Collection<KeyStrokeMapping> keyStrokeMappings() {
    return SingletonHolder.instance;
  }

}
