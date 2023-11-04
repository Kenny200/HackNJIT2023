package akinator;

import java.util.Scanner;

public class question {
	public static void main(String[] args)throws Exception { 
	elements ();
}
	public static void elements () throws Exception{ 

	
		// TODO Auto-generated method stub

		Scanner user = new Scanner(System.in);
		System.out.println("Select what game you play in you phone");
		
		System.out.println("1.Roblox\r\n"
				+ "2.Attack Hole\r\n"
				+ "3.Royal Match\r\n"
				+ "4.Candy Crush Saga\r\n");
		int game = user.nextInt();
		  if (game == 1) { 
			  System.out.println("Enter how many hour you play this game for day");
				int hour = user.nextInt();
				if(hour >= 6) {
					System.out.println("1.You spend too much time playing games. Please stop this behavior, the game is virtual and not good for you!");
				}else if(hour >= 3 && hour < 6) {
					System.out.println("1.You shoule not spend " + hour + " hours on this. Please use your time to study or something more recreative");
				}else {
					System.out.println("1.Playing games properly is a relaxation for your mind");
				}
			  System.out.println("Do you like play 1)alone or with 2)Other");
			  int AS = user.nextInt();
			  if (AS == 1) {
				  System.out.println("That is Great too. Just try find some fiends in the game");
				  System.out.println("Where you play more 1)outside or 2)home?");
				  int answer2 = user.nextInt();
				  if (answer2 == 1) { 
					  System.out.println("That is good, it means you like to soak up the sun and cool off a bit.");
				  }
				  if (answer2 == 2) { 
					  System.out.println("Try to get some fresh air after playing");
				  }
					  System.out.println("You spend money");
					  String answer3 = user.next();
					  if(answer3.equalsIgnoreCase("yes")) {
						  System.out.println("How much you spend?");
						  int money = user.nextInt();
						  if(money >= 200) {
								System.out.println("2.You're spending too much money on the game, please spend wisely!");
							}else if(money >= 100 && money < 200) {
								System.out.println("2.It does look like you spent some of your money on the game, hopefully you can think carefully about whether or not you should continue to spend money in the future");
							}else {
								System.out.println("2.It doesn't look like you're spending too much money on the game, keep up the good behavior!");
							}
				  }
					  if(answer3.equalsIgnoreCase("no")||answer3.equalsIgnoreCase("not")){
						  System.out.println("You are fine, you safe a lot of money");
					  }
					  else {
						  System.out.println("Enter yes or not");
					  }
				  }
			  if (AS == 2) {
				  System.out.println("That is Great too, that means you like to socialize with people a lot");
				  System.out.println("Where you play more 1)outside or 2)home?");
				  int answer2 = user.nextInt();
				  if (answer2 == 1) { 
					  System.out.println("You spend money");
					  String answer3 = user.next();
					  if(answer3.equalsIgnoreCase("yes")) {
						  System.out.println("How much you spend?");
						  int money = user.nextInt();
						  if(money >= 200) {
								System.out.println("2.You're spending too much money on the game, please spend wisely!");
							}else if(money >= 100 && money < 200) {
								System.out.println("2.It does look like you spent some of your money on the game, hopefully you can think carefully about whether or not you should continue to spend money in the future");
							}else {
								System.out.println("2.It doesn't look like you're spending too much money on the game, keep up the good behavior!");
							}
				  }
					  if(answer3.equalsIgnoreCase("no")||answer3.equalsIgnoreCase("not")){
						  System.out.println("You are fine, you safe a lot of money");
					  }
				  }
				  
				  
			  }
			 
       }
	}
}

        
		
		
       
	


