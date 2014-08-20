package pack;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Game extends StateBasedGame{
	
	String name = "Project Unicorn";
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
		this.enterState(play);
	}

}
