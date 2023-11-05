package akinator;

import javax.swing.JOptionPane;

public class MineCraft extends PC{
	private int mode;
	private int whoYouPlayWith;
	private int item;
	private double money;

	public MineCraft() {
		
	}

	public MineCraft(int input1, int input2, int input3, double input4) {
		this.mode = input1;
		this.whoYouPlayWith = input2;
		this.item = input3;
		this.setMoney(money);
		 JOptionPane.showMessageDialog(null,"Based on your answer to this question:");
		 JOptionPane.showMessageDialog(null,"| Your favorite mode is " + input1);
		 JOptionPane.showMessageDialog(null,"| Your favorite item is " + input3);
		 JOptionPane.showMessageDialog(null,"| So far you have been spend " + money + "$ on this game");
	
	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public int getWhoYouPlayWith() {
		return whoYouPlayWith;
	}

	public void setWhoYouPlayWith(int whoYouPlayWith) {
		this.whoYouPlayWith = whoYouPlayWith;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void MineCraft(int input1, int input2, int input3, double input4) {
		// TODO Auto-generated method stub
		this.mode = input1;
		this.whoYouPlayWith = input2;
		this.item = input3;
		this.setMoney(money);
		 JOptionPane.showMessageDialog(null,"Based on your answer to this question:");
		 JOptionPane.showMessageDialog(null,"| Your favorite mode is " + input1);
		 JOptionPane.showMessageDialog(null,"| Your favorite item is " + input3);
		 JOptionPane.showMessageDialog(null,"| So far you have been spend " + money + "$ on this game");
	}

}