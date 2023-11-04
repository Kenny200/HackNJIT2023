package Akinator;
import java.util.*;
import java.io.*;

public class PSXBOX {
	static Map<String, PlayerPreferences> preferencesMap = new HashMap<>();
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Collect basic information
        System.out.println("Please provide some basic information:");

        System.out.println("What is your favorite game?");
        String favoriteGame = getFavoriteGame(sc);
        
        System.out.println("What is your average playing time (e.g., '2 hours', '3-4 hours', 'all day')?");
        String playingTime;
        playingTime = sc.nextLine();
        

        if (favoriteGame.equals("Call of Duty: Modern Warfare II")) {
            System.out.println("What is your favorite gamemode?");
            String favoriteGamemodeCOD = sc.nextLine();
        } else if (favoriteGame.equals("Mortal Kombat 1")) {
            System.out.println("Who do you main?");
            String MKmainfighter = sc.nextLine();
        } else if (favoriteGame.equals("EA Sports FC 24")) {
            System.out.println("Who is your favorite team?");
            String EAfavoriteteam = sc.nextLine();
        }

        
        PlayerPreferences playerPreferences = new PlayerPreferences();
        playerPreferences.setFavoriteGame(favoriteGame);
        playerPreferences.setPlayingTime(playingTime);

        preferencesMap.put(favoriteGame, playerPreferences);
		// Generate a report based on user's preferences
        generateReport(playerPreferences);
    }
    
	public static void generateReport(PlayerPreferences preferences) {
	    int totalHours = calculateTotalHours(preferences.getPlayingTime());

	    if (totalHours >= 10) {
	        System.out.println("Consider limiting your game time. Playing for extended periods may not be healthy.");
	    }

	    String favoriteGame = preferences.getFavoriteGame();

	    if (favoriteGame.equals("Call of Duty: Modern Warfare II")) {
	        System.out.println("Your favorite gamemode in Call of Duty: Modern Warfare II is: " + preferences.getFavoriteGamemodeCOD());
	    } else if (favoriteGame.equals("Mortal Kombat 1")) {
	        System.out.println("Your main fighter in Mortal Kombat 1 is: " + preferences.getMKmainfighter());
	    } else if (favoriteGame.equals("EA Sports FC 24")) {
	        System.out.println("Your favorite team in EA Sports FC 24 is: " + preferences.getEAfavoriteteam());
	    }

	    // Example: Recommend a game based on user's favorite
	    if (favoriteGame.equals("Call of Duty: Modern Warfare II")) {
	        System.out.println("You might also enjoy playing Battlefield V.");
	    } else if (favoriteGame.equals("Mortal Kombat 1")) {
	        System.out.println("If you like fighting games, you should try Tekken 7.");
	    } else if (favoriteGame.equals("EA Sports FC 24")) {
	        System.out.println("For sports simulation, FIFA 22 is a great choice.");
	    }
	}


    public static int calculateTotalHours(String playingTime) {
        int totalHours = 0;
        try {
            if (playingTime.toLowerCase().contains("all day")) {
                totalHours = 24; // Assuming "all day" means 24 hours
            } else {
                String[] parts = playingTime.split("-");
                if (parts.length == 2) {
                    int lowerBound = Integer.parseInt(parts[0]);
                    int upperBound = Integer.parseInt(parts[1].split(" ")[0]);
                    totalHours = (lowerBound + upperBound) / 2;
                } else {
                    totalHours = Integer.parseInt(playingTime.split(" ")[0].replaceAll("\\D+",""));
                }
            }
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid number
            System.out.println("Invalid input for playing time. Please provide a valid time range.");
        }

        if (totalHours >= 10) {
            System.out.println("Consider limiting your game time. Playing for extended periods may not be healthy.");
        }

        return totalHours;
    }


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


    static class PlayerPreferences {
        private String playingTime;
        private String favoriteGame;
        
        private String favoriteGamemodeCOD;
        private String MKmainfighter; 
        private String EAfavoriteteam; 

        public void setPlayingTime(String playingTime) {
            this.playingTime = playingTime;
        }

        public String getPlayingTime() {
            return playingTime;
        }

        public void setFavoriteGame(String favoriteGame) {
            this.favoriteGame = favoriteGame;
        }

        public String getFavoriteGame() {
            return favoriteGame;
        }

		public String getFavoriteGamemodeCOD() {
			return favoriteGamemodeCOD;
		}

		public void setFavoriteGamemodeCOD(String favoriteGamemodeCOD) {
			this.favoriteGamemodeCOD = favoriteGamemodeCOD;
		}

		public String getMKmainfighter() {
			return MKmainfighter;
		}

		public void setMKmainfighter(String mKmainfighter) {
			MKmainfighter = mKmainfighter;
		}

		public String getEAfavoriteteam() {
			return EAfavoriteteam;
		}

		public void setEAfavoriteteam(String eAfavoriteteam) {
			EAfavoriteteam = eAfavoriteteam;
		}
    }
}
