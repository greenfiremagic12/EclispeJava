public class DataTypeCasting {
	
	public static void main(String[] args) {
		
		/* in java, you can convert a data type to something else
		smaller to bigger = byte < short < int < long < float < double
		bigger to smaller = double > float > long > int > short > byte */
		
		// bigger
		byte x = 1;
		short y = (short) x;
		int z = (int) y;
		long a = (long) z;
		float b = (float) a;
		double c = (double) b;
		System.out.println(((Object)c).getClass().getSimpleName());
		
		// smaller
		double X = 1;
		float Y = (float) X;
		long Z = (long) Y;
		int A = (int) Z;
		short B = (short) A;
		byte C = (byte) B;
		System.out.println(((Object)C).getClass().getSimpleName());
		
	}
	
}