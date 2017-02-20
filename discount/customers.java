package dharm;

public class customers {
	private String name;
	private boolean member=false;
	private String membertype;
	public customers(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}
	public boolean ismember(){
		return member;
	}
	public void setmemberbool(boolean member){
		this.member=member;
	}
	public String getmembertype(){
		return membertype;
	}
	public void setmember(String membertype1){
		this.membertype=membertype1;
	}


}
