package assignment_11;

import ignore.TestingUtils;

public class App {


	/**

	Given a string, return a string where for every char in the original, append another. 
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		repeatChar("The")  <b>---></b>"TThhee"<br>
		repeatChar("AAbb")    <b>---></b> "AAAAbbbb" <br>
		repeatChar("Hi-There") <b>---></b> "HHii--TThheerree" <br>
	 */
	
	public static String repeatChar(String str) {
		char[] letters = new char[str.length()*2];
		int currentIdx = 0;
		
		for(int i = 0; i < str.length(); i++){
			letters[currentIdx] = str.charAt(i);
			letters[currentIdx + 1] = str.charAt(i);
			currentIdx = currentIdx + 2;
		}
		
		String result = "";
		
		for(int i = 0; i < letters.length; i++){
			result += letters[i];
		}
		return result;
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
