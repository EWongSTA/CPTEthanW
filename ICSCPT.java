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
		
		logo(con);
	
	}
	public static void logo(Console con){
	con.println(" ______              ______   ____    ____ ");
	con.println("|         |      |  |        |       |     ");
	con.println("|         |      |  |        |       |     ");
	con.println("|   ___   |      |  |_____   |____   |____ ");
	con.println("|     |   |      |  |             |       |");
	con.println("|_____|   |______|  |______   ____|   ____|");
	con.println("   ");
	con.println("    ");
	con.println("      ");
	con.println("        ");
	con.println("   ");
	con.println("           ");
	con.println("    ");
	con.println("   ");
	con.println("     ");
	con.println("         ");
	con.println("        ");
	}	
	
}
