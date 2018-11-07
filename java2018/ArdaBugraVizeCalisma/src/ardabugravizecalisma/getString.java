/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardabugravizecalisma;
import java.util.Scanner;
/**
 *
 * @author tuhanan
 */
public class getString {

    public static void main(String args[]){
   
        Scanner oku = new Scanner(System.in);   
        System.out.print("Adınız:");       
        String ad = oku.nextLine();
        System.out.print("Yaşınız:");
        int yas = oku.nextInt();
        System.out.printf("Merhaba %s, Demek %d yaşındasın.\nTanıştığımıza memnun oldum ;)\n",ad,yas);
  }
}
