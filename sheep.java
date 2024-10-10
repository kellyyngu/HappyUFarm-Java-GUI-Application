package assignment;


import java.awt.Graphics;


import java.awt.Color;


public class sheep extends FarmAnimal
{
	int x = 0;
	int y = 0;
	
	public sheep()
	{
	}

	public void paintComponent(Graphics g) 
	{
	        // Set sheep color and size
	        int sheepSize = 100;

	        // Draw the sheep's body
	        g.setColor(Color.WHITE);
	        g.fillRect(x+10, y+120, 10, 30);
	        g.fillRect(x+80, y+10, 30, 90);
	        g.fillRect(x+70, y+20, 10, 70);
	        g.fillRect(x+60, y+30, 10, 50);
	        g.fillRect(x+50, y+40, 10, 30);
	        g.fillRect(x+40, y+50, 10, 20);
	        g.fillRect(x+30, y+60, 10, 10);
	        g.fillRect(x+20, y+70, 10, 110);
	        g.fillRect(x+30, y+90, 30, 20);
	        g.fillRect(x+30, y+110, 20, 70);
	        g.fillRect(x+90, y+100, 30, 10);
	        g.fillRect(x+110, y+20, 10, 90);
	        g.fillRect(x+120, y+10, 10, 90);
	        g.fillRect(x+130, y+10, 10, 100);
	        g.fillRect(x+140, y+10, 10, 90);
	        g.fillRect(x+150, y+20, 10, 60);
	        g.fillRect(x+160, y+30, 10, 40);
	        g.fillRect(x+170, y+40, 10, 30);
	        g.fillRect(x+180, y+60, 20, 10);
	        g.fillRect(x+200, y+70, 10, 10);
	        g.fillRect(x+160, y+90, 10, 20);
	        g.fillRect(x+170, y+90, 20, 100);
	        g.fillRect(x+190, y+80, 10, 100);
	        g.fillRect(x+200, y+120, 10, 40);
	        g.fillRect(x+30, y+180, 10, 10);
	        g.fillRect(x+40, y+180, 10, 20);
	        g.fillRect(x+50, y+160, 10, 50);
	        g.fillRect(x+60, y+170, 10, 40); 
	        g.fillRect(x+70, y+180, 10, 30);
	        g.fillRect(x+80, y+180, 10, 20);
	        g.fillRect(x+90, y+190, 40, 20);
	        g.fillRect(x+130, y+180, 10, 20);
	        g.fillRect(x+140, y+180, 10, 30);
	        g.fillRect(x+150, y+170, 10, 40);
	        g.fillRect(x+160, y+160, 10, 40);
	        	
	        // Draw the sheep's legs
	        g.setColor(Color.LIGHT_GRAY);
	        g.fillRect(x+80, y+200, 10, 10);
	        g.fillRect(x+60,  y+210, 30, 10);
	        g.fillRect(x+130, y+200, 10, 10);
	        g.fillRect(x+130, y+210, 30, 10);
	        
	        g.setColor(Color.BLACK);
	        g.fillRect(x+60, y+220, 30, 10);
	        g.fillRect(x+90, y+210, 20, 10);
	        g.fillRect(x+120, y+210, 10, 10);
	        g.fillRect(x+130, y+220, 30, 10);

	        // Draw the sheep's head
	        g.setColor(Color.LIGHT_GRAY);
	        g.fillRect(x+40, y+70, 20, 10);
	        g.fillRect(x+50, y+110, 10, 50);
	        g.fillRect(x+60, y+80, 10, 90);
	        g.fillRect(x+70, y+90, 10, 30);
	        g.fillRect(x+80, y+100, 10, 20);
	        g.fillRect(x+60, y+140, 10, 30);
	        g.fillRect(x+70, y+140, 20, 40);
	        g.fillRect(x+90, y+110, 40, 20);
	        g.fillRect(x+120, y+100, 10, 10);
	        g.fillRect(x+90, y+140, 10, 50);
	        g.fillRect(x+100, y+150, 20, 40);
	        g.fillRect(x+120, y+140, 10, 50);
	        g.fillRect(x+130, y+140, 20, 40);
	        g.fillRect(x+130, y+110, 10, 10);
	        g.fillRect(x+140, y+100, 10, 20);
	        g.fillRect(x+150, y+80, 10, 90);
	        g.fillRect(x+160, y+110, 10, 50);
	        g.fillRect(x+160, y+70, 30, 10);
	        
	        
	        g.setColor(Color.DARK_GRAY);
	        g.fillRect(x+30, y+70, 10, 10);
	        g.fillRect(x+30, y+80, 30, 10);
	        g.fillRect(x+160, y+80, 30, 10);
	        g.fillRect(x+190, y+70, 10, 10);
	        

	        // Draw the sheep's nose
	        g.setColor(Color.PINK);
	        g.fillRect(x+90, y+130, 40, 10);
	        g.fillRect(x+100, y+140, 20, 10);
	        
	        // Draw the sheep's eyes
	        g.setColor(Color.WHITE);
	        g.fillRect(x+70, y+120 , 10, 10);
	        g.fillRect(x+130, y+120, 10, 10);
	        
	        g.setColor(Color.BLACK);
	        g.fillRect(x+70, y+130, 10, 10);
	        g.fillRect(x+80, y+120, 10, 20);
	        g.fillRect(x+140, y+120, 10, 10);
	        g.fillRect(x+130, y+130, 20, 10);
	    }

}