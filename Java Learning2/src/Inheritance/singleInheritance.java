/*Single Inheritance
 * 1.One parent class and one Child Class
 */
package Inheritance;

class A{
	int value;
	void display() {
		System.out.println(value);
	}
}
class B extends A{
	
	int value1;
	
	void show() {
		System.out.println(value1);
			}
}
public class singleInheritance {
	public static void main(String[]args) {
		
		B obj =new B();//we can directly access the A class value by object of class B
		obj.value = 12323; //Variable in A class
		obj.value1=324324;
		obj.display();   //Method in A class 
		obj.show();
		
	}

}
