
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;


public class Kafe extends JFrame {
    
	private static final long serialVersionUID = 1L;
	
	ArrayList<Double> hesaplistesi = new ArrayList<Double>();
	
    static DefaultListModel<String> model = null;
    static double hesap = 0.0;
    static String select;
    int indeks;
    
    String[]    soup      = {"Mercimek 5 TL","Ezogelin 5TL","Yayla 5TL","Domates 5 TL"
                            ,"Mantar 4 TL","Şehriye 5 TL","İşkembe 9.5 TL"
                            ,"Kelle Paça 9.5 TL"};
    String[]    food    = {"Patlıcan Kebap - 10TL","Porsiyon ET"
                            ,"Pilavüstü ET - 15 TL","Porsiyon Tavuk"
                            ,"Pilavüstü Tavuk - 10 TL"};
    String[]    drink     = {"Kola 4 TL","Gazoz 4 TL","Fanta 4 TL","Gazoz 4 TL"
                            ,"Meyvesuyu 3 TL","Çay 2.5 TL","Ayran 3 TL"};
    String[]    dessert   = {"Baklava 7.5 TL","Kadayıf 6 TL","Sütlaç 6 TL"
                            ,"Şekerpare 3.5 TL","Kazandibi 5.5TL","Tulumba 3 TL"
                            ,"İrmik Helvası 3TL","Dondurmalı İrmik 7.5 TL"};
    
    JList<String> siparisler  = new JList<String>();
    JList<String> corbalar    = new JList<String>(soup);
    JList<String> yemekler    = new JList<String>(food);
    JList<String> icecekler   = new JList<String>(drink);
    JList<String> tatlilar    = new JList<String>(dessert);
    
    JTextField num;
    
    JLabel ucret,SiparisListesi,label1,label2,label3,label4,label5;
    static JLabel label0;
    
    JButton button0,button1,button2,button3,button4,button5,button6,button7,
            button8,button9,button10,fis;
    
    public void menu(final String masa) {
        
        final JFrame yeni = new JFrame("Menü");
        model = new DefaultListModel<String>();
	    yeni.setBounds(0,0,1080,878);
        yeni.setLayout(null);
                
        SiparisListesi = new JLabel("Siparis Verilecek Liste  ");
        SiparisListesi.setForeground(Color.black);
	    SiparisListesi.setFont(new Font("LucidaSan", Font.PLAIN, 15));
        SiparisListesi.setBounds(800 , 20, 180,  20);
	    yeni.add(SiparisListesi);
                
        ucret = new JLabel("Toplam Tutar: ");
        ucret.setForeground(Color.black);
        ucret.setBounds(750,320,180,20);
        yeni.add(ucret);
                
        label0 = new JLabel("");
        label0.setBounds(900,320,180,20);
        yeni.add(label0);
                
        siparisler.setBounds(700, 50, 350, 250);
	    siparisler.setEnabled(false);
	    siparisler.setVisibleRowCount(10);
    	yeni.add(siparisler);
        yeni.setVisible(true);
                
                
        label4 = new JLabel("Çorba Listesi");
        label4.setForeground(Color.BLACK);
        label4.setFont(new Font("LucidaSan",Font.PLAIN,15));
        label4.setBounds(40,20,180,20);
        yeni.add(label4);
                
        corbalar.setBounds(20,50,150,250);
        yeni.add(corbalar);
               
        label1 = new JLabel("Yemek Listesi");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("LucidaSan",Font.PLAIN,15));
        label1.setBounds(210,20,180,20);
        yeni.add(label1);
                
        yemekler.setBounds(210,50,150,250);
        yemekler.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        yemekler.setVisibleRowCount(10);
        yeni.add(yemekler);
        
                
        label2 = new JLabel("İcicek Listesi");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("LucidaSan",Font.PLAIN,15));
        label2.setBounds(210,355,180,20);
        yeni.add(label2);              
                
        icecekler.setBounds(210,385,150,250);
        yeni.add(icecekler);
                
        label3 = new JLabel("Tatlı Listesi");
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("LucidaSan",Font.PLAIN,15));
        label3.setBounds(20,355,180,20);
        yeni.add(label3); 
                
        tatlilar.setBounds(20,385,150,250);
        yeni.add(tatlilar);
                
        button0 = new JButton("Yemeği Ekle");
        button0.setBounds(210,300,150,50);
        yeni.add(button0);
                
        button1 = new JButton("İçeceği Ekle");
        button1.setBounds(210,635,150,50);
        yeni.add(button1);
                
        button2 = new JButton("Tatlıyı Ekle");
        button2.setBounds(20,635,150,50);
        yeni.add(button2);
                
        button3 = new JButton("Çorbayı Ekle");
        button3.setBounds(20,300,150,50);
        yeni.add(button3);
                
        button4 = new JButton("Sipariş İptal");
        button4.setBounds(500,100,150,50);
        yeni.add(button4);
                
        button5 = new JButton("Sipariş Onayla");
        button5.setBounds(500,150,150,50);
        yeni.add(button5);
                
       button0.addActionListener(new ActionListener()
       {
            public void actionPerformed(ActionEvent ae){
            	try{
                siparisler.setEnabled(true);
                siparisler.setModel(model);
                final String selected = yemekler.getSelectedValue().toString();
                if(selected == "Porsiyon ET"){
                    final JFrame ekleme = new JFrame();
                    JRadioButton rb4 = new JRadioButton("Duble Porsiyon");
                    rb4.setActionCommand("Duble - 22 TL");
                    JRadioButton rb1 = new JRadioButton("Tam Porsiyon");
                    rb1.setActionCommand("Tam Porsiyon - 12 TL");
                    JRadioButton rb2 = new JRadioButton("Yarım Porsiyon");
                    rb2.setActionCommand("Yarım Porsiyon - 8");
                    JButton      rbb = new JButton     ("Seç");
                    final ButtonGroup bG = new ButtonGroup();
                    bG.add(rb1);
                    bG.add(rb2);;
                    bG.add(rb4);
                    ekleme.setSize(100,200);
                    ekleme.setLayout( new FlowLayout());
                    ekleme.add(rb4);
                    ekleme.add(rb1);
                    ekleme.add(rb2);
                    ekleme.add(rbb);
                    ekleme.setVisible(true);
                    rbb.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent ae){
                             String x = bG.getSelection().getActionCommand();
                             if(x == "Duble - 22 TL")
                            {                           	 
                                hesap += 22;
                                hesaplistesi.add((double)22);
                            }else if(x == "Tam Porsiyon - 12 TL"){
                                hesap += 12;
                                hesaplistesi.add((double)12);
                            }else if(x == "Yarım Porsiyon - 8"){
                                hesap += 8;
                                hesaplistesi.add((double)8);
                            }
                            model.addElement(selected+"-"+x);
                            label0.setText(hesap+" TL ");
                            ekleme.setVisible(false);
                        } 
                    });
                }else if(selected == "Porsiyon Tavuk"){
                    final JFrame ekleme = new JFrame();
                    JRadioButton rb4 = new JRadioButton("Duble Porsiyon");
                    rb4.setActionCommand("Duble - 18 TL");
                    JRadioButton rb1 = new JRadioButton("Tam Porsiyon");
                    rb1.setActionCommand("Tam Porsiyon - 10 TL");
                    JRadioButton rb2 = new JRadioButton("Yarım Porsiyon");
                    rb2.setActionCommand("Yarım Porsiyon - 6");
                    JButton      rbb = new JButton     ("Seç");
                    final ButtonGroup bG = new ButtonGroup();
                    bG.add(rb1);
                    bG.add(rb2);;
                    bG.add(rb4);
                    ekleme.setSize(100,200);
                    ekleme.setLayout( new FlowLayout());
                    ekleme.add(rb4);
                    ekleme.add(rb1);
                    ekleme.add(rb2);
                    ekleme.add(rbb);
                    ekleme.setVisible(true);
                    rbb.addActionListener(new ActionListener()
                    {
                        public void actionPerformed(ActionEvent ae){
                            String x = bG.getSelection().getActionCommand();
                            
                            if(x == "Duble - 18 TL")
                            {
                                hesap += 18;
                                hesaplistesi.add((double)18);
                     
                            }else if(x == "Tam Porsiyon - 10 TL"){
                                hesap += 10;
                                hesaplistesi.add((double)10);
                            }else if(x == "Yarım Porsiyon - 6"){
                                hesap += 6;
                                hesaplistesi.add((double)6);
                            }
                            model.addElement(selected+"-"+x);
                            label0.setText(hesap+" TL ");
                            ekleme.setVisible(false);
                        } 
                    });
                }else{
                    model.addElement(selected);
                    indeks = yemekler.getSelectedIndex();
                    
                    if (indeks == 0){
                        hesap += 10;
                        hesaplistesi.add((double)10);
                    }else if (indeks == 2){
                        hesap += 15;
                        hesaplistesi.add((double)15);
                    }else if (indeks == 4){
                        hesap += 10;
                        hesaplistesi.add((double)10);
                    }
                    label0.setText(hesap+" TL ");
                }
            	}catch(Exception e){
         		   JOptionPane.showMessageDialog(null,"Yemek Seçiniz.");
         	   }  
            }
    	   
        });
                
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae){
            	try{
                siparisler.setEnabled(true);
                siparisler.setModel(model);
                String selected = icecekler.getSelectedValue().toString();
                model.addElement(selected);
                indeks = icecekler.getSelectedIndex();
                
                if (indeks == 0){
                    hesap += 4;
                    hesaplistesi.add((double)4);
                }else if (indeks == 1){
                    hesap += 4;
                    hesaplistesi.add((double)4);
                }else if (indeks == 2){
                    hesap += 4;
                    hesaplistesi.add((double)4);
                }else if (indeks == 3){
                    hesap += 4;
                    hesaplistesi.add((double)4);
                }else if (indeks == 4){
                    hesap += 3;
                    hesaplistesi.add((double)3);
                }else if (indeks == 5){
                    hesap += 2.5;
                    hesaplistesi.add(2.5);  
                }else if (indeks == 6){
                    hesap += 3;
                    hesaplistesi.add((double)3);
                }               
                label0.setText(hesap+" TL ");
            	}catch(Exception e){
            		 JOptionPane.showMessageDialog(null,"Yemek Seçiniz.");
            	}
            } 
        });
        
        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae){
            	try{
                siparisler.setEnabled(true);
                siparisler.setModel(model);                
                String selected = tatlilar.getSelectedValue().toString();               
                model.addElement(selected);
                indeks = tatlilar.getSelectedIndex();
                
                if (indeks == 0){               
                    hesap += 7.5;                 
                    hesaplistesi.add(7.5);
                }else if (indeks == 1){                
                    hesap += 6;                
                    hesaplistesi.add((double)6);            
                }else if (indeks == 2){                
                    hesap += 6;                
                    hesaplistesi.add((double)6);                
                }else if (indeks == 3){                
                    hesap += 3.5;                
                    hesaplistesi.add(3.5);
                }else if (indeks == 4){                
                    hesap += 5.5;                
                    hesaplistesi.add(5.5);                
                }else if (indeks == 5){                
                    hesap += 3;                
                    hesaplistesi.add((double)3);                  
                }else if (indeks == 6){                
                    hesap += 3;                
                    hesaplistesi.add((double)3);                
                }else if (indeks == 7){                
                    hesap += 7.5;                
                    hesaplistesi.add(7.5);                
                }                
                label0.setText(hesap+" TL ");
            	}catch(Exception e){
            		 JOptionPane.showMessageDialog(null,"Yemek Seçiniz.");
            	}
                                                
            }                
        });        
                
        button3.addActionListener(new ActionListener()        
        {        
            public void actionPerformed(ActionEvent ae){
            	try{
                siparisler.setEnabled(true);            
                siparisler.setModel(model);                    
                String selected = corbalar.getSelectedValue().toString();                    
                model.addElement(selected);
                indeks = corbalar.getSelectedIndex(); 
                
                if (corbalar.getSelectedIndex() == 0){                   
                    hesap += 5;                    
                    hesaplistesi.add((double)5); 
                }else if ( indeks == 1){                    
                    hesap += 5;                    
                    hesaplistesi.add((double)5);                
                }else if (indeks == 2){                    
                    hesap += 5;                    
                    hesaplistesi.add((double)5);                    
                }else if (indeks == 3){                    
                    hesap += 5;                    
                    hesaplistesi.add((double)5);                    
                }else if (indeks == 4){                    
                    hesap += 4;                    
                    hesaplistesi.add((double)4);                    
                }else if (indeks == 5){                    
                    hesap += 5;                    
                    hesaplistesi.add((double)5);                      
                }else if (indeks == 6){                    
                    hesap += 9.5;                    
                    hesaplistesi.add(9.5);                    
                }else if (indeks == 7){                    
                    hesap += 9.5;                     
                    hesaplistesi.add(9.5);                   
                }
                label0.setText(hesap+" TL ");
            	}catch(Exception e){
            		 JOptionPane.showMessageDialog(null,"Yemek Seçiniz.");
            	}
                                 
            }
                    
        });
                
        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(model.size() == 0 || hesaplistesi.size() == 0)
		{
		    JOptionPane.showMessageDialog(null,"Sipariş veriniz.");
			return;
		}
                hesaplistesi.remove(siparisler.getSelectedIndex());
		model.remove(siparisler.getSelectedIndex());
		siparisler.setModel(model);
		hesap = 0;
		for (int i = 0; i < hesaplistesi.size(); i++)
                {
		hesap += hesaplistesi.get(i);
                label0.setText(hesap+" TL ");
                }  
            }
        });
                
        button5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(model.size() == 0 || hesaplistesi.size() == 0)
		{
                    JOptionPane.showMessageDialog(null,"Sipariş veriniz.");
			return;
		}
                else{
                    int dialogButton = JOptionPane.showConfirmDialog (null, "Onaylandıktan sonra iptal edilmemektedir","Uyarı!",JOptionPane.YES_NO_OPTION);
                    if(dialogButton == JOptionPane.YES_OPTION){
                        siparisler.setEnabled(false);
                        try{
                            File f = new File(".\\"+masa+".txt");
                            if(!f.exists()){
                            	f.createNewFile();
                            }
                            FileWriter fw = new FileWriter(f,true);
                            PrintWriter pw = new PrintWriter(fw);
                            String metin = masa + "\n ";
                            
                            for (int i = 0; i < model.size(); i++) 
			                {
                            	metin += model.get(i)+"\n";
			                }
                            
                            metin += "Toplam Fiyat : " + hesap+"\n";
                            pw.println(metin);
                            pw.close();
                            model.clear();
                            hesaplistesi.clear();
                            hesap = 0;
                            label0.setText("");
                            yeni.setVisible(false);
                            
                        }catch (IOException ex) {
                            Logger.getLogger(Kafe.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
                    
        });
                
    }
    public Kafe(){
        setBounds(0,0,840,680);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(null);
  
        setVisible(true);
        
        final JButton button0 = new JButton("Giriş");
        button0.setBounds(320,50,150,50);
        add(button0);
        
        final JButton button1 = new JButton("Masa 1");
        button1.setBounds(20,150,100,100);
        button1.setEnabled(false);
        add(button1);
        button1.setActionCommand("masa 1");

        
        final JButton button2 = new JButton("Masa 2");
        button2.setBounds(20,300,100,100);
        button2.setEnabled(false);
        add(button2);
        button2.setActionCommand("masa 2");
        
        final JButton button3 = new JButton("Masa 3");
        button3.setBounds(20,450,100,100);
        button3.setEnabled(false);
        add(button3);
        button3.setActionCommand("masa 3");
        
        final JButton button4 = new JButton("Masa 4");
        button4.setBounds(200,150,100,100);
        button4.setEnabled(false);
        add(button4);
        button4.setActionCommand("masa 4");
        
        final JButton button5 = new JButton("Masa 5");
        button5.setBounds(200,300,100,100);
        button5.setEnabled(false);
        add(button5);
        button5.setActionCommand("masa 5");
        
        final JButton button6 = new JButton("Masa 6");
        button6.setBounds(200,450,100,100);
        button6.setEnabled(false);
        add(button6);
        button6.setActionCommand("masa 6");
        
        final JButton button7 = new JButton("Masa 7");
        button7.setBounds(380,150,100,100);
        button7.setEnabled(false);
        add(button7);
        button7.setActionCommand("masa 7");
        
        final JButton button8 = new JButton("Masa 8");
        button8.setBounds(380,300,100,100);
        button8.setEnabled(false);
        add(button8);
        button8.setActionCommand("masa 8");
        
        final JButton button9 = new JButton("Masa 9");
        button9.setBounds(380,450,100,100);
        button9.setEnabled(false);
        add(button9);
        button9.setActionCommand("masa 9");
        
        final JButton button10 = new JButton("KASA");
        button10.setBounds (530,225,250,250);
        button10.setEnabled(false);
        add(button10);


        button0.addActionListener(new ActionListener() 
        {
	    public void actionPerformed(ActionEvent ae) 
            {
	    		button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(true);
                button8.setEnabled(true);
                button9.setEnabled(true);
                button10.setEnabled(true);
                
            }
	});
        
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String m = button1.getActionCommand();
                menu(m);
            }
        });
        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String m = button2.getActionCommand();
                menu(m);
            }
        });
        
        button3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String m = button3.getActionCommand();
                menu(m);
            }
        });
        
        button4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String m = button4.getActionCommand();
                menu(m);
            }
        });
        
        button5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String m = button5.getActionCommand();
                menu(m);
            }
        });
        
        button6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String m = button6.getActionCommand();
                menu(m);
            }
        });
        
        button7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String m = button7.getActionCommand();
                menu(m);
            }
        });
        
        button8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String m = button8.getActionCommand();
                menu(m);
            }
        });
        
        button9.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String m = button9.getActionCommand();
                menu(m);
            }
        });
        
        button10.addActionListener(new ActionListener()
        {  
           
           public void actionPerformed(ActionEvent ae)
           {
                final JFrame make = new JFrame("KASA");
                make.setBounds(530,225,250,250);
                make.setLayout(null);
                make.setVisible(true);
               
                label5 = new JLabel("Masanızın Numarası : ");
                label5.setBounds(50,50,180,25);
                label5.setFont(new Font("LucidaSan",Font.PLAIN,15));
                label5.setForeground(Color.BLACK);
                make.add(label5);
               
                num = new JTextField();
                num.setBounds(75,75,75,25);
                make.add(num);
               
                fis = new JButton("Fiş iste");
                fis.setBounds(75,125,75,75);
                make.add(fis);
               
                fis.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent ae){
                        int masa_no = Integer.parseInt(num.getText());
                        if(masa_no > 10){
                            JOptionPane.showMessageDialog(null,"Seçtiğiniz Masa Yok.");
                            return;
                        }else{
                            String masa_s = Integer.toString(masa_no);
                            fis_kes(masa_s);
                            make.setVisible(false);
                        }
                    } 
                });
                
           }       
        });   
                
    }
    
    public void fis_kes(String s){
          try {                  
                    FileReader fr = new FileReader(".\\masa "+s+".txt");
                    BufferedReader br = new BufferedReader(fr);
                    String str;
                    while((str = br.readLine()) != null)
                    {
                        System.out.println(str);
                    }
                    br.close();
                }catch (IOException ex) {
                	 JOptionPane.showMessageDialog(null,"Masa Boş");
                }finally{
                    File f = new File(".\\masa "+s+".txt");
                    f.delete();
                  
                }
    }
    
    public static void main(String[] args) {

        new Kafe();
    }                      
    
}
