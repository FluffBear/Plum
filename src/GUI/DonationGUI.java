package GUI;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class DonationGUI extends PLFrame{

	public DonationGUI(){
			
		super();
		
		setTitle("Donations"); 
		setBounds(0, 0, 500, 500);
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
