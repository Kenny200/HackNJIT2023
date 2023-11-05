package akinator;

public class CSGO extends PC{
	
	private int mode;
	private int weapon;
	private int character;
	private int skin;
	private double money;
	

	public CSGO() {
		
	}


	public void CSGO(int input1, int input2, int input3, int input4, double money) {
		this.mode = input1;
		this.weapon = input2;
		this.character = input3;
		this.skin = input4;
		this.money = money;
		System.out.println("Based on your answer to this question:");
		System.out.println("| You play " + input1);
		System.out.println("| Your favorite weapon is " + input2);
		System.out.println("| Your favorite character is " + input3);
		System.out.println("| Your favorite weapon skin is " + input4);
		System.out.println("| So far you have been spend " + money + "$ on this game");
	}


	public int getMode() {
		return mode;
	}


	public void setMode(int mode) {
		this.mode = mode;
	}


	public int getWeapon() {
		return weapon;
	}


	public void setWeapon(int weapon) {
		this.weapon = weapon;
	}


	public int getCharacter() {
		return character;
	}


	public void setCharacter(int character) {
		this.character = character;
	}


	public int getSkin() {
		return skin;
	}


	public void setSkin(int skin) {
		this.skin = skin;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}
	
}