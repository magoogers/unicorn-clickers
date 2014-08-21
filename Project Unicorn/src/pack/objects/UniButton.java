package pack.objects;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class UniButton extends Button{
	
	boolean isClicked = false;
	Image button;
	
	long clicks = 0;
	
	int imageX, imageY;
	
	int mouseY;
	int mouseX;
	int y,x,width,height;
	public UniButton(int x,int y,int width,int height){
		this.x = x;
		this.y = y;
		this.height = width;
		this.width = width;
		
	}
	
	
	public void update(GameContainer gc) {
		mouseX = Mouse.getX();
		mouseY = Mouse.getY();
		
		Input i = gc.getInput();
		
		if((mouseX>x && mouseX<x+width) && (mouseY>y-height)&&mouseY<y && i.isMousePressed(0)) {
			isClicked = true;
		}else {
			isClicked = false;
		}
	}
	
	public void render(Graphics g) throws SlickException {
		
		
		g.drawRect(12, 350, 38, 30);;
		
		g.drawString("MouseX: " + mouseX, 100, 150);
		g.drawString("MouseY: " + mouseY, 100, 162);
		
		
			button = new Image("res/Unicorn.png");
	
		g.drawImage(button, x, y-height);
		
		if(isClicked) {
			count();
		}
		
		g.drawString("Clicks: " + clicks, 100, 100);
	}
	
	public void count() {
		clicks++;
	}
}
