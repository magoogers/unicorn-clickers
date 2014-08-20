package pack.main;

import java.awt.Graphics;

public class Counter {
	public Counter(int x, int y, Graphics g) {
		int counts = 0;
		
		while(true) {
			g.drawString("Hello", x, y);
			counts += increment(1);
		}
		
		
	}
	
	public int increment(int add) {
		return add;
	}
	
	
}
