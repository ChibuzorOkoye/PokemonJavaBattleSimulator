package pokemonSim;

import java.awt.Canvas;

public class GameManager extends Canvas implements Runnable{

	public static final int WIDTH = 900;
	public static final int HEIGHT = WIDTH/12*9;
	public GameManager()
	{
		new GameWindow(WIDTH, HEIGHT, "PokeMon Battle Simulator", this);
	}
	public synchronized void start () {
		
	}
	
	public void run()
	{
		
	}
	
	public static void main(String args[])
	{
		new GameManager();
	}
}
