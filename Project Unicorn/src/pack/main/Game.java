package pack.main;

import pack.main.states.StateManager;


public class Game implements Runnable{
	
	private boolean isRunning = true;
	
	public static void main(String args[]) {
		Window window = new Window(800, 600, "Unicorn Clicker v1.0");
		StateManager sm = new StateManager(1,2);
		
	}
	
	public void run() {
		while(isRunning == true) {
			
			
			
			
		}
	}
	
	
	
}


