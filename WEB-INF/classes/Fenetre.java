package Class;

import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame
{	
	public Fenetre() throws Exception
	{
		setTitle("Ping Pong");
		setSize(600,800);
		Pannel b = new Pannel();
		b.setLayout(new FlowLayout());
		add(b);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}     
}