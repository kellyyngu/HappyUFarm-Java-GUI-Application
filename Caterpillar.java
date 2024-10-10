package assignment;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;
import java.awt.BasicStroke;
import java.awt.Color;

public class Caterpillar extends FarmAnimal{

	private int lastX;
	private int lastY;
	
	private Ellipse2D.Double fifthcircle;
	private Ellipse2D.Double fourthcircle;
	private Ellipse2D.Double thirdcircle;
	private Ellipse2D.Double secondcircle;
	private Ellipse2D.Double firstcircle;
	
	private Ellipse2D.Double eye1;
	private Ellipse2D.Double eye2;
	private Ellipse2D.Double ie1;
	private Ellipse2D.Double ie2;
	
	private Line2D.Double line;
	private Line2D.Double line1;
	private Line2D.Double line2;
	private Line2D.Double line3;
	private Line2D.Double line4;
	private Line2D.Double line5;
	private Line2D.Double line6;
	private Line2D.Double line7;
	
	private Ellipse2D.Double c;
	private Ellipse2D.Double c1;
	private Ellipse2D.Double c2;
	private Ellipse2D.Double c3;
	private Ellipse2D.Double c4;
	private Ellipse2D.Double c5;
	private Ellipse2D.Double c6;
	private Ellipse2D.Double c7;
	
	private Ellipse2D.Double ye;
	private Ellipse2D.Double y1;
	private Ellipse2D.Double y2;
	private Ellipse2D.Double y3;
	
	private Arc2D.Double smile;
	private Arc2D.Double ear;
	private Arc2D.Double ear1;

	private Ellipse2D.Double e;
	private Ellipse2D.Double e1;
	
	public Caterpillar()
	{
		fifthcircle = new Ellipse2D.Double(10, 210, 50, 50);
		fourthcircle = new Ellipse2D.Double(50, 200, 50, 50);
		thirdcircle = new Ellipse2D.Double(90, 210, 50, 50);
		secondcircle = new Ellipse2D.Double(130, 200,50,50);
		firstcircle = new Ellipse2D.Double(170,210,50,50);
		
		eye1 = new Ellipse2D.Double(185,225,13,13);
		eye2 = new Ellipse2D.Double(200,225,13,13);
		ie1 = new Ellipse2D.Double(188,228,5,5);
		ie2 = new Ellipse2D.Double(203,228,5,5);
		line = new Line2D.Double  (25, 258, 25 ,280);
		line1 = new Line2D.Double (40, 260, 40 ,270);
		line2 = new Line2D.Double (65, 250, 65 ,280);
		line3 = new Line2D.Double (80, 252, 80 ,270);
		line4 = new Line2D.Double (105, 257, 105 ,280);
		line5 = new Line2D.Double (120, 260, 120 ,270);
		line6 = new Line2D.Double (145, 250, 145 ,280);
		line7 = new Line2D.Double (160, 252, 160 ,270);
		
		c = new Ellipse2D.Double(24,278,12,10);
		c1 = new Ellipse2D.Double(40,265,12,10);
		c2 = new Ellipse2D.Double(64,279,12,10);
		c3 = new Ellipse2D.Double(79,266,12,10);
		c4 = new Ellipse2D.Double(104,279,12,10);
		c5 = new Ellipse2D.Double(118,266,12,10);
		c6 = new Ellipse2D.Double(145,278,12,10);
		c7 = new Ellipse2D.Double(160,266,12,10);
		
		ye = new Ellipse2D.Double(60,210,10,10);
		y1 = new Ellipse2D.Double(140,210,10,10);
		y2 = new Ellipse2D.Double(100,220,10,10);
		y3 = new Ellipse2D.Double(20,220,10,10);
		
		smile = new Arc2D.Double(190,235,15,16,180,175,Arc2D.OPEN);
		ear = new Arc2D.Double(183,186,20,25,90,170,Arc2D.OPEN);
		ear1 = new Arc2D.Double(199,188,20,25,90,170,Arc2D.OPEN);
		
		e = new Ellipse2D.Double(185,182,10,10);
		e1 = new Ellipse2D.Double(201,184,10,10);
	}
	
	public void paintComponent(Graphics g) 
    {
		Graphics2D g2 = (Graphics2D) g;
		Stroke stroke = new BasicStroke(3f);
	    g2.setStroke(stroke);
        
		Color green = new Color(0,204,0);
		g2.setColor(green);
		g2.fill(fifthcircle);
		g2.setColor(Color.BLACK);
	    g2.draw(fifthcircle);
       
		Color green2 = new Color(0,204,0);
		g2.setColor(green2);
        g2.fill(fourthcircle);
        g2.setColor(Color.BLACK);
	    g2.draw(fourthcircle);

		Color green3 = new Color(0,204,0);
		g2.setColor(green3);
		g2.fill(thirdcircle);
		g2.setColor(Color.BLACK);
	    g2.draw(thirdcircle);
		
		Color green4 = new Color(0,204,0);
		g2.setColor(green4);
		g2.fill(secondcircle);
		g2.setColor(Color.BLACK);
	    g2.draw(secondcircle);
		
		Color green5 = new Color(0,204,0);
		g2.setColor(green5);
		g2.fill(firstcircle);
		g2.setColor(Color.BLACK);
	    g2.draw(firstcircle);
	    
	    g2.setColor(Color.BLACK);
		g2.fill(eye1);
		
	    g2.setColor(Color.BLACK);
		g2.fill(eye2);
		
	    g2.setColor(Color.WHITE);
		g2.fill(ie1);
		
	    g2.setColor(Color.WHITE);
		g2.fill(ie2);
	
		g2.setColor(Color.BLACK);
		g2.draw(line);
		
		g2.setColor(Color.BLACK);
		g2.draw(line1);
		
		g2.setColor(Color.BLACK);
		g2.draw(line2);
		
		g2.setColor(Color.BLACK);
		g2.draw(line3);
		
		g2.setColor(Color.BLACK);
		g2.draw(line4);
		
		g2.setColor(Color.BLACK);
		g2.draw(line5);
		
		g2.setColor(Color.BLACK);
		g2.draw(line6);
		
		g2.setColor(Color.BLACK);
		g2.draw(line7);
		
	    g2.setColor(Color.GRAY);
		g2.fill(c);
		g2.setColor(Color.BLACK);
	    g2.draw(c);
		
	    g2.setColor(Color.GRAY);
		g2.fill(c1);
		g2.setColor(Color.BLACK);
	    g2.draw(c1);
		
	    g2.setColor(Color.GRAY);
		g2.fill(c2);
		g2.setColor(Color.BLACK);
	    g2.draw(c2);
		
	    g2.setColor(Color.GRAY);
		g2.fill(c3);
		g2.setColor(Color.BLACK);
	    g2.draw(c3);
		
	    g2.setColor(Color.GRAY);
		g2.fill(c4);
		g2.setColor(Color.BLACK);
	    g2.draw(c4);
		
	    g2.setColor(Color.GRAY);
		g2.fill(c5);
		g2.setColor(Color.BLACK);
	    g2.draw(c5);
		
	    g2.setColor(Color.GRAY);
		g2.fill(c6);
		g2.setColor(Color.BLACK);
	    g2.draw(c6);
		
	    g2.setColor(Color.GRAY);
		g2.fill(c7);
		g2.setColor(Color.BLACK);
	    g2.draw(c7);
	    
	    g2.setColor(Color.YELLOW);
		g2.fill(ye);
		g2.setColor(Color.BLACK);
	    g2.draw(ye);
	    
	    g2.setColor(Color.YELLOW);
		g2.fill(y1);
		g2.setColor(Color.BLACK);
	    g2.draw(y1);
	    
	    g2.setColor(Color.YELLOW);
		g2.fill(y2);
		g2.setColor(Color.BLACK);
	    g2.draw(y2);
	    
	    g2.setColor(Color.YELLOW);
		g2.fill(y3);
		g2.setColor(Color.BLACK);
	    g2.draw(y3);
	    
	    g2.setColor(Color.BLACK);
	    g2.draw(smile);

	    g2.setColor(Color.BLACK);
	    g2.draw(ear);
	    
	    g2.setColor(Color.BLACK);
	    g2.draw(ear1);	    
	    
	    Color lightgreen = new Color(0,255,51);
	    g2.setColor(lightgreen);
	    g2.fill(e);
		g2.setColor(Color.BLACK);
	    g2.draw(e);
	    
	    Color lightgreen1 = new Color(0,255,51);
	    g2.setColor(lightgreen1);
	    g2.fill(e1);
		g2.setColor(Color.BLACK);
	    g2.draw(e1);
    }
}