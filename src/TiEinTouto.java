public class TiEinTouto {

	public final static int ITERATIONS = 10000;	//keep this number small cause it will take ages!
	public static final int ITERATIONS1 = 10000000;
	public static int timeString;
	public static int timeStringBuff;
	public static int x=ITERATIONS1/ITERATIONS;

	public static void main(String[] args) {
	
		concatString();
		concatStrBuffer();
	}
	public static int concatString() {
		System.out.println("this is the String for "+ ITERATIONS);
		int startTime = (int) System.currentTimeMillis();
		String concat = "";
		for (int i = 0; i < ITERATIONS; i++) {
			concat += "A";
		}
		int endTime = (int) System.currentTimeMillis();
		timeString = (endTime - startTime);
		System.out.println("lenght: " + concat.length());
		System.out.println("time: " + timeString);
		System.out.println();
		return timeString;
	}

	public static void concatStrBuffer() {
		System.out.println("this is the StringBuffer for "+ ITERATIONS1+" notice the difference on the itterations..");
		int startTime = (int) System.currentTimeMillis();
		String concat = "";
		StringBuffer concatB = new StringBuffer();
		for (int i = 0; i < ITERATIONS1; i++) {
			concatB.append("A");
		}
		int endTime = (int) System.currentTimeMillis();
		timeStringBuff = (endTime - startTime);
		System.out.println("lenght: " + concatB.length());
		System.out.println("time: " + timeStringBuff);
		System.out.println();
		
		System.out.println("the StringBuffer is "+ timeString*x+ "% faster than the String....." );
	}


	
	
}
