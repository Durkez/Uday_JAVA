package ExceptionalHandling;



public class UserExceptionMain {
	
   public  static void amount(int input) throws UserDefinedException {
	if(input<1000) {
	throw new UserDefinedException("Amount is not Sufficient");
	
		}
	else {
	System.out.println("amount is greater:"+input);}
      }
    	
   static int display(int input ) {
    	return input;
    }

	public static void main(String[]args)throws UserDefinedException{
		try{
			int a=19;
			System.out.println(display(a));
		amount(a);
		}
		catch (UserDefinedException e) {
			System.out.println(e.getMessage());
		}
		
		}
		}

