package JoptionPane;

import javax.swing.JOptionPane;

public class JOptionPaneKullanýmý 
{
	public static void main(String[] args) 
	{
		String girilen=JOptionPane.showInputDialog("ilk sayýyý girin :");
		int sayi1=Integer.valueOf(girilen);
		String girilen2=JOptionPane.showInputDialog("ikinci sayýyý girin :");
		int sayi2=Integer.valueOf(girilen2);
		int toplam=0;
		for(int i=sayi1; i<=sayi2; i++)
		{
			toplam+=i;
		}
		JOptionPane.showMessageDialog(null, toplam, "Sonuç",JOptionPane.DEFAULT_OPTION);
		
	}

}
