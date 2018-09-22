package Game;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable, KeyListener{
	
	//Serial ID
	private static final long serialVersionUID = 1L;
	
	//Dimension for the game frame
	public static final int WIDTH = 320;
	public static final int HEIGHT = 240;
	
	//SCALE
	public static final int SCALE = 2;
	
	//Image
	private BufferedImage bufferedImage;
	private Graphics2D g;
	
	//running
	private boolean running;
	
	//Game Thread
	private Thread gameThread;
	
	//Audio Thread
	private Thread audioThread;
	
	//Game States
	
	//Constructor
	public GamePanel() {
		//Call stuff from the super class
		super();
		
		//Set the size of the game screen
		setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		setFocusable(true);
		requestFocus();
	}
	
	//Run automatically depending on the AWT
	public void addNotify() {
		super.addNotify();
		if(gameThread == null) {
			gameThread = new Thread(this);
			addKeyListener(this);
			gameThread.start();
		}
		
		//For Audio
		if(audioThread == null) {
			audioThread = new Thread();
		}
	}
	
	//Initialize any objects we need to use
	public void init() {
		
		bufferedImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		//Convert it Graphics2D
		g = (Graphics2D)bufferedImage.getGraphics();
		
		running = true;
	}
	
	@Override
	public void run() {
		
		init();
		
		long startTime;
		long elapsedTime;
		long waitTime;
		
		while(running) {
			
			startTime = System.nanoTime();
			
			
		}
		
	}
	
	private void update() {
		
	}
	
	private void render() {
		
	}
	
	private void drawAndDispose() {
		
	}
	
	@Override 
	public void keyTyped(KeyEvent key) {
		
	}
	
	@Override 
	public void keyPressed(KeyEvent key) {
		
	}
	
	@Override
	public void keyReleased(KeyEvent key) {
		
	}
}
