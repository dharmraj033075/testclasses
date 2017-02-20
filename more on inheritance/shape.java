package dharm;

public abstract class shape {
	protected String color;
	protected boolean filled;
	public shape(){
		color="red";
		filled=true;
	}
	public shape(String color,boolean filled){
		this.color=color;
		this.filled=filled;
	}
	public String getcolor(){
		return color;
	}
	public boolean isfilled(){
		return filled;
	}
	public abstract double getarea();
	public abstract double getperimeter();
	
	

}
