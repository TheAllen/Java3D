package Game;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class Game extends JFrame{
	
	public Game() {
		super("Metal Slug");
	}

	
	public static void main(String[] args) {
		
		JFrame gameFrame = new Game();
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//gameFrame.setLocationRelativeTo(null);
		//gameFrame.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
		gameFrame.setContentPane(new GamePanel());
		gameFrame.setResizable(false);
		gameFrame.pack();
		gameFrame.setVisible(true);;
		
	}
}
