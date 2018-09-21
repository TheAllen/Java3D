package Main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Screen extends JPanel{
	
	public Screen() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(10,  10, 150, 150);
		g.drawOval(10, 10, 150, 150);
	}
}
