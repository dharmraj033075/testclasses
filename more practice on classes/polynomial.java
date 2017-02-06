package dharm;

import java.lang.reflect.Array;

public class polynomial {
	double[] coeff;
	int degree;
	public polynomial(double... t){
		coeff=t;
		degree=Array.getLength(coeff);
	}
	public int getdegree(){
		return (Array.getLength(coeff)-1);
	}
	public double evaluate(double x){
		return add(x);
	}
	public double add(double x){
		double sum1=0;
		for(int i=1;i<=degree;i++){
			
			sum1=coeff[0]+sum1+coeff[i]*multiply(x,i);
		}
		return sum1;
		
	}
	public double multiply(double x, int p){
		double sum=0;
		for(int j=1;j<=p;j++){
			sum=sum+x*x;
		}
		return sum;
	}
	

}
