//-------------------------------------------------------------------------
// Name:         EthanCPT
// Purpose:      Create a Guess the Word Game
// Author:       Wong E.
// Created:      Dec 16, 2024
//-------------------------------------------------------------------------

import arc.*;

public class ICSCPT{
	public static void main(String [] args){
		Console con = new Console("Guess The Word", 1280, 720);
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
		
		
		//main menu
		String strChoice;
		con.println("Welcome to Guess the Word!");
		con.println("What would you like to do:");
		con.println("Play / HighScore / Help / Quit");
		strChoice = con.readLine();
		
		int intLength;
		String strThemeWord[][];
		String strTheme;
			
		if (strChoice.equalsIgnoreCase("p")){
			con.clear();
			System.out.println(strChoice);
			while(themes.eof() == false){
				con.println("Choose a Theme:");	
				con.println("(1) pokemon");
				con.println("(2) Video Games");
				con.println("(3) Marvel Characters");
				con.println("(4) Anime");
				con.println("(5) Animals");
				strTheme = con.readLine();
				themes.readLine();
				themes.close();
				if(strTheme.equalsIgnoreCase("1")){
					pokemon.readLine();
				}else if(strTheme.equalsIgnoreCase("2")){
					VideoGames.readLine();
				}else if (strTheme.equalsIgnoreCase("3")){
					Marvel.readLine();
				}
			}
		}else if(strChoice.equalsIgnoreCase("hs")){
			con.clear();
			System.out.println(strChoice);
			con.println("highscore");
		}else if(strChoice.equalsIgnoreCase("h")){
			con.clear();
			System.out.println(strChoice);
			//help option
			con.println("In Guess The Word, the aim of the game is to correctly guess what the word is.");
			con.println("You get a certain amount of guesses and when you run out of guesses you lose!");
			con.println("Try and guess as many words as possible!");
		}else if(strChoice.equalsIgnoreCase("Secret")){
			con.clear();
			System.out.println(strChoice);
			con.println("You found the secret menu!");
			con.println("Here is a funny joke for you.");
			con.sleep(2000);
			con.println("Where did the Software Developer go?");
			con.sleep(1500);
			con.println("He probably ransomware!");
		}else{
			con.clear();
			System.out.println(strChoice);
			con.closeConsole();
		}
		
		//bubble sorting algorithm

		}
	}
	

