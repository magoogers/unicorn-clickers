package pack.particule;

import java.util.Random;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Numbers {

	String thing;
	float x,y;
	boolean active = true;
	Random ran = new Random();
	public Numbers(String thing){
		this.thing = thing;
		this.x= x;
		this.y = y;
		
	}
	public void render(Graphics g){
		if(active){
		g.drawString(thing,x,y);
		}
		
	}
	public void update(GameContainer gc,int delta){
		Input i = gc.getInput();
		if(active){
		
		y-=0.1f*delta;
		
		
		
		
		
		
		if(y>gc.getHeight()){
			
			
		active = false;	
		}
		}
		
		if(i.isMouseButtonDown(0)){
			
			active = true;
			
			x=1+(int)ran.nextInt();
			
		}
		
	}
	
	
	
}
