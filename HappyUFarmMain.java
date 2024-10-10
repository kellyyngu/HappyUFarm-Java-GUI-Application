package assignment;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Timer;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class HappyUFarmMain extends JFrame 
{
	private JComboBox<String>myAnimals;
	private Cow a1;
	private Caterpillar a2;
	private sheep a3;
	private Pig a4;
	private JPanel background;
	private JButton create;
	Timer time;
	Random r1= new Random();
	ArrayList<FarmAnimal> list= new ArrayList<FarmAnimal>();
	
	public HappyUFarmMain()
	{
		String[] animals= {"Cow","Caterpillar","Sheep","Pig"};
		myAnimals=  new JComboBox<>(animals);
		background= new JPanel()
		{
			protected void paintComponent(Graphics g)
			{
				g.drawImage(getImage(), 0, 0, 1258, 665, background);
			}
		};
		background.setBounds(0,0,1400,1180);
		JPanel panel= new JPanel();
		panel.add(new JLabel("Choose Your Animal: "));
		panel.add(myAnimals);
		create= new JButton ("Create");
		panel.add(create);
		JLayeredPane lp1= new JLayeredPane();
		lp1.add(background,Integer.valueOf(1));
		
		class ButtonListener implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String animal= (String)myAnimals.getSelectedItem();
				if(animal.equals("Cow")) {
					a1= new Cow();
					a1.setBounds();
					list.add(a1);
					lp1.add(a1,Integer.valueOf(2));
					moves(a1);
					Drag control1 = new Drag(a1);
				}
				else if (animal.equals("Caterpillar")) {
					a2= new Caterpillar();
					a2.setBounds();
					list.add(a2);
					lp1.add(a2,Integer.valueOf(2));
					moves(a2);
					Drag control1= new Drag(a2);
				}
				else if (animal.equals("Sheep")) {
					a3= new sheep();
					a3.setBounds();
					list.add(a3);
					lp1.add(a3,Integer.valueOf(2));
					moves(a3);
					Drag control1= new Drag(a3);
				}
				else if(animal.equals("Pig"))
				{
					a4= new Pig();
					a4.setBounds();
					list.add(a4);
					lp1.add(a4,Integer.valueOf(2));
					moves(a4);
					Drag control1= new Drag(a4);
				}
					
			}
			
		}
		
		JButton delete = new JButton("Delete All");
		panel.add(delete);
		delete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				 for (FarmAnimal a : list) {
			            lp1.remove(a);
			        }
			        list.clear();
			        lp1.repaint();
			}	
		
		
		});
		ActionListener actionlistener1= new ButtonListener();
		create.addActionListener(actionlistener1);
		getContentPane().add(lp1,BorderLayout.CENTER);
		getContentPane().add(panel,BorderLayout.NORTH);
	}

	Image getImage() {
		// TODO Auto-generated method stub
		File f1=new File("C:\\\\Users\\\\Kay Yii\\\\eclipse-workspace\\\\assignment\\\\bin\\\\Farm.jpeg");
		BufferedImage img = null;
		try {
			img = ImageIO.read(f1);
		}catch (IOException e) {

		e.printStackTrace();
		}
		BufferedImage bufferedImage = (BufferedImage) img;
		return img;
	}
	
	public void moves(JComponent a)
    {
		int delay=50;
    	class TimeListener implements ActionListener
    	{
    		int speedX=3;
    		int speedY=3;
    		public void actionPerformed(ActionEvent e) {
    			int lastX=a.getX();
    			int lastY=a.getY();
				if(lastX<0||lastX>1000)
				{
					speedX=-1*speedX;
				}
				if(lastY<0||lastY>380)
				{
					speedY=-1*speedY;
				}
				
				lastX=lastX+speedX;
				lastY=lastY+speedY;

		        a.setLocation(lastX,lastY);
		    }
		   
	    }
    	ActionListener actionlistener2= new TimeListener();
 		Timer t1= new Timer(delay, actionlistener2);
 		t1.start();
    }
	
	public static void main(String[]args)
	{
		HappyUFarmMain farm= new HappyUFarmMain();
		farm.setSize(1258, 738);
		farm.setTitle("HappyU Farm");
		farm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		farm.setVisible(true);
	}
}