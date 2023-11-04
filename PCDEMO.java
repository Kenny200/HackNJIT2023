package Akinator;
import java.util.*;
import java.io.*;

public class PCDEMO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PC pc = new PC();;
		System.out.println("Please enter how many hour do you play game per day?");
		double PlayTime = sc.nextDouble();
		
		
		System.out.println("Which of the following games have you played before, and if none of them, choose the one you are most familiar with");

		System.out.println("1: league of legends");
		System.out.println("2: CSGO");
		System.out.println("3: MineCraft");
		int pcik = sc.nextInt();
		if(pcik == 1) {
			LOL lol = new LOL();
			System.out.println("Which ROLES do you normally play?");
			String input1 = sc.next();
			System.out.println("Which HERO do you like most?");
			String input2 = sc.next();
			System.out.println("Do you play SOLO or DUO?");
			String input3 = sc.next();
			System.out.println("Do you spend MONEY on this game? If so, how much do you spend?");
			double input4 = sc.nextDouble();
			
			System.out.println("Wait a second, your report is beening made......");
			lol.LOL(input1, input2, input3, input4);
			pc.PC(PlayTime);
			
			System.out.println("\n    Here is my sugguetion:");
			//about time
			if(PlayTime >= 6) {
				System.out.println("1.You spend too much time playing games. Please stop this behavior, the game is virtual and not good for you!");
			}else if(PlayTime >= 3 && PlayTime < 6) {
				System.out.println("1.You shoule not spend " + PlayTime + " hours on this. Please use your time to study");
			}else {
				System.out.println("1.Playing games properly is a relaxation for your mind");
			}
			//about money
			if(input4 >= 200) {
				System.out.println("2.You're spending too much money on the game, please spend wisely!");
			}else if(input4 >= 100 && input4 < 200) {
				System.out.println("2.It does look like you spent some of your money on the game, hopefully you can think carefully about whether or not you should continue to spend money in the future");
			}else {
				System.out.println("2.It doesn't look like you're spending too much money on the game, keep up the good behavior!");
			}
			//about play with
			if(input3.equalsIgnoreCase("solo")) {
				System.out.println("3.You seem to prefer playing the game alone, maybe it would be more fun to try and play the game with other people");
			}else if(input3.equalsIgnoreCase("duo")) {
				System.out.println("3.It seems like you enjoy playing games with other people, which is much more conducive to making friends! Keep it up! :D");
			}
		}else if(pcik == 2) {
			CSGO csgo = new CSGO();
			System.out.println("Which mode do you play for CSGO?");
			System.out.println("Please choose one of them:");
			System.out.println("Casual mode");
			System.out.println("Competitive mode");
			System.out.println("Wingman mode");
			System.out.println("Deathmatch mode");
			System.out.println("Arms mode");
			System.out.println("Demolition mode");
			System.out.println("Danger Zone");
			System.out.println("Retakes");
			String input1 = sc.next();
			System.out.println("What's your favorite weapon in the game?");
			String input2 = sc.next();
			System.out.println("What is your favorite character?");
			String input3 = sc.next();
			System.out.println("What is your favorite weapen skin?");
			String input4 = sc.next();
			System.out.println("Do you spend MONEY on this game? If so, how much do you spend?");
			double input5 = sc.nextDouble();
			
			System.out.println("Wait a second, your report is beening made......");
			csgo.CSGO(input1, input2, input3, input4, input5);
			pc.PC(PlayTime);
			
			System.out.println("\n    Here is my sugguetion:");
			//about time
			if(PlayTime >= 6) {
				System.out.println("1.You spend too much time playing games. Please stop this behavior, the game is virtual and not good for you!");
			}else if(PlayTime >= 3 && PlayTime < 6) {
				System.out.println("1.You shoule not spend " + PlayTime + " hours on this. Please use your time to study");
			}else {
				System.out.println("1.Playing games properly is a relaxation for your mind");
			}
			//about mode
			if(input1.equalsIgnoreCase("Casual")){
				System.out.println("2.Casual Mode caters to players who enjoy more relaxed and casual gameplay. They suggest a mode where they can practice, experiment, and play without the intense competition of Competitive Mode");
			}else if(input1.equalsIgnoreCase("Competitive")){
				System.out.println("2.Competitive Mode is ideal for players who want a highly competitive environment with a focus on teamwork, strategy, and skill improvement. They suggest a mode where they can climb the ranks and challenge themselves");
			}else if(input1.equalsIgnoreCase("Wingman")) {
				System.out.println("2.Wingman Mode caters to those who prefer smaller teams and quicker matches. They suggest a mode for 2v2 gameplay that emphasizes close cooperation");
			}else if(input1.equalsIgnoreCase("Deathmatch")) {
				System.out.println("2.Deathmatch Mode is often suggested for players looking to practice and improve their aiming and shooting skills in a more fast-paced environment");
			}else if(input1.equalsIgnoreCase("Arms")) {
				System.out.println("2.Arms Race provides a mode for players looking for an alternative gameplay style with quick weapon progression and a race to the final knife kill");
			}else if(input1.equalsIgnoreCase("Demolition")) {
				System.out.println("2.Demolition Mode combines elements of Casual and Competitive modes, appealing to those who want something in between");
			}else if(input1.equalsIgnoreCase("Danger")) {
				System.out.println("2.Danger Zone is a departure from traditional \"CS:GO\" gameplay, suggesting that players want to experience a battle royale mode within the game");
			}else if(input1.equalsIgnoreCase("Retakes")) {
				System.out.println("2.Retakes is ideal for players looking for custom game modes that allow them to focus on specific in-game scenarios, such as bomb site defense and retakes");
			}
			//about money
			if(input5 >= 200) {
				System.out.println("3.You're spending too much money on the game, please spend wisely!");
			}else if(input5 >= 100 && input5 < 200) {
				System.out.println("3.It does look like you spent some of your money on the game, hopefully you can think carefully about whether or not you should continue to spend money in the future");
			}else {
				System.out.println("3.It doesn't look like you're spending too much money on the game, keep up the good behavior!");
			}
		}else if(pcik == 3) {
			MineCraft minecraft = new MineCraft();
			System.out.println("Please enter what is your favorite mode (Survival, Creative, Adventure and Spectator)");
			String input1 = sc.next();
			System.out.println("Do you play alone? (Please enter yes or no)");
			String input2 = sc.next();
			System.out.println("What is your favorite item?");
			String input3 = sc.next();
			System.out.println("Do you spend MONEY on this game? If so, how much do you spend?");
			double input4 = sc.nextDouble();
			
			System.out.println("Wait a second, your report is beening made......");
			minecraft.MineCraft(input1, input2, input3, input4);
			pc.PC(PlayTime);
			
			System.out.println("\n    Here is my sugguetion:");
			//about time
			if(PlayTime >= 6) {
				System.out.println("1.You spend too much time playing games. Please stop this behavior, the game is virtual and not good for you!");
			}else if(PlayTime >= 3 && PlayTime < 6) {
				System.out.println("1.You shoule not spend " + PlayTime + " hours on this. Please use your time to study");
			}else {
				System.out.println("1.Playing games properly is a relaxation for your mind");
			}
			//about mode
			if(input1.equalsIgnoreCase("Survival")){
				System.out.println("2.Survival Mode is for players who enjoy challenging and immersive gameplay. It allows them to gather resources, face threats, and focus on exploration and survival");
			}else if(input1.equalsIgnoreCase("Creative")) {
				System.out.println("2.Creative Mode caters to players who love creativity and building. It enables players to express themselves through construction without limitations");
			}else if(input1.equalsIgnoreCase("Adventure")) {
				System.out.println("2.Adventure Mode is designed for players who enjoy custom-made maps, story-driven content, and puzzle challenges created by the Minecraft community.");
			}else if(input1.equalsIgnoreCase("Spectator")) {
				System.out.println("2.Spectator Mode is for players who want to observe and appreciate Minecraft worlds or multiplayer events without directly participating. In this case you need to be more active");
			}
			//about money
			if(input4 >= 200) {
				System.out.println("3.You're spending too much money on the game, please spend wisely!");
			}else if(input4 >= 100 && input4 < 200) {
				System.out.println("3.It does look like you spent some of your money on the game, hopefully you can think carefully about whether or not you should continue to spend money in the future");
			}else {
				System.out.println("3.It doesn't look like you're spending too much money on the game, keep up the good behavior!");
			}
			//who you play with
			if(input2.equalsIgnoreCase("yes")) {
				System.out.println("4.You seem to prefer playing the game alone, maybe it would be more fun to try and play the game with other people");
			}else if(input2.equalsIgnoreCase("no")) {
				System.out.println("4.It seems like you enjoy playing games with other people, which is much more conducive to making friends! Keep it up! :)");
			}
			
		}
		
	}

}
