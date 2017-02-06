package dharm;

public class cylinder extends circle2{
	double height;
	public cylinder(){
		super();
		height=1.0;
	}
	public cylinder(double radius,double height,String color,String n,String s){
		super(radius,color,n,s);
		height=height;
	}
	public double getvolume(){
		return height*super.getarea();
	}
	public double getarea(){
		return 2*3.14*super.getradius()*height;
	}
	public void gett(){
		super.getnamesize();
	}
	

}
