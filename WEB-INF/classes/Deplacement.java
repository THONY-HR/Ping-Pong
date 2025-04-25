package Class;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Deplacement
{
	int x;
	int y;
	int vx = 1;
	int vy = 1;
	int widthX = 0;
	int heightY = 0;
	public Graphics2D getColor(Graphics2D g)
	{
		if (getVX() < 0 || getVY() < 0) 
		{
			g.setColor(Color.RED);	
		}
		else
		{
			g.setColor(Color.BLUE);
		}
		return g;
	}	
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	public int getVX()
	{
		return this.vx;
	}
	public int getVY()
	{
		return this.vy;
	}
	public void setX(int xx)
	{
		this.x = xx;
	}
	public void setY(int yy)
	{
		this.y = yy;
	}
	public void setVX(int vxx)
	{
		this.vx = vxx;
	}
	public void setVY(int vyy)
	{
		this.vy = vyy;
	}
	public void setHeightEtWidth(int wxx , int hyy)
	{
		this.widthX = wxx;
		this.heightY = hyy;
	}
	public void deplacement()
	{
		try
		{
			Thread.sleep(2);
		}
		catch(Exception e)
		{			
		}
		setX(getX() + getVX());
		setY(getY() + getVY());
		if (getX() < 0 || getX() + 20 > 600) 
		{
			setVX(-getVX());
		}
		if (getY() < 0 || getY() + 20 > 800) 
		{
			setVY(-getVY());
		}
		System.out.println("x = "+getX()+" y = "+getY());
	}

	public void collision(int otherX , int otherY , int tailleX , int tailleY)
	{
		Rectangle2D.Double rect1 = new Rectangle2D.Double(getX() + widthX, getY() + heightY, 10, 10);
		Rectangle2D.Double rect2 = new Rectangle2D.Double(otherX, otherY, tailleX, tailleY);

		Area area1 = new Area(rect1);
		Area area2 = new Area(rect2);

		// Intersecter les deux zones
		area1.intersect(area2);

		// Vérifier si l'une des zones a été modifiée après l'intersection
		if (!area1.isEmpty() && !area2.isEmpty()) {
		    // Calculer la direction de collision
		    double deltaX = otherX - getX();
		    double deltaY = otherY - getY();

		    // Inverser la direction en conséquence
		    if (Math.abs(deltaX) > Math.abs(deltaY)) {
		        setVX(-getVX()); // Inverser la direction horizontale
		    } else {
		        setVY(-getVY()); // Inverser la direction verticale
		    }
		}
	}
}