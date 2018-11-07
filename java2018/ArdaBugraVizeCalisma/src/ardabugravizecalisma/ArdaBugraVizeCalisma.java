/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardabugravizecalisma;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author tuhanan
 */
public class ArdaBugraVizeCalisma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        ///////////////////////////////
        Kutu k1 = new Kutu();
        Kutu k2 = new Kutu();   
        k1.x = 5.0;
        k1.y = 4.0;
        k1.z = 8.0;
	k2.x = 4.5;k2.y = 4.5;k2.z =4.5;
	k2.kirilir=true;k2.taban_kodu=1;
        
	System.out.println("1. Kutunun hacmi:"+(k1.x*k1.y*k1.z)+" santimetrekup.");
	System.out.println("2. Kutunun hacmi:"+(k2.x*k2.y*k2.z)+" santimetrekup.");
           
    }
    
}
