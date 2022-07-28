import java.util.Map.Entry;
import java.util.HashMap;
public class PalindromePermutation{

	public static void main (String [] args) {

		String test = "ababcc";
		boolean result = isPalindromePermutation(test);

		System.out.println(result);

	}


	//function that checks if a string is a permutation of a palindrome and returns a boolean
	public static boolean isPalindromePermutation(String string) {

		//create a hasmap to store characters from the strinng and their frequency
		HashMap<Character,Integer> frequency = new HashMap<Character,Integer>();

		//traverse through the string and check whether the character exists in the HashMap and increase th frequency if not add
		for(int i = 0; i < string.length(); i++) {

			char c = string.charAt(i);

			if( frequency.containsKey(c )) {

				frequency.put(c,frequency.get(c)+1);
			} else {

				frequency.put(c,1);
			}

		}


		//traverse through  the hashmap and check how many characters appear in odd frequency

		int oddCharFrequency = 0;

		for ( Entry<Character, Integer> e : frequency.entrySet() ) {


			if(e.getValue()%2 == 1) 
				oddCharFrequency++;
		} 


		//if odd character frequency characters are less than one then it is a permutation of a palindrome retuen true otherwise false

		if (oddCharFrequency <= 1) 
			return true;

		return false;

		

	}






}
