package example;

import java.util.Scanner;

public class example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
	System.out.println("x^2 kareli terimin katsayýsýný giriniz: ");
	double a=input.nextDouble();
	System.out.println("x'li terimin baþkatsayýsýný giriniz");
	double b=input.nextDouble();
	System.out.println("sabit sayýnýn deðerini giriniz");
	double c=input.nextDouble();
	
	double delta=(b*b)-(4*a*c);
	
	if(delta>0) {
		System.out.println("denklemin iki kökü vardýr");
		double x1=(-b+Math.sqrt(delta))/(2*a);
		double x2=(-b-Math.sqrt(delta)/(2*a));
		System.out.println("denklemin kökleri þunlardýr ("+x1+" , "+x2+")");
		}
	else if(delta==0) {
		System.out.println("denklem çift köklüdür o yüzden tek kökü vardýr");
		double x1=(-b+Math.sqrt(delta))/(2*a);
		System.out.println("denklemin kökü þudur ("+x1+")");
		}
	
	
	else {
		System.out.println("denklemin gerçek kökü yoktur");
		double reel =(-b)/(2*a);
		double imaginery=(Math.sqrt(-delta)/(2*a));
		System.out.printf("denklemin irrasyonel birinci kökü: %.4f-%.4fi %n",reel,imaginery);
		System.out.printf("denklemin irrasyonel ikinci kökü: %.4f+%.4fi ",reel,imaginery);
		
	}
		
		
		
	
		
		
	}

}
