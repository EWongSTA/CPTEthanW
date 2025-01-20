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
		//themes + highscore files
		TextInputFile themes = new TextInputFile("themes.txt");
		
		//logo
		methodsCPT.logo(con);
		con.sleep(2000);
		con.clear();
		
		//variables
		String strUsername = "";
		String strScreen = "menu";
		String strChoice;
		strChoice = "";
		String strBackMenu;
		String strTheme;
		String strTemp;
		int intScore = 0;
		String strFileName;
		String strWord[][];
		int intRow;
		intRow = 0;
		strWord = new String [intRow][2];
		int intThemeLength = 0;
		String strThemeArray[];
		while (themes.eof() == false){
			strTemp = themes.readLine();
			intThemeLength++;
		}
		int intCount;
		themes.close();
		strThemeArray = new String[intThemeLength];
		
		//keep the game running 
		while(true){
			//menu screen
			while(strScreen.equals("menu")){
				con.clear();
				con.println("Welcome to Guess the Word!");
				con.println("What would you like to do:");
				con.println("Play / HighScore / Help / Quit");
				strChoice = con.readLine();
				if(strChoice.equalsIgnoreCase("p") || strChoice.equalsIgnoreCase("play")){
					System.out.println("user wants to play");
					strScreen = "play";
				}
				else if(strChoice.equalsIgnoreCase("hs") || strChoice.equalsIgnoreCase("highscore")){
					System.out.println("User is checking highscores");
					strScreen = "highscore";
				}
				else if(strChoice.equalsIgnoreCase("h") || strChoice.equalsIgnoreCase("help")){
					System.out.println("User checking help menu");
					strScreen = "help";
				}
				else if(strChoice.equalsIgnoreCase("UUDDLRLRBASTART")){
					System.out.println("User found secret menu");
					strScreen = "secret";
				}
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
				}
				//ask user what theme to play
				con.println("");
				con.println("Choose a theme:");
				con.println("(1) Animals");
				con.println("(2) Anime");
				con.println("(3) Marvel Characters");
				con.println("(4) Pokemon");
				con.println("(5) Video Games");
				strChoice = con.readLine();
				
				if(strChoice.equals("1")){
					con.println("You chose Theme: Animals");
					strScreen = "game";
				}
				else if(strChoice.equals("2")){
					con.println("You chose Theme: Anime");
					strScreen = "game";
				}
				else if(strChoice.equals("3")){
					con.println("You chose Theme: Marvel Characters");
					strScreen = "game";
				}
				else if(strChoice.equals("4")){
					con.println("You chose Theme: Pokemon");
					strScreen = "game";
				}
				else if(strChoice.equals("5")){
					con.println("You chose Theme: Video Games");
					strScreen = "game";
				}
			}
			//help option
			while(strScreen.equals("help")){
				con.clear();
				System.out.println(strChoice);
				con.println("In Guess The Word, the aim of the game is to correctly guess what the word is.");
				con.println("You get a certain amount of guesses and when you run out of guesses you lose!");
				con.println("Try and guess as many words as possible!");
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
				con.clear();
				con.println("You have chosen Theme: "+ strChoice);
				
				
				
			}
			
			//quit feature
			while(strScreen.equals("quit")){
				con.closeConsole();
			}
		}


	}
}
