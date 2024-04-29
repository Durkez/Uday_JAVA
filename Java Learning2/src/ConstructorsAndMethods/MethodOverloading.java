/*
 
 CREATING OVERLOADING METHODS RULES....   
 
1.Methods name should be same.
2.number of parameters should be different.
3.if the number of parameters are same then 
the data types should be different.
4.if the data type is also same then the order of 
parameter should be different.*/

package ConstructorsAndMethods;

public class MethodOverloading {
	int x,y,z;
	
	void add() {
		x=20;
		y=90;
		z=100;
		System.out.println(x+y+z);
	}
	void add(int a,int b){
		x=a;
		y=b;
		System.out.println(x+y);
		
	}
	void add (int a ,int b,int c) {
		x=a;
		y=b;
		z=c;
		System.out.println(x+y+z);
	}

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.add(12,12,12);
		

	}

}
