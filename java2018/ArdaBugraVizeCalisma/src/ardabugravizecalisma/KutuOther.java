/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardabugravizecalisma;

import java.util.Scanner;

/**
 *
 * @author tuhanan
 */



// class Hesap1
//	{
//		public static double Hacim1(double a,double b, double c)
//		{
//			return (a*b*c);
//		}
//	}
//class Hesap2
//	{
//		public double Hacim2(KutuOther m)
//		{
//			return (m.x*m.y*m.z);
//		}
//	}
public class KutuOther {
    	double x,y,z;
        
	public static class Hesap1
	{
		public static double Hacim1(double a,double b, double c)
		{
			return (a*b*c);
		}
	}
	public static class Hesap2
	{
		public  double Hacim2(KutuOther m)
		{
			return (m.x*m.y*m.z);
		}
	}
        
	public static void main(String [] args)
	{
		KutuOther k = new KutuOther();
		Scanner giris = new Scanner(System.in);
		double h1,h2;
		System.out.println("1.degeri giriniz :"); k.x=giris.nextDouble();
		System.out.println("2.degeri giriniz :"); k.y=giris.nextDouble();
		System.out.println("3.degeri giriniz :"); k.z=giris.nextDouble();
		h1=Hesap1.Hacim1(k.x, k.y, k.z);
		Hesap2 n = new Hesap2();
                    h2=n.Hacim2(k);
		System.out.printf("Hesap1 = %2.1f \nHesap2 = %2.1f\n",h1,h2);
	}
}
