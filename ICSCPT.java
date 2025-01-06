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
		TextOutputFile highscore = new TextOutputFile("highscore.txt", true);
		
		//logo
		methodsCPT.logo(con);
		con.sleep(3000);
		con.clear();
		
		
		//main menu
		String strChoice;
		con.println("Welcome to Guess the Word!");
		con.println("What would you like to do: Play / HighScore / Help / Quit");
		strChoice = con.readLine();
		
		int intLength;
		String strThemeWord[][];
		strThemeWord = new String[intLength][2];
		String strTheme;
		
		//bubble sorting algorithm
		int intRow;
		con.println("BEFORE");
		for(intRow = 0; intRow < 10; intRow++){
			con.println(strShopping[intRow][0] + " | " + strShopping[intRow][1]);
		}
		String strTempName;
		String strTempPrice;
		int intRow2;
		for(intRow2 = 0; intRow2 < 10 - 1; intRow2++){
			for(intRow = 0; intRow < 10-1; intRow++){
				if(Integer.parseInt(strShopping[intRow][1]) > Integer.parseInt(strShopping[intRow+1][1])){
				strTempName = strShopping[intRow][0];
				strTempPrice = strShopping[intRow][1];
				strShopping[intRow][0] = strShopping[intRow + 1][0];
				strShopping[intRow][1] = strShopping[intRow + 1][1];
				
				strShopping[intRow + 1][0] = strTempName;
				strShopping[intRow+1][1] = strTempPrice;
				System.out.println(strTempName);
				System.out.println(strTempPrice);
				}
			}
		}
		con.println("AFTER");
		for(intRow = 0; intRow < 10; intRow++){
			con.println(strShopping[intRow][0] + " | " + strShopping[intRow][1]);
		}
		
				
		if (strChoice.equalsIgnoreCase("play")){
			con.clear();

			while(themes.eof() == false){
				con.println("Choose a Theme:");	
				strTheme = con.readLine();
				themes.readLine();
				if(strTheme.equalsIgnoreCase("Pokemon")){
					pokemon.readLine();
				}else if(strTheme.equalsIgnoreCase("Video Games")){
					VideoGames.readLine();
				}else if (strTheme.equalsIgnoreCase("Marvel Characters")){
					Marvel.readLine();
				}
			}
		}else if(strChoice.equalsIgnoreCase("highscore")){
			con.clear();
			con.println("highscore");
		}else if(strChoice.equalsIgnoreCase("help")){
			con.clear();
			//help option
			con.println("In Guess The Word, the aim of the game is to correctly guess what the word is.");
			con.println("You get a certain amount of guesses and when you run out of guesses you lose!");
			con.println("Try and guess as many words as possible!");
		}else{
			con.clear();
			con.println("quit");
		}
		
	
	}
}	
	

