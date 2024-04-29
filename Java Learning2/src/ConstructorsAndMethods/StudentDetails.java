package ConstructorsAndMethods;

public class StudentDetails {
	
	int id;
	int mark;
	String name;
	
 StudentDetails (int a,int b,String n) {
	id=a;
	mark=b;
	name=n;
}
 void display() {
	 System.out.println(id);
	 System.out.println(mark);
	 System.out.println(name);
 }

	public static void main(String[] args) {
		
		StudentDetails sd = new StudentDetails(7,99,"Uday");
		sd.display();
	}

}
