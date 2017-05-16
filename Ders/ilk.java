import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ilk extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfToplanan;
	private JTextField tfToplanan2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ilk frame = new ilk();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ilk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTopla = new JButton("Topla");
		btnTopla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		btnTopla.setBounds(166, 136, 89, 23);
		contentPane.add(btnTopla);
		
		tfToplanan = new JTextField();
		tfToplanan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tfToplanan.setBounds(169, 44, 86, 20);
		contentPane.add(tfToplanan);
		tfToplanan.setColumns(10);
		
		tfToplanan2 = new JTextField();
		tfToplanan2.setBounds(169, 94, 86, 20);
		contentPane.add(tfToplanan2);
		tfToplanan2.setColumns(10);
		
		JPanel sonuc = new JPanel();
		sonuc.setBounds(166, 196, 89, 33);
		contentPane.add(sonuc);
		
		

	}
}
