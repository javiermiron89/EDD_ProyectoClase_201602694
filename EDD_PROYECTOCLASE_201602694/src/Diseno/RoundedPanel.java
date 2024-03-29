/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diseno;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author javier
 */
public class RoundedPanel extends JPanel {

          private Color backgroundColor;
          private int cornerRadius = 15;

          public RoundedPanel(LayoutManager layout, int radius) {
                    super(layout);
                    cornerRadius = radius;
          }

          public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
                    super(layout);
                    cornerRadius = radius;
                    backgroundColor = bgColor;
          }

          public RoundedPanel(int radius) {
                    super();
                    cornerRadius = radius;
          }

          public RoundedPanel(int radius, Color bgColor) {
                    super();
                    cornerRadius = radius;
                    backgroundColor = bgColor;
          }

          @Override
          protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Dimension arcs = new Dimension(cornerRadius, cornerRadius);
                    int width = getWidth();
                    int height = getHeight();
                    Graphics2D graphics = (Graphics2D) g;
                    graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    //Draws the rounded panel with borders.
                    if (backgroundColor != null) {
                              graphics.setColor(backgroundColor);
                    } else {
                              graphics.setColor(getBackground());
                    }
                    graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
                    graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//            
          }

}
