package game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.*;

import display.Display;

public class Game implements Runnable{

	public int width, height;
	private Thread gameThread;
	public String threadname;
	boolean program_running;
	String title;
	Display displayer = new Display();
	private BufferStrategy bs;
	private Graphics g;
	
	
	
	
	
	
public synchronized void startThread() { 
	
	gameThread = new Thread();
	System.out.println("game thread started");
	gameThread.start();
	program_running = true;
	run();
}

public synchronized void stopThread() {
	
	
	if (program_running = true) {
		
		return;
	}
	
	try {
		gameThread.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
		System.out.println("error in main game thread");
	}
	
	
	
}


private void render() { 

	displayer.getHeight();
	displayer.getWidth();
	
	
	
	
	 bs = displayer.getCanvas().getBufferStrategy();
	 if (bs == null){
		 
		displayer.getCanvas().createBufferStrategy(3);
		 return;
	 }
	  g = bs.getDrawGraphics();
	 
	  g.setColor(Color.red);
	 g.fillRect(10,10,100,100);
	 
	 bs.show();
	 g.dispose();
}


private void init() {
	
	
	displayer.Displayer();
}

private void tick() {
	
	
	
	
}
	
public void run() {
	System.out.println("method run initiated");
	init();
	while(program_running)
	{
	tick();
	render();
	}
		
	}
	
	
	
	
	
	
	}
	
	

