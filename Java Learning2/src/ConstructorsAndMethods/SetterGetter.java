package ConstructorsAndMethods;

class number{
	int a;
	String word;
	double d;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	
}


public class SetterGetter {
	public static void main(String[]a) {
  number num = new number();
        num.setA(12);
        System.out.println(num.getA());
}
}
