package gui3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;

public class gui3 extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JTextField txtMet;
	private JCheckBox chckIta;
	private JCheckBox chckKal;
	private JRadioButton rdSay1;
	private JRadioButton rdSay2;
	private JRadioButton rdSay3;
	private JComboBox cRenk;
	private JToggleButton tgBtn;
	int a,b;
	Color c;
	private ButtonGroup btnGp = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui3 frame = new gui3();
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
	public gui3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 90, 0, 125, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		chckKal = new JCheckBox("Kal\u0131n");
		GridBagConstraints gbc_chckKal = new GridBagConstraints();
		gbc_chckKal.insets = new Insets(0, 0, 5, 5);
		gbc_chckKal.gridx = 3;
		gbc_chckKal.gridy = 1;
		contentPane.add(chckKal, gbc_chckKal);
		
		rdSay1 = new JRadioButton("11");
		GridBagConstraints gbc_rdSay1 = new GridBagConstraints();
		gbc_rdSay1.insets = new Insets(0, 0, 5, 5);
		gbc_rdSay1.gridx = 5;
		gbc_rdSay1.gridy = 1;
		contentPane.add(rdSay1, gbc_rdSay1);
		
		txtMet = new JTextField();
		GridBagConstraints gbc_txtMet = new GridBagConstraints();
		gbc_txtMet.gridwidth = 2;
		gbc_txtMet.insets = new Insets(0, 0, 5, 5);
		gbc_txtMet.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMet.gridx = 1;
		gbc_txtMet.gridy = 2;
		contentPane.add(txtMet, gbc_txtMet);
		txtMet.setColumns(10);
		
		rdSay2 = new JRadioButton("12",true);
		GridBagConstraints gbc_rdSay2 = new GridBagConstraints();
		gbc_rdSay2.insets = new Insets(0, 0, 5, 5);
		gbc_rdSay2.gridx = 5;
		gbc_rdSay2.gridy = 2;
		contentPane.add(rdSay2, gbc_rdSay2);
		
		chckIta = new JCheckBox("\u0130talic");
		GridBagConstraints gbc_chckIta = new GridBagConstraints();
		gbc_chckIta.insets = new Insets(0, 0, 5, 5);
		gbc_chckIta.gridx = 3;
		gbc_chckIta.gridy = 3;
		contentPane.add(chckIta, gbc_chckIta);
		
		rdSay3 = new JRadioButton("13");
		GridBagConstraints gbc_rdSay3 = new GridBagConstraints();
		gbc_rdSay3.insets = new Insets(0, 0, 5, 5);
		gbc_rdSay3.gridx = 5;
		gbc_rdSay3.gridy = 3;
		contentPane.add(rdSay3, gbc_rdSay3);
		
		cRenk = new JComboBox();
		GridBagConstraints gbc_cRenk = new GridBagConstraints();
		gbc_cRenk.gridwidth = 3;
		gbc_cRenk.insets = new Insets(0, 0, 5, 5);
		gbc_cRenk.fill = GridBagConstraints.HORIZONTAL;
		gbc_cRenk.gridx = 3;
		gbc_cRenk.gridy = 4;
		contentPane.add(cRenk, gbc_cRenk);
		
		tgBtn = new JToggleButton("Ge\u00E7i\u015Fli Dugme");
		GridBagConstraints gbc_tgBtn = new GridBagConstraints();
		gbc_tgBtn.gridwidth = 3;
		gbc_tgBtn.insets = new Insets(0, 0, 5, 5);
		gbc_tgBtn.gridx = 3;
		gbc_tgBtn.gridy = 5;
		contentPane.add(tgBtn, gbc_tgBtn);
		
		btnGp.add(rdSay1);
		btnGp.add(rdSay2);
		btnGp.add(rdSay3);
		cRenk.addItem("Sarı");
		cRenk.addItem("Kırmızı");
		cRenk.addItem("Mavi");
		cRenk.addItem("Siyah");
		tgBtn.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		if(chckKal.isSelected())
			a = Font.BOLD;
		else
			a = Font.ITALIC;

		if(rdSay1.isSelected())
			b = Integer.valueOf(rdSay1.getActionCommand());
		else if(rdSay2.isSelected())
			b = Integer.valueOf(rdSay2.getActionCommand());
		else if(rdSay3.isSelected())
			b = Integer.valueOf(rdSay3.getActionCommand());
		
		if(cRenk.getSelectedItem().equals("Sarı"))
			c = Color.YELLOW;
		else if(cRenk.getSelectedItem().equals("Kırmızı"))
			c = Color.RED;
		else if(cRenk.getSelectedItem().equals("Mavi"))
			c = Color.BLUE;
		else if(cRenk.getSelectedItem().equals("Siyah"))
			c = Color.BLACK;
		
		txtMet.setFont(new Font("sansserif", a, b));
		txtMet.setForeground(c);
	}

}
