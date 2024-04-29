package ConstructorsAndMethods;

public class ConstructorOverloading {
	int a,b;
	double d;
	ConstructorOverloading(){
		a=100;
		b=200;
		}
	ConstructorOverloading(int a ,int b){
		this.a =a;
		this.b=b;
		}
	ConstructorOverloading(int a ,double d){
		this.a=a;
		this.d=d;
	}
	ConstructorOverloading(int a,int b,double d){
		this.a=a;
		this.b=b;
		this.d=d;
	}
	void show() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
	}
	
	

	public static void main(String[] args) {
		
   ConstructorOverloading co= new ConstructorOverloading();
   co.show();
   
	}

}
