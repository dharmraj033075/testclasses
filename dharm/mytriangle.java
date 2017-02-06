package dharm;

public class mytriangle {
	mypointclass v1;
	mypointclass v2;
	mypointclass v3;
	public mytriangle(int x1,int y1,int x2, int y2,int x3,int y3){
		v1=new mypointclass(x1,y1);
		v2=new mypointclass(x2,y2);
		v3=new mypointclass(x3,y3);
		
	}
	public mytriangle(mypointclass t1,mypointclass t2,mypointclass t3){
		v1=t1;
		v2=t2;
		v3=t3;
	}
	public double perimeter(){
		double d1=v1.distance(v2);
		double d2=v2.distance(v3);
		double d3=v3.distance(v1);
		return d1+d2+d3;
	}
	public String gettype(){
		double d1=v1.distance(v2);
		double d2=v2.distance(v3);
		double d3=v3.distance(v1);
		if(d1==d2 && d2==d3 && d3==d1){
			return "Isosclaes";
			
		}
		else if(d1==d2 || d2==d3 || d3==d1){
			return "equilateral";
		}
		else{
			return "scalene";
		}
	}

}
