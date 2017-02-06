package dharm;

public class ractangle extends shape {
	private double width;
	private double length;
	public ractangle(){
		width=1;
		length=1;
	}
	public ractangle(double width,double length,String color,boolean filled){
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	public double getarea(){
		return width*length;
	}
	public double getperimeter(){
		return 2*(length+width);
	}
	public void setwidth(double width){
		this.width=width;
	}
	public void setlength(double length){
		this.length=length;
	}

}
