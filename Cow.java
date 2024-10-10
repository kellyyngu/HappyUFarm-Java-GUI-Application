package assignment;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import java.util.Timer;

public class Cow extends FarmAnimal{
	int lastX;
	int lastY;
	Timer time;
	public Cow()
	{
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2d=(Graphics2D)g;
		
		Color c1=new Color(239,184,187);
		g2d.setColor(c1);
		
		
		int[] xmouth= {lastX+40,lastX+40,lastX+50,lastX+50,lastX+110,lastX+110,lastX+120,lastX+120,lastX+110,lastX+110,lastX+50,lastX+50};
		int[] ymouth= {lastY+80,lastY+100,lastY+100,lastY+110,lastY+110,lastY+100,lastY+100,lastY+80,lastY+80,lastY+70,lastY+70,lastY+80};
		int mouthpoints=12;
		g2d.drawPolygon(xmouth, ymouth, mouthpoints);
		g2d.fillPolygon(xmouth, ymouth, mouthpoints);
		
		int[] xudder= {lastX+160,lastX+160,lastX+170,lastX+170,lastX+200,lastX+200,lastX+190,lastX+190};
		int[] yudder= {lastY+110,lastY+120,lastY+120,lastY+130,lastY+130,lastY+120,lastY+120,lastY+110};
		int udderpoints=8;
		g2d.drawPolygon(xudder, yudder, udderpoints);
		g2d.fillPolygon(xudder, yudder, udderpoints);
		
		g2d.setColor(new Color(255,255,255));
		int[] xwhitehead= {lastX+70,lastX+70,lastX+60,lastX+60,lastX+50,lastX+50,lastX+60,lastX+60,lastX+70,lastX+70,lastX+90,lastX+90,lastX+100,lastX+100,lastX+110,lastX+110,lastX+120,lastX+120,lastX+100,lastX+100};
		int[] ywhitehead= {lastY+20,lastY+30,lastY+30,lastY+40,lastY+40,lastY+70,lastY+70,lastY+50,lastY+50,lastY+70,lastY+70,lastY+50,lastY+50,lastY+70,lastY+70,lastY+80,lastY+80,lastY+30,lastY+30,lastY+20};
		int whiteheadpoints=20;
		g2d.drawPolygon(xwhitehead, ywhitehead, whiteheadpoints);
		g2d.fillPolygon(xwhitehead, ywhitehead, whiteheadpoints);
		
		int[] xear= {lastX+120,lastX+120,lastX+150,lastX+150};
		int[] year= {lastY+20,lastY+30,lastY+30,lastY+20};
		int earpoints=4;
		g2d.drawPolygon(xear, year, earpoints);
		g2d.fillPolygon(xear, year, earpoints);
		
		int[] xleg1whitepoints= {lastX+90,lastX+90,lastX+100,lastX+100};
		int[] yleg1whitepoints= {lastY+120,lastY+140,lastY+140,lastY+120};
		g2d.drawPolygon(xleg1whitepoints, yleg1whitepoints, earpoints);
		g2d.fillPolygon(xleg1whitepoints, yleg1whitepoints, earpoints);
		
		int[] xleg2whitepoints= {lastX+170,lastX+170,lastX+180,lastX+180};
		int[] yleg2whitepoints= {lastY+130,lastY+140,lastY+140,lastY+130};
		g2d.drawPolygon(xleg2whitepoints, yleg2whitepoints, earpoints);
		g2d.fillPolygon(xleg2whitepoints, yleg2whitepoints, earpoints);
		
		int[] xbodywhitepoints= {lastX+130,lastX+130,lastX+120,lastX+120,lastX+110,lastX+110,lastX+130,lastX+130,lastX+140,lastX+140,lastX+210,lastX+210,lastX+220,lastX+220,lastX+210,lastX+210,lastX+180,lastX+180,lastX+170,lastX+ 170};
		int[] ybodywhitepoints= {lastY+40,lastY+100,lastY+100,lastY+110,lastY+110,lastY+120,lastY+120,lastY+140,lastY+140,lastY+110,lastY+110,lastY+140,lastY+140,lastY+50,lastY+50,lastY+60,lastY+60,lastY+50,lastY+50,lastY+40};
		int bodywhitepoints=20;
		g2d.drawPolygon(xbodywhitepoints, ybodywhitepoints, bodywhitepoints);
		g2d.fillPolygon(xbodywhitepoints, ybodywhitepoints, bodywhitepoints);
		
		Color c2=new Color(0,0,0);
		g2d.setColor(c2);
		Rectangle head1= new Rectangle(lastX+10,lastY+10,40,20);
		g2d.draw(head1);
		g2d.fill(head1);
		
		Rectangle head2= new Rectangle(lastX+20,lastY+30,40,10);
		g2d.draw(head2);
		g2d.fill(head2);
		
		Rectangle head3= new Rectangle(lastX+50,lastY+20,20,10);
		g2d.draw(head3);
		g2d.fill(head3);
		
		Rectangle head4= new Rectangle(lastX+70,lastY+10,30,10);
		g2d.draw(head4);
		g2d.fill(head4);
		
		Rectangle head5= new Rectangle(lastX+100,lastY+20,20,10);
		g2d.draw(head5);
		g2d.fill(head5);
		
		Rectangle head6= new Rectangle(lastX+120,lastY+10,40,10);
		g2d.draw(head6);
		g2d.fill(head6);
		
		Rectangle head7= new Rectangle(lastX+150,lastY+20,10,10);
		g2d.draw(head7);
		g2d.fill(head7);
		
		Rectangle head8= new Rectangle(lastX+40,lastY+40,10,40);
		g2d.draw(head8);
		g2d.fill(head8);
		
		Rectangle head9= new Rectangle(lastX+30,lastY+80,10,20);
		g2d.draw(head9);
		g2d.fill(head9);
		
		Rectangle head10= new Rectangle(lastX+40,lastY+100,10,10);
		g2d.draw(head10);
		g2d.fill(head10);
		
		Rectangle head11= new Rectangle(lastX+50,lastY+110,60,10);
		g2d.draw(head11);
		g2d.fill(head11);
		
		Rectangle head12= new Rectangle(lastX+120,lastY+30,10,70);
		g2d.draw(head12);
		g2d.fill(head12);
		
		Rectangle head13= new Rectangle(lastX+110,lastY+100,10,10);
		g2d.draw(head13);
		g2d.fill(head13);
		
		Rectangle eyes1= new Rectangle(lastX+60,lastY+50,10,20);
		g2d.draw(eyes1);
		g2d.fill(eyes1);
		
		Rectangle eyes2= new Rectangle(lastX+90,lastY+50,10,20);
		g2d.draw(eyes2);
		g2d.fill(eyes2);
		
		Rectangle nose1= new Rectangle(lastX+60,lastY+80,10,10);
		g2d.draw(nose1);
		g2d.fill(nose1);
		
		Rectangle nose2= new Rectangle(lastX+90,lastY+80,10,10);
		g2d.draw(nose2);
		g2d.fill(nose2);
		
		Rectangle body1= new Rectangle(lastX+120,lastY+30,90,10);
		g2d.draw(body1);
		g2d.fill(body1);
		
		Rectangle body2= new Rectangle(lastX+210,lastY+40,20,10);
		g2d.draw(body2);
		g2d.fill(body2);
		
		Rectangle body3= new Rectangle(lastX+220,lastY+50,10,110);
		g2d.draw(body3);
		g2d.fill(body3);
		
		Rectangle body4= new Rectangle(lastX+140,lastY+110,70,10);
		g2d.draw(body4);
		g2d.fill(body4);
		
		Rectangle body5= new Rectangle(lastX+100,lastY+120,30,10);
		g2d.draw(body5);
		g2d.fill(body5);
		
		Rectangle tail1= new Rectangle(lastX+230,lastY+50,10,10);
		g2d.draw(tail1);
		g2d.fill(tail1);
		
		Rectangle tail2= new Rectangle(lastX+240,lastY+60,10,60);
		g2d.draw(tail2);
		g2d.fill(tail2);
		
		Rectangle tail3= new Rectangle(lastX+250,lastY+90,10,20);
		g2d.draw(tail3);
		g2d.fill(tail3);
		
		int[] spot1x= {lastX+170,lastX+170,lastX+180,lastX+180,lastX+210,lastX+210};
		int[] spot1y= {lastY+40,lastY+50,lastY+50,lastY+60,lastY+60,lastY+40};
		int spot1points= 6;
		g2d.drawPolygon(spot1x, spot1y, spot1points);
		g2d.fillPolygon(spot1x, spot1y, spot1points);
		
		int[] spot2x= {lastX+140,lastX+140,lastX+170,lastX+170,lastX+180,lastX+180,lastX+150,lastX+150};
		int[] spot2y= {lastY+80,lastY+100,lastY+100,lastY+90,lastY+90,lastY+70,lastY+70,lastY+80};
		int spot2points=8;
		g2d.drawPolygon(spot2x, spot2y, spot2points);
		g2d.fillPolygon(spot2x, spot2y, spot2points);
		
		Rectangle leg1= new Rectangle(lastX+80,lastY+120,10,40);
		g2d.draw(leg1);
		g2d.fill(leg1);
		
		Rectangle leg2= new Rectangle(lastX+80,lastY+140,30,20);
		g2d.draw(leg2);
		g2d.fill(leg2);
		
		Rectangle leg3= new Rectangle(lastX+100,lastY+120,10,40);
		g2d.draw(leg3);
		g2d.fill(leg3);
		
		Rectangle leg4= new Rectangle(lastX+120,lastY+120,10,40);
		g2d.draw(leg4);
		g2d.fill(leg4);
		
		
		Rectangle leg5= new Rectangle(lastX+120,lastY+140,30,20);
		g2d.draw(leg5);
		g2d.fill(leg5);
		
		Rectangle leg6= new Rectangle(lastX+140,lastY+110,10,50);
		g2d.draw(leg6);
		g2d.fill(leg6);
		
		Rectangle leg7= new Rectangle(lastX+160,lastY+120,10,40);
		g2d.draw(leg7);
		g2d.fill(leg7);
		
		Rectangle leg8= new Rectangle(lastX+160,lastY+140,30,20);
		g2d.draw(leg8);
		g2d.fill(leg8);
		
		Rectangle leg9= new Rectangle(lastX+180,lastY+130,10,30);
		g2d.draw(leg9);
		g2d.fill(leg9);
		
		Rectangle leg10= new Rectangle(lastX+200,lastY+110,10,50);
		g2d.draw(leg10);
		g2d.fill(leg10);
		
		Rectangle leg11= new Rectangle(lastX+200,lastY+140,30,20);
		g2d.draw(leg11);
		g2d.fill(leg11);
		
	}	
}

