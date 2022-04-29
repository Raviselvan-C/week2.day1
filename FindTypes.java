package week2.day1;

public class FindTypes {
	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		//Convert the String to character array
		char[] array = new char[test.length()];
		
		//Traverse through each character (using loop)
		for (int i=0; i < array.length; i++) {
			array[i] = test.charAt(i);
			
			//Find if the given character is what type using (if)
			if(Character.isDigit(array[i])) {
				num++;
			}
			else if(Character.isLetter(array[i])) {
				letter++;
			}
			else if(Character.isWhitespace(array[i])) {
				space++;
			}
			else {
				specialChar++;
			}

		}
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
