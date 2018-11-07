/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardabugravizecalisma;

/**
 *
 * @author tuhanan
 */
public class HelloWorld {
    public static void main(String[] args){
        	System.out.print("Merhaba Dünya\n");
		System.out.printf("%d kere Merhaba Dünya 2\n", 10);
		System.out.println("Merhaba Dünya 3");
		System.out.printf("%30.5s\n","merhaba");
		//5 karakterlik yer ayır, sağdan 2. karakterden itibaren yaz
		System.out.printf("%1$s\n","deneme","iki","üç","dört");
		System.out.printf("%2$d\n",111,222,333,444,555);
		// n. değişkeni yazdırmak için %n$(s|d|f|...)
		System.out.printf("%2$10.7S\n","merhaba","dünya","naber","nasılsın");
		// %s = Olduğu gibi yaz
		// %S = Hepsini büyük harfe çevirip yaz
                
                ///////////////////////////////////////////////////////////////7
                String s1 = "Merhaba";
		String s2 = "Arda";
		String s3 = s1 + " " + s2;
		System.out.println(s3);
    }
}
