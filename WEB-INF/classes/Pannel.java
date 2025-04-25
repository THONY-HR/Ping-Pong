package Class;

import javax.swing.*;
import java.awt.*;

public class Pannel extends JPanel
{
	Ball[] ball = new Ball[5];
	Joueur j1 = new Joueur(100,50,7,0,190,80);
	public Pannel()
	{
		this.ball[0] = new Ball(100,100,1,1);
		this.ball[1] = new Ball(150,150,2,2);
		this.ball[2] = new Ball(200,200,3,3);
		this.ball[3] = new Ball(250,250,4,4);
		this.ball[4] = new Ball(300,300,6,6);

	}

	public void ballon(Graphics2D g)
	{
		super.paint(g);
		for (int i = 0; i<this.ball.length; i++) 
		{
			ball[i].ballon(g);	
		}
		for (int i = 0; i<this.ball.length; i++) 
		{
			ball[i].deplacement();
		}
		for (int i = 0; i<this.ball.length; i++) 
		{
			for (int e = i; e<this.ball.length; e++) 
			{
				ball[i].collision(ball[e].getX() , ball[e].getY() , 20 , 20);
				ball[i].collision(j1.getX() , j1.getY() , 80 , 20);
			}
		}
		repaint();
	}

	public void paint(Graphics gP)			
	{
		Graphics2D g = (Graphics2D) gP;
		ballon(g);
		j1.joueur(g);
		j1.deplacement();
		repaint();
	}
}