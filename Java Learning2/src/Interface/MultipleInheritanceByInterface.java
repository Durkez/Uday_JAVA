/* INTERFACE MULTIPLE INHERITANCE
 * 1.the interface variable ,method and type is public always.
 */


package Interface;

interface Apple{   //parent class(interface type)
	int Apprate =10000;
	void model1();
	
}
interface Samsung{ //parent class (interface type)
	int Samrate=7000;
	void model2();
}
class Oppo{         //parent class (Class)
	int Opporate=5000;
	void model3() {
		System.out.println("oppo Reno pro plus");
	}
}
//child Class for 2 interface type and one Class type
public class MultipleInheritanceByInterface extends Oppo implements Apple,Samsung //extending of class first then implements keyword
{
 @Override
	public void model1() {
		// TODO Auto-generated method stub
		System.out.println("Samsung S23 Ultra");
	}

	@Override
	public void model2() {
		// TODO Auto-generated method stub
		System.out.println("Apple 14");
	}

	public static void main(String a[]) {
		MultipleInheritanceByInterface MI= new MultipleInheritanceByInterface();
MI.model1();
System.out.println(MI.Samrate);//it is an static variable
MI.model2();
System.out.println(MI.Apprate);//it is an static variable 
MI.model3();
System.out.println(MI.Opporate); 
	}
}