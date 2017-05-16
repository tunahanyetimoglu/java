package yeniHata;

public class yeniHata extends Exception {

	private int a;
	private int b;
	String hataMetni = 	"Sayý belirtilen deðerin üstünde ";
	
	public yeniHata(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public String toString(){
		return hataMetni + a + " " + b;
	}
}
