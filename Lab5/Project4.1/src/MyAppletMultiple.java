/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

/**
 *
 * @author user
 */
public class MyAppletMultiple extends Applet {
   int yLoc;
  int xLoc;
  Vector<Line> lines;
  int linesNo = 0;

    /**
     *
     */
    @Override
  public void init() {
    MyMouseListener myMouseListener = new MyMouseListener();
    this.addMouseMotionListener(myMouseListener);
    this.addMouseListener(myMouseListener);
    lines = new Vector<Line>();
  }

   @Override
  public void paint(Graphics g) {
    for (int i = 0; i < lines.size(); i++) {
      g.drawLine(
        lines.get(i).x1,
        lines.get(i).y1,
        lines.get(i).x2,
        lines.get(i).y2
      );
    }
  }

  class Line {

    int x1;
    int y1;
    int x2;
    int y2;

    public Line(int _x1, int _y1, int _x2, int _y2) {
      x1 = _x1;
      y1 = _y1;
      x2 = _x2;
      y2 = _y2;
    }

    public void setPos(int x, int y) {
      x2 = x;
      y2 = y;
    }
  }

  class MyMouseListener extends MouseAdapter {

    boolean dragging = false;
    int dragXPos;
    int dragYPos;

    public void mouseDragged(MouseEvent e) {
      //detect the mouse dragging the Ball
      if (!dragging) {
        dragging = true;
        dragXPos = e.getX();
        dragYPos = e.getY();
        lines.add(new Line(dragXPos, dragYPos, e.getX(), e.getY()));
        repaint();
      } else {
        lines.lastElement().setPos(e.getX(), e.getY());
        repaint();
        // System.out.println(String.valueOf(lines[linesNo].point2X));
      }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      if (dragging) {
        lines.lastElement().setPos(e.getX(), e.getY());
        repaint();
        dragging = false;
      }
    }
  }
}