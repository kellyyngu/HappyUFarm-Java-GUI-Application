package assignment;

import java.util.Random;
import javax.swing.JComponent;

public class FarmAnimal extends JComponent
{
	Random r1= new Random();
	public void setBounds()
	{
		setBounds(r1.nextInt(300),r1.nextInt(300),300,300);
	}
}