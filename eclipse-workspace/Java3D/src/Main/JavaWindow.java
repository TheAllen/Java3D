package Main;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class JavaWindow extends JFrame{

	static JFrame f = new JavaWindow();
	//private Screen screen;
	
	public JavaWindow() {
		super("Java 3D Console");
		
		//screen = new Screen();
		
		//setUndecorated(true); // Means no bottoms on the top right corner
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new Screen());
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new JavaWindow();
	}
}
