package dharm;

public class movablepoint implements movable{
	int x,y,xspeed,yspeed;
	public movablepoint(int x,int y,int xspeed,int yspeed){
		this.x=x;this.y=y;this.xspeed=xspeed;this.yspeed=yspeed;
		
	}
	public void moveup(){
		y=y-yspeed;
	}
	public void movedown(){
		y=y+yspeed;
	}
	public void moveleft(){
		x=x-xspeed;
	}
	public void moveright(){
		x=x+xspeed;
	}
	public String toString(){
		return "point class";
	}
	
	

}
