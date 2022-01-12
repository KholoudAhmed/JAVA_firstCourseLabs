/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class MarqueeApplet extends Applet implements Runnable {
    String ss;
    int x , y , statusFlag = -1;
    Thread th;
    
    

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        ss = "hello java";
        x = 50;
        y = 100;
        statusFlag = 1;
        th = new Thread(this);
        th.start();
    }
    public void update()
    {
        x = x + 10 * statusFlag;
        if(x > 350)
        {
            statusFlag = -1;
        }
        if(x < 100)
        {
            y = 101;
            statusFlag = 1;
        }
    }
    @Override
    public void run()
    {
       while(true)
       {
           repaint();
           update();
           try {
               Thread.sleep(1000);
           } catch (InterruptedException ex) {
               Logger.getLogger(MarqueeApplet.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
    
   

    @Override
    public void paint(Graphics g)
	{
		g.drawString(ss, x, y);
	}
    // TODO overwrite start(), stop() and destroy() methods
}
