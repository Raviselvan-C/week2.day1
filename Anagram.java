package week2.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//Declare a String 
		String text1 = "stops";
		//Declare another String
		String text2 = "potss";

		//
		int equalsValues = 0;

		char[] array1 = new char[text1.length()];
		char[] array2 = new char[text2.length()];

		//Check length of the strings are same then (Use A Condition)
		if(text1.length() == text2.length()) {
			for(int i=0; i<text1.length(); i++) {
				//Convert both Strings in to characters
				array1[i] = text1.charAt(i);
				array2[i] = text2.charAt(i);
			}

			//Sort Both the arrays
			Arrays.sort(array1);
			Arrays.sort(array2);

			//check how many equalsValues in both array
			for(int i=0; i<text1.length(); i++) {
				if(array1[i] == array2[i]) {
					equalsValues++;
				}
			}

			//Check equalsValues are same as the array length
			if (equalsValues == array1.length) {
				System.out.println("both words are Anagram");
			}
			else {
				System.out.println("both words are not Anagram");
			}
		}

	}

}
