package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		//Declare A String value as"madam"
		String word1 = "Madam";
		//Declare another String rev value as ""
		String rev ="";

		//Iterate over the String in reverse order
		for (int i = word1.length()-1; i >= 0 ; i--) {
			char a = word1.charAt(i);
			//Add the char into rev
			rev = rev + a;
		}
		
		//Compare the original String with the reversed String, 
		if(word1.equalsIgnoreCase(rev)) {
			//if it is same then print palinDrome 
			System.out.println("Palindrome word");
		}
		else {
			System.out.println("Not Palindrome word");
		}		
	}
}
