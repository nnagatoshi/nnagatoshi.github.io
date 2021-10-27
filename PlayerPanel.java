import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.Polygon;
import java.awt.event.*;

public class PlayerPanel extends JPanel{
    private  List <Player> playerOne = new LinkedList<Player>();

    void addPlayer(Player player){
        playerOne.add(player);
        this.repaint();
    }

    @Override 
    public void paint(Graphics g){
        
        for (Player p : playerOne){
            p.draw(g);
        }
    }
}