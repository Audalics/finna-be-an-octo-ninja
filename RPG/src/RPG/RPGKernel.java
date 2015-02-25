  /* Want a class for:
   * creature:
   * player:
   * npc:
   * entity:
   * 	Sprite:sprite;
   * 	
   * 	
   * 	bool:solid;
   * 	float:x;
   * 	float:y;
   * 	float:width;
   * 	float:height;
   * sprite:
   * spriteImage:
   * BgColor:
   * screenSelector: 
   */
package RPG;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RPGKernel extends JPanel implements ActionListener
{
	public enum EntityType { PLAYER, CREATURE, NPC, DECORATION, DOOR, TRIGGER, TELEPORT, WALL, WINDOW, ROOF, TREE, ROCK, TABLE, CHAIR, CONTAINER };
	
	EntityTracker entityTracker;
	
	private JFrame screen;
	private WindowListener screenListener;
	private Timer timer;
	private Ticker tick;
	
	private Rectangle bounds;
	private float tileWidth;
	private float tileHeight;
	private int worldCols;
	private int worldRows;
	private World world;
	
	public class Ticker extends TimerTask
	{
		private int cnt;
		public Ticker()
		{
			super();
			cnt = 0;
		}
		@Override
		public void run() {
			// Have Kernel Update Screen
			screen.repaint();
		}
		
	}
	
	public String toString()
	{
		return "Hi";
	}
	
	public class WindowListener implements ComponentListener
	{

		@Override
		public void componentHidden(ComponentEvent e) {
			// Dont need to do anything
			
		}

		@Override
		public void componentMoved(ComponentEvent e) {
			// Dont need to do anything
			
		}

		@Override
		public void componentResized(ComponentEvent e) {
			// Need to update bounds
			bounds.width = screen.getWidth();
			bounds.height = screen.getHeight();
		}

		@Override
		public void componentShown(ComponentEvent e) {
			// Dont need to do anything
			
		}
	}
	
	public RPGKernel()
	{
		super();
		
		entityTracker = new EntityTracker();
		
		bounds = new Rectangle(0, 0, 800, 600);
		worldRows = 5;
		worldCols = 5;
		
		screenListener = new WindowListener();
		// screen.addComponentListener(screenListener);

		screen = new JFrame("TerrainKernel");
		tick = new Ticker();
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String event = e.getActionCommand();
		
	}

	public void paintComponent(Graphics g){
		// Get the drawing area bounds for game logic.
		bounds = g.getClipBounds();
		
		// Clear the drawing area
		g.clearRect(bounds.x, bounds.y, bounds.width, bounds.height);
		
		// Draw stuff
		//g.fillRect(ball.x, ball.y, ball.width, ball.height);
	}
	
	public void createWorld()
	{
		world = new World(worldCols, worldRows);
	}
  
	public static void main(String arg[]){
		// Instantiate our Kernel
		RPGKernel kernel = new RPGKernel();

		kernel.screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kernel.screen.setSize(kernel.bounds.width, kernel.bounds.height);

		kernel.screen.setContentPane(kernel); 
		kernel.screen.setVisible(true);
		
		// Game code
		kernel.createWorld();
		
		// Start Game Loop
		kernel.timer.schedule(kernel.tick, 0, 33);
	}
	
}
