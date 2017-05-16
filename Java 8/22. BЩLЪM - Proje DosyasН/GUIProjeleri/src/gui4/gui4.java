package gui4;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import java.awt.FlowLayout;
import javax.swing.JTabbedPane;

public class gui4 extends JFrame {

	private JPanel contentPane;
	private JTable tabloY;
	private JList listeY;
	private JTree agac;
	private JLabel lbl = new JLabel("Geniþleme - Daralma");
	private JLabel lbl2 = new JLabel("Seçme");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui4 frame = new gui4();
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
	public gui4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Tablo", new tablo());
		tabbedPane.addTab("Liste", new liste());
		tabbedPane.addTab("JTree", new JAgac());
		contentPane.add(tabbedPane);
	}
	
	public class tablo extends JPanel implements ListSelectionListener{
		tablo(){
			String[] sutun = {"il","plaka","Bölge"};
			String[][] veri = {
					{"Edirne","22","Marmara"},
					{"Kýrýkkale","71","Ýç Anadolu"},
					{"Bursa","18","Marmara"},
					{"Ýzmir","35","Ege"},
					{"Ýstanbul","34","Ýstanbul"},
					{"Ankara","06","Ýç Anadolu"},
					{"Adana","01","Akdeniz"}
			};
			tabloY = new JTable(veri, sutun);
			add(tabloY);
			
			JScrollPane j = new JScrollPane(tabloY);
			add(j);
			
			ListSelectionModel lm = tabloY.getSelectionModel();
			lm.setSelectionMode(lm.SINGLE_SELECTION);
			lm.addListSelectionListener(this);
		}

		@Override
		public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub
			int indisX = tabloY.getSelectedColumn();
			int indisY = tabloY.getSelectedRow();
			
			String s = "";
			
			s = (String) tabloY.getValueAt(indisY, indisX);
			System.out.println(s);
		}
	}

	public class liste extends JPanel{
		liste(){
			String[] il = {"Edirne","Kýrýkkale","Bursa","Ýzmir","Ýstanbul","Ankara","Adana","Tekirdað","Kýrklareli","Çanakkale","Çorum"};
			listeY = new JList(il);
			add(listeY);
			
			JScrollPane j2 = new JScrollPane(listeY);
			add(j2);
		}
	}
	
	public class JAgac extends JPanel implements TreeExpansionListener, TreeSelectionListener{
		JAgac(){
			agac = new JTree();
			add(agac);
			
			JScrollPane j3 = new JScrollPane(agac);
			add(j3);
			
			add(lbl);
			add(lbl2);
			agac.addTreeExpansionListener(this);
			agac.addTreeSelectionListener(this);
		}

		@Override
		public void treeCollapsed(TreeExpansionEvent arg0) {
			// TODO Auto-generated method stub
			lbl.setText(arg0.getPath().toString() + " alaný daraldý.");
		}

		@Override
		public void treeExpanded(TreeExpansionEvent arg0) {
			// TODO Auto-generated method stub
			lbl.setText(arg0.getPath().toString() + " alaný geniþledi.");
		}

		@Override
		public void valueChanged(TreeSelectionEvent arg0) {
			// TODO Auto-generated method stub
			lbl2.setText(arg0.getNewLeadSelectionPath().toString() + " alaný seçildi.");
		}
	}
}
