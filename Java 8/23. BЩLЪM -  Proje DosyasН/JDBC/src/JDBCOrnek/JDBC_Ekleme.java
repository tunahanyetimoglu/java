package JDBCOrnek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Ekleme {
	public static Connection c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baglantiAc();
		ekle();
		bagKapat();
	}
	
	public static void ekle(){
		String sql = "INSERT INTO ogrenci(ogrNo,ogrAd,ogrSoyad) VALUES(23,'Onur','�e�e')";
		
		try {
			Statement sta = c.createStatement();
			sta.execute(sql);
			System.out.println("Ekleme ba�ar�l�");			
		} catch (SQLException e) {
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
			System.out.println("Ba�lant� ba�ar�l�");			
		} catch (Exception e) {
			System.out.println(e.toString());
		}	
	}
	
	public static void bagKapat(){
		try {
			c.close();
			System.out.println("Ba�lant� ba�ar�yla kapat�ld�.");			
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}

}
