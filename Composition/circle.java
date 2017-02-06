package dharm;

public class circle {
	mypointclass center;
	int radius;
	public circle(){
		center=new mypointclass(0,0);
		radius=1;
	}
	public circle(int x,int y,int radius){
		center.x=x;
		center.y=y;
		this.radius=radius;
	}
	public circle(mypointclass p1,int radius){
		center=p1;
		this.radius=radius;
	}
	public int getradius(){
		return radius;
	}
	public void setradius(int r){
		radius=r;
	}
	public mypointclass getcenter(){
		return center;
	}
	public void setcenter(mypointclass p5){
		center=p5;
	}
	public int[] getcenterxy(){
		int[] j=new int[2];
		j[0]=center.x;
		j[1]=center.y;
		return j;
	}
	public void setcenterxy(int x,int y){
		center.x=x;
		center.y=y;
	}
	public double getarea(){
		return (3.14*radius*radius);
	}
	public double distance(circle another){
		return center.distance(another.center);
	}


}
