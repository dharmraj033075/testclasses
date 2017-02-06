package dharm;

import java.util.Scanner;

public class test4 {
	public static void main(String [] args){
		Scanner reader=new Scanner(System.in);
		System.out.println("your two numbers for complex number1");
		int x=reader.nextInt();
		int y=reader.nextInt();
		complex c1=new complex(x,y);
		System.out.println("your two numbers for complex number2");
		int x1=reader.nextInt();
		int y1=reader.nextInt();
		complex c2=new complex(x1,y1);
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1));
		System.out.println(c1.equals(reader.nextInt(), reader.nextInt()));
		System.out.println((c1.add(c2)).img);
		System.out.println(c1.addnew(c2).real);
		
		
		
	}


}
