/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author user
 */
public class MyAppletDraw extends Applet {

    String ss;
    int x;
    int y;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        ss = "hello java";
        x = 50;
        y = 50;
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        x--;
                        y = 50;
                        repaint();
                        break;

                    case KeyEvent.VK_RIGHT:
                        x++;
                        y = 50;
                        repaint();
                        break;

                    case KeyEvent.VK_UP:
                        x = 50;
                        y++;
                        repaint();
                        break;

                    case KeyEvent.VK_DOWN:
                        x = 50;
                        y--;
                        repaint();
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                //To change body of generated methods, choose Tools | Templates.
            }
        });
        // TODO start asynchronous download of heavy resources
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(ss, x, y);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
