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
	
	public static String[][] BubbleSort(String[][] strWord, String strFileName){
		// strword[0] = playable word
		// strWord[1} = random number
		String[][] strRandWord;
		String strTempWord;
		String strTempNum;
		int intRand;
		int intRow2;
		int intRow;
		TextInputFile FileLength = new TextInputFile(strFileName);
		int intCount = 0;
		strRandWord = new String[intCount][2];
		
		while(FileLength.eof() == false){
			FileLength.readLine();
			intCount = intCount + 1;
		}
		
		for(intRow2 = 0; intRow2 < intCount - 1; intRow2++){
			for(intRow = 0; intRow < intCount -1 - intRow2; intRow++){
				if(Integer.parseInt(strWord[intRow][1]) > Integer.parseInt(strWord[intRow+1][1])){
				strTempWord = strWord[intRow][0];
				strTempNum = strWord[intRow][1];
				strWord[intRow][0] = strWord[intRow + 1][0];
				strWord[intRow][1] = strWord[intRow + 1][1];
				
				strWord[intRow + 1][0] = strTempWord;
				strWord[intRow+1][1] = strTempNum;
				System.out.println(strTempWord);
				System.out.println(strTempNum);
				
				}
			}
		}
		return strRandWord;
	}
}	
	
