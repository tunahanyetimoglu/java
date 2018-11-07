/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardabugravizecalisma;

import javax.swing.JOptionPane;

/**
 *
 * @author tuhanan
 */
public class switchCase {
    
    public static void main(String[] args){
        String sayi= JOptionPane.showInputDialog(null,"Merak ettiginiz ay numarasını giriniz :");
		
		int aynumarasi = Integer.parseInt(sayi);
		
		switch (aynumarasi) 
		{
		case 1:JOptionPane.showMessageDialog(null,"Ocak","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 2:JOptionPane.showMessageDialog(null,"Şubat","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 3:JOptionPane.showMessageDialog(null,"Mart","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 4:JOptionPane.showMessageDialog(null,"Nisan","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 5:JOptionPane.showMessageDialog(null,"Mayıs","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 6:JOptionPane.showMessageDialog(null,"Haziran","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 7:JOptionPane.showMessageDialog(null,"Temmuz","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 8:JOptionPane.showMessageDialog(null,"Agustos","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 9:JOptionPane.showMessageDialog(null,"Eylul","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 10:JOptionPane.showMessageDialog(null,"Ekim","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 11:JOptionPane.showMessageDialog(null,"Kasım","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 12:JOptionPane.showMessageDialog(null,"Aralık","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		
		default:System.out.println("Bir yıl 12 aydan oluşmaktadır.");break;
		}

    }
 
   	
}
