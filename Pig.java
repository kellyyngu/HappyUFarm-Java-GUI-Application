package assignment;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;

import javax.swing.JPanel;

public class Pig extends FarmAnimal
{
	static JPanel panel;
	static int lastX;
	static int lastY;
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2= (Graphics2D)g;
		Ellipse2D.Double grass= new Ellipse2D.Double(50, 200, 220, 50);
		g2.setColor(new Color(51, 204, 51));
		g2.draw(grass);
		g2.fill(grass);
		int[]xpoint= {50,40,30,18};
		int[]ypoint= {40,30,32,45};
		Polygon leftear = new Polygon(xpoint,ypoint,4);
		g2.setColor(new Color(255, 153, 204));
		g2.draw(leftear);
		g2.fill(leftear);
		int[]xpoint2= {90,100,110,122};
		Polygon rightear = new Polygon(xpoint2,ypoint,4);
		g2.draw(rightear);
		g2.fill(rightear);
		Ellipse2D.Double face= new Ellipse2D.Double(20, 30, 100, 90);
		g2.setColor(new Color(255, 128, 170));
		g2.draw(face);
		g2.fill(face);
		Ellipse2D.Double nose= new Ellipse2D.Double(45, 85, 50, 25);
		g2.setColor(new Color(255,51,153));
		g2.draw(nose);
		g2.fill(nose);
		Ellipse2D.Double leftnostril= new Ellipse2D.Double(57, 90, 10, 15);
		g2.setColor(new Color(0,0,0));
		g2.draw(leftnostril);
		g2.fill(leftnostril);
		Ellipse2D.Double rightnostril= new Ellipse2D.Double(73, 90, 10, 15);
		g2.draw(rightnostril);
		g2.fill(rightnostril);
		Ellipse2D.Double lefteye= new Ellipse2D.Double(50,60, 10, 20);
		g2.setColor(new Color(255,255,255));
		g2.draw(lefteye);
		g2.fill(lefteye);
		Ellipse2D.Double righteye= new Ellipse2D.Double(80,60, 10, 20);
		g2.draw(righteye);
		g2.fill(righteye);
		Ellipse2D.Double leftpupil= new Ellipse2D.Double(55, 65, 5, 10);
		g2.setColor(new Color(0,0,0));
		g2.draw(leftpupil);
		g2.fill(leftpupil);
		Ellipse2D.Double rightpupil= new Ellipse2D.Double(85, 65, 5, 10);
		g2.draw(rightpupil);
		g2.fill(rightpupil);
		Rectangle frontleftleg = new Rectangle(90,180,20,40);
		g2.setColor(new Color(255, 153, 204));
		g2.draw(frontleftleg);
		g2.fill(frontleftleg);
		Rectangle frontrightleg = new Rectangle(120,190,20,20);
		g2.draw(frontrightleg);
		g2.fill(frontrightleg);
		Rectangle backleftleg = new Rectangle(190,180,20,40);
		g2.draw(backleftleg);
		g2.fill(backleftleg);
		Rectangle backrightleg = new Rectangle(220,180,20,30);
		g2.draw(backrightleg);
		g2.fill(backrightleg);
		Ellipse2D.Double body= new Ellipse2D.Double(70, 80, 190, 125);
		g2.setColor(new Color(255, 128, 170));
		g2.draw(body);
		g2.fill(body);
		int[]xFLtoe= {90,93,100,107,110};
		int[]yFLtoe= {220,230,225,230,220};
		Polygon frontlefttoe= new Polygon(xFLtoe, yFLtoe, 5);
		g2.setColor(new Color(77, 38, 0));
		g2.draw(frontlefttoe);
		g2.fill(frontlefttoe);
		int[]xFRtoe= {120,123,130,137,140};
		int[]yFRtoe= {210,220,215,220,210};
		Polygon frontrighttoe= new Polygon(xFRtoe, yFRtoe, 5);
		g2.draw(frontrighttoe);
		g2.fill(frontrighttoe);
		int[]xBLtoe= {190,193,200,207,210};
		Polygon backlefttoe= new Polygon(xBLtoe, yFLtoe, 5);
		g2.draw(backlefttoe);
		g2.fill(backlefttoe);
		int[]xBRtoe= {220,223,230,237,240};
		Polygon backrighttoe= new Polygon(xBRtoe, yFRtoe, 5);
		g2.draw(backrighttoe);
		g2.fill(backrighttoe);
		Path2D.Double tail= new Path2D.Double();
		tail.moveTo(260,140);
		tail.curveTo(265, 130, 280,130, 290, 140);
		g2.draw(tail);
	}
}