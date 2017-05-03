import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main extends JFrame implements ActionListener {

	public static void main(String[] arg) {
		Main als = new Main();
		als.setVisible(true);
		als.setDefaultCloseOperation(als.EXIT_ON_CLOSE);
	}
	
	JButton btn1;
	JTextField yazi;
	
	public Main() {
		setLayout(new FlowLayout());

		JLabel userName = new JLabel("Kullanýcý Adý:");
	    userName.setBounds(20, 20, 100, 20);
        JTextField txt_userName = new JTextField();
        txt_userName.setBounds(120, 20, 150, 20);
        JLabel lbl_password = new JLabel("Þifre :");
        lbl_password.setBounds(20, 50, 100, 20);
        JPasswordField passF_password = new JPasswordField();
        passF_password.setBounds(120, 50, 150, 20);
		
		btn1 = new JButton("buton-1");
		add(btn1);
		btn1.addActionListener(this);

		
	    
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("butona tiklandi");
	}
}