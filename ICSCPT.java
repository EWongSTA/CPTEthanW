//-------------------------------------------------------------------------
// Name:         EthanCPT
// Purpose:      Create a Guess the Word Game
// Author:       Wong E.
// Created:      Dec 16, 2024
//-------------------------------------------------------------------------
import arc.*;

public class ICSCPT{
	public static void main(String [] args){
		//changing console size
		Console con = new Console("Guess The Word", 1280, 720);
		
		//logo
		methodsCPT.logo(con);
		con.sleep(2000);
		con.clear();
		
		//variables
		
		//choice variables
		String strUsername = "";
		String strScreen = "menu";
		String strChoice = "";
		String strBackMenu;
		String strGuess;
		String strTheme;

		//Game Variables
		int intScore = 0;
		String strFileName = "";
		String strThemeArray[];
		int intCount = 0;
		boolean boolGuesses = false;
		String strThemeName = "";
		
		//keep the game running 
		while(true){
			//menu screen
			while(strScreen.equals("menu")){
				con.clear();
				con.println("Welcome to Guess the Word!");
				con.println("What would you like to do:");
				con.println("(P)lay / (H)igh(S)core / (H)elp / (Q)uit");
				strChoice = con.readLine();
				// if user chooses play
				if(strChoice.equalsIgnoreCase("p") || strChoice.equalsIgnoreCase("play")){
					System.out.println("user wants to play");
					strScreen = "play";
				}
				// if user chooses highscore
				else if(strChoice.equalsIgnoreCase("hs") || strChoice.equalsIgnoreCase("highscore")){
					System.out.println("User is checking highscores");
					strScreen = "highscore";
				}
				// if user chooses help
				else if(strChoice.equalsIgnoreCase("h") || strChoice.equalsIgnoreCase("help")){
					System.out.println("User checking help menu");
					strScreen = "help";
				}
				// if user finds secret menu
				else if(strChoice.equalsIgnoreCase("UUDDLRLRBASTART")){
					System.out.println("User found secret menu");
					strScreen = "secret";
				}
				// if user chooses quit
				else if(strChoice.equalsIgnoreCase("q") || strChoice.equalsIgnoreCase("quit")){
					System.out.println("User quit");
					strScreen = "quit";
				}else{
					strScreen = "menu";
				}
			}
			//play screens
			while(strScreen.equals("play")){
				con.clear();
				System.out.println("user is in play menu");
				//username
				con.println("What is your username?");
				strUsername = con.readLine();

				//secret cheat 
				if(strUsername.equals("Funky Monkey")){
					strScreen = "X";
					con.println("You found the secret cheat!");
					con.println("You get 2 extra points!");
					intScore = intScore + 2;
					System.out.println("Score is: " +intScore);
				}
				//ask user what theme to play
				con.println("");
				con.println("Choose a theme:");
				TextInputFile theme = new TextInputFile("themes.txt");
				while(theme.eof() == false){
					intCount++;
					strTheme = theme.readLine();
					con.println("("+intCount +") " +strTheme);
				}
				strChoice = con.readLine();
				
				if(strChoice.equals("1")){
					con.println("You chose Theme: Animals");
					strThemeName = "Animals";
					strFileName = "Animals.txt";
					strScreen = "game";
				}
				else if(strChoice.equals("2")){
					con.println("You chose Theme: Anime");
					strThemeName = "Anime";
					strFileName = "Anime.txt";
					strScreen = "game";

				}
				else if(strChoice.equals("3")){
					con.println("You chose Theme: Marvel Characters");
					strThemeName = "Marvel Characters";
					strFileName = "MarvelCharacters.txt";
					strScreen = "game";
				}
				else if(strChoice.equals("4")){
					con.println("You chose Theme: Pokemon");
					strThemeName = "Pokemon";
					strFileName = "Pokemon.txt";
					strScreen = "game";

				}
				else if(strChoice.equals("5")){
					con.println("You chose Theme: Video Game Titles");
					strThemeName = "Video Game Titles";
					strFileName = "VideoGames.txt";
					strScreen = "game";
				}
				else{
					strScreen = "menu";
				}
			}
			//help option
			while(strScreen.equals("help")){
				con.clear();
				con.println("In Guess The Word, the aim of the game is to correctly guess what the word is.");
				con.println("You get a certain amount of guesses and when you run out of guesses you lose!");
				con.println("Try and guess as many words as possible!");
				con.println("");
				con.println("Controls:");
				con.println("P - Play");
				con.println("H - Help");
				con.println("HS - Highscore");
				con.println("Q - Quit");
				con.println("SECRET MENU...");
				con.println("FIND THE CHEAT!");
				con.println("");
				con.println("");
				con.println("");
				con.println("Back to menu? Y / N");
				strBackMenu = con.readLine();
				if(strBackMenu.equalsIgnoreCase("y")){
					strScreen = "menu";
				}
			}
			//secret menu
			while(strScreen.equals("secret")){
				con.clear();
				System.out.println(strChoice);
				con.println("You found the secret menu!");
				con.println("Here is a funny joke for you.");
				con.println("");
				con.sleep(2000);
				con.println("Where did the Software Developer go?");
				con.sleep(1500);
				con.println("He probably ransomware!");
				con.println("");
				con.println("");
				con.println("");
				con.println("Back to Menu? Y / N");
				strBackMenu = con.readLine();
				if(strBackMenu.equalsIgnoreCase("y")){
					strScreen = "menu";
				}
			}
			//game
			while(strScreen.equals("game")){
				System.out.println("User is now playing game");
				con.print("Word:");
					String strTempWord;
					String strTempRand;
					int intThemeLength = 0;
					int intRow2;
					int intRow;
					int intLength;
					strGuess = "";
					int intWordCount = 0;
					
					TextInputFile Count = new TextInputFile(strFileName);
					while(Count.eof() == false){
						strTempWord = Count.readLine();
						intThemeLength++;
						
					}
					
					Count.close();

					String strWord[][] = new String[intThemeLength][2];
					TextInputFile Reading = new TextInputFile(strFileName);
					for(intCount = 0; intCount < intThemeLength; intCount++){
						strWord[intCount][1] = (methodsCPT.Random1to100() +"");
						strWord[intCount][0] = Reading.readLine();
					}
					
					//bubble sort for words
					for(intRow2 = 0; intRow2 < intThemeLength - 1; intRow2++){
						for(intRow = 0; intRow < intThemeLength - 1; intRow++){
							if(Integer.parseInt(strWord[intRow][1]) > Integer.parseInt(strWord[intRow+1][1])){
								strTempWord = strWord[intRow][0];
								strTempRand = strWord[intRow][1];
								strWord[intRow][0] = strWord[intRow + 1][0];
								strWord[intRow][1] = strWord[intRow + 1][1];
								
								strWord[intRow + 1][0] = strTempWord;
								strWord[intRow + 1][1] = strTempRand;
							}
						}
					}
					
					System.out.println(strWord[intWordCount][0]);
					
					//grabbing length of selected word
					intLength = strWord[intWordCount][0].length();
					
					String strLetters[][] = new String[intLength][2];
					
					for(intCount = 0; intCount < intLength; intCount++){
						strLetters[intCount][0] = strWord[intWordCount][0].substring(intCount,intCount+1);
						strLetters[intCount][1] = (methodsCPT.Random1to100() + "");
					}
						//bubble sort for scrambling letters
						for(intRow2 = 0; intRow2 < intLength - 1; intRow2++){
						for(intRow = 0; intRow < intLength - 1; intRow++){
							if(Integer.parseInt(strLetters[intRow][1]) > Integer.parseInt(strLetters[intRow+1][1])){
								strTempWord = strLetters[intRow][0];
								strTempRand = strLetters[intRow][1];
								strLetters[intRow][0] = strLetters[intRow + 1][0];
								strLetters[intRow][1] = strLetters[intRow + 1][1];
								
								strLetters[intRow + 1][0] = strTempWord;
								strLetters[intRow + 1][1] = strTempRand;
							}
						}
					}
					//# of guesses variable
					int intGuesses = intLength - 4;
					
					//printing scrambled words
					while(intGuesses > 0){
						for(intCount = 0; intCount < intLength; intCount++){
							con.print(strLetters[intCount][0]);
						}
						//spacing lines
						con.println("");
						con.println("");
						con.println("");
						con.println("");
						con.println("");
						con.println("Guesses Remaining: " + intGuesses);
						con.println("Guess:");
						strGuess = con.readLine();
						System.out.println("Score: " + intScore);
						//if guessed word matches secret word 
						if(strGuess.equalsIgnoreCase(strWord[intWordCount][0])){
							con.clear();
							intScore = intScore + 1;
							System.out.println("score: " + intScore);
							con.println("You are correct! The word was: " + strWord[intWordCount][0]);
							con.println("Would you like to play again? Y / N");
							strChoice = con.readLine();
							//if user wants to play again
							if(strChoice.equalsIgnoreCase("y") || strChoice.equalsIgnoreCase("yes")){
								con.clear();
								intGuesses = 0;
								strScreen = "game";
								
							}
							//if user does not want to play again
							else if(strChoice.equalsIgnoreCase("n") || strChoice.equalsIgnoreCase("no")){
								strScreen = "menu";
								//highscore file (input)
								TextOutputFile Highscore = new TextOutputFile("highscore.txt", true);
								Highscore.println(strUsername);
								Highscore.println(intScore);
								Highscore.println(strThemeName);
								Highscore.close();
								intScore = 0;
								break;
								
							}
						}	
						//if guessed word does not equal secret word
						else if(!strGuess.equalsIgnoreCase(strWord[intWordCount][0])){
							con.clear();
							con.println("You are Incorrect! Try again.");
							intGuesses = intGuesses - 1;
							if (intGuesses == 0){
								con.println("the word was: " + strWord[intWordCount][0]);
								con.println("Would you like to play again? Y / N");
								strChoice = con.readLine();
								if(strChoice.equalsIgnoreCase("y") || strChoice.equalsIgnoreCase("yes")){
									con.clear();
									strScreen = "game";
								}
								else if(strChoice.equalsIgnoreCase("n") || strChoice.equalsIgnoreCase("no")){
									strScreen = "menu";
									TextOutputFile Highscore = new TextOutputFile("highscore.txt", true);
									Highscore.println(strUsername);
									Highscore.println(intScore);
									Highscore.println(strThemeName);
									intScore = 0;
									break;
									
								}
							}
							System.out.println(intGuesses);
						}
					}
					
				}	
			//highscore variables
			String strUsernameHS = "";
			int intHighscore = 0;
			
			//highscore feature
			while(strScreen.equals("highscore")){
				con.clear();
				TextInputFile Highscores = new TextInputFile("highscore.txt");
				con.println("Highscores:");
				while(Highscores.eof() == false){
					strUsernameHS = Highscores.readLine();
					intHighscore = Highscores.readInt();
					strThemeName = Highscores.readLine();
					con.sleep(350);
					con.println("username: "+strUsernameHS);
					con.sleep(350);
					con.println("Score: " +intHighscore);
					con.sleep(350);
					con.println("Theme: " +strThemeName);
				}
				Highscores.close();
				con.println("");
				con.println("");
				con.println("");
				con.println("Back to menu? Y / N");
				strBackMenu = con.readLine();
				if(strBackMenu.equalsIgnoreCase("y")){
					strScreen = "menu";
				}
			}
			
			//quit feature
			while(strScreen.equals("quit")){
				con.closeConsole();
			}
		}
	}
}
