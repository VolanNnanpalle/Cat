package cat;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

/**
 * This program draws a cat face
 *
 * @author Volan Nnanpalle
 */
public class Cat extends JComponent {

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // Paints the background
        g2.setColor(Color.RED);
        g2.fill(new Rectangle(600, 600));
        g2.translate(300, 300);

        //Draws head and fill
        Ellipse2D.Double head = new Ellipse2D.Double(-240, -240, 480, 480);
        g2.setColor(Color.BLACK);
        g2.fill(head);

        // Draws eyes and fill  
        g2.setColor(Color.BLUE);
        Ellipse2D.Double leftEye = new Ellipse2D.Double(-170, -100, 100, 50);
        Ellipse2D.Double rightEye = new Ellipse2D.Double(50, -100, 90, 50);
        g2.fill(leftEye);
        g2.fill(rightEye);

        // Draws the mouth
        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(4));
        g2.drawArc(-60, 100, 60, 60, 50, 100);
        g2.setStroke(new BasicStroke(4));
        g2.drawArc(-20, 100, 60, 60, 40, 100);

        // Draws top first left wisker 
        g2.setStroke(new BasicStroke(2));
        Point2D.Double left1;
        Point2D.Double right1;
        left1 = new Point2D.Double(-280, 75);
        right1 = new Point2D.Double(-105, 55);
        g2.draw(new Line2D.Double(left1, right1));

        //Draws middle second left wisker 
        g2.setStroke(new BasicStroke(2));
        Point2D.Double left2;
        Point2D.Double right2;
        left2 = new Point2D.Double(-280, 120);
        right2 = new Point2D.Double(-100, 55);
        g2.draw(new Line2D.Double(left2, right2));

        // Draws bottom third left wisker 
        g2.setStroke(new BasicStroke(2));
        Point2D.Double left3;
        Point2D.Double right3;
        left3 = new Point2D.Double(-280, 35);
        right3 = new Point2D.Double(-100, 55);
        g2.draw(new Line2D.Double(left3, right3));

        // Draws top first right wisker 
        g2.setStroke(new BasicStroke(2));
        Point2D.Double Left1;
        Point2D.Double Right1;
        Left1 = new Point2D.Double(280, 75);
        Right1 = new Point2D.Double(105, 55);
        g2.draw(new Line2D.Double(Left1, Right1));

        // Draws middle second right wisker
        g2.setStroke(new BasicStroke(2));
        Point2D.Double Left2;
        Point2D.Double Right2;
        Left2 = new Point2D.Double(280, 120);
        Right2 = new Point2D.Double(100, 55);
        g2.draw(new Line2D.Double(Left2, Right2));

        // Draws bottom third right wisker
        g2.setStroke(new BasicStroke(2));
        Point2D.Double Left3;
        Point2D.Double Right3;
        Left3 = new Point2D.Double(280, 35);
        Right3 = new Point2D.Double(100, 55);
        g2.draw(new Line2D.Double(Left3, Right3));

        // Draws left ear 
        Polygon tri = new Polygon();
        g2.setColor(Color.BLACK);
        tri.addPoint(-170, -260);
        tri.addPoint(-200, -100);
        tri.addPoint(-100, -150);
        g2.fill(tri);

        // Draws right ear
        g2.setColor(Color.BLACK);
        tri.addPoint(170, -260);
        tri.addPoint(200, -100);
        tri.addPoint(100, -150);
        g2.fill(tri);

        Polygon earL = new Polygon();

        g2.setColor(Color.YELLOW);
        earL.addPoint(-170, -260);
        earL.addPoint(-200, -100);
        earL.addPoint(-100, -150);
        g2.fill(earL);

        Polygon earR = new Polygon();

        g2.setColor(Color.YELLOW);
        earR.addPoint(170, -260);
        earR.addPoint(200, -100);
        earR.addPoint(100, -150);
        g2.fill(earR);

        //Draws nose 
        Polygon nose = new Polygon();
        g2.setColor(Color.BLUE);
        nose.addPoint(-5, -15);
        nose.addPoint(-20, 30);
        nose.addPoint(10, 30);
        g2.fill(nose);

        //Left LightSaber 
        g2.setColor(Color.GREEN);
        g2.setStroke(new BasicStroke(8));
        Point2D.Double saber1;
        Point2D.Double saber2;
        saber1 = new Point2D.Double(-285, 25);
        saber2 = new Point2D.Double(-250, -200);
        g2.draw(new Line2D.Double(saber1, saber2));

        //Right LightSaber 
        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(8));
        Point2D.Double saberL1;
        Point2D.Double saberR1;
        saberL1 = new Point2D.Double(285, -25);
        saberR1 = new Point2D.Double(250, -200);
        g2.draw(new Line2D.Double(saberL1, saberR1));

        // Left LightSaber handle 
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(15));
        g2.draw(new Line2D.Float(-285, 25, -280, -10));

        // Right LightSaber handle 
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(15));
        g2.draw(new Line2D.Float(285, -25, 290, 10));

        // Writes text 
        g2.setColor(Color.YELLOW);
        Font font = new Font("SansSerif", Font.BOLD, 24);
        g2.setFont(font);
        g2.drawString("THE FORCE IS STRONG WITH THIS ONE",
                -250, -270);

    }

}
