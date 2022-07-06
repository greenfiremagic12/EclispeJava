import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {

		// a string is a bunch of letters, and string is capitalized
		String string1 = "abracadabra";
		
		// you can find the length of a string with .length() 
		System.out.println("The length of the string is: " + string1.length()); // outputs 11
		
		// you can also make it upper case or lower case
		System.out.println(string1.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(string1.toLowerCase());   // Outputs "hello world"
		
		// you can also find where a letter is in a string
		System.out.println(string1.indexOf("bra")); // Outputs 7
		
		// you can add strings together 
		String add1 = "Booga"; String add2 = "Booga!";
		String added = add1 + " " + add2; // added a space
		System.out.println(added);
		
		// and add special characters
		String[] specialChars = {"\'", "\"", "\\"}; // ' " \
		System.out.println(Arrays.toString(specialChars));
	}

}