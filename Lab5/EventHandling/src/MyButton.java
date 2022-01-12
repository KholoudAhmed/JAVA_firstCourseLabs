/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author user
 */
public class MyButton extends Applet {
    int x;
    Button b;
    Button c;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        b = new Button("Increment");
        b.addActionListener(new MyButtonListener());
        add(b);
        c = new Button("Decrement");
        c.addActionListener(new MyButtoncListener());
        add(c);
    }
    @Override
    public void paint(Graphics g)
    {
        g.drawString("click count is : " +x, 50, 200);
    }
    class MyButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            x++;
            if(x==11){
                x = 10;
            }
            repaint();//To change body of generated methods, choose Tools | Templates.
        }
    }
    class MyButtoncListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            x--;
            if(x==0)
            {
                x = 10;
            }
            repaint();//To change body of generated methods, choose Tools | Templates.
        }
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
