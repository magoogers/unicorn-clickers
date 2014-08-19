package pack.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
	JFrame frame;
	JPanel panel;
	
	JButton b1;
	
	boolean isrunning = true;
	public Window(int width, int height, String title) {
		
		panel = new JPanel();
		
		
		
		frame = new JFrame(title);
		frame.add(panel);
		frame.setSize(width, height);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		
		frame.addWindowListener( new WindowAdapter()
		{
		    public void windowClosing(WindowEvent e)
		    {
		    	isrunning = false;
		    }
		});
	}
	
	public void resize(int width, int height) {
		frame.setSize(width, height);
	}
	
	public void rename(String name) {
		frame.setName(name);
	}
	
	public void undecorate(boolean undecorate) {
		frame.setUndecorated(undecorate);
	}
	public JPanel getPanel(){
		return panel;
	}
	public boolean getRunning(){
		return isrunning;
	}
	
	
}
