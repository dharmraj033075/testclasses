package dharm;

public class author {
	private String name;
	private String email;
	private String gender;
	public author(String name1,String email1,String gender1){
		name=name1;
		email=email1;
		gender=gender1;
	}
	public String getname(){
		return name;
	}
	public String getemail(){
		return email;
	}
	public char getgender(){
		return gender;
	}
	public void setemail(String email2){
		email=email2;
		System.out.println(email);
	}

}
