package dharm;

public class movablecircle implements movable{
	private movablepoint center;
	private int radius;
	public movablecircle(int x,int y,int xspeed,int yspeed,int radius){
		center=new movablepoint(x,y,xspeed,yspeed);
		this.radius=radius;
	}
	public void moveup(){
		center.y-=center.yspeed;
	}
	public void movedown(){
		center.y+=center.yspeed;
	}
	public void moveleft(){
		center.x-=center.xspeed;
	}
	public void moveright(){
		center.x+=center.xspeed;
	}

}
