package threadSenkron;

public class threadSenkron {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadOrnek t1 = new threadOrnek(2, 3, "t1");
		threadOrnek t2 = new threadOrnek(2, 4, "t2");
		threadOrnek t3 = new threadOrnek(2, 5, "t3");
	}

}

class threadOrnek extends Thread{
	private int sayi1,sayi2;
	
	public threadOrnek(int sayi1,int sayi2,String isim) {
		super(isim);
		start();
		this.sayi1 = sayi1;
		this.sayi2 = sayi2;
	}

	public void toplama(){
		sayi1 = sayi1 + sayi2;
		System.out.println(Thread.currentThread().getName() + "Toplam :" + sayi1);
	}
	
	public void run(){
		toplama();
		
		synchronized (this) {
			sayi1 = (int) Math.pow(sayi1, sayi2);
			System.out.println(Thread.currentThread().getName() + "Kuvvet :" + sayi1);
		}
		//senkron();
	}
	
//	public synchronized void senkron(){
//		sayi1 = (int) Math.pow(sayi1, sayi2);
//		System.out.println("Kuvvet :" + sayi1);
//	}
}