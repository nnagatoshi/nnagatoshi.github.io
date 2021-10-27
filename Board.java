import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.Polygon;
import java.awt.event.*;

class Board extends JFrame {

    public Board() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        //getContentPane().addMouseListener(new ClickBoard());
        setSize(500, 500);

        // JButton button = new JButton("Start");
        // panel.add(button);
    }

    public void paint(Graphics gp) {

        super.paint(gp);
        Graphics2D graphics = (Graphics2D) gp;
        gp.setColor(Color.BLACK);
        Line2D line1 = new Line2D.Float(500, 166, 0, 166);
        gp.setColor(Color.BLACK);
        Line2D line2 = new Line2D.Float(500, 332, 0, 332);
        gp.setColor(Color.BLACK);
        Line2D line3 = new Line2D.Float(166, 500, 166, 0);
        gp.setColor(Color.BLACK);
        Line2D line4 = new Line2D.Float(332, 500, 332, 0);
        graphics.draw(line1);
        graphics.draw(line2);
        graphics.draw(line3);
        graphics.draw(line4);
        // making tic tac toe board

        Rectangle2D player1 = new Rectangle2D.Double(40, 40, 100, 100);
        gp.setColor(Color.RED);
        graphics.draw(player1);

        Rectangle2D player2 = new Rectangle2D.Double(40, 40, 90, 90);
        gp.setColor(Color.BLUE);
        graphics.rotate(Math.toRadians(45), 75, 75);

        
        graphics.draw(player2);
        // graphics.draw(new Rectangle2D.Double(30,30,100,100));
        // graphics.draw(new Polygon2D.Double(100,100,4));
    }

    public static void main(String[] args) {
        Board b = new Board();
        b.setVisible(true);
        JFrame.setDefaultLookAndFeelDecorated(true); 
        JFrame window = new JFrame("Inverse Tic Tac Toe");
        PlayerPanel frame = new PlayerPanel();
        window.setContentPane(frame);
        frame.addMouseListener(new ClickBoard(frame));
        window.setSize(500,500);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setVisible(true);
        Board panel = new Board();
        frame.setBackground(Color.white);
        frame.add(panel);
     
        frame.setVisible(true);
    }
}