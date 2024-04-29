/*SUPER KEYWORD
 * 1.super keyword invokes immediate parent class
 * 2.super keyword invokes immediate parent method
 * 3.it is only applicable i inheritance concept
 */


package Inheritance;

public class superKEywordExCars {
	String n = "Ambassdor";
	int sp=100;
	void speed() {
		
		System.out.println(sp);
	}

}
class Benz extends superKEywordExCars{
	String n= "BENZ"; //Overriding happened
	int sp=200; // Overriding happened
	void show() {
		System.out.println(super.n); /*Super key word in the child class
		it will fetch the value of n in its parent class*/
	}
		void speed() {
			
		
		System.out.println(super.sp);/*Super key word in the child class
		it will fetch the value of sp in its parent class*/
	}
}
