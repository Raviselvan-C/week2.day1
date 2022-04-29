package week2.day1;

public class ClassAssignment {
	public int charCount() {
		//declare the string variable
		String text = "testleaf";
		//declare the variable to find the number of e
		int t = 0;
		//create a loop to check each character in String
		for (int i=0; i < text.length(); i++) {
			//check the string has character 'e'
			if ('e' == text.charAt(i)) {
				//e character is available t is incremented
				++t;
			}
		}
		//return t
		return t;		
	}

	public void wordsWithT(){
		String text = "Testleaf is situated in twin towers teynampet";
		//split the string sentence into words by array
		String[] array = text.split(" ");
		//create loop to check each word of string
		for (int i=0; i < array.length; i++) {
			//covert the each array into string for startsWith() method
			String word = array[i];
			//check the first letter of the string with startsWith() method
			if(word.startsWith("t") || word.startsWith("T") ) {
				//print the word if its starts with "t" or "T"
				System.out.println(array[i]);
			}
		}
	}

	public static void main(String[] args) {
		ClassAssignment obj = new ClassAssignment();
		int noOfChar = obj.charCount();
		System.out.println("e = "+noOfChar);
		System.out.println("Words start with T or t");
		obj.wordsWithT();
	}


}
