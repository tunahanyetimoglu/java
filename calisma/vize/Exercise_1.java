public class Exercise_1{
  int deger1;
   public Exercise_1(){
       deger1 = 10;
   }
   public Exercise_1(int sayi){
        deger1 = sayi;
   }


  public static void main(String args[]){
      Exercise_1 nesne1 = new Exercise_1();
			Exercise_1 nesne2 = new Exercise_1(20);
      System.out.println("Nesne1 : "+ nesne1.deger1);
			System.out.println("Nesne2 : "+ nesne2.deger1);
  }}
