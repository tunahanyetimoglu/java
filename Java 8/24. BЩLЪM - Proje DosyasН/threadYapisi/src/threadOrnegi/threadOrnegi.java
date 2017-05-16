package threadOrnegi;

public class threadOrnegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadKalitim tk = new threadKalitim("tk");
		threadRunnable tr = new threadRunnable();
	}

}

class threadKalitim extends Thread{
	
	public threadKalitim(String isim) {
		super(isim);
		start();
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}

class threadRunnable implements Runnable{
	Thread kanal;
	
	public threadRunnable() {
		kanal = new Thread(this);
		kanal.start();
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}


/* start()
 * stop()
 * sleep(long)
 * yield()
 * join()
 * setPriotry(int öncelik)
 * isAlive()
 */