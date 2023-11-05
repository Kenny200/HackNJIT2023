package akinator;
import java.util.HashMap;
import java.util.Map;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
Project: Questionnaire：
What devices mobile users prefer to play games on, and collect and calculate the average playing time,
as well as selecting which games are popular with the public
 */
public class Demo {
	static Map<String, PlayerPreferences> preferencesMap = new HashMap<>();
	public static void main(String[] args) {
		ImageIcon icon = new ImageIcon("smile.png");
		JOptionPane.showMessageDialog(null,"Welcome to the game world!!","Welcome",JOptionPane.OK_OPTION,icon);
		String sc = (String) JOptionPane.showInputDialog(null,"Please select the device on which you normally play games\n"+
				"1: PC or laptop\n"+"2: Play Station or XBOX\n"+"3: Phone\n"+"Please enter your selection: ","Welcome",JOptionPane.OK_CANCEL_OPTION,icon,null,null);
		int select = Integer.parseInt(sc);
		//while(select <=3) {
		if(select == 1) {
			PC pc = new PC();;
			JOptionPane.showInputDialog(null,"Please enter how many hour do you play game per day?","PC",JOptionPane.OK_CANCEL_OPTION,icon,null,null);
			double PlayTime = Integer.parseInt(sc);
			
			
			JOptionPane.showInputDialog(null,"Which of the following games have you played before, and if none of them, choose the one you are most familiar with\n"
					+"1: league of legends\n"+"2: CSGO\n"+"3: MineCraft\n","PC",JOptionPane.OK_CANCEL_OPTION,icon,null,null);

			int pcik = Integer.parseInt(sc);
			if(pcik == 1) {
				LOL lol = new LOL();
				JOptionPane.showInputDialog(null,"Which ROLES do you normally play?","PC",JOptionPane.OK_CANCEL_OPTION,icon,null,null);
				int input1 = Integer.parseInt(sc);
				JOptionPane.showInputDialog(null,"Which HERO do you like most?","PC",JOptionPane.OK_CANCEL_OPTION,icon,null,null);
				int input2 = Integer.parseInt(sc);
				JOptionPane.showInputDialog(null,"Do you play 1)SOLO or 2)DUO?","PC",JOptionPane.OK_CANCEL_OPTION,icon,null,null);
				int input3 = Integer.parseInt(sc);
				JOptionPane.showInputDialog(null,"Do you spend MONEY on this game? If so, how much do you spend?","PC",JOptionPane.OK_CANCEL_OPTION,icon,null,null);
				double input4 = Integer.parseInt(sc);
				
				JOptionPane.showMessageDialog(null,"Wait a second, your report is beening made......","PC",JOptionPane.OK_OPTION,icon);
				lol.LOL(input1, input2, input3, input4);
				pc.PC(PlayTime);
				
				JOptionPane.showMessageDialog(null,"\n    Here is my sugguetion:","PC",JOptionPane.OK_OPTION,icon);
				//about time
				if(PlayTime >= 6) {
					JOptionPane.showMessageDialog(null,"1.You spend too much time playing games. Please stop this behavior, the game is virtual and not good for you!","PC",JOptionPane.OK_OPTION,icon);
				}else if(PlayTime >= 3 && PlayTime < 6) {
					JOptionPane.showMessageDialog(null,"1.You shoule not spend " + PlayTime + " hours on this. Please use your time to study","PC",JOptionPane.OK_OPTION,icon);
				}else {
					JOptionPane.showMessageDialog(null,"1.Playing games properly is a relaxation for your mind","PC",JOptionPane.OK_OPTION,icon);
				}
				//about money
				if(input4 >= 200) {
					JOptionPane.showMessageDialog(null,"2.You're spending too much money on the game, please spend wisely!","PC",JOptionPane.OK_OPTION,icon);
				}else if(input4 >= 100 && input4 < 200) {
					JOptionPane.showMessageDialog(null,"2.It does look like you spent some of your money on the game, hopefully you can think carefully about whether or not you should continue to spend money in the future","PC",JOptionPane.OK_OPTION,icon);
				}else {
					JOptionPane.showMessageDialog(null,"2.It doesn't look like you're spending too much money on the game, keep up the good behavior!","PC",JOptionPane.OK_OPTION,icon);
				}
				//about play with
				if(input3==1) {
					JOptionPane.showMessageDialog(null,"3.You seem to prefer playing the game alone, maybe it would be more fun to try and play the game with other people","PC",JOptionPane.OK_OPTION,icon);
				}else if(input3==2) {
					JOptionPane.showMessageDialog(null,"3.It seems like you enjoy playing games with other people, which is much more conducive to making friends! Keep it up! :D","PC",JOptionPane.OK_OPTION,icon);
				}
			}else if(pcik == 2) {
				CSGO csgo = new CSGO();
				JOptionPane.showInputDialog(null,"Which mode do you play for CSGO?\n"+
						"Please choose one of them:\n"+
						"1)Casual mode\n"+
						"2)Competitive mode\n"+
						"3)Wingman mode\n"+
						"4)Deathmatch mode\n"+
						"5)Arms mode\n"+"6)Demolition mode\n"+"7)Danger Zone\n"+"8)Retakes\n","PC",JOptionPane.OK_CANCEL_OPTION,icon,null,null);
				
				int input1 = Integer.parseInt(sc);
				JOptionPane.showInputDialog(null,"What's your favorite weapon in the game?","PC",JOptionPane.OK_CANCEL_OPTION,icon,null,null);
				int input2 = Integer.parseInt(sc);
				JOptionPane.showInputDialog(null,"What is your favorite character?","PC",JOptionPane.OK_CANCEL_OPTION,icon,null,null);
				int input3 = Integer.parseInt(sc);
				JOptionPane.showInputDialog(null,"What is your favorite weapen skin?","PC",JOptionPane.OK_CANCEL_OPTION,icon,null,null);
				int input4 = Integer.parseInt(sc);
				JOptionPane.showInputDialog(null,"Do you spend MONEY on this game? If so, how much do you spend?","PC",JOptionPane.OK_CANCEL_OPTION,icon,null,null);
				double input5 = Integer.parseInt(sc);
				
				JOptionPane.showMessageDialog(null,"Wait a second, your report is beening made......","PC",JOptionPane.OK_OPTION,icon);
				csgo.CSGO(input1, input2, input3, input4, input5);
				pc.PC(PlayTime);
				
				JOptionPane.showMessageDialog(null,"\n    Here is my sugguetion:","PC",JOptionPane.OK_OPTION,icon);
				//about time
				if(PlayTime >= 6) {
					JOptionPane.showMessageDialog(null,"1.You spend too much time playing games. Please stop this behavior, the game is virtual and not good for you!","PC",JOptionPane.OK_OPTION,icon);
				}else if(PlayTime >= 3 && PlayTime < 6) {
					JOptionPane.showMessageDialog(null,"1.You shoule not spend " + PlayTime + " hours on this. Please use your time to study","PC",JOptionPane.OK_OPTION,icon);
				}else {
					JOptionPane.showMessageDialog(null,"1.Playing games properly is a relaxation for your mind","PC",JOptionPane.OK_OPTION,icon);
				}
				//about mode
				if(input1==1){
					JOptionPane.showMessageDialog(null,"2.Casual Mode caters to players who enjoy more relaxed and casual gameplay. They suggest a mode where they can practice, experiment, and play without the intense competition of Competitive Mode","PC",JOptionPane.OK_OPTION,icon);
				}else if(input1==2){
					JOptionPane.showMessageDialog(null,"2.Competitive Mode is ideal for players who want a highly competitive environment with a focus on teamwork, strategy, and skill improvement. They suggest a mode where they can climb the ranks and challenge themselves","PC",JOptionPane.OK_OPTION,icon);
				}else if(input1==3) {
					JOptionPane.showMessageDialog(null,"2.Wingman Mode caters to those who prefer smaller teams and quicker matches. They suggest a mode for 2v2 gameplay that emphasizes close cooperation","PC",JOptionPane.OK_OPTION,icon);
				}else if(input1==4) {
					JOptionPane.showMessageDialog(null,"2.Deathmatch Mode is often suggested for players looking to practice and improve their aiming and shooting skills in a more fast-paced environment","PC",JOptionPane.OK_OPTION,icon);
				}else if(input1==5) {
					JOptionPane.showMessageDialog(null,"2.Arms Race provides a mode for players looking for an alternative gameplay style with quick weapon progression and a race to the final knife kill","PC",JOptionPane.OK_OPTION,icon);
				}else if(input1==6) {
					JOptionPane.showMessageDialog(null,"2.Demolition Mode combines elements of Casual and Competitive modes, appealing to those who want something in between","PC",JOptionPane.OK_OPTION,icon);
				}else if(input1==7) {
					JOptionPane.showMessageDialog(null,"2.Danger Zone is a departure from traditional \"CS:GO\" gameplay, suggesting that players want to experience a battle royale mode within the game","PC",JOptionPane.OK_OPTION,icon);
				}else if(input1==8) {
					JOptionPane.showMessageDialog(null,"2.Retakes is ideal for players looking for custom game modes that allow them to focus on specific in-game scenarios, such as bomb site defense and retakes","PC",JOptionPane.OK_OPTION,icon);
				}
				//about money
				if(input5 >= 200) {
					JOptionPane.showMessageDialog(null,"3.You're spending too much money on the game, please spend wisely!","PC",JOptionPane.OK_OPTION,icon);
				}else if(input5 >= 100 && input5 < 200) {
					JOptionPane.showMessageDialog(null,"3.It does look like you spent some of your money on the game, hopefully you can think carefully about whether or not you should continue to spend money in the future","PC",JOptionPane.OK_OPTION,icon);
				}else {
					JOptionPane.showMessageDialog(null,"3.It doesn't look like you're spending too much money on the game, keep up the good behavior!","PC",JOptionPane.OK_OPTION,icon);
				}
			}else if(pcik == 3) {
				MineCraft minecraft = new MineCraft();
				JOptionPane.showInputDialog(null,"Please enter what is your favorite mode (1)Survival, 2)Creative, 3)Adventure and 4)Spectator)","PC",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
				int input1 = Integer.parseInt(sc);;
				JOptionPane.showInputDialog(null,"Do you play alone? (Please enter 1)yes or 2)no)","PC",JOptionPane.OK_CANCEL_OPTION,icon,null,null);
				int input2 = Integer.parseInt(sc);;
				String sc5 = (String) JOptionPane.showInputDialog(null,"What is your favorite item?","PC",JOptionPane.OK_CANCEL_OPTION,icon,null,null);
				int input3 = Integer.parseInt(sc5);
				JOptionPane.showInputDialog(null,"Do you spend MONEY on this game? If so, how much do you spend?","PC",JOptionPane.OK_CANCEL_OPTION,icon,null,null);
				double input4 = Integer.parseInt(sc);;
				
				JOptionPane.showMessageDialog(null,"Wait a second, your report is beening made......","PC",JOptionPane.OK_OPTION,icon);
				minecraft.MineCraft(input1, input2, input3, input4);
				pc.PC(PlayTime);
				
				JOptionPane.showMessageDialog(null,"\n    Here is my sugguetion:","PC",JOptionPane.OK_OPTION,icon);
				//about time
				if(PlayTime >= 6) {
					JOptionPane.showMessageDialog(null,"1.You spend too much time playing games. Please stop this behavior, the game is virtual and not good for you!","PC",JOptionPane.OK_OPTION,icon);
				}else if(PlayTime >= 3 && PlayTime < 6) {
					JOptionPane.showMessageDialog(null,"1.You shoule not spend " + PlayTime + " hours on this. Please use your time to study","PC",JOptionPane.OK_OPTION,icon);
				}else {
					JOptionPane.showMessageDialog(null,"1.Playing games properly is a relaxation for your mind","PC",JOptionPane.OK_OPTION,icon);
				}
				//about mode
				if(input1==1){
					JOptionPane.showMessageDialog(null,"2.Survival Mode is for players who enjoy challenging and immersive gameplay. It allows them to gather resources, face threats, and focus on exploration and survival","PC",JOptionPane.OK_OPTION,icon);
				}else if(input1==2) {
					JOptionPane.showMessageDialog(null,"2.Creative Mode caters to players who love creativity and building. It enables players to express themselves through construction without limitations","PC",JOptionPane.OK_OPTION,icon);
				}else if(input1==3) {
					JOptionPane.showMessageDialog(null,"2.Adventure Mode is designed for players who enjoy custom-made maps, story-driven content, and puzzle challenges created by the Minecraft community.","PC",JOptionPane.OK_OPTION,icon);
				}else if(input1==4) {
					JOptionPane.showMessageDialog(null,"2.Spectator Mode is for players who want to observe and appreciate Minecraft worlds or multiplayer events without directly participating. In this case you need to be more active","PC",JOptionPane.OK_OPTION,icon);
				}
				//about money
				if(input4 >= 200) {
					JOptionPane.showMessageDialog(null,"3.You're spending too much money on the game, please spend wisely!","PC",JOptionPane.OK_OPTION,icon);
				}else if(input4 >= 100 && input4 < 200) {
					JOptionPane.showMessageDialog(null,"3.It does look like you spent some of your money on the game, hopefully you can think carefully about whether or not you should continue to spend money in the future","PC",JOptionPane.OK_OPTION,icon);
				}else {
					JOptionPane.showMessageDialog(null,"3.It doesn't look like you're spending too much money on the game, keep up the good behavior!","PC",JOptionPane.OK_OPTION,icon);
				}
				//who you play with
				if(input2==1) {
					JOptionPane.showMessageDialog(null,"4.You seem to prefer playing the game alone, maybe it would be more fun to try and play the game with other people","PC",JOptionPane.OK_OPTION,icon);
				}else if(input2==2) {
					JOptionPane.showMessageDialog(null,"4.It seems like you enjoy playing games with other people, which is much more conducive to making friends! Keep it up! :)","PC",JOptionPane.OK_OPTION,icon);
				}
			}
		}

		else if(select == 2) {

		        // Step 1: Collect basic information
			String sc2 =(String) JOptionPane.showInputDialog(null,"What is your average playing time (e.g., '2 hours', '3-4 hours', '24 house')?","PSXBOX",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
		       
	        int playingTime = Integer.parseInt(sc2);
			 JOptionPane.showInputDialog(null,"Please provide some basic information:\n");
		        String favoriteGame = getFavoriteGame(sc2);
		        
		        
		        

		        if (favoriteGame.equals("Call of Duty: Modern Warfare II")) {
		        	JOptionPane.showInputDialog(null,"What is your favorite gamemode?","PSXBOX",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
		            int favoriteGamemodeCOD = Integer.parseInt(sc2);
		             JOptionPane.showInputDialog(null,"Who is your favorite character?","PSXBOX",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
		            int CODfavoritechar = Integer.parseInt(sc2);
		        } else if (favoriteGame.equals("Mortal Kombat 1")) {
		        	JOptionPane.showInputDialog(null,"Who do you main?","PSXBOX",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
		            int MKmainfighter = Integer.parseInt(sc2);
		            JOptionPane.showInputDialog(null,"Do you play competively?","PSXBOX",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
		            int MKiscompetative = Integer.parseInt(sc2);
		        } else if (favoriteGame.equals("EA Sports FC 24")) {
		        	JOptionPane.showInputDialog(null,"Who is your favorite team?","PSXBOX",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
		            int EAfavoriteteam = Integer.parseInt(sc2);
		            JOptionPane.showInputDialog(null,"Who is your favorite player?","PSXBOX",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
		            int EAfavoriteplayer = Integer.parseInt(sc2);
		        }

		        
		        PlayerPreferences playerPreferences = new PlayerPreferences();
		        playerPreferences.setFavoriteGame(favoriteGame);
		        playerPreferences.setPlayingTime(playingTime);

		        preferencesMap.put(favoriteGame, playerPreferences);
				// Generate a report based on user's preferences
		        generateReport(playerPreferences);
		        
		}
		
		
		     if(select ==3) {
		    	 try {
		    	 String sc1 = (String) JOptionPane.showInputDialog(null, "Select what game you play in you phone\n "+"1.Roblox\r\n"
			        		+ "	2.Among Us\r\n"
			        		+ "	3.Royal Match\r\n"
			        		+ "	4.Candy Crush Saga\r\n","Phone",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
			        
				
				 int game = Integer.parseInt(sc1);
				  if (game == 1||game == 2) { 
					  JOptionPane.showInputDialog(null,"\n1.Enter how many hour you play this game for day ","Phone",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
						int hour = Integer.parseInt(sc1);
						 JOptionPane.showInputDialog(null,"\n2.Do you like play 1)alone or with 2)Other? ","Phone",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
					  int AS = Integer.parseInt(sc1);
					  JOptionPane.showInputDialog(null,"\n3.Where you play more 1)outside or 2)home? ","Phone",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
						  int answer2 = Integer.parseInt(sc1);
						  JOptionPane.showInputDialog(null,"\n4.How much you spend in this game? ","Phone",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
							  int answer3 = Integer.parseInt(sc1);

							  
							  JOptionPane.showMessageDialog(null,"\n    Here is my sugguetion:","Phone",JOptionPane.OK_OPTION,icon);
							  ///time
							  if(hour >= 6) {
								  JOptionPane.showMessageDialog(null,"1.You spend too much time playing games. Please stop this behavior, the game is virtual and not good for you!","Phone",JOptionPane.OK_OPTION,icon);
								}else if(hour >= 3 && hour < 6) {
									JOptionPane.showMessageDialog(null,"1.You shoule not spend " + hour + " hours on this. Please use your time to study or something more recreative","Phone",JOptionPane.OK_OPTION,icon);
								}else {
									JOptionPane.showMessageDialog(null,"1.Playing games properly is a relaxation for your mind","Phone",JOptionPane.OK_OPTION,icon);
								}
							  //with who you play
							  if (AS == 1) {
								  JOptionPane.showMessageDialog(null,"2.That is Great too. Just try find some fiends in the game","Phone",JOptionPane.OK_OPTION,icon);
							  }
								  if (AS == 2) {
									  JOptionPane.showMessageDialog(null,"2.That is Great!!, that means you like to socialize with people a lot","Phone",JOptionPane.OK_OPTION,icon);
								  }
								  
							  //where you play
							  if (answer2 == 1) { 
								  JOptionPane.showMessageDialog(null,"3.That is good, it means you like to soak up the sun and cool off a bit.","Phone",JOptionPane.OK_OPTION,icon);
							  }
							  if (answer2 == 2) { 
								  JOptionPane.showMessageDialog(null,"3..Try to get some fresh air after playing","Phone",JOptionPane.OK_OPTION,icon);
							  }
							//money
							  if(answer3 == 0) {
								  JOptionPane.showMessageDialog(null,"4.You are fine, you save a lot of money","Phone",JOptionPane.OK_OPTION,icon);
							  }
							  else if(answer3 >= 200) {
								  JOptionPane.showMessageDialog(null,"4.You're spending too much money on the game, please spend wisely!","Phone",JOptionPane.OK_OPTION,icon);
									}else if(answer3 >= 100 && answer3 < 200) {
										JOptionPane.showMessageDialog(null,"4.It does look like you spent some of your money on the game, hopefully you can think carefully about whether or not you should continue to spend money in the future","Phone",JOptionPane.OK_OPTION,icon);
									}else {
										JOptionPane.showMessageDialog(null,"4.It doesn't look like you're spending too much money on the game, keep up the good behavior!","Phone",JOptionPane.OK_OPTION,icon);
									}
					  }

				  if (game == 3||game == 4) { 
					  JOptionPane.showInputDialog(null,"\n1.Enter how many hour you play this game for day: ","Phone",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
						int hour = Integer.parseInt(sc1);
						 JOptionPane.showInputDialog(null,"\n2.Where you play more 1)outside or 2)home? ","Phone",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
						  int answer2 = Integer.parseInt(sc1);
						  JOptionPane.showInputDialog(null,"\n3.How much you spend in this game? ");
						  int answer3 = Integer.parseInt(sc1);
						  JOptionPane.showInputDialog(null,"\n4.Do you like this game because its is a puzzle game, 1)yes or 2)not? ","Phone",JOptionPane.OK_CANCEL_OPTION,icon, null, null);
						  int answer4 = Integer.parseInt(sc1);
						  
						  
						  JOptionPane.showMessageDialog(null,"\n    Here is my sugguetion:","Phone",JOptionPane.OK_OPTION,icon);
						  ///time
						  if(hour >= 6) {
							  JOptionPane.showMessageDialog(null,"1.You spend too much time playing games. Please stop this behavior, the game is virtual and not good for you!","Phone",JOptionPane.OK_OPTION,icon);
							}else if(hour >= 3 && hour < 6) {
								JOptionPane.showMessageDialog(null,"1.You shoule not spend " + hour + " hours on this. Please use your time to study or something more recreative","Phone",JOptionPane.OK_OPTION,icon);
							}else {
								JOptionPane.showMessageDialog(null,"1.Playing games properly is a relaxation for your mind","Phone",JOptionPane.OK_OPTION,icon);
							}
							  
						  //where you play
						  if (answer2 == 1) { 
							  JOptionPane.showMessageDialog(null,"3.That is good, it means you like to soak up the sun and cool off a bit.","Phone",JOptionPane.OK_OPTION,icon);
						  }
						  if (answer2 == 2) { 
							  JOptionPane.showMessageDialog(null,"3..Try to get some fresh air after playing","Phone",JOptionPane.OK_OPTION,icon);
						  }
						//money
						  if(answer3 == 0) {
							  JOptionPane.showMessageDialog(null,"3.You are fine, you save a lot of money","Phone",JOptionPane.OK_OPTION,icon);
						  }
						  else if(answer3 >= 200) {
							  JOptionPane.showMessageDialog(null,"3.You're spending too much money on the game, please spend wisely!","Phone",JOptionPane.OK_OPTION,icon);
								}else if(answer3 >= 100 && answer3 < 200) {
									JOptionPane.showMessageDialog(null,"3.It does look like you spent some of your money on the game, hopefully you can think carefully about whether or not you should continue to spend money in the future","Phone",JOptionPane.OK_OPTION,icon);
								}else {
									JOptionPane.showMessageDialog(null,"3.It doesn't look like you're spending too much money on the game, keep up the good behavior!","Phone",JOptionPane.OK_OPTION,icon);
								}
						  
						  if(answer4==1) {
							  JOptionPane.showMessageDialog(null,"4.Great!, that means you're one of those people who like to think while playing.","Phone",JOptionPane.OK_OPTION,icon);
						  }
		                 if(answer4==0) {
		                	 JOptionPane.showMessageDialog(null,"4.Try not to waste too much time in this game","Phone",JOptionPane.OK_OPTION,icon);
							  
						  }
				  }
		    	 }
				  catch(Exception e){
					  JOptionPane.showMessageDialog(null,"You entered the wrong answer.","Error", JOptionPane.OK_OPTION,icon);
				  }
				  }
			
		//}
	System.exit(0);
		
	}
	 public static void generateReport(PlayerPreferences preferences) {
         int totalHours = calculateTotalHours(preferences.getPlayingTime());

         if (totalHours >= 10) {
         	 JOptionPane.showMessageDialog(null,"Consider limiting your game time. Playing for extended periods may not be healthy.","PSXBOX",JOptionPane.OK_OPTION);
         }

         String favoriteGame = preferences.getFavoriteGame();

         if (favoriteGame.equals("Call of Duty: Modern Warfare II")) {
         	 JOptionPane.showMessageDialog(null,"Your favorite gamemode in Call of Duty: Modern Warfare II is: " + preferences.getFavoriteGamemodeCOD(),"PSXBOX",JOptionPane.OK_OPTION);
         	 JOptionPane.showMessageDialog(null,"Your favorite character in Call of Duty: Modern Warfare II is: " + preferences.getCODfavoritechar(),"PSXBOX",JOptionPane.OK_OPTION);
         } else if (favoriteGame.equals("Mortal Kombat 1")) {
         	 JOptionPane.showMessageDialog(null,"Your main fighter in Mortal Kombat 1 is: " + preferences.getMKmainfighter(),"PSXBOX",JOptionPane.OK_CANCEL_OPTION);
         	 JOptionPane.showMessageDialog(null,"Your main fighter in Mortal Kombat 1 is: " + preferences.getMKiscompetative(),"PSXBOX",JOptionPane.OK_CANCEL_OPTION);
         } else if (favoriteGame.equals("EA Sports FC 24")) {
         	 JOptionPane.showMessageDialog(null,"Your favorite team in EA Sports FC 24 is: " + preferences.getEAfavoriteteam(),"PSXBOX",JOptionPane.OK_OPTION);
         	 JOptionPane.showMessageDialog(null,"Your favorite team in EA Sports FC 24 is: " + preferences.getEAfavoriteplayer(),"PSXBOX",JOptionPane.OK_OPTION);
             
         }

         // Example: Recommend a game based on user's favorite
         if (favoriteGame.equals("Call of Duty: Modern Warfare II")) {
         	 JOptionPane.showMessageDialog(null,"You might also enjoy playing Battlefield 2049.","PSXBOX",JOptionPane.OK_OPTION);
         } else if (favoriteGame.equals("Mortal Kombat 1")) {
         	 JOptionPane.showMessageDialog(null,"If you like fighting games, you should try Tekken 8.","PSXBOX",JOptionPane.OK_OPTION);
         } else if (favoriteGame.equals("EA Sports FC 24")) {
         	 JOptionPane.showMessageDialog(null,"For sports simulation, Madden is a great choice.","PSXBOX",JOptionPane.OK_OPTION);
         }
     }
     public static int calculateTotalHours(int i) {
         int totalHours = 0;
         try {
             if (i==24) {
                 totalHours = 24;
                 JOptionPane.showMessageDialog(null,"You play all day Please Sleep and talk with someone\nConsider limiting your game time\n. Playing for extended periods may not be healthy.","PSXBOX",JOptionPane.OK_OPTION);}
                 if (totalHours >= 10) {
                 	 JOptionPane.showMessageDialog(null,"Consider limiting your game time. Playing for extended periods may not be healthy.","PSXBOX",JOptionPane.OK_OPTION);
                 }// Assuming "all day" means 24 hours
                 if (totalHours < 10) {
                	 JOptionPane.showMessageDialog(null,"Consider limiting your game time.","PSXBOX",JOptionPane.OK_OPTION);
                 }
         } catch (NumberFormatException e) {
             // Handle the case where the input is not a valid number
         	 JOptionPane.showMessageDialog(null,"Invalid input for playing time. Please provide a valid time range.","PSXBOX",JOptionPane.OK_OPTION);
         }

         return totalHours;
     }
     public static String getFavoriteGame(String sc32) {
     	String sc3 = JOptionPane.showInputDialog(null,"3. What is your favorite game?\n"+"   1) Call of Duty: Modern Warfare II\n"+"   2) Mortal Kombat 1/n"+"   3) EA Sports FC 24/n","PSXBOX",JOptionPane.OK_CANCEL_OPTION);

     	int choice = Integer.parseInt(sc3);

         if (choice==1) {
             return "Call of Duty: Modern Warfare II";
         } else if (choice==2) {
             return "Mortal Kombat 1";
         } else if (choice==3) {
             return "EA Sports FC 24";
         } else {
        	 JOptionPane.showMessageDialog(null,"Invalid choice. Please select a valid option.","PSXBOX",JOptionPane.OK_OPTION);
             return getFavoriteGame(sc3);
         }
    }

		
	}


	

	

