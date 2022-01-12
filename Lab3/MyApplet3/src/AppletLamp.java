/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author user
 */
public class AppletLamp extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        resize(350,350);
    }
    @Override
    public void paint(Graphics g)
    {
       g.fillRect(0,250,290,290);

    // the base of the lamp
    
    g.drawLine(125,250,125,160);
    g.drawLine(175,250,175,160);

    // the lamp shade with two arcs
    g.drawArc(85,157,130,50,-65,312);
    g.drawArc(85,87,130,50,62,58);

    
    g.drawLine(85,177,119,89);
//    g.setColor(Color.WHITE);
    g.drawLine(215,177,181,89);
    
    

    // pattern on the shade
    g.setColor(Color.GRAY);
    g.fillArc(78,120,40,40,63,-174);
    g.setColor(Color.yellow);
    g.fillOval(120,96,40,40);
    g.setColor(Color.pink);
    g.fillArc(173,100,40,40,110,180); 
    }
    // TODO overwrite start(), stop() and destroy() methods
}
