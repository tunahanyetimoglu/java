package olaylarOrnek;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class ornek extends JFrame implements MouseListener,MouseMotionListener,KeyListener,WindowListener {

	JLabel e1 = new JLabel();
	JLabel e2 = new JLabel();
	JLabel e3 = new JLabel();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				ornek o = new ornek();
				o.setVisible(true);
			}
		});
	}
	
	ornek(){
		super("Mouse ve Klavye");
		Container c = getContentPane();
		setLayout(new FlowLayout());
		c.add(e1);
		c.add(e2);
		c.add(e3);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		addWindowListener(this);
		
		setSize(300,400);
	}
	String metin ="";
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		metin ="Bir Tuþa basýldý ";
		e1.setText(metin);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		metin += "Basýlan tuþ Serbest Býrakýldý ";
		e1.setText(metin);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char c = e.getKeyChar();
		metin += "Klavyeden basýlan tus : " + c + " ";
		e1.setText(metin);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		e2.setText("Mouse Sürüklendi - Dragged");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		e2.setText("Mouse sürüklendi - Moved");
		e3.setText("X :" + x + "Y : " + y);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		e2.setText("Mouse týklanýldý.");
		int x = e.getX();
		int y = e.getY();
		e3.setText("X :" + x + "Y : " + y);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		e2.setText("Mouse etki alanýna girdi");
		int x = e.getX();
		int y = e.getY();
		e3.setText("X :" + x + "Y : " + y);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		e3.setText("X :" + x + "Y : " + y);
		
		e2.setText("Mouse Etki alanýndan çýktý");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		e3.setText("X :" + x + "Y : " + y);
		
		// TODO Auto-generated method stub
		e2.setText("Mouse tuþuna basýldý");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		e3.setText("X :" + x + "Y : " + y);
		
		// TODO Auto-generated method stub
		e2.setText("Mouse tuþu serbest býrakýldý.");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pencere aktif");
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pencere atifliðini kaybetti");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pencere simge durumundan getirildi");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pencere simge durumunda");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pencere açýldý");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("pencere kapandý");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("pencere kapanýyor");
	}
}
