package dharm;
import java.util.*;

public class visit extends customers{
	private customer customer1;
	private Date date;
	private double servicexpense;
	private double productexpense;
	public visit(String name,Date date){
		super(name);
		this.date=date;
		
	}
	public String getname1(){
		return customer1.name;
	}
	public double getsrvicexpense(){
		return servicexpense;
	}
	public double getproductexpense(){
		return productexpense;
	}
	public double gettotalexp(){
		return servicexpense+productexpense;
	}
	public double setsrvicexpense(double servicexpense){
		return this.servicexpense=servicexpense;
	}
	public double setproductexpense(double productexpense){
		return productexpense;
	}
	

}
