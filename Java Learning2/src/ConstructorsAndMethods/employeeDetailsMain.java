package ConstructorsAndMethods;

public class employeeDetailsMain {
	public static void main(String[]args) {
		
		staticKeyWordEmployee ep=new staticKeyWordEmployee();
		System.out.println(staticKeyWordEmployee.deptid);
		/*we have mention the variable with the class name to use the 
		static variable like above. if we have created and in separate main method*/
		ep.getdata(12,"Uday",3000);
		ep.display();
		ep.getdata1(13, "Shree", 3004);
		ep.display();
		ep.getdata2(14,"venu",2500);
		ep.display();
		ep.getdata3(15,"Tamil",123);
		ep.display();
				
	}

}
