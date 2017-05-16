package JDBCOrnek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Guncelle {
	public static Connection c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baglantiAc();
		guncelleme();
		baglantiKapat();
	}
	
	public static void guncelleme(){
		try {
			String sql = "UPDATE ogrenci SET ogrAd = ? WHERE ogrNo = ?";
			
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, "Cem");
			ps.setInt(2, 3);
			System.out.println("De�erler ba�ar�yla aktar�ld�.");
			
			ps.execute();
			System.out.println("Sorgu �al��t�r�ld�.");
			
			ps.close();
			System.out.println("PreparedStatement nesnesi kapat�ld�.");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void baglantiKapat(){
		try {
			c.close();
			System.out.println("Ba�lant� ba�ar�yla kapat�ld�.");		
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void baglantiAc(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String bag = "jdbc:mysql://localhost:3306/ornek";
			String kul = "root";
			String sif = "19711958";
			c = DriverManager.getConnection(bag, kul, sif);
			System.out.println("Ba�lant� ba�ar�l�.");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
