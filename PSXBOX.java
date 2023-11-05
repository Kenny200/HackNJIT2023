package akinator;
import java.util.*;
import java.io.*;
public class PSXBOX {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayerPreferences playerPreferences = new PlayerPreferences();

        // Step 1: Collect basic information
        System.out.println("Please provide some basic information:");

        System.out.println("What is your favorite game?");
        String favoriteGame = getFavoriteGame(sc);
        
        System.out.println("What is your average playing time (e.g., '2 hours', '3-4 hours', 'all day')?");
        int playingTime = sc.nextInt();
        sc.nextLine();
        
        if (favoriteGame.equals("Call of Duty: Modern Warfare II")) {
            System.out.println("What is your favorite gamemode?");
            String favoriteGamemodeCOD = sc.nextLine();
			playerPreferences.setFavoriteGamemodeCOD(favoriteGamemodeCOD);
			
            System.out.println("Who is your favorite character?");
            String cODfavoritechar = sc.nextLine();
            playerPreferences.setCODfavoritechar(cODfavoritechar);
            
        } 
       if (favoriteGame.equals("Mortal Kombat 1")) {
            System.out.println("Who do you main?");
            String mKmainfighter = sc.nextLine();
            playerPreferences.setMKmainfighter(mKmainfighter);
            
            System.out.println("Do you play competively?");
            String mKiscompetative = sc.nextLine();
            playerPreferences.setmKiscompetative(mKiscompetative);
            
        } 
       if (favoriteGame.equals("EA Sports FC 24")) {
            System.out.println("Who is your favorite team?");
            String eAfavoriteteam = sc.nextLine();
            playerPreferences.setEAfavoriteteam(eAfavoriteteam);
            
            System.out.println("Who is your favorite player?");
            String eAfavoriteplayer = sc.nextLine();
            playerPreferences.setEAfavoriteplayer(eAfavoriteplayer);
            
        }

        
        
        playerPreferences.setFavoriteGame(favoriteGame);
        playerPreferences.setPlayingTime(playingTime);


		// Generate a report based on user's preferences
        generateReport(playerPreferences);
    }
    
	//method to generate the report based on user input
	public static void generateReport(PlayerPreferences preferences) {
	    int totalHours = calculateTotalHours(preferences.getPlayingTime());

	    if (totalHours >= 10) {
	        System.out.println("Consider limiting your game time. Playing for extended periods may not be healthy.");
	    }

	    String favoriteGame = preferences.getFavoriteGame();

	    if (favoriteGame.equals("Call of Duty: Modern Warfare II")) {
	        System.out.println("Your favorite gamemode in Call of Duty: Modern Warfare II is: " + preferences.getFavoriteGamemodeCOD());
	        System.out.println("Your favorite character in Call of Duty: Modern Warfare II is: " + preferences.getCODfavoritechar());
	    } else if (favoriteGame.equals("Mortal Kombat 1")) {
	        System.out.println("Your main fighter in Mortal Kombat 1 is: " + preferences.getMKmainfighter());
	        if (preferences.getMKiscompetative()) {
	            System.out.println("You play Mortal Kombat 1 competitively.");
	        } else {
	            System.out.println("You play Mortal Kombat 1 casually.");
	        }
	    } else if (favoriteGame.equals("EA Sports FC 24")) {
	        System.out.println("Your favorite team in EA Sports FC 24 is: " + preferences.getEAfavoriteteam());
	        System.out.println("Your favorite player in EA Sports FC 24 is: " + preferences.getEAfavoriteplayer());
	    }


	    // Example: Recommend a game based on user's favorite
	    if (favoriteGame.equals("Call of Duty: Modern Warfare II")) {
	        System.out.println("You might also enjoy playing Battlefield 2049.");
	    } else if (favoriteGame.equals("Mortal Kombat 1")) {
	        System.out.println("If you like fighting games, you should try Tekken 8.");
	    } else if (favoriteGame.equals("EA Sports FC 24")) {
	        System.out.println("For sports simulation, Madden is a great choice.");
	    }
	}

	//method to tell if user needs to limit play time
	public static int calculateTotalHours(int playingTime) {
	    int totalHours = 0;
	    if (totalHours >= 10) {
	        System.out.println("Consider limiting your game time. Playing for extended periods may not be healthy.");
	    }

	    return totalHours;
	}

    //method to get user's favorite game
    public static String getFavoriteGame(Scanner sc) {
        System.out.println("3. What is your favorite game?");
        System.out.println("   a) Call of Duty: Modern Warfare II");
        System.out.println("   b) Mortal Kombat 1");
        System.out.println("   c) EA Sports FC 24");

        String choice = sc.nextLine();

        if (choice.equals("a")) {
            return "Call of Duty: Modern Warfare II";
        } else if (choice.equals("b")) {
            return "Mortal Kombat 1";
        } else if (choice.equals("c")) {
            return "EA Sports FC 24";
        } else {
            System.out.println("Invalid choice. Please select a valid option.");
            return getFavoriteGame(sc);
        }
    }


}
