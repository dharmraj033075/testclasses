package dharm;

public class testcylinder {
	public static void main(String[] args){
		shape s1=new circle3(5.5,"greeen",false);//upcasting to shape
		System.out.println(s1.getarea());
		System.out.println(s1.getperimeter());
		circle3 c1=(circle3)s1;//downcast
		System.out.println(c1.getarea());
		//shape s2=new shape(); can't do this coz abstract class cant make objects
		shape s3=new ractangle(1,2,"yellow",false); //upcast
		System.out.println(s3.getperimeter());
		System.out.println(s3.getcolor());
		ractangle r1=(ractangle)s3;//downcast
		//square s4=(square) r1;//downcast r to sqaure 
		//s4.getperimeter();
		//s4.setwidth(5);
		
	}

}
