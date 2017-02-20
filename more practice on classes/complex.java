package dharm;

public class complex {
	int real;
	int img;
	public complex(){
		real=0;
		img=0;
	}
	public complex(int real1,int img1){
		real=real1;
		img=img1;
	}
	public int getreal(){
		return real;
	}
	public int getimg(){
		return img;
	}
	
	public void setimg(int setimg1){
		img=setimg1;
	}
	public void setvalue(int real1,int img1){
		real=real1;
		img=img1;
	}

	public boolean equals(int real1,int img1){
		if(this.real==real1 && this.img==img1){
			return true;
		}
		else{
			return false;
		}
	}
		
	public boolean equals(complex t1){
		if(this.equals(t1.real, t1.img)){
			return true;
		}
		else {
			return false;
		}
	}
	public void mycomplex1(){
		System.out.println("this is  %d + i %d",real,img);
	}
	public complex add(complex right){
		this.real=this.real+right.real;
		this.img=this.img+right.img;
		return this;
	}
	public complex subtract(complex right){
		this.real=this.real-right.real;
		this.img=this.img-right.img;
		return this;
	} 
	public complex divide(complex right){
		this.real=this.real/right.real;
		this.img=this.img/right.img;
		return this;
	}
	public complex multiply(complex right){
		this.real=this.real*right.real;
		this.img=this.img*right.img;
		System.out.println(this.real);
		return this;
	}
	public complex addnew(complex right){
		complex t2=new complex(this.real+right.real,this.img+right.img);
		
		System.out.println(this.real);
		return t2;
	} 
	public complex subtractnew(complex right){
		complex t2=new complex(this.real-right.real,this.img-right.img);
		return t2;
	} 
	public complex conjugate(complex right){
		return(new complex(right.real,-right.img));
	}
	
	
	

}
