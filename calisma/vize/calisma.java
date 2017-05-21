class alisma{
   private void kasa(){
   System.out.println("Gizli kasa");
  }
   private String belge = "gizli belge";
   protected void bilgisayar(){
      System.out.println("Bilgisayar metodu");
}
   protected String fatura = "Fatura";
}

class gosterme extends alisma{
  }

public class calisma{

  public static void main(String args[]){
    alisma a = new alisma();
    gosterme b = new gosterme();
    System.out.println(b.fatura);
		b.kasa();
  	//System.out.println(a.belge);
    a.bilgisayar();
		System.out.println(a.fatura);
}}    
