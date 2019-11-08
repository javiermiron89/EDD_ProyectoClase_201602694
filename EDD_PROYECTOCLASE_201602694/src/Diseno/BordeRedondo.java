/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseno;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

/**
 *
 * @author javier
 */
public class BordeRedondo implements Border{
          private int radio;

          public BordeRedondo(int radio) {
                    this.radio = radio;
          }

          @Override
          public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                    g.drawRoundRect(x, y, width - 1, height - 1, radio, radio);
          }

          @Override
          public Insets getBorderInsets(Component c) {
                    return new Insets(this.radio + 1, this.radio + 1, this.radio + 2, this.radio);
          }

          @Override
          public boolean isBorderOpaque() {
                    return true;
          }
}
