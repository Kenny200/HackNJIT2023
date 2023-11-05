package akinator;

public class LOL extends PC{
	private int role;
	private int hero;
	private int whoYouPlayWith;
	private double money;
	
	public LOL() {
		
	}

	public void LOL(int input1, int input2, int input3, double money) {
		this.role = input1;
		this.hero = input2;
		this.whoYouPlayWith = input3;
		this.money = money;
		System.out.println("Based on your answer to this question:");
		System.out.println("| Your favorite role is " + input1);
		System.out.println("| Your favorite hero is " + input2);
		if(input3 == 1) {
			System.out.println("| You like play solo mood");
			
		}else if(input3 == 2) {
			System.out.println("| You like play duo mood");
		}
		System.out.println("| So far you have been spend " + money + "$ on this game");
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getHero() {
		return hero;
	}

	public void setHero(int hero) {
		this.hero = hero;
	}

	public int getWhoYouPlayWith() {
		return whoYouPlayWith;
	}

	public void setWhoYouPlayWith(int whoYouPlayWith) {
		this.whoYouPlayWith = whoYouPlayWith;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

}
