public class SwitchStatements {

	public static void main(String[] args) {

		// these are statements that change depending on a variable
		int x = 1;
		switch(x) {
		  	case 0:
		  		System.out.println("x is 0");
		  		break; // break ends the rest of the code when called to save execution time
		  	case 1:
		  		System.out.println("x is 1");
		    	break;
		    default: // when there is no match above
		    	System.out.println("you broke it somehow");
		}
	
	}

}
