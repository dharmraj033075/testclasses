package dharm;

public class test2 {
	public static void main(String[] args){
		customer h=new customer(1,"dharm0",50);
		
		invoice k=new invoice(2,h,10000);
		System.out.println(k.amount);
		System.out.println(k.getafterdis());
		account t=new account(1,h,2000);
		t.deposit(5000);
		t.withdraw(2000);
		t.withdraw(6000);
		System.out.println(t.bal);
		
	}

}
