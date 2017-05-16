package gui1;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class gui extends JFrame {

	public static void main(String args[]){
		gui g = new gui();
	}
	
	gui(){
		super("GUI Projemiz 1");
		this.setSize(300, 400);
		this.setAlwaysOnTop(true);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		c.add(new JLabel("Merhaba GUI"));
		c.add(new JLabel("Bu ilk GUI Projemizdi."));
		c.add(new JLabel("Bu metin bir alt satýrda olmalý."));
	}
}
