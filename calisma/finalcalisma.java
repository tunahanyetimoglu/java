import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class finalcalisma extends JFrame implements ActionListener {
    private JPanel con;
    private JLabel lbyak;
    private JLabel lbyak2;
    private JTextField txt1;
    private JTextField txt2;
    private String h;
    
    public static void main(String args[]){
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                try{
                    finalcalisma frame = new finalcalisma();
                    frame.setVisible(true);
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    System.out.println("finally bloğu");
                }
            }
        });
        
    }
    finalcalisma(){
        super("Saygılar");
        this.setBounds(100,100,480,640);
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        con = new JPanel();
        con.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(con);
        con.setLayout(new FlowLayout(FlowLayout.CENTER, 5,5));
        
        txt1 = new JTextField();
        con.add(txt1);
        txt1.setColumns(10);
        
        JButton but = new JButton("tıkla");
        but.setActionCommand("he");
        but.addActionListener(this);
                con.add(but);


        txt2 = new JTextField();
        con.add(txt2);
        txt2.setColumns(10);
        
        
         JButton but2 = new JButton("tıkla");
        con.add(but2);
        but2.setActionCommand("h"); 
        but2.addActionListener(this);

        
        lbyak = new JLabel("");
        con.add(lbyak);
        
        lbyak2 = new JLabel("");
        con.add(lbyak2);
    }
@Override
    public void actionPerformed(ActionEvent e){
        String s;
        String s2;
        
        s = String.valueOf(txt1.getText());
        s2 = String.valueOf(txt2.getText());
        
        if (e.getActionCommand() == "he")
            lbyak.setText(s);
        else
            lbyak2.setText(s2);  
    }
}
