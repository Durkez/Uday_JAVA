package Interface;

abstract class Mobile{
	  void show() {
		  System.out.println("Playing song");
	  }
	 abstract void call();
}
class Redmi extends Mobile{
	void show() 
	 {
		 System.out.println("Playing Games"); // here overrided the method defined in abstract class
	 }
	void call() {
		System.out.println("Redmi Calling"); /*here defined the abstract method 
		                                      on the abstract method. the extended class must have to define the 
		                                       abstract method */
		}
}

public class abstractKeywordDemo {
	public static void main(String []a) {
	Redmi red = new Redmi();
	red.show();
	red.call();
	}

}
