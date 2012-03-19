package Data;

import java.awt.image.BufferedImage;

public class Player {

	private String playerID, playerPassword, playerEmail, playerName, playerDOB;
	private Integer playerStack;
	private BufferedImage playerPicture;
	
	private static final Integer STARTING_STACK = 0;
	
	public Player(String _playerID, String _playerPassword, String _playerEmail){
		playerID = _playerID;
		playerPassword = _playerPassword;
		playerEmail = _playerEmail;
		playerName = "";
		playerDOB = "";
		playerPicture = null; //TODO: default picture design
		playerStack = STARTING_STACK;
	}
	
	//GETTERS	
	public String getPlayerID(){
		return playerID;
	}
	
	public String getPlayerPassword(){
		return playerPassword;
	}
	
	public String getPlayerEmail(){
		return playerEmail;
	}
	
	public String getPlayerName(){
		return playerName;
	}
	
	public String getPlayerDOB(){
		return playerDOB;
	}
	
	public BufferedImage getPlayerPiture(){
		return playerPicture;
	}
	
	public Integer getPlayerStack(){
		return playerStack;
	}
	
	//GENERIC SETTERS
	public void setPlayerID(String newPlayerID){
		playerID = newPlayerID;
	}
	
	public void setPlayerPassword(String newPlayerPassword){
		playerPassword = newPlayerPassword;
	}
	
	public void setPlayerEmail(String newPlayerEmail){
		playerEmail = newPlayerEmail;
	}
	
	public void setPlayerName(String newPlayerName){
		playerName = newPlayerName;
	}
	
	public void setPlayerDOB(String newPlayerDOB){
		playerDOB = newPlayerDOB;
	}
	
	public void setPlayerPiture(BufferedImage newPlayerPicture){
		playerPicture = newPlayerPicture;
	}
	
	public void setPlayerStack(Integer newPlayerStack){
		playerStack = newPlayerStack;
	}
	
	//ADDITIONAL SETTERS
	public void increasePlayerStack(Integer increaseAmount){
		playerStack += increaseAmount;
	}
	
	public void decreasePlayerStack(Integer decreaseAmount){
		playerStack -= decreaseAmount;
	}
}
