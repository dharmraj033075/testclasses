package dharm;

public class testball {
	public static void main(String[] args){
		ball Ball=new ball(50,50,5,10,30);
		container c=new container(0,0,100,100);
		Ball.move();
		System.out.println(c.collide(Ball));
	}

}
