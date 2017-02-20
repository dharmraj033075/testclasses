package dharm;
import java.util.*;

public class testdiscount {
	public static void main( String[] args){
		customers c11=new customers("dharm");
		System.out.println(c11.getname());
		System.out.println(c11.ismember());
		c11.setmember("gold");
		c11.setmemberbool(true);
		visit b1=new visit("dharm",new Date());
		System.out.println(b1.setsrvicexpense(10000));
		System.out.println(b1.setproductexpense(20000));
		System.out.println(b1.gettotalexp());
		discountrate d1=new discountrate(0.5);
		System.out.println(c11.getname());
		System.out.println(d1.getservicediscount(c11.getmembertype()));
		System.out.println(d1.productdiscount());
		
		
		
	}
	
	

}
