/* OVERRIDING RULES
 * 1.it is only possible in multiple classes atleast2 class is required
 * 2.only works under inheritance concept of OOPs
 * 3.we should not change definition(data type) of the method but body
 *  we should change(operations & variable values)
 * 4.method names should be same
 */



package Inheritance;

class games{
	String requirement() {
		return "Equipments Needed";
	}
	
}
class Cricket extends games{
	String requirement() {   // overriding takes place
		return "BAT,BALL";
	}
	
}
class Football extends games{
	String requirement() {
		return "FOOTBALL,BOOTS"; //overriding takes place
}
}
public class overRiding {

	public  static void main(String[]args) {
   games ga=new games();
   System.out.println(ga.requirement());// Equipments needed --O/P
	Cricket cc= new Cricket();
	System.out.println(cc.requirement());//same method name but it overrides the games string to BAT,BALL -O/P
	Football fb= new Football();
	System.out.println(fb.requirement());//same method name but it overrides the games string to FOOTBAL,BOOTS -O/P
		

	

}
}
