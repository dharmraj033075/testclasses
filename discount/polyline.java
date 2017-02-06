package dharm;
import java.util.*;

public class polyline {
	List <points> list;
	public polyline(){
		list=new LinkedList<points>();
	}
	public polyline(List<points> l){
		this.list=l;
	}
	public void appendpoint(int x,int y){
		list.add(new points(x,y));
	}
	public void appendpoint(points point1){
		list.add(point1);
	}
	public String toString(){
		return "different points";
	}
	public double getlength1(){
		return list.size();
	}

}
