package dharm;

public class ball {
	double x;
	double y;
	int radius;
	double xdelta;
	double ydelta;
	public ball(double x,double y,int radius,int speed,double direction){
		this.x=x;;
		this.y=y;
		this.radius=radius;
		this.xdelta=speed*Math.sin(Math.toRadians(direction));
		this.ydelta=speed*Math.sin(Math.cos(Math.toRadians(direction)));
	}
	public void move(){
		x=x+xdelta;
		y=x+ydelta;
	}
	public double getx(){
		return x;
	}
	public double gety(){
		return y;
	}
	public void reflecthor(){
		xdelta=-xdelta;
		
	}
	public void reflectver(){
		ydelta=-ydelta;
	}
		
	

}
