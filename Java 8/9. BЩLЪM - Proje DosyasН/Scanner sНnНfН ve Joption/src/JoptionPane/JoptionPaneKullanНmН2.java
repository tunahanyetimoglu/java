package JoptionPane;

import java.util.Random;

import javax.swing.JOptionPane;

public class JoptionPaneKullan�m�2 
{
	public static void main(String[] args) 
	{
		Random r=new Random();
		int sayi=r.nextInt(20);
		int tahminsayisi=1;
		while(true)
		{
			String tahmin=JOptionPane.showInputDialog("Tahmin girin");
			int tahmin2=Integer.parseInt(tahmin);
			
			if(tahmin2==sayi)
			{
				String mesaj= tahminsayisi + ". tahminde bildiniz";
				JOptionPane.showMessageDialog(null, mesaj,"Do�ru bildiniz",JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			else if(tahmin2>sayi)
			{
				JOptionPane.showMessageDialog(null,"tahmininiz fazla oldu.biraz a�a�� inin");
				tahminsayisi++;
			}
			else if(tahmin2<sayi)
			{
				JOptionPane.showMessageDialog(null,"tahmininiz az oldu.biraz yukar� ��k�n");
				tahminsayisi++;
			}
			
		}
	}

}
