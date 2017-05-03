import java.awt.*;
import javax.swing.*;


public class ilk extends JFrame {
	 public ilk(){
		 this.setTitle("FrameDemo Test");     //metodun pencere baþlýðý
		 this.setSize(640,480);          // pencere boyutu   -- Varsayýlaný (0,0);
		 this.setLayout(null);          // metodu pencere yerleþim düzenini ayarlar
		 this.setVisible(true);          //Görünürlük   -- Varsayýlaný falsedur. TRUE YAPILCAK!!!
		 
		        JButton buton1 = new JButton("Buton 1");
		        this.add(buton1);                       // veya this.getContentPane().add(buton1);
	        //  buton1.setBounds(10,20,100,40);
		        buton1.setBounds(100,100,100,100);        // setBounds(x,y,width,height)
		 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // metodu ise varsayýlan pencere kapanýþ davranýþýný ayarlar.
	 }
	public static void main(String[] a){
		new ilk();
		
		JFrame pencere = new JFrame();
		JButton button2 = new JButton("Buton 2");
		pencere.setSize(640,480);
		pencere.setLayout(null);
		pencere.add(button2);
		button2.setBounds(50,50,50,50);
		pencere.setVisible(true);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}