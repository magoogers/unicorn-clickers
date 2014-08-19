package pack.main;

import pack.main.game.Menu;
import pack.main.input.Input;
import pack.main.render.Graphics;
import pack.main.states.StateManager;


public class Main implements Runnable{
	
	private boolean isRunning = true;
	static Graphics g;
	static Window window;
	static StateManager sm;
	static Menu menu;
	static Input i;
	public static void main(String args[]) {
		window = new Window(800, 600, "Unicorn Clicker v1.0");
		sm = new StateManager(menu.getID(),2);
		g = new Graphics(window.getPanel());
		menu = new Menu();
		i = new Input();
	}
	
	public void run() {
		if(sm.getState() == menu.getID()){
			
			menu.init(window);
		}
		while(window.getRunning()) {
			if(sm.getState() == menu.getID()){
				menu.render(window, g);
				menu.update(window, i);
				
			}
			
			
			
		}
	}
	
	
	
}


