package tk.uniclicker.main;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{
	//dont know why this is here
	private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	private boolean running = false;
	private Thread thread;
	public Game(){
		
	}
	public synchronized void start(){
		running = true;
		thread = new Thread(this,"Display");
		thread.start();
	}
	public synchronized void stop(){
		running = false;
	}
	public void run(){
		
	}
}
