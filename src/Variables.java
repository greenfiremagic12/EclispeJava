public class Variables{
	
	public static void main(String[] args) {
		
		/*	data types
		 	byte - really small number
		 	short - small number
		 	int - number
		 	long - big number
		 	float - 7 decimals
		 	double - 15 decimals
		 	boolean - true or false
			char - one character	*/
		
		// normal numbers
		byte[] byte1 = {-128, 127}; //range
		short[] short1 = {-32,768, 32,767}; //range
		int[] int1 = {-2,147,483,648, 2,147,483,647}; //range
		long[] long1 = {-9,223,372,036,854,775,808, 9,223,372,036,854,775,807}; //range
		
		// decimal numbers
		float float1 = 0.123456789f; //32 bits
		double double1 = 1E16d; //64 bits

		// character and boolean
		char char1 = 'x'; // single character
		boolean boolean1 = true; // true or false
		
		System.out.println(byte1); System.out.println(short1); System.out.println(int1); System.out.println(long1); System.out.println(float1); System.out.println(double1); System.out.println(boolean1); System.out.println(char1);
		// just to get rid of errors
		
	}
	
}