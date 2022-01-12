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
public class MyAppletDrawLines extends Applet {
  int x1 , y1 , x2 , y2;
  int i = 0;
  MyLine[] lineObj = new MyLine[5];

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
      this.addMouseMotionListener(new MouseMotionListener(){
          @Override
          public void mouseDragged(MouseEvent me) {
              x2 = me.getX();
              y2 = me.getY();
              lineObj[i] = new MyLine(x1,y1,x2,y2);
              i+=1;
              repaint();
          }

          @Override
          public void mouseMoved(MouseEvent me) {
              
          }
          
      });
  }
  @Override
  public void paint(Graphics g){
      for(int k = 0 ; k < i ; k++){
          g.drawLine(x1, y1, x2, y2);
      }
      
  }
  class MyLine{
    MyLine(int _x1 , int _y1 , int _x2 , int _y2){
      x1 = _x1;
      y1 = _y1;
      x2 = _x2;
      y2 = _y2;
  }
}
      
  }
 