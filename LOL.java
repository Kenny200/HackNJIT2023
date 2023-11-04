package Akinator;

public class LOL extends PC{
	private String role;
	private String hero;
	private String whoYouPlayWith;
	private double money;
	
	public LOL() {
		
	}

	public void LOL(String role, String hero, String whoYouPlayWith, double money) {
		this.role = role;
		this.hero = hero;
		this.whoYouPlayWith = whoYouPlayWith;
		this.money = money;
		System.out.println("Based on your answer to this question:");
		System.out.println("| Your favorite role is " + role);
		System.out.println("| Your favorite hero is " + hero);
		System.out.println("| You like play " + whoYouPlayWith + " mood");
		System.out.println("| So far you have been spend " + money + "$ on this game");
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getHero() {
		return hero;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public String getWhoYouPlayWith() {
		return whoYouPlayWith;
	}

	public void setWhoYouPlayWith(String whoYouPlayWith) {
		this.whoYouPlayWith = whoYouPlayWith;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

}
