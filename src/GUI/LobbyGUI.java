package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * LobbyGUI: frame for lobby
 */
public class LobbyGUI extends PLFrame{

	//class instances	
	private JMenuBar mbMain;
	private JMenu mLobby, mAccount, mOptions, mHelp;
	private JMenuItem miLogin, miRegistration, miDonations, miQuit, 
		miMyAccount, 
		miPreferences;
	
	private JPanel pMain;
	private GridBagLayout gblMain;	
		
	//constructor: builds frame & collection of build methods
	public LobbyGUI(){
		
		super();
//		frame = new PLFrame("PokerLiberty"); 
		setTitle("PokerLiberty");
		setBounds(0, 0, 800, 520);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());             
        
        buildMenuBar();
        buildLobbyPanel();
	}
	
	//build main menu bar
	private void buildMenuBar(){
		
		//INSTANTIATIONS
		mbMain = new JMenuBar();
		
		mLobby = new JMenu("Lobby");
		mAccount = new JMenu("Account");
		mOptions = new JMenu("Options");
		mHelp = new JMenu("Help");

		miLogin = new JMenuItem("Login");
		miRegistration = new JMenuItem("Registration");
		miDonations = new JMenuItem("Donations");
		miQuit = new JMenuItem("Quit");
		
		miMyAccount = new JMenuItem("My Account");
		miPreferences = new JMenuItem("Preferences");
		
		//ASSEMBLY
		mLobby.add(miLogin);
		mLobby.add(miRegistration);
		mLobby.add(miDonations);
		mLobby.add(miQuit);
		
		mAccount.add(miMyAccount);
		
		mOptions.add(miPreferences);
		
		mbMain.add(mLobby);
		mbMain.add(mAccount);
		mbMain.add(mOptions);
		mbMain.add(mHelp);
		
		add(mbMain, BorderLayout.NORTH);
		
		//LISTENERS
		miQuit.addActionListener(new GeneralActionListener());
		miLogin.addActionListener(new GeneralActionListener());
		miRegistration.addActionListener(new GeneralActionListener());
		miDonations.addActionListener(new GeneralActionListener());
		miPreferences.addActionListener(new GeneralActionListener());
		miMyAccount.addActionListener(new GeneralActionListener());
	}
	
	//build main panel
	private void buildLobbyPanel(){
		
		//INSTANTIATIONS
		pMain = new JPanel();
		gblMain = new GridBagLayout();
		
		//ASSEMBLY
		pMain.setLayout(gblMain);
	}
	
	//generalized action listener to handle multiple sources
	private class GeneralActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent ae) {
			if (ae.getSource() == miQuit){
				System.exit(0);
			}else if (ae.getSource() == miLogin){
				final LoginGUI guiLogin = new LoginGUI();
				setFocusableWindowState(false);
				guiLogin.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent we) {
						guiLogin.dispose();
						setFocusableWindowState(true);						
					}
				});
			}else if (ae.getSource() == miDonations){
				final DonationGUI guiDonations = new DonationGUI();
				setFocusableWindowState(false);
				guiDonations.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent we) {
						guiDonations.dispose();
						setFocusableWindowState(true);						
					}
				});
			}else if (ae.getSource() == miMyAccount){
				final MyAccountGUI guiPlayerAccount = new MyAccountGUI();
				setFocusableWindowState(false);
				guiPlayerAccount.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent we) {
						guiPlayerAccount.dispose();
						setFocusableWindowState(true);						
					}
				});
			}else if (ae.getSource() == miPreferences){
				final PreferencesGUI guiPreferences = new PreferencesGUI();
				setFocusableWindowState(false);
				guiPreferences.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent we) {
						guiPreferences.dispose();
						setFocusableWindowState(true);						
					}
				});
			}else if (ae.getSource() == miRegistration){
				final RegistrationGUI guiRegistration = new RegistrationGUI();
				setFocusableWindowState(false);
				guiRegistration.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent we) {
						guiRegistration.dispose();
						setFocusableWindowState(true);						
					}
				});
			}
		}
	}
	
}
