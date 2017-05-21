interface Arayuz1 {
  public void a1();
}

interface Arayuz2 {
  public void a2();
}

interface Arayuz3 extends Arayuz1{
   public void a3();
}

abstract class Soyut1{
  public abstract void s1();
}

class A extends Soyut1 implements Arayuz3,Arayuz2{
  public void a1(){
    System.out.println("A.a1();");
  }
  public void a2(){
    System.out.println("A.a2();");
  }
  public void s1(){
    System.out.println("A.s1();");
  }
  public void a3(){
    System.out.println("A.a3();");
}

public class pazarlamaci{
  public static void main(String args[]){
    Soyut1 soyut_1 = new A();
//  Soyut1 nesne_2 = new Soyut1();  HATA!!
//  Arayuz1 nesne  = new Arayuz1();  HATA!!
    Arayuz1 arayuz_1 = (Arayuz1) soyut_1;
    Arayuz2 arayuz_2 = (Arayuz2) soyut_1;
    soyut_1.s1();
//  soyut_1.a1();  HATA!!! 
    arayuz_1.a1();
		arayuz_2.a2();
//	arayuz_1.a3(); İNCELE
		arayuz_1.a3();
//  arayuz_1.a2(); HATA!!
}}
    
