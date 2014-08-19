package pack.main;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;

public class UniButton {
		public JButton b1;
		public JButton b2;
		public JButton b3;
	public UniButton(Counter count) {
		
		b1 = new JButton("Disable middle button");
	    b1.setVerticalTextPosition(AbstractButton.CENTER);
	    b1.setHorizontalTextPosition(AbstractButton.LEADING); //aka LEFT, for left-to-right locales
	    b1.setMnemonic(KeyEvent.VK_D);
	    b1.setActionCommand("disable");

	    b2 = new JButton("Middle button");
	    b2.setVerticalTextPosition(AbstractButton.BOTTOM);
	    b2.setHorizontalTextPosition(AbstractButton.CENTER);
	    b2.setMnemonic(KeyEvent.VK_M);

	    b3 = new JButton("Enable middle button");
	    //Use the default text position of CENTER, TRAILING (RIGHT).
	    b3.setMnemonic(KeyEvent.VK_E);
	    b3.setActionCommand("enable");
	    b3.setEnabled(false);
	}
	
	public void actionPerformed(ActionEvent e) {
	    if ("disable".equals(e.getActionCommand())) {
	        b2.setEnabled(false);
	        b1.setEnabled(false);
	        b3.setEnabled(true);
	    } else {
	        b2.setEnabled(true);
	        b1.setEnabled(true);
	        b3.setEnabled(false);
	    }
	} 
}
