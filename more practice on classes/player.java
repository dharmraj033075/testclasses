package dharm;

public class player {
	int number;
	private double x;
	private double y;
	private double z=0.0;
	public player(double x,double y,double z){
		this.x=x;this.y=y;this.z=z;
	}
	public void move(double xdisp,double ydisp){
		x=x+xdisp;
		y=y+ydisp;
	}
	public void jump(double zdisp){
		z=zdisp;
	}
	public boolean near(ball1 Ball){
		double distance;
		distance=(Ball.getx()-this.x)*(Ball.getx()-this.x)+(Ball.getx()-this.x)*(Ball.getx()-this.x)+(Ball.gety()-this.y)*(Ball.getz()-this.z);
		if(distance<8){
			return true;
		}
		else{
			return false;
		}
	
	}
	public void kick(ball1 Ball){
		if(near(Ball)){
			System.out.println("kick the ball");
		}
	}

	

}
