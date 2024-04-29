/*Static Method___
 * 1.Static methods can access static stuff directly
 * without calling a method..
 * 2.Static Method can access not static method too 
 * but through creating an object.
 * 3.An non-static method can access everything directly.
 * (Weather it can be static variable or static method).
 */



package ConstructorsAndMethods;

public class staticKeyWordEmployee {
	int empid;
	String empname;
	static int deptid=10;
	int empsalary;

	
	void getdata(int empid,String empname,int empsalary) {
		this.empid=empid;
		this.empname=empname;
		this.empsalary=empsalary;
		
	}
	
	void getdata1(int empid,String empname,int empsalary) {
		this.empid=empid;
		this.empname=empname;
		this.empsalary=empsalary;
		
	}
	
	void getdata2(int empid,String empname,int empsalary) {
		this.empid=empid;
		this.empname=empname;		
		this.empsalary=empsalary;
		
	}
	
	void getdata3(int empid,String empname,int empsalary) {
		this.empid=empid;
		this.empname=empname;
		this.empsalary=empsalary;
		
	}
	void display() {
		System.out.print(empid+"  ");
		System.out.print(empname+" ");
		System.out.print(deptid+" ");
		System.out.print(empsalary+" ");
	}
	

}

