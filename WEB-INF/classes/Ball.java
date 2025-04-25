package Class;

import javax.swing.*;
import java.awt.*;

public class Ball extends Deplacement
{
	int width = 20;
	int height = 20;
	public Graphics2D ballon(Graphics2D g)
	{
		getColor(g);
		g.fillOval(getX(),getY(),width,height);
		setHeightEtWidth(width , height);
		return g;
	}
	public Ball(int xx , int yy , int vitessX, int vitessY)
	{
		this.setX(xx);
		this.setY(yy);
		this.setVX(vitessX);
		this.setVY(vitessY);
	}
}