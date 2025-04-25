package Class;

import javax.swing.*;
import java.awt.*;

public class Joueur extends Deplacement
{
	int width = 0;
	int height = 0;
	public Graphics2D joueur(Graphics2D g)
	{
		getColor(g);
		g.fillRect(getX(), getY(), width, height);
		setHeightEtWidth(width , height);
		return g;
	}
	public Joueur(int xx , int yy , int vx , int vy , int tailleX, int tailleY)
	{
		this.setX(xx);
		this.setY(yy);
		this.setVX(vx);
		this.setVY(vy);
		this.width = tailleX;
		this.height = tailleY;
	}
}