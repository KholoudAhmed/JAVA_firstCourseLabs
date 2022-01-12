/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

/**
 *
 * @author user
 */
public class AppletFont extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    String s;
    public void init() {
        // TODO start asynchronous download of heavy resources
        s = new String("hello iti");
    }
    @Override
    public void paint(Graphics g)
    {
      Color c = new Color(0 , 255 , 0);
      g.setColor(c);
      int y = 50;
      Toolkit t = Toolkit.getDefaultToolkit();
      String[] fontname = t.getFontList();
      Font f;
      for(String current : fontname)
      {
          f = new Font(current , Font.BOLD|Font.ITALIC , 15);
          g.setFont(f);
          g.drawString(s+current , 50, y);
          y+=10;
      }
    }

    // TODO overwrite start(), stop() and destroy() methods
}
