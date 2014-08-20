package pack.main;

import java.awt.Graphics;

//import pack.main.game.Menu;
import pack.main.input.Input;
//import pack.main.states.StateManager;


public class Main implements Runnable{
	
	private boolean isRunning = true;
	static Graphics g = null;
	static Window window;
	//static StateManager sm;
	//static Menu menu;
	static Input i;
	public static void main(String args[]) {
		window = new Window(800, 600, "Unicorn Clicker v1.0");
		//sm = new StateManager(0,2);
		
		//menu = new Menu();
		i = new Input();
		
		
	}
	
	public void run() {
		//if(sm.getState() == menu.getID()){

		//g.drawString("hello",100,100);
			//menu.init(window);
		//}
		while(window.getRunning()) {
			//if(sm.getState() == menu.getID()){
				//menu.render(window,sm);
				//menu.update(window, i,sm);
				
			//}
			
			
			
		}
	}
	
	
	
}


