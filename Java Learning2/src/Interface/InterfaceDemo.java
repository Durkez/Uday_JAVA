package Interface;

interface Shape
{
	int length =10; //by default variable is final & static
	int width =20;
	void circle(); //abstract method.
	default void A() { /*an method can be defined in an interface only by specifying the 
							the default & static keyword to the method*/
		System.out.println("By default keyword-Rectangle");
	}
	static void triangle() {
		System.out.println("By static keyword-Triangle");/*an method can be defined in an interface only by specifying the 
		                                                the static & default keyword to the method*/
	}
}


public class InterfaceDemo implements Shape {
	public void circle() {
		System.out.println("By implemention in class(InterfaceDemo)-Circle");
	}
	
	public static void main(String[]a) {
		//Shape sh = new Shape(); //we cant create object of interface.
		InterfaceDemo id= new InterfaceDemo();
		id.circle();
		id.A();
		Shape.triangle();
		
		System.out.println("Here one by creating an interface variable of a class which it is implemented");
		Shape sh = new InterfaceDemo(); /*this is allowed
		                                    the interface variable can hold the object of a class in which it is 
		                                    implemented*/
		sh.circle();
		sh.A();
		Shape.triangle();
		
		
		 
	}

}
