package pack.states;

import java.util.ArrayList;
import java.util.Random;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import pack.objects.UniButton;
import pack.particule.Numbers;

public class Play extends BasicGameState{
	
	UniButton butt = new UniButton(100,200,350,350);

	Random ran = new Random();
	ArrayList<Numbers> num;
	int i,u;
	Numbers noom;
	public Play(int play) {
		u = ran.nextInt();
	 	i = ran.nextInt();
		
	 	
	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		num= new ArrayList<Numbers>();
		noom = new Numbers("hello");
		num.add(noom);
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		butt.render(g);
		for(Numbers a : num){
			a.render(g);
		}
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		butt.update(gc);
		for(Numbers a : num){
			a.update(gc,delta);
		}
		Input i = gc.getInput();
		
		
		
		
		
		
	}

	public int getID() {
		return 1;
	}

}

