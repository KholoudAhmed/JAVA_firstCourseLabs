
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppletLamp extends Applet implements Runnable {
    Thread th;
    int statusFlag = -1;
    Color kh;
    
    

     /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        th = new Thread(this);
        th.start();
        statusFlag = 1;
        resize(350,350);
    }
    @Override
    public void run()
    {
        while(true){
        kh = Color.YELLOW;
        repaint();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AppletLamp.class.getName()).log(Level.SEVERE, null, ex);
        }
        kh = Color.PINK;
        repaint();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AppletLamp.class.getName()).log(Level.SEVERE, null, ex);
        }
        kh = Color.RED;
        repaint();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AppletLamp.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    
    @Override
    public void paint(Graphics g) {
    g.drawLine(200, 300, 400, 300);
    g.drawLine(200, 320, 400, 320);
    g.drawLine(200, 300, 200, 320);
    g.drawLine(400, 300, 400, 320);

    g.drawLine(275, 300, 295, 200);
    g.drawLine(320, 300, 305, 200);
    g.drawLine(295, 200, 305, 200);

    g.drawArc(175, 120, 250, 80, 0, -180);
    g.drawLine(175, 160, 200, 70);
    g.drawLine(425, 160, 400, 70);

    // g.setStroke(new BasicStroke(1)); // Sets Outer Line Width of Shapes
    g.setColor(kh);
    g.fillOval(200, 60, 200, 20);
    g.fillOval(195, 100, 40, 60);
    g.fillOval(365, 100, 40, 60);
    g.fillOval(275, 100, 50, 80);

    g.setColor(kh);
    g.drawOval(200, 60, 200, 20);
    g.drawOval(195, 100, 40, 60);
    g.drawOval(365, 100, 40, 60);
    g.drawOval(275, 100, 50, 80);
  }
    // TODO overwrite start(), stop() and destroy() methods
}