package JoptionPane;

import javax.swing.JOptionPane;

public class JOptionPaneKullan�m� 
{
	public static void main(String[] args) 
	{
		String girilen=JOptionPane.showInputDialog("ilk say�y� girin :");
		int sayi1=Integer.valueOf(girilen);
		String girilen2=JOptionPane.showInputDialog("ikinci say�y� girin :");
		int sayi2=Integer.valueOf(girilen2);
		int toplam=0;
		for(int i=sayi1; i<=sayi2; i++)
		{
			toplam+=i;
		}
		JOptionPane.showMessageDialog(null, toplam, "Sonu�",JOptionPane.DEFAULT_OPTION);
		
	}

}
