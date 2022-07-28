import java.util.Stack;

public class StringReverser{

	//function that reverses a string using a stack
	public String reverse( String input) {

		//checks whether a valid string has been sent
		if (input == null)
			throw new IllegalArgumentException();

		Stack<Character> stack = new Stack<>();
	
		for (char c : input.toCharArray() )
			stack.push(c);

		StringBuffer reversed = new StringBuffer();

		
		while (!stack.empty() )
			reversed.append (stack.pop() );


		return reversed.toString();



	}




}
