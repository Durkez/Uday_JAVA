/*MultiLevel Inheritance .
 * 1.It can have multiple child classes and must to have only one Parent class 
 */

package Inheritance;

class AAA{
	
			void display(int a) {
		System.out.println(a);
	}
}
class BBB extends AAA{
	
	void print(int b) {
		System.out.println(b);
		
	}
}
class CCC extends AAA{
	
	void view(int c) {
		System.out.println(c);
	}
}
public class hierarcyInheritance {

	public static void main(String[] args) {
		BBB obj= new BBB();
		obj.display(12); // method from AAA class
		obj.print(27);
		CCC obj1 = new CCC();
		obj1.display(34); /// method from AAA class
		obj1.view(89);
		
		

	}
}
