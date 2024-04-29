
public class WrapperClasses {
	public static void main(String[]a) {
		
		byte ab=1;
		short b =12;
		int c =123;
		long d =1234;
		float e =22.4f;
		double f =565.09;
		char g ='a';
		String h ="Udaya";
		
		//Converting the primitive type into object is called Autoboxing
		
		Byte obj=ab;             /*here we converted primitive ab byte
	                              value to object obj by calling Byte class*/
		System.out.println(obj);
	System.out.println(obj.byteValue());
	String sobj=h;
	System.out.println(sobj);
	System.out.println(ab); // we can also call by its variable.
	/*autoboxing is done to use methods to the use inbuild methods in the wrapper class and for data conversion */              
	
	//Converting Object to primitive is called Unboxing
	byte bytevalue=obj;
	
		}

}
