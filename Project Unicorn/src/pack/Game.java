package pack;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import pack.states.Menu;
import pack.states.Play;

public class Game extends StateBasedGame{
	
	private static final String name = "Project Unicorn";
	int menu = 0;
	int play = 1;
	
	public Game(String name) {
		super(name);
		this.addState(new Menu(menu));
		this.addState(new Play(play));
	}

	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(menu).init(gc, this);
		this.getState(play).init(gc, this);
		this.enterState(menu);
	}
	
	public static void main(String args[]) {
		AppGameContainer appgc;
		try {
			appgc = new AppGameContainer(new Game(name));
			appgc.setDisplayMode(1024,768, false);
			appgc.setShowFPS(false);
			
			appgc.start();
		}catch(SlickException e) { e.printStackTrace(); }
	}

}
