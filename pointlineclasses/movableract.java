package dharm;

public class movableract implements movable{
	private movablepoint l1;
	private movablepoint l2;
	public movableract(int x1,int y1,int x2,int y2,int xspeed,int yspeed){
		l1=new movablepoint(x1,y1,xspeed,yspeed);
		l2=new movablepoint(x2,y2,xspeed,yspeed);
	}
	public void moveup(){
		l1.y-=l1.yspeed;
		l2.y-=l2.yspeed;
	}
	public void movedown(){
		l1.y+=l1.yspeed;
		l2.y+=l2.yspeed;
	}
	public void moveright(){
		l1.x+=l1.xspeed;
		l2.y+=l2.xspeed;
	}
	public void moveleft(){
		l1.y+=l1.xspeed;
		l2.y+=l2.xspeed;
	}

}
