package dharm;

public class circle2 extends feature{
	private double radius;
	private String color;
	public circle2(){
		super();
		radius=1;
		color="red";
	}
	public void getr(){
		super.getnamesize();
	}
	public circle2(double r,String d,String n,String s){
		super(n,s);
		radius=r;
		color=d;
		
	}
	public double getradius(){
		return radius;
	}
	public String getcolor(){
		return color;
	}
	public double getarea(){
		return 3.14*radius*radius;
	}



}
