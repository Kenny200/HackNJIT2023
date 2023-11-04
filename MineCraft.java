package Akinator;

public class MineCraft extends PC{
	private String mode;
	private String whoYouPlayWith;
	private String item;
	private double money;

	public MineCraft() {
		
	}

	public void MineCraft(String mode, String whoYouPlayWith, String item, double money) {
		this.mode = mode;
		this.whoYouPlayWith = whoYouPlayWith;
		this.item = item;
		this.money = money;
		System.out.println("Based on your answer to this question:");
		System.out.println("| Your favorite mode is " + mode);
		System.out.println("| Your favorite item is " + item);
		System.out.println("| So far you have been spend " + money + "$ on this game");
	
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getWhoYouPlayWith() {
		return whoYouPlayWith;
	}

	public void setWhoYouPlayWith(String whoYouPlayWith) {
		this.whoYouPlayWith = whoYouPlayWith;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
}
