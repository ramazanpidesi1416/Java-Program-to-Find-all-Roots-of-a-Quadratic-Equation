package example;

import java.util.Scanner;

public class example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
	System.out.println("x^2 kareli terimin katsay�s�n� giriniz: ");
	double a=input.nextDouble();
	System.out.println("x'li terimin ba�katsay�s�n� giriniz");
	double b=input.nextDouble();
	System.out.println("sabit say�n�n de�erini giriniz");
	double c=input.nextDouble();
	
	double delta=(b*b)-(4*a*c);
	
	if(delta>0) {
		System.out.println("denklemin iki k�k� vard�r");
		double x1=(-b+Math.sqrt(delta))/(2*a);
		double x2=(-b-Math.sqrt(delta)/(2*a));
		System.out.println("denklemin k�kleri �unlard�r ("+x1+" , "+x2+")");
		}
	else if(delta==0) {
		System.out.println("denklem �ift k�kl�d�r o y�zden tek k�k� vard�r");
		double x1=(-b+Math.sqrt(delta))/(2*a);
		System.out.println("denklemin k�k� �udur ("+x1+")");
		}
	
	
	else {
		System.out.println("denklemin ger�ek k�k� yoktur");
		double reel =(-b)/(2*a);
		double imaginery=(Math.sqrt(-delta)/(2*a));
		System.out.printf("denklemin irrasyonel birinci k�k�: %.4f-%.4fi %n",reel,imaginery);
		System.out.printf("denklemin irrasyonel ikinci k�k�: %.4f+%.4fi ",reel,imaginery);
		
	}
		
		
		
	
		
		
	}

}
