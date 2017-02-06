package dharm;

public class feature {
	private String name;
	private String size;
	public feature(){
		name="s";
		size="chota";
	}
	public feature(String name,String size){
		this.name=name;
		this.size=size;
	}
	public void getnamesize(){
		System.out.println(name+size);
	}

}
