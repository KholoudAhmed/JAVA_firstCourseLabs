/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author user
 */
public class AppletAllFonts extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    @Override
    public void paint(Graphics g)
    {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontnames = ge.getAvailableFontFamilyNames();
        Font[] allFonts = ge.getAllFonts();
        int y = 50;
        for (String fontname : fontnames) {
            System.out.println(fontname);
        }
        for(int i = 0 ; i < allFonts.length ; i++)
        {
            System.out.println(allFonts[i].getName());
            System.out.println(allFonts[i].getFontName());
            System.out.println(allFonts[i].getFamily());
            g.drawString("HELLO TIT", 30, y);
            y+=10;
        }
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
