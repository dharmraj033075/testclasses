package dharm;

public class circle3 extends shape{
	private double radius;
	public circle3(){
		radius=1;
	}
	public circle3(double radius){
		this.radius=radius;
	}
	public circle3(double radius,String color,boolean filled){
		super(color,filled);
		this.radius=radius;
	}
	public double getperimeter(){
		return 2*3.14*radius;
	}
	public double getarea(){
		return 3.14*radius*radius;
	}

}
