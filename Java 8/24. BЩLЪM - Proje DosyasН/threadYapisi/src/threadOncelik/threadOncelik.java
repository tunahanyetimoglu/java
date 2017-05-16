package threadOncelik;

public class threadOncelik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadOrnek t1 = new threadOrnek("t1");
		t1.setPriority(Thread.MAX_PRIORITY);
		threadOrnek t2 = new threadOrnek("t2");
		t2.setPriority(Thread.MIN_PRIORITY);
		threadOrnek t3 = new threadOrnek("t3");
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}

}

class threadOrnek extends Thread{
	
	public threadOrnek(String isim) {
		super(isim);
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}