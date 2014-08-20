package pack.objects;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Graphics;

public class UniButton extends Button{
	
	boolean isClicked = false;
	
	public void update() {
		int mouseX = Mouse.getY();
		int mouseY = Mouse.getX();
		
		if(mouseX>10 && mouseX<100 && mouseY>10 && mouseY<100) {
			isClicked = true;
		}else {
			isClicked = false;
		}
	}
	
	public void render(Graphics g) {
		g.drawRect(10, 10, 100, 100);
		
		if(isClicked) {
			g.drawString("Clicked", 200, 200);
		}
	}
}
