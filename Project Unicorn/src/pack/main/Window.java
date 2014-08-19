package pack.main;

import javax.swing.JFrame;

public class Window {
	JFrame frame;
	public Window(int width, int height, String title) {
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void resize(int width, int height) {
		frame.setSize(width, height);
	}
	
	public void rename(String name) {
		frame.setName(name);
	}
	
	public void undecorate(boolean undecorate) {
		
	}
}
