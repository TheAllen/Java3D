package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Objects {
	private Polygon p;
	private Color c;
	
	public Objects(int[] x, int[] y, Color c) {
		
		p = new Polygon();
		
		this.c = c;
		
		p.xpoints = x;
		p.ypoints = y;
		p.npoints = x.length;
	}
	
	void drawPolygon(Graphics g) {
		g.setColor(c);
		g.drawPolygon(p);
	}
}
