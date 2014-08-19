package pack.main.render;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Graphics {
	
	//panel 2 draw stuff on witch then gets drawn to the screen
	JPanel panel;
	public Graphics(JPanel panel){
		this.panel = panel;
		
		
	}
	public void drawString(String string,int x,int y){
		JLabel label = new JLabel(string);
		label.setLocation(x, y);
		panel.add(label);
	}
	

}
