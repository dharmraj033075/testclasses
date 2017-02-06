package dharm;

public class test1 {
	public static void main(String[] args){
		mypointclass[] p1=new mypointclass[10];
		for(int i=0;i<=9;i++){
			p1[i]=new mypointclass(1+i,1+i);
		}
		mypointclass p3=new mypointclass(4,4);
		for(int i=0;i<=9;i++){
			System.out.println(p3.distance(p1[i]));
		}
		mypointclass obj=new mypointclass(1,1);
		System.out.println(obj.getx());
		obj.setxy(3, 3);
		System.out.println(obj.getxy()[0]);
		System.out.println(obj.getxy()[1]);
		mypointclass p2=new mypointclass(5,5);
		System.out.println(obj.distance(p2));
		System.out.println(obj.distance(6, 6));
		System.out.println(p2.distance(obj));
		circle ob1=new circle(p3,1);
		circle ob2=new circle(new mypointclass(3,3),2);
		System.out.println(ob1.distance(ob2));
		System.out.println(ob2.getcenter().distance(2,2));
		System.out.println(ob1.getarea());
		

		
		mytriangle tr1=new mytriangle(0,0,0,1,1,0);
		mytriangle tr2=new mytriangle(p1[0],p1[1],p1[2]);
		System.out.println(tr1.gettype());
		System.out.println(tr2.perimeter());
		
		
	
	}
	

}
