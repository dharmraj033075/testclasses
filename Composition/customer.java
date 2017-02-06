package dharm;

public class customer {
	int id;
	String name;
	int discount;
	public customer(int id1, String name1, int discount1){
		id=id1;
		name=name1;
		discount=discount1;
	}
	public int getdiscount(){
		return discount;
	}
	public void setdiscount(int  Discount){
		discount=Discount;
	}


}
