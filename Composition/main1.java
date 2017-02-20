package dharm;

public class main1 {
	public static void main(String[] args){
		author[] authors=new author[2];
		authors[0]=new author("vik","sa@sdf.com","M");
		authors[1]=new author("mark johnson","love@secrets","M");
		
		
		book newbook=new book("leaves",authors,19.85,2);
		System.out.println(newbook.getauthor(0).getemail());
		System.out.println(newbook.getauthor(0).getname());
		System.out.println(newbook.getauthor(1).getname());
		System.out.println(newbook.getauthor(1).getemail());
		System.out.println(newbook.getname());
		System.out.println(newbook.getprice());
		System.out.println(newbook.getqty());
		
		
	}

	
}
