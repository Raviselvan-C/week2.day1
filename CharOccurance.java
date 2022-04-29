package week2.day1;

public class CharOccurance {
	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		String text = "welcome to chennai";

		// declare and initialize a variable count to store the number of occurrences
		int t = 0;

		// convert the string into char array
		char[] array = new char[text.length()];

		//get the length of the array
		// traverse from 0 till the array length 
		for (int i=0; i < array.length; i++) {
			array[i] = text.charAt(i);
			// Check the char array has the particular char in it 
			if ('e' == array[i]) {
				// if is has increment the count
				++t;
			}
		}
		// print the count out of the loop
		System.out.println("number of 'e' in String : "+t);
	}

}
