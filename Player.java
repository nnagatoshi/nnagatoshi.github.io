import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.Polygon;
import java.awt.event.*;

public class Player{

    private int x;
    private  int y;
    private Color color;

    public Player(int x, int y, Color color){
        super();
        this.x = x;
        this.y = y;
        this.color = color;
    }

	public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Color getColor(){
        return color;
    }

    public void draw(Graphics g){
        Graphics2D graphics = (Graphics2D) g;
        g.setColor(color);
        ((Graphics2D) g).draw(new Rectangle2D.Double(x, y, 100, 100));
       

    }
}