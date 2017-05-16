package JDBCOrnek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Silme {
	public static Connection c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baglantiAc();
		silme();
		baglantiKapat();
	}
	
	public static void silme(){
		try {
			String sql = "DELETE FROM ogrenci WHERE ogrNo = 2";
			
			Statement st = c.createStatement();
			st.execute(sql);
			System.out.println("Silme baþarýlý.");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void baglantiKapat(){
		try {
			c.close();
			System.out.println("Baðlantý baþarýyla kapatýldý.");		
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
			System.out.println("Baðlantý baþarýlý.");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
