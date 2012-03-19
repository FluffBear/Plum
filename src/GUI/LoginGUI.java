package GUI;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.event.ChangeListener;

public class LoginGUI extends PLFrame{

	public LoginGUI(){
			
		super();
		
		setTitle("Login"); 
		setBounds(0, 0, 300, 300);
	    setLocationRelativeTo(null);
	    setLayout(new GridBagLayout());
	}
		
	//generalized action listener to handle multiple sources
//	private class GeneralActionListener implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent ae) {
//			if (ae.getSource() == ){
//				
//			}
//		}
//	}
}
