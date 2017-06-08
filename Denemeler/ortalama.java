package exam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Action;
import javax.swing.JOptionPane;

/**
 *
 * @author Tunahan
 */
public class ortalama extends JFrame {
    static JButton bt1,bt2;
    static JTextField tf1,tf2;
    static JLabel lb1,lb2,lb3,lb4;
    
    ortalama(){
        setTitle("Ortalama Hesapla");
        setBounds(0,0,480,350);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        tf1 = new JTextField("");
        tf2 = new JTextField("");
        
        tf1.setBounds(80,25,50,25);
        tf2.setBounds(80,65,50,25);
        add(tf1);
        add(tf2);
        
      
        
        lb1 = new JLabel("Vize Notu: ");
        lb2 = new JLabel("Final Notu: ");
        lb3 = new JLabel("Ortalama :");
        lb4 = new JLabel("");
        
        lb1.setBounds(10,20,60,30);
        lb2.setBounds(10,60,80,30);
        lb3.setBounds(10,100,80,30);
        lb4.setBounds(90,100,80,30);
        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);
        
        bt1 = new JButton("Hesapla");
        bt2 = new JButton("Temizle");
        bt2.setEnabled(false);
        
        bt1.setBounds(150,23,100,30);
        bt2.setBounds(150,63,100,30);
        add(bt1);
        add(bt2);
        
        Hesapla h = new Hesapla();
        Temizle t = new Temizle();
        
        bt1.addActionListener(h);
        bt2.addActionListener(t);
        
        setVisible(true);
       
    }

        public class Hesapla implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                double ortalama = Double.parseDouble(tf1.getText())*0.4 + Double.parseDouble(tf2.getText())*0.6;
                lb4.setText(""+ortalama);
                bt2.setEnabled(true);
                bt1.setEnabled(false);
                tf1.setEditable(false);
                tf2.setEditable(false);
            }catch(Exception a){
                JOptionPane.showMessageDialog(null,"Notlarınızı Giriniz!");
            }
        }
            
        }
        
        public class Temizle implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
               lb4.setText("");
               bt1.setEnabled(true);
               bt2.setEnabled(false);
               tf1.setEditable(true);
               tf2.setEditable(true);
               tf1.setText("");
               tf2.setText("");
        }
            
        }  
    public static void main(String args[]){
        new ortalama();
    }
}
