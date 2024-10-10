package assignment;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

public class Drag extends JComponent implements MouseListener, MouseMotionListener {

	private int firstX;
	private int firstY;
	private int newX;
	private int newY;
	
	public Drag(FarmAnimal a)
	{
		a.addMouseListener(this);
		a.addMouseMotionListener(this);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		firstX= e.getX();
		firstY= e.getY();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		e.getComponent().setLocation((e.getX()+e.getComponent().getX())-firstX,(e.getY()+e.getComponent().getY())-firstY); 
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
			
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}