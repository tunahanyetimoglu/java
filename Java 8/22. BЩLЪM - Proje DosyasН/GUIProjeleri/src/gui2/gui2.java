package gui2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JSpinner;

public class gui2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtTah1;
	private JTextField txtTah2;
	private JLabel lblYak;
	static int a;
	int k;
	private JLabel lblYak2;
	String m = "";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Random r = new Random();
					a = r.nextInt(100);
					gui2 frame = new gui2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gui2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblYak = new JLabel("Yakla\u015F\u0131m : ");
		contentPane.add(lblYak);
		
		lblYak2 = new JLabel("Yakla\u015F\u0131m 2 : ");
		contentPane.add(lblYak2);
		
		txtTah1 = new JTextField();
		contentPane.add(txtTah1);
		txtTah1.setColumns(10);
		
		txtTah2 = new JTextField();
		contentPane.add(txtTah2);
		txtTah2.setColumns(10);
		
		JButton btnTah = new JButton("Tahmin");
		btnTah.setActionCommand("Tahmin");
		btnTah.addActionListener(this);
		contentPane.add(btnTah);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int i;
		int j;
		k++;
		m = e.getActionCommand();
		
		i = Integer.valueOf(txtTah1.getText());
		j = Integer.valueOf(txtTah2.getText());
		
		if(i==a){
			lblYak.setText("Tebrikler buldunuz. Tahmin sayýsý : " + k);
		}
		else if(i<a){
			lblYak.setText("Tahmininiz daha küçük. Tahmin sayýsý : " + k);
		}
		else if(i>a){
			lblYak.setText("Tahmininiz daha büyük. Tahmin sayýsý : " + k);
		}
		
		if(j==a){
			lblYak2.setText("Tebrikler buldunuz. Tahmin sayýsý : " + k);
		}
		else if(j<a){
			lblYak2.setText("Tahmininiz daha küçük. Tahmin sayýsý : " + k);
		}
		else if(j>a){
			lblYak2.setText("Tahmininiz daha büyük. Tahmin sayýsý : " + k);
		}
		
		System.out.println(m);
	}

}
