public class Exercise_2{
	static int sayi=0;
  public Exercise_2(){
    sayi++;
    System.out.println("Nesne Oluşturuldu");
  }

  
public static void dongu(Exercise_2 nesne[]){
      System.out.println("dongu metodu başlatıldı");
   for(int i=0;i <4;i++){
        nesne[i] = new Exercise_2();
        System.out.println("----Döngü----");
}
}

  public static void main(String args[]){
       Exercise_2 nesne[] = new Exercise_2[4];
      Exercise_2.dongu(nesne);
      System.out.println(sayi+"nesne oluşturuldu");
}}

