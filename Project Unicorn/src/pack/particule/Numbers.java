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
		
		x=ran.nextInt(100);
		y=ran.nextInt(100);
		
	}
	public void render(Graphics g){
		if(active){
			g.drawString("" +y,600,600);
		g.drawString(thing,x,y);
		}
		
	}
	public void update(GameContainer gc,int delta){
		Input i = gc.getInput();
		if(active){
		
		y-=0.1f*delta;
		
		
		
		
		
		
		if(y<-10){
			
			
		active = false;	
		}
		}
		
		
		
	}
	
	
	public void setActive(){
		
		active = true;
		x=ran.nextInt(300);
		y=ran.nextInt(400);
		
		
	}
	public int getY(){
		return (int)y;
		
		
		
	}
}
