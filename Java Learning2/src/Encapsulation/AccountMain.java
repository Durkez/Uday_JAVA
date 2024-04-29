package Encapsulation;

public class AccountMain{
	 public static void main(String[]args) {
		 AccountDetails ad= new AccountDetails();
		 ad.setAcc_no(12);
		ad.setName("Udaya");
		ad.setBalance(2222.80);
		System.out.println(ad.getAcc_no());
		System.out.println(ad.getName());
		System.out.println(ad.getBalance());
	 }
}
