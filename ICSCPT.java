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
		TextInputFile pokemon = new TextInputFile("pokemon.txt");
		TextInputFile VideoGames = new TextInputFile("VideoGames.txt");
		TextInputFile Marvel = new TextInputFile("MarvelCharacters.txt");
		TextInputFile Anime = new TextInputFile("Anime.txt");
		TextInputFile Animals = new TextInputFile("Animals.txt");
		TextOutputFile highscore = new TextOutputFile("highscore.txt", true);
		
		//logo
		methodsCPT.logo(con);
		con.sleep(3000);
		con.clear();
		
		//variables
		String strUsername = "";
		String strScreen = "menu";
		String strChoice;
		strChoice = "";
		String strBackMenu;
		String strTheme;
		
		//keep the game running 
		while(true){
			//menu screen
			while(strScreen.equals("menu")){
				con.clear();
				con.println("Welcome to Guess the Word!");
				con.println("What would you like to do:");
				con.println("Play / HighScore / Help / Quit");
				strChoice = con.readLine();
				if(strChoice.equalsIgnoreCase("p")){
					strScreen = "play";
				}
				else if(strChoice.equalsIgnoreCase("hs")){
					strScreen = "highscore";
				}
				else if(strChoice.equalsIgnoreCase("h")){
					strScreen = "help";
				}
				else if(strChoice.equalsIgnoreCase("secret")){
					strScreen = "secret";
				}
				else if(strChoice.equalsIgnoreCase("q")){
					strScreen = "quit";
				}else{
					strScreen = "menu";
				}
			}
			//play screens
			while(strScreen.equals("play")){
				con.clear();
				System.out.println(strChoice);
				//username
				con.println("What is your username?");
				strUsername = con.readLine();
				con.clear();
				con.println("Your Username: " + strUsername);
				con.println("");
				//theme chooser
				con.println("Choose a Theme:");
				con.println("(1) Anime");
				con.println("(2) Animals");
				con.println("(3) Marvel Characters");
				con.println("(4) Pokemon");
				con.println("(5) Video Games");
				strTheme = con.readLine();
								
			}
			//highscore screen
			while(strScreen.equals("highscore")){
				
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
			//quit feature
			while(strScreen.equals("quit")){
				con.closeConsole();
			}
		}


	}
}
