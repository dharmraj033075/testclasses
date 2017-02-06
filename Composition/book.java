package dharm;

public class book {
	String name;
	author[] authors;
	double price;
	int qty;
	public book(String name1,author[] authors1,double price1){
		name=name1;
		authors=authors1;
		price=price1;
		
	}
	public book(String name1,author[] authors1,double price1,int qty2){
		name=name1;
		authors=authors1;
		price=price1;
		qty=qty2;
	}
	public String getname(){
		return name;
	}
	public double getprice(){
		return price;
	}

	public author getauthor(int i){
		return authors[i];
	}

	public int getqty(){
		return qty;
	}
	public void setqty(int x){
		qty=x;
		System.out.println(qty);
	}



}
