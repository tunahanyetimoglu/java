package threadDurBekle;

public class threadDurBekle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			threadOrnek tO1 = new threadOrnek("t1", 3);
				tO1.sleep(5000);
			threadOrnek tO2 = new threadOrnek("t2", 2);
				tO2.stop();
			threadOrnek tO3 = new threadOrnek("t3", 4);
				tO3.join();
			threadOrnek tO4 = new threadOrnek("t4", 3);
				tO4.yield();
			System.out.println(tO2.isAlive());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

class threadOrnek extends Thread {
	private String s;
	private int k;
	
	public threadOrnek(String s,int k) {
		super();
		start();
		this.s = s;
		this.k = k;
	}
	
	public void run(){
		for(int i = 1;i<=k;i++)
			System.out.print(s + " ");
	}
}