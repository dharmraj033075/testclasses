package dharm;

public class points {
	private int x;
	private int y;
	public points(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int getx1(){
		return x;
	}
	public int gety1(){
		return y;
	}
	public double distance(points anather){
		double xdiff=(this.x-anather.x)*(this.x-anather.x);
		double ydiff=(this.y-anather.y)*(this.y-anather.y);
		return Math.sqrt(xdiff+ydiff);
	}

}
