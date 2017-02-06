package dharm;

public class line extends point {
	 point end;
	 public line(int bx,int by,int ex, int ey){
		 super(bx, by);
		 this.end=new point(ex,ey);
	 }
	 public line(point begin,point end1){
		 super(begin.getx(),begin.gety());
		 this.end=end1;
	 }
	public point getbegin(){
		return new point(super.getx(),super.gety());
	}
	// starting point will be accessed by super and end point it self given 
   // here learning things are we can inherit the one class and atleast one object of that class we can start and others we can define in compositions we have to define both point objects 
}
