package Akinator;

public class CSGO extends PC{
	
	private String mode;
	private String weapon;
	private String character;
	private String skin;
	private double money;
	

	public CSGO() {
		
	}


	public void CSGO(String mode, String weapon, String character, String skin, double money) {
		this.mode = mode;
		this.weapon = weapon;
		this.character = character;
		this.skin = skin;
		this.money = money;
		System.out.println("Based on your answer to this question:");
		System.out.println("| You play " + mode);
		System.out.println("| Your favorite weapon is " + weapon);
		System.out.println("| Your favorite character is " + character);
		System.out.println("| Your favorite weapon skin is " + skin);
		System.out.println("| So far you have been spend " + money + "$ on this game");
	}


	public String getMode() {
		return mode;
	}


	public void setMode(String mode) {
		this.mode = mode;
	}


	public String getWeapon() {
		return weapon;
	}


	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}


	public String getCharacter() {
		return character;
	}


	public void setCharacter(String character) {
		this.character = character;
	}


	public String getSkin() {
		return skin;
	}


	public void setSkin(String skin) {
		this.skin = skin;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}
	
}
