package Interface;

class Test{
	int value =99;
         final void meth() { //we cannot override methods if we use final keyword in any child class
		System.out.println("from test");
	}
}
	class Test2 extends Test{
		
		}
	

			public class finalKeywordMethod 
			{
	public static void main (String[]args)
	{

	Test2 test = new Test2();
	test.meth();
	}
		}
	
