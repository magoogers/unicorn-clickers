package pack.objects;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class UniButton extends Button{
	
	boolean isClicked = false;
	Image button;
	
	long clicks = 0;
	
	int imageX, imageY;
	
	int mouseY;
	int mouseX;
	int y,x,width,height;
	private Shape mouse,uni;
	public UniButton(int x,int y,int width,int height){
		this.x = x;
		this.y = y;
		this.height = width;
		this.width = width;
		
	}
	
	
	public void update(GameContainer gc)  {
		mouseX = Mouse.getX();
		mouseY = Mouse.getY();
		mouse = new Rectangle(mouseX,-mouseY+gc.getHeight(),1,1);
		uni = new Rectangle(x,y,width,height);
		Input i = gc.getInput();
		
		if(mouse.intersects(uni) && i.isMousePressed(0) ) {
			isClicked = true;
		}else {
			isClicked = false;
		}
		
		if(isClicked){
			
			count();
			
			
		}
	}
	
	public void render(Graphics g) throws SlickException {
		
		
		
		
		g.drawString("MouseX: " + mouseX, 25,25);
		g.drawString("MouseY: " + mouseY, 25,50);
		
		
		
			button = new Image("res/Unicorn 2.0.png");
	
		g.drawImage(button,x,y);
		
		g.drawString("Clicks: " + clicks, 100, 100);
	}
	
	public void count() {
	
			
			clicks++;
			
			
		
	}
}
>>>>>>> 01ab3176ba85c6c15e2bfbcdf0a7f8711fc40412
