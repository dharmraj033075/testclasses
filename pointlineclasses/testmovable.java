package dharm;

public class testmovable {
	public static void main(String[] args){
		movable m1=new movablepoint(5,6,10,12);
		System.out.println(m1);
		m1.moveleft();
		movable m2=new movablecircle(1,2,3,5,6);
		System.out.println(m2);
		m2.moveright();
		movablepoint m3=new movablepoint(5,6,10,12);
		m3.moveleft();
		System.out.println(m3);
		
		
	}
	
	

}
