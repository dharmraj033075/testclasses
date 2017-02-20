package dharm;

public class discountrate {
	private static  double servicediscountper=0.2;
	private static double sericediscountgold=0.15;
	private static double sericediscountsilver=0.15;
	private static double productdiscountper=0.1;
	private static double productdiscountgold=0.1;
	private static double productdiscountsilver=0.1;
	
	public discountrate(double j){
		productdiscountper=j;
		productdiscountgold=j;
		productdiscountsilver=j;	
		
	}
	public double getservicediscount(String membertype1){
		if(membertype1=="Premium"){
			return 0.20;
		}
		else if(membertype1=="gold"){
			return 0.15;
		}
		else{
			return 0.1;
		}
	}
	public double productdiscount(){
		return productdiscountper;
	}

}
