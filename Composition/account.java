package dharm;

public class account {
	int id;
	customer cu;
	double bal;
	public account(int i,customer e,double bal1){
		id=i;
		cu=e;
		bal=bal1;
	}
	public int getid(){
		return id;
	}
	public customer getcu(){
		return cu;
	}

	public double getbal(){
		return bal;
	}
	public void deposit(int bal2){
		bal=bal+bal2;
		System.out.println(bal);
	}
	public void withdraw(int bal3){
		if(bal3<=bal){
			bal=bal3-bal;
		}
		else {
			System.out.println("fuckoff");
		}
	}
}
