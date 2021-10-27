

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.Polygon;
import java.awt.event.*;

public class ClickBoard extends MouseAdapter{

   private PlayerPanel panel;

   public ClickBoard(PlayerPanel panel){
      super();
      this.panel=panel;
   }
   @Override
   public void mouseClicked(MouseEvent e){
      panel.addPlayer(new Player(e.getX() - 12 , e.getY() - 12 , Color.BLUE));

   }
}