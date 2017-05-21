public class ornek{
  String isim;
  String isim2;
  public ornek(String isim){
      this(isim, "Kirazli");
   }
   public ornek(String isim , String isim2){
     System.out.println(isim +""+isim2);
   }


 public static void main(String[] args){
     ornek a = new ornek("Ahmet");
     ornek s = new ornek("ahmet","mehmet");
  }}
