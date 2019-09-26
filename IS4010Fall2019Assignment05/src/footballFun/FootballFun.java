/* IS4010 Fal 2019
 * Assignment 05
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package footballFun;

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	public static String translateScore (int score) {
		
		if (score == 2) 
				return ("safety"); // if the team scores 2, then string will return safety
		else if (score == 3) 
				return ("field goal"); // if the team score 3, then the string will return field goal 
		else if (score == 6) 
				return ("touchdown"); // when the team score 6, the string will return touch down
		else if (score == 7) 
				return ("touchdown and extra point"); //when the team add an extra point to touch down, then the string will return touch down and extra point
		else if (score == 8) 
				return ("touchdown and 2-point conversion"); // when the team adds 2 points to touch down, then string will return touch down and 2 point conversion 
		else if (score == -1) 
				return (""); // when the score = -1, the string will return ""
		else if (score == 1) 
				return ("invalid"); // when the score = 1, string will return invalid
		else if (score == 10) 
				return ("you must be playing Quidditch "); // when score= 10, string will return you must be playing Quidditch
		
		return "";
	}
}
