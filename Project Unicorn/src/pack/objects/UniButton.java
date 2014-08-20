package pack.objects;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class UniButton extends Button{
	
	boolean isClicked = false;
	Image button;
	
	long clicks = 0;
	
	int imageX, imageY;
	
	int mouseY;
	int mouseX;
	
	public void update() {
		mouseX = Mouse.getX();
		mouseY = Mouse.getY();
		
		if((mouseX>100 && mouseX<132) && (mouseY>100 && mouseY<132)) {
			isClicked = true;
		}else {
			isClicked = false;
		}
	}
	
	public void render(Graphics g, int x, int y) {
		imageX = x;
		imageY = y;
		
		g.drawRect(12, 350, 38, 30);;
		
		g.drawString("MouseX: " + mouseX, 100, 150);
		g.drawString("MouseY: " + mouseY, 100, 162);
		
		try {
			button = new Image("res/Unicorn.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
		
		g.drawImage(button, x, y);
		
		if(isClicked) {
			count();
		}
		
		g.drawString("Clicks: " + clicks, 100, 100);
	}
	
	public void count() {
		clicks++;
	}
}
