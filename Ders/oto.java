import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class oto extends JPanel{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Otomobil özellikleri");
		frame.setLayout(new FlowLayout());
		JCheckBox oto1 = new JCheckBox("ABS");
		oto1.setSelected(true);
		JCheckBox oto2 = new JCheckBox("Klima");
		JCheckBox oto3 = new JCheckBox("CD çalar");
		JCheckBox oto4 = new JCheckBox("Hava Yastýðý");
		oto4.setSelected(true);
		
		frame.add(oto1);
		frame.add(oto2);
		frame.add(oto3);
		frame.add(oto4);
		
	}
}
