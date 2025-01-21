import arc.*;

public class methodsCPT{
	public static void main(String [] args){
		Console con = new Console();
	}
	

	
	public static void logo(Console con){
	//title screen
	con.println("  *******  *     *  ******  *******  *******   ");
	con.println("  *        *     *  *       *        *         ");
	con.println("  *   ***  *     *  ****    *******  *******   ");
	con.println("  *     *  *     *  *             *        *   ");
	con.println("  *******  *******  ******  *******  *******   ");
	//spacing line
	con.println(" ");
	con.println("      *********  *      *  ********           ");
	con.println("          *      *      *  *                  ");
	con.println("          *      ********  *****              ");
	con.println("          *      *      *  *                  ");
	con.println("          *      *      *  ********           ");
	//spacing line
	con.println(" ");
	con.println("     *     *   *******  ******  *******      ");
	con.println("     *     *   *     *  *    *  *     **     ");
	con.println("     *     *   *     *  ******  *      *     ");
	con.println("     *  *  *   *     *  * **    *      *     ");
	con.println("     * * * *   *     *  *   *   *     **     ");
	con.println("     *     *   *******  *     * *******      ");
	
	}
	
	public static int Random1to100(){
		//generate a random integer from 1 to 100
		//and return it back
		int intRandom;
		intRandom = (int)(Math.random()*100 + 1);
		
		
		return intRandom;
	}
	

}	
	
