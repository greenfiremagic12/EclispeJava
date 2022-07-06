public class IfElseStatements {

	public static void main(String[] args) {
		
		// if else statements use the comparrasion operators
		int x = 1; int y = 0;
		if (x > y) { // true
			System.out.println("x is greater than y");
		}
		else {
			System.out.println("x isn't greater than y");
		}
		
		// else if
		if (x > y) {
			System.out.println("x is greater than y");
		}
		else if (x < y) {
			System.out.println("x isn't greater than y");
		}
		else {
			System.out.println("x is equal to y");
		}
		
		// there is a shorthand version of if else statements
		String z = (x > y) ? "x is greater than y" : "x isn't greater than y";
		System.out.println(z);
		
	}

}
