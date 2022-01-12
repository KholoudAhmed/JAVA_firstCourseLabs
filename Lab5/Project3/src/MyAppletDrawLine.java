/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author user
 */
public class MyAppletDrawLine extends Applet {
    int x1,x2;
    int y1,y2;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        this.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                 
            }

            @Override
            public void mousePressed(MouseEvent me) {
                x1 = me.getX();
                y1 = me.getY();
//                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                 
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                 
            }

            @Override
            public void mouseExited(MouseEvent me) {
               
            }
            
        });
        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent me) {
               x2 = me.getX();
               y2 = me.getY();
               repaint();
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                
            }
        });
        // TODO start asynchronous download of heavy resources
    }
    @Override
    public void paint(Graphics g){
        g.drawLine(x1, y1, x2, y2);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
