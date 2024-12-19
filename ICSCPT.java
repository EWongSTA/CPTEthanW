import arc.*;

public class ICSCPT{
	public static void main(String [] args){
		Console con = new Console();
		TextInputFile themes = new TextInputFile("themes.txt");
		TextInputFile pokemon = new TextInputFile("pokemon.txt");
		TextInputFile VideoGames = new TextInputFile("VideoGames.txt");
		TextInputFile Marvel = new TextInputFile("MarvelCharacters.txt");
		TextInputFile Anime = new TextInputFile("Anime.txt");
		TextInputFile Animals = new TextInputFile("Animals.txt");
		
		methodsCPT.logo(con);
		con.sleep(3000);
		con.clear();
		
		
		//
		String strChoice;
		con.println("Welcome to Guess the Word!");
		con.println("What would you like to do: Play / HighScore / Help / Quit");
		strChoice = con.readLine();
		
		if (strChoice.equalsIgnoreCase("play")){
			con.clear();
			con.println("play");
		}else if(strChoice.equalsIgnoreCase("highscore")){
			con.clear();
			con.println("highscore");
		}else if(strChoice.equalsIgnoreCase("help")){
			con.clear();
			con.println("In Guess The Word, the aim of the game is to correctly guess what the word is.");
			con.println("You get a certain amount of guesses and when you run out of guesses you lose!");
		}else{
			con.clear();
			con.println("quit");
		}
		
	
	}
}	
	

