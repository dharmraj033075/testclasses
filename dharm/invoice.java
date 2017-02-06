package dharm;

public class invoice {
	int id;
	customer customer1;
	double amount;
	public invoice(int id1,customer r,double amount1){
		id=id1;
		customer1=r;
		amount=amount1;
	}
	public customer getcustomer(){
		return customer1;
	}
	public void setcustomer(customer p){
		customer1=p;
	}
	public double getamount(){
		return amount;
	}
	public void setamount(double g){
		amount=g;
		
	}
	public String getname(){
		return customer1.name;
	}
	public double getafterdis(){
		amount=amount-(amount*customer1.discount/100);
		return amount;
	}
	

}
