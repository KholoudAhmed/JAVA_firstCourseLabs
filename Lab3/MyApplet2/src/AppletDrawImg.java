/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author user
 */
public class AppletDrawImg extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Image drawPicture ;
    
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
//        drawPicture = getImage(getDocumentBase() , "image.jpg");
          drawPicture = getImage(getDocumentBase() , "image2.png");
    }
    @Override
    public void paint(Graphics g)
    {
        g.drawImage(drawPicture, 50, 50, this);
//        g.drawImage(drawPicture, 40, 40, this);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
