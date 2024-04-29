package Inheritance;

class AA {
	int a=1234;
	void display(){
		System.out.println(a);
}
}

class BB extends AA {
	int b=5678;
	void show(){
		System.out.println(b);
}
}

class CC extends BB {
	int c=91011;
	void view(){
		System.out.println(c);
}
}
public class MultiLevelInheritance {
	public static void main(String []args) {
		CC obj =new CC(); //by creating CC class obj we can access AA & BB  class because CC Extends BB class
		obj.display(); //method in AA class
		obj.show();  //method in BB class
		obj.view();   //method in CC class
		
	}

}
