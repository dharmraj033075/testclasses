package dharm;

public class mypointclass {
	public int x;
	public int y;
	public mypointclass(){
		x=0;
		y=0;
	};
	public mypointclass(int x1,int y1){
		x=x1;
		y=y1;
	}
	public int getx(){
		return x;
		
	}
	public int gety(){
		return y;
	}
	public void setx(int z){
		x=z;
	}
	public void sety(int z){
		y=z;
	}
	public int[] getxy(){
		int[] arr1=new int[2];
		arr1[0]=x;
		arr1[1]=y;
		return arr1;
	}
	public void setxy(int z,int h){
		x=z;
		y=h;
	}
	public double distance(int z,int h){
		int d1=(x-z)*(x-z);
		int d2=(y-h)*(y-h);
		return Math.sqrt((d1+d2));
		
	}
	public double distance(mypointclass p1){
		return this.distance(p1.x,p1.y);
	}
	public double distance(){
		int diffx=this.x-x;
		int diffy=this.y-y;
		diffx=Math.multiplyExact(diffx, diffx);
		diffy=Math.multiplyExact(diffy, diffy);
		return Math.sqrt((diffx+diffy));
	}

}
