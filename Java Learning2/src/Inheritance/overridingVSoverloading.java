package Inheritance;

class operation{
	void add(int a){
		
		System.out.println(a);
	}
	void sub(int b) {
		System.out.println(b);
	}
}
class finalOperation extends operation{
	void add(int a)   //Overrided add() method
	{
		System.out.println(a+100);
		
	}
	void sub(int a,int b)   //Overloaded sub() method 
{
		System.out.println(a-b);
		}
}

public class overridingVSoverloading {
	public static void main(String []args) {
		finalOperation fp = new finalOperation();
		fp.add(12);
		fp.sub(12); // 12 -O/p by method sub() derived in Operation parent Class
		fp.sub(12,10); // 2- O/P by method sub() overloaded and derived in finalOperation child class.
		
	}

}
