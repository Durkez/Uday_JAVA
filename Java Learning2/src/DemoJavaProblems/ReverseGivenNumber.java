package DemoJavaProblems;
import java.util.*;
public class ReverseGivenNumber {
 public static void main(String[]a) 
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter A Number");
	 int num= sc.nextInt();
	 int rev=0;
	 while(num!=0) {
		 rev = rev*10 + num%10; 
		 num=num/10;
		 }
	 System.out.println(rev);
	 }
}
