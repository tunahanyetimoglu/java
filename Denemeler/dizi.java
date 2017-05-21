import java.util.Scanner;
public class dizi{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    System.out.println("Fibonacci adım sayısını giriniz.");
    int adim = sc.nextInt();
    int[] dizi = new int[adim];	
		int sayi1=1;
		int sayi2=1;
		int temp;
		int tekrar=1;
    System.out.println("Fibonacci Serisi:");
		System.out.print(sayi1+"\t");
		for(int i=1;i<adim;i++){
      temp=sayi2;
			sayi2=sayi1+sayi2;
      sayi1=temp;
			dizi[i]=temp;
			tekrar++;
		//System.out.println("sayi1:"+sayi1);
		//System.out.println("sayi2:"+sayi2);
		System.out.print(temp+"\t");
		}
		System.out.println("\n Adım sayısı :"+tekrar);
  }
}
