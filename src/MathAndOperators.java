import java.util.Arrays;

public class MathAndOperators {
	
	public static void main(String[] args) {
		
		/* there are a lot of operators, which is like math
		"+" is the addition operator
		"-" is the subtraction operator
		"*" is the mulitplucation operator
		"/" is the division operator
		"%" is the remainder operator
		"++" increases value by 1
		"--" decreases value by 1 */
		
		int[] x = {0, 1, 2, 3, 4, 5, 6};
		x[0] = 1 + 1; // 1 + 1
		x[1] = 2 - 1; // 2 - 1
		x[2] = 2 * 2; // 2 X 2
		x[3] = 4 / 2; // 4 / 2
		x[4] = 5 % 2; // 5 / 2 remainder
		x[5] = ++x[5]; // 5 + 1
		x[6] = --x[6]; // 6 - 1
		
		System.out.println(Arrays.toString(x));
		
		// if you add a equal sing, "=" , you can do the operator to the variable
		
		int[] y = {1, 2, 2, 4, 5};
		y[0] += 1; // 1 + 1
		y[1] -= 1; // 2 - 1
		y[2] *= 2; // 2 X 2
		y[3] /= 2; // 4 / 2
		y[4] %= 2; // 5 / 2 remainder
		
		System.out.println(Arrays.toString(y));
		
		/* comparison operators
		"==" is the equal to operator
		"!=" is the not equal to operator
		">" is the greater than operator
		"<" is the less than operator
		">=" is the greater than or equal to operator
		"<=" is the less than or equal to operator */
		
		int[] z = {0, 1};
		boolean[] a = {true, true, true, true, true, true, true};
		a[0] = z[0] == z[1]; // 0 = 1
		a[1] = z[0] != z[0]; // 0 != 0 not equal
		a[2] = z[0] > z[1]; // 0 > 1
		a[3] = z[1] < z[0]; // 1 < 0
		a[4] = z[0] >= z[1]; // 0 >= 1
		a[5] = z[1] <= z[0]; // 1 <= 0
			
		System.out.println(Arrays.toString(a));
		
		// some math methods
		int randomNum = (int)(Math.random() * 101);  // 0 to 100 random number
		System.out.println(
			
			Math.max(5, 10) + ", " + // finds highest value
			Math.min(5, 10)	+ ", " + // finds lowest value
			Math.sqrt(64) + ", " + // sqaure root
			Math.abs(-4.7) + ", " + // absolute value
			randomNum
			
		);
			
	}
	
}