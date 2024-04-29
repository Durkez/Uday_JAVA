package ExceptionalHandling ;

public  class ExceptionalHandlingDemo   {
    static void check(int age) {
	   if (age<18) {
		   throw new ArithmeticException("v");
	   }
   }
	
	public static void main(String[]a) {
		
	try {
		check(17);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
}
}
