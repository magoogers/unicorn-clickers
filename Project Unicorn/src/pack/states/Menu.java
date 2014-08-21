package pack.states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Menu extends BasicGameState{

	Music backmusic;
	
	public Menu(int menu) {
	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		backmusic = new Music("res/Background Music.MP3");
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		backmusic.loop();
		
	}

	public int getID() {
		return 0;
	}

}
