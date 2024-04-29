package ConstructorsAndMethods;



public class CreatingMethodsAndConstructors {

int a,b,c;
String s1,s2,s3;
 CreatingMethodsAndConstructors(int a1,int b1,int c1,String k1,String k2,String k3)
{
	a=a1;
	b=b1;
	c=c1;
	s1=k1;
	s2=k2;
	s3=k3;
	
	}
void display()
{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
}
	public static void main(String[]args) {

CreatingMethodsAndConstructors con = new CreatingMethodsAndConstructors(212,11,33,"uday","shree","venu");
                        con.display();
		
		

	}

}

