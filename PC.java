package Akinator;
//parent class for PC
public class PC {
	
	String gameName;
	double playTime;
	
	public PC() {
		
	}
	
	public void PC(double playTime) {
		this.playTime = playTime;
		System.out.println("| You play game " + playTime + " hour per day");
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPlayTime() {
		return playTime;
	}

	public void setPlayTime(double playTime) {
		this.playTime = playTime;
		
	}
	
}
