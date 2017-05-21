
public class Hash {
	
	public static int f(int x){
	if(x==10) return 10;
	System.out.println("x:"+x);
		return f(x+1)+x;
	
	}
  
  
	
  public static void main(String[] args){
	  System.out.println("f(0)" + f(0));
	  /*
	  //Rekürsif ile fibonacci
	  int toplam = 0;
	  for(int i=0;i<10;i++){
		  toplam += i+1;
		  System.out.println("toplam: " +toplam + "i: " + i);
		  
	  }
	    System.out.println(toplam);  
	  
	  
	  
	  //Diziler ile fibonacci
	  /*
	  int fib [] = new int[10];
	  fib[0] = 1;
	  fib[1] = 1;
	  for(int i=0 ; i<8 ; i++){
		  fib[i+2] = fib[i+1] + fib[i];
		  
	  }
	  for(int i=0; i<10; i++){
		  System.out.println(fib[i]);
	  }
	  //Döngüler ile fibonacci
	 int x =1;
	  int y =1;
	  int sonuc;
	  System.out.println(x);
	  System.out.println(y);
	  
	  for(int i=0; i<10;i++){
		  sonuc = x+y;
		  x = y;
		  y= sonuc;
		  System.out.println(sonuc);
		  
	  }*/
  
  }
  }

