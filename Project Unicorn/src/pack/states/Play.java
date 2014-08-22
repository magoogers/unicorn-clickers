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
	Numbers n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
	double add = 1.0;
	
	
	public Play(int play) {
		u = ran.nextInt();
	 	i = ran.nextInt();
		
	 	
	}

	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		num= new ArrayList<Numbers>();
		n1 = new Numbers(""+add);
		num.add(n1);
		n2 = new Numbers(""+add);
		num.add(n2);
		n3 = new Numbers(""+add);
		num.add(n3);
		n4 = new Numbers(""+add);
		num.add(n4);
		n5 = new Numbers(""+add);
		num.add(n5);
		n6 = new Numbers(""+add);
		num.add(n6);
		
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
		
		if(butt.getClicked()){
			
			for(Numbers a:num){
				if(a.getY() <0){
				a.setActive();
				}
				
			}
			
		}
		
		Input i = gc.getInput();
		
		
		
		
		
		
	}

	public int getID() {
		return 1;
	}

}

