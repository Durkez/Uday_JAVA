
public class WrapperClassDataConversion {
	public static void main(String[]a) {
		//String to int
		String s1= "1234";
		
		int num=Integer.valueOf(s1);
		System.out.println("String to Int"+" "+ num);
		
		int n1=11111;
		
		String s2=String.valueOf(n1);
		System.out.println(" Int to String"+" "+ s2);
		
		String s3="123.40"	;
		double d=Double.valueOf(s3);
		System.out.println("String to double"+ " "+d);
	}

}
