package dharm;

public class square extends ractangle{
	public square(){
		super();
	}
	public square(double side){
		super.setwidth(side);
		super.setlength(side);
		
	}
	public square(double side, String color,boolean filled){
		super.setlength(side);
		
				
	}
	public void setwidth(double width){
		super.setwidth(width);
	}
	public void setlength(double length){
		super.setlength(length);
	}
	

}
