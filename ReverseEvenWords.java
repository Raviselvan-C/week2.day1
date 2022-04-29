package week2.day1;

public class ReverseEvenWords {
	//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

	public static void main(String[] args) {

		//Declare the input as Follow
		String test = "I am a software tester"; 

		//split the words and have it in an array
		String[] array1 = test.split(" ");


		//Traverse through each word (using loop)
		for(int i = 0; i < array1.length; i++) {
			//find the odd index within the loop
			if (i%2 == 0) {
				System.out.print(array1[i]+" ");
			}
			else {
				int a = array1[i].length();
				int k = 0;
				//Convert words to character array if the position is even else print the word as it is(concatenate space at the end)
				char[] array2 = new char[a];
				//print the even position words in reverse order using another loop
				for (int j = a-1; j >= 0; j--) {
					array2[k++] = array1[i].charAt(j);					
				}
				//print the even character array
				System.out.print(array2);
				System.out.print(" ");
			}
		}
	}

}
