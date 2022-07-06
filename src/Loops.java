
public class Loops {

	public static void main(String[] args) {
		
		// the while loop executes code if the condition is true and does it until the condition isn't true
		int i = 0;
		while (i < 5) { // the condition has to be true in order for this to work 
			System.out.println("Executed " + (i + 1) + " time(s) in the while loop");
			i++;
		}
		
		// the do while loop always runs once before checking if the condition is true or false
		i = 0;
		do {
			System.out.println("Executed " + (i + 1) + " time(s) in the do while loop");
		}
		while (i == 1); // this condition is false, but it still runs once
		
		/* the next type of loop is a for loop. 
			the first part of the loop is executed once before the loop, 
			the second part is the condition for the loop
			the third part is executed every time the loop happens */
		for (int i2 = 0; i2 < 10; i2++) {
			System.out.println("Executed " + (i2 + 1) + " time(s) in a for loop");
		}
		
	}

}
