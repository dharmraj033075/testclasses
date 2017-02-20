package dharm;

public class container {
	int x1,y1,x2,y2;
	public container(int x,int y,int width,int height){
		x1=x;
		y1=y;
		x2=x+width-1;
		y2=y+width-1;
	}
	public boolean collide(ball Ball){
		if(Ball.x-(double)Ball.radius<=this.x1 || Ball.x-Ball.radius>=this.x2){
			Ball.reflectver();
			return true;
		}
		else {
			return false;
		}
	}
	

}
