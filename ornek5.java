import java.awt.*;
import javax.swing.*;

public class ornek5 {
	public static void main(String[] args){
		JTextField password,username;
		password = new JTextField(10);
		username = new JTextField(10);
		JFrame c = new JFrame("Þifre Ekraný");
		c.setLayout(new GridLayout(2,2));
		c.add(new JLabel("Kullancý adý : "));
		c.add(username);
		c.add(new JLabel("Þifre:"));
		c.add(password);
		
		c.setVisible(true);
		c.pack();      
	  //c.setSize(3000,200);   packten sonra kullanýlýrsa boyutu deðiþtirir.
		
	}
}
