import java.util.Scanner;

   public class aylar{
   	public static void main(String[] args){
   		System.out.println("1-12 arasinda bir sayi giriniz: ");
   		Scanner a = new Scanner(System.in);
   		int x = a.nextInt();

   		 switch(x){
   		 	case 1 :
   		 	  System.out.println("Ocak Ayi : 31 gun");
   		 	  break;
   		 	case 2:
   		 	  System.out.println("Subat Ayi : 28 gun");
   		 	  break;
   		 	case 3:
   		 	 System.out.println("Mart Ayi : 31 gun");
   		 	 break;
   		 	case 4:
   		 	 System.out.println("Nisan Ayi : 30 gun");
   		 	 break;
   		 	case 5:
   		 	 System.out.println("Mayis Ayi : 31 gun");
   		 	 break;
   		 	case 6:
   		 	 System.out.println("Haziran Ayi : 30 gun");
   		 	 break;
   		 	case 7:
   		 	 System.out.println("Temmuz Ayi : 31 gun");
   		 	 break;
   		 	case 8:
   		 	 System.out.println("Agustos Ayi : 31 gun");
   		 	 break;
   		 	case 9:
   		 	 System.out.println("Eylul Ayi : 30 gun");
   		 	 break;
   		 	case 10:
   		 	 System.out.println("Ekim Ayi : 31 gun");
   		 	 break;
   		 	case 11:
   		 	 System.out.println("Kasim Ayi : 30 gun");
   		 	 break;
   		 	case 12:
   		 	 System.out.println("Aralik Ayi : 31 gun");
   		 	  break;

   		 }


   	}
   }