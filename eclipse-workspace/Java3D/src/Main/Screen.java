package Main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Screen extends JPanel{
	
	private double[] viewFrom;
	
	private double[] viewTo;
	
	private Objects o;
	
	public Screen() {
		
		o = new Objects(new int[] {100,200,280,200,100,20}, new int[] {100, 100, 200, 300, 300, 200}, Color.BLACK);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		//g.setColor(Color.BLUE);
		//g.fillOval(10,  10, 150, 150);
		//getSize().drawOval(10, 10, 150, 150);
		
		//Drawing polygons
		g.fillPolygon(o.getPoly());
		o.drawPolygon(g);
	}
}
