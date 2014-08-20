package pack.states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import pack.objects.UniButton;

public class Play extends BasicGameState{
	UniButton butt = new UniButton();
	
	public Play(int play) {
	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		butt.render(g, 10, 10);
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		butt.update();
		
	}

	public int getID() {
		return 1;
	}

}
